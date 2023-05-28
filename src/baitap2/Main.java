package baitap2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Sinhvien sv1 = new Sinhvien(2809, "Lê Nhật Hoàng", 10, 10);
		Sinhvien sv2 = new Sinhvien(1111, "Nguyễn Văn A", 5, 7);
		Sinhvien sv3 = new Sinhvien();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mã sinh viên: ");
		sv3.setMaSV(sc.nextInt());
		sc.nextLine();
		System.out.println("Nhập tên sinh viên: ");
		sv3.setHoten(sc.nextLine());
		System.out.println("Nhập điểm lý thuyết: ");
		sv3.setDiemLT(sc.nextInt());
		System.out.println("Nhập điểm thực hành: ");
		sv3.setDiemTH(sc.nextInt());
		System.out.println("MSSS\tHọ và tên\t\tĐiểm LT\tĐiểm TH\tĐiểm TB");
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
	}

}
