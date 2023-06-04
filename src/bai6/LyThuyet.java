package bai6;

public class LyThuyet extends PhongHoc {
	public LyThuyet(int maphong, String daynha, float dientich, int sobongden, boolean maychieu) {
		super(maphong, daynha, dientich, sobongden);
		this.maychieu = maychieu;
	}

	public LyThuyet() {
	}

	private boolean maychieu;

	public boolean isMaychieu() {
		return maychieu;
	}

	public void setMaychieu(boolean maychieu) {
		this.maychieu = maychieu;
	}

	public boolean datchuan() {
		return maychieu ? true : false;
	}

	@Override
	public String toString() {
		return "Phòng học lý thuyết. \nMã phòng: " + getMaphong() + ", dãy nhà: " + getDaynha() + ", diện tích: "
				+ getDientich() + ", có số bóng đèn là: " + getSobongden() + " và " + (maychieu ? "có " : "không có ")
				+ "máy chiếu.";
	}
}
