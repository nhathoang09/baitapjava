package bai6;

public class MayTinh extends PhongHoc {
	private int somaytinh;

	public MayTinh(int maphong, String daynha, float dientich, int sobongden, int somaytinh) {
		super(maphong, daynha, dientich, sobongden);
		this.somaytinh = somaytinh;
	}

	public MayTinh() {
	}

	public int getSomaytinh() {
		return somaytinh;
	}

	public void setSomaytinh(int somaytinh) {
		this.somaytinh = somaytinh;
	}

	public boolean datchuan() {
		return (getDientich() / 1.5 <= somaytinh) ? true : false;
	}

	@Override
	public String toString() {
		return "Phòng học máy tính. \nMã phòng: " + getMaphong() + ", dãy nhà: " + getDaynha() + ", diện tích: "
				+ getDientich() + ", có số bóng đèn là: " + getSobongden() + " và có " + somaytinh + " máy tính.";
	}
}
