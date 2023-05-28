package baitap2;

public class Sinhvien {
	private int maSV;
	private String hoten;
	private float diemLT;
	private float diemTH;

	public Sinhvien() {
	}

	public Sinhvien(int maSV, String hoten, float diemLT, float diemTH) {
		if (maSV > 0) {
			this.maSV = maSV;
		} else {
			System.out.println("Mã sinh viên phải lớn hơn 0");
			this.maSV = 9999;
		}
		if (hoten == null || hoten.trim().length() == 0) {
			this.hoten = "Chưa xác định";
			System.out.println("Họ và tên không được rỗng");
		} else {
			this.hoten = hoten;
		}
		if (diemLT < 0.0 || diemLT > 10.0) {
			this.diemLT = 0;
			System.out.println("Điểm lý thuyết phải nằm trong khoảng 0 tới 10");
		} else {
			this.diemLT = diemLT;
		}
		if (diemTH < 0.0 || diemTH > 10.0) {
			this.diemTH = 0;
			System.out.println("Điểm thực hành phải nằm trong khoảng 0 tới 10");
		} else {
			this.diemTH = diemTH;
		}
	}

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public float getDiemLT() {
		return diemLT;
	}

	public void setDiemLT(float diemLT) {
		this.diemLT = diemLT;
	}

	public float getDiemTH() {
		return diemTH;
	}

	public void setDiemTH(float diemTH) {
		this.diemTH = diemTH;
	}

	public float diemTB() {
		return (diemTH + diemLT) / 2;
	}

	@Override
	public String toString() {
		return maSV + "\t" + hoten + "\t\t" + diemLT + "\t" + diemTH + "\t" + diemTB();
	}

}
