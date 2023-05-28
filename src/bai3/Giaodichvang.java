package bai3;

import java.time.LocalDate;

public class Giaodichvang {
	private int magd;
	private LocalDate ngaygd;
	private float dongia;
	private int soluong;
	private String loaivang;

	public float thanhtien() {
		return soluong * dongia;
	}

	public Giaodichvang(int magd, LocalDate ngaygd, float dongia, int soluong, String loaivang) {
		this.magd = magd;
		this.ngaygd = ngaygd;
		this.dongia = dongia;
		this.soluong = soluong;
		this.loaivang = loaivang;
	}

	public Giaodichvang(int magd, LocalDate ngaygd, float dongia, int soluong) {
		this.magd = magd;
		this.ngaygd = ngaygd;
		this.dongia = dongia;
		this.soluong = soluong;
	}

	@Override
	public String toString() {
		return "Giaodichvang [magd=" + magd + ", ngaygd=" + ngaygd + ", dongia=" + dongia + ", soluong=" + soluong
				+ ", loaivang=" + loaivang + "]";
	}

	public float getDongia() {
		return dongia;
	}

	public int getSoluong() {
		return soluong;
	}
}
