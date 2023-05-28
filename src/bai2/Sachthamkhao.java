package bai2;

import java.time.LocalDate;

public class Sachthamkhao extends Sachgiaokhoa {
	private float thue;

	public Sachthamkhao(int masach, LocalDate ngaynhap, float dongia, int soluong, String nhaXB, float thue) {
		super(masach, ngaynhap, dongia, soluong, nhaXB);
		this.thue = thue;
	}

	public float thanhtien() {
		return getDongia()*getSoluong()+thue;
	}
}
