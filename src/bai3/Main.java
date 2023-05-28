package bai3;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,##0.0 đ");
		Giaodichvang gdv1 = new Giaodichvang(1001, LocalDate.now(), 6700000, 2, "SJC 9999");
		Giaodichvang gdv2 = new Giaodichvang(1002, LocalDate.now(), 5660000, 10, "PNJ 9999");
		Giaodichvang gdv3 = new Giaodichvang(1003, LocalDate.now(), 1873000, 50, "Vàng 8k");
		Giaodichtiente gdtt1 = new Giaodichtiente(1011, LocalDate.now(), 500, 10, 23483, "USD");
		Giaodichtiente gdtt2 = new Giaodichtiente(1012, LocalDate.now(), 10000000, 2, 1, "VN");
		Giaodichtiente gdtt3 = new Giaodichtiente(1013, LocalDate.now(), 1000, 4, 25200, "Euro");
		
		System.out.println("Tổng số lượng vàng là: " + (gdv1.getSoluong()+gdv2.getSoluong()+gdv3.getSoluong()));
		System.out.println("Tổng số lượng thành tiền là: " + (gdtt1.getSoluong()+gdtt2.getSoluong()+gdtt3.getSoluong()));
		
		System.out.println("Trung bình thành tiền là: " + df.format((gdtt1.thanhtien()+gdtt2.thanhtien()+gdtt3.thanhtien())/3));
		
		ArrayList<Giaodichvang> gdvl = new ArrayList<Giaodichvang>();
		gdvl.add(gdv1);
		gdvl.add(gdv2);
		gdvl.add(gdv3);
		for (Giaodichvang gdv : gdvl) {
			if (gdv.getDongia()>5000000) {
				System.out.println(gdv);
			}
		}
		
//		ArrayList<Giaodichtiente> gdttl = new ArrayList<Giaodichtiente>();
//		gdttl.add(gdtt1);
//		gdttl.add(gdtt2);
//		gdttl.add(gdtt3);
//		for (Giaodichvang gdtt : gdttl) {
//			if (gdtt.getDongia()>5000000) {
//				System.out.println(gdtt);
//			}
//		}
	}

}
