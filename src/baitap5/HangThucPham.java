package baitap5;

import java.time.LocalDate;

public class HangThucPham {
	private int mahang;
	private String tenhang;
	private float dongia;
	private LocalDate ngaysanxuat;
	private LocalDate ngayhethan;
	public int getMahang() {
		return mahang;
	}
	public void setMahang(int mahang) {
		this.mahang = mahang;
	}
	public String getTenhang() {
		return tenhang;
	}
	public void setTenhang(String tenhang) {
		this.tenhang = tenhang;
	}
	public float getDongia() {
		return dongia;
	}
	public void setDongia(float dongia) {
		this.dongia = dongia;
	}
	public LocalDate getNgaysanxuat() {
		return ngaysanxuat;
	}
	public void setNgaysanxuat(LocalDate ngaysanxuat) {
		this.ngaysanxuat = ngaysanxuat;
	}
	public LocalDate getNgayhethan() {
		return ngayhethan;
	}
	public void setNgayhethan(LocalDate ngayhethan) {
		this.ngayhethan = ngayhethan;
	}
	
	
}
