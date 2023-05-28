package bai1;

public class Xenoithanh {
	private int masochuyen;
	private String hotentaixe;
	private int soxe;
	private int sotuyen;
	private float sokmdiduoc;
	private float doanhthu;

	public Xenoithanh(int masochuyen, String hotentaixe, int soxe, float sokmdiduoc, float doanhthu) {
		this.masochuyen = masochuyen;
		this.hotentaixe = hotentaixe;
		this.soxe = soxe;
		this.sokmdiduoc = sokmdiduoc;
		this.doanhthu = doanhthu;
	}

	public Xenoithanh(int masochuyen, String hotentaixe, int soxe, int sochuyen, float sokmdiduoc, float doanhthu) {
		this.masochuyen = masochuyen;
		this.hotentaixe = hotentaixe;
		this.soxe = soxe;
		this.sotuyen = sochuyen;
		this.sokmdiduoc = sokmdiduoc;
		this.doanhthu = doanhthu;
	}

	public int getSoxe() {
		return soxe;
	}

	public float getDoanhthu() {
		return doanhthu;
	}

	@Override
	public String toString() {
		return "Xenoithanh [masochuyen=" + masochuyen + ", hotentaixe=" + hotentaixe + ", soxe=" + soxe + ", sochuyen="
				+ sotuyen + ", sokmdiduoc=" + sokmdiduoc + ", doanhthu=" + doanhthu + "]";
	}

}
