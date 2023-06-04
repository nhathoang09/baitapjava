package bai6;

public class ThiNghiem extends PhongHoc {
	private String chuyennganh;
	private int succhua;
	private boolean bonrua;

	public ThiNghiem(int maphong, String daynha, float dientich, int sobongden, String chuyennganh, int succhua,
			boolean bonrua) {
		super(maphong, daynha, dientich, sobongden);
		this.chuyennganh = chuyennganh;
		this.succhua = succhua;
		this.bonrua = bonrua;
	}

	public ThiNghiem() {
	}

	public String getChuyennganh() {
		return chuyennganh;
	}

	public void setChuyennganh(String chuyennganh) {
		this.chuyennganh = chuyennganh;
	}

	public int getSucchua() {
		return succhua;
	}

	public void setSucchua(int succhua) {
		this.succhua = succhua;
	}

	public boolean isBonrua() {
		return bonrua;
	}

	public void setBonrua(boolean bonrua) {
		this.bonrua = bonrua;
	}

	public boolean datchuan() {
		return bonrua ? true : false;
	}

	@Override
	public String toString() {
		return "Phòng học thí nghiệm. \nMã phòng: " + getMaphong() + ", dãy nhà: " + getDaynha() + ", diện tích: "
				+ getDientich() + ", có số bóng đèn là: " + getSobongden() + ", chuyên ngành: " + chuyennganh
				+ ", sức chứa: " + succhua + " người và " + (bonrua ? "có " : "không có ") + "bồn rửa.";
	}
}
