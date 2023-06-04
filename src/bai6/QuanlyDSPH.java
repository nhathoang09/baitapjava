package bai6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class QuanlyDSPH {
	private ArrayList<PhongHoc> phl;

	public QuanlyDSPH() {
		this.phl = new ArrayList<PhongHoc>();
	}

	public QuanlyDSPH(ArrayList<PhongHoc> phl) {
		this.phl = phl;
	}

	public void addLT(LyThuyet lt) {
		boolean flag = true;
		for (PhongHoc ph : phl) {
			if (ph.getMaphong() == lt.getMaphong()) {
				System.out.println("Mã phòng đã tồn tại!");
				flag = false;
			}
		}
		if (flag) {
			this.phl.add(lt);
			System.out.println("Thêm thành công phòng lý thuyết.");
		}
	}

	public void addMT(MayTinh mt) {
		boolean flag = true;
		for (PhongHoc ph : phl) {
			if (ph.getMaphong() == mt.getMaphong()) {
				System.out.println("Mã phòng đã tồn tại!");
				flag = false;
			}
		}
		if (flag) {
			this.phl.add(mt);
			System.out.println("Thêm thành công phòng lý máy tính.");
		}
	}

	public void addTN(ThiNghiem tn) {
		boolean flag = true;
		for (PhongHoc ph : phl) {
			if (ph.getMaphong() == tn.getMaphong()) {
				System.out.println("Mã phòng đã tồn tại!");
				flag = false;
			}
		}
		if (flag) {
			this.phl.add(tn);
			System.out.println("Thêm thành công phòng thí nghiệm.");
		}
	}

	public void searchPhong(int maphong) {
		for (PhongHoc ph : phl) {
			if (maphong == ph.getMaphong()) {
				System.out.println("Phòng học có mã " + maphong + " là: " + ph);
			}
		}
	}

	public void showPhong() {
		if (phl.size() > 0) {
			System.out.println("===== Thông tin danh sách phòng =====");
		} else {
			System.out.println("Danh sách phòng trống.");
		}
		for (PhongHoc ph : phl) {
			System.out.println(ph + "\n");
		}
	}

	public void showPhongDC() {
		if (phl.size() > 0) {
			System.out.println("===== Thông tin danh sách phòng đạt chuẩn =====");
		} else {
			System.out.println("Danh sách phòng trống.");
		}
		for (PhongHoc ph : phl) {
			if (ph.datchuan()) {
				System.out.println(ph + "\n");
			}
		}
	}

	public void ascDaynha() {
		if (phl.size() > 0) {
			System.out.println("===== Danh sách phòng học tăng dần theo dãy nhà =====");
		} else {
			System.out.println("Danh sách phòng trống.");
		}
		Collections.sort(phl, PhongHoc.compareDN);
		for (PhongHoc ph : phl) {
			System.out.println(ph + "\n");
		}
	}

	public void descDientich() {
		if (phl.size() > 0) {
			System.out.println("===== Danh sách phòng học giảm dần theo diện tích =====");
		} else {
			System.out.println("Danh sách phòng trống.");
		}
		Collections.sort(phl, PhongHoc.compareDT);
		for (PhongHoc ph : phl) {
			System.out.println(ph + "\n");
		}
	}

	public void ascBongden() {
		if (phl.size() > 0) {
			System.out.println("===== Danh sách phòng học tăng dần theo số bóng đèn =====");
		} else {
			System.out.println("Danh sách phòng trống.");
		}
		Collections.sort(phl, PhongHoc.compareBD);
		for (PhongHoc ph : phl) {
			System.out.println(ph + "\n");
		}
	}
}
