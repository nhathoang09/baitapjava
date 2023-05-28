package baitap8;

import java.util.ArrayList;
import java.util.Collections;

public class CDList {
	private ArrayList<CD> list;

	public CDList() {
		this.list = new ArrayList<CD>();
	}

	public CDList(ArrayList<CD> list) {
		this.list = list;
	}

	public void addCD(CD cd) {
		boolean flag = true;
		if (cd.getTuaCD() == null || cd.getTuaCD().trim().length() == 0) {
			cd.setTuaCD("Chưa xác định");
		}
		if (cd.getMaCD() <= 0) {
			cd.setMaCD(999999);
		}
		for (CD c : list) {
			if (c.getMaCD() == cd.getMaCD()) {
				System.out.println("Đã tồn tại mã CD");
				flag = false;
			}
		}
		if (cd.getSobaihat() <= 0) {
			System.out.println("Số bài hát phải lớn hơn 0");
			flag = false;
		}
		if (cd.getGiathanh() <= 0) {
			System.out.println("Thành tiền phải lớn hơn 0");
			flag = false;
		}
		if (flag) {
			this.list.add(cd);
			System.out.println("Thêm thành công");
		}

	}

	public void totalCD() {
		System.out.println("Số lượng đĩa CD là: " + this.list.size());
	}

	public void totalMon() {
		float total = 0;
		if (this.list.size() == 0) {
			System.out.println("Chưa có CD nào trong danh sách để tính thành tiền");
		} else {
			for (CD cd : list) {
				total += cd.getGiathanh();
			}
			System.out.println("Tổng giá thành các CD là: " + total);
		}
	}

	public void showCD() {
		if (this.list.size() == 0) {
			System.out.println("Chưa có CD nào trong danh sách");
		}
		for (CD cd : list) {
			System.out.println(cd);
		}
	}

	public void descMon() {
		if (this.list.size() == 0) {
			System.out.println("Chưa có CD nào trong danh sách");
		} else {
			System.out.println("Danh sách sau khi đã sắp xếp theo giá thành: ");
			Collections.sort(list, CD.compareMon);
			for (CD cd : list) {
				System.out.println(cd);
			}
		}
	}

	public void ascTuaCD() {
		if (this.list.size() == 0) {
			System.out.println("Chưa có CD nào trong danh sách");
		} else {
			System.out.println("Danh sách sau khi đã sắp xếp theo tựa CD: ");
			Collections.sort(list, CD.compare);
			for (CD cd : list) {
				System.out.println(cd);
			}
		}
	}
}
