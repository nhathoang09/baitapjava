package bai2;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Sachgiaokhoa {
	private int masach;
	private LocalDate ngaynhap;
	private float dongia;
	private int soluong;
	private String nhaXB;
	private boolean tinhtrang;

	public Sachgiaokhoa(int masach, LocalDate ngaynhap, float dongia, int soluong, String nhaXB) {
		this.masach = masach;
		this.ngaynhap = ngaynhap;
		this.dongia = dongia;
		this.soluong = soluong;
		this.nhaXB = nhaXB;
	}

	public Sachgiaokhoa(int masach, LocalDate ngaynhap, float dongia, int soluong, String nhaXB, boolean tinhtrang) {
		this.masach = masach;
		this.ngaynhap = ngaynhap;
		this.dongia = dongia;
		this.soluong = soluong;
		this.nhaXB = nhaXB;
		this.tinhtrang = tinhtrang;
	}

	public String getNhaXB() {
		return nhaXB;
	}

	public void setNhaXB(String nhaXB) {
		this.nhaXB = nhaXB;
	}

	public float getDongia() {
		return dongia;
	}

	public int getSoluong() {
		return soluong;
	}


	public float thanhtien() {
		if (!tinhtrang) {
			dongia /= 2;
		}

		return soluong * dongia;
	}
	DecimalFormat df = new DecimalFormat("#,##0 đ");
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-LL-yyyy");
	@Override
	public String toString() {
		return "Sách giáo khoa => Mã sách: " + masach + ", ngày nhập: " + ngaynhap.format(dtf) + ", đơn giá: " + df.format(dongia) + ", số lượng: "
				+ soluong + ", nhà xuất bản: " + nhaXB + ", tình trạng: " + (tinhtrang? "mới" : "cũ");
	}

}
