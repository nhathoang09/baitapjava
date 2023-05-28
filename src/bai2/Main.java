package bai2;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,##0 đ");
		Scanner sc = new Scanner(System.in);
		Sachgiaokhoa sgk1 = new Sachgiaokhoa(101, LocalDate.now(), 80000, 50, "Lê Nhật Hoàng", true);
		Sachgiaokhoa sgk2 = new Sachgiaokhoa(102, LocalDate.now(), 10000, 30, "Nguyễn Văn A", false);
		Sachgiaokhoa sgk3 = new Sachgiaokhoa(103, LocalDate.now(), 40000, 10, "Huỳnh Văn B", false);
		Sachthamkhao stk1 = new Sachthamkhao(201, LocalDate.now(), 25000, 40, "Trần Thị C", 5000);
		Sachthamkhao stk2 = new Sachthamkhao(202, LocalDate.now(), 45000, 100, "Đào Thị D", 15000);
		Sachthamkhao stk3 = new Sachthamkhao(203, LocalDate.now(), 75000, 20, "Võ Thị E", 25000);
		System.out.println("Tổng thành tiền sách giáo khoa là: " + df.format(sgk1.thanhtien()+sgk2.thanhtien()+sgk3.thanhtien()));
		System.out.println("Tổng thành tiền sách tham khảo là: " + df.format(stk1.thanhtien()+stk2.thanhtien()+stk3.thanhtien()));
		System.out.println("Trung bình cộng đơn giá của các sách tham khảo là: " + df.format((stk1.getDongia()+stk2.getDongia()+stk3.getDongia())/3));
		ArrayList<Sachgiaokhoa> sgkl = new ArrayList<Sachgiaokhoa>();
		sgkl.add(sgk1);
		sgkl.add(sgk2);
		sgkl.add(sgk3);
		System.out.println("Nhập tên nhà xuất bản sách giáo khoa: ");
		String temp = sc.nextLine();
		for (Sachgiaokhoa sgk : sgkl) {
			if (temp.compareTo(sgk.getNhaXB()) == 0) {
				System.out.println(sgk);
			}
		}
	}

}
