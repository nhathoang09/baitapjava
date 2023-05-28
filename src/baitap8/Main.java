package baitap8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bài tập 8");
		CDList cdl = new CDList();
		boolean flag = true;
		do {
			System.out.println(
					
					"---------------------------- \n"
					+ "Nhập 1 để thêm đĩa CD. \n"
					+ "Nhập 2 để tính số lượng CD. \n"
					+ "Nhập 3 để tính giá thành các CD. \n"
					+ "Nhập 4 để tính hiển thị danh sách các CD. \n"
					+ "Nhập 5 để sắp xếp danh sách CD theo thứ tự giảm dần của giá thành. \n"
					+ "Nhập 6 để xắp xếp danh sách CD theo thứ tự tăng dần của tựa CD. \n"
					+ "Nhập 0 để thoát."
					+ "\n");
			System.out.println("Nhập lựa chọn: ");
			int choose = sc.nextInt();
			System.out.println("----------------------------");

			switch (choose) {
			case 1:
				System.out.println("Nhập mã CD: ");int maCD = sc.nextInt();
				sc.nextLine();
				System.out.println("Nhập tựa CD");String tuaCD = sc.nextLine();
				System.out.println("Nhập số bài hát: ");int sobaihat = sc.nextInt();
				System.out.println("Nhập giá thành: ");float giathanh = sc.nextFloat();
				CD cd = new CD(maCD, tuaCD, sobaihat, giathanh);
				cdl.addCD(cd);
				break;
			case 2:
				cdl.totalCD();
				break;
			case 3:
				cdl.totalMon();
				break;
			case 4:
				cdl.showCD();
				break;
			case 5:
				cdl.descMon();
				break;
			case 6:
				cdl.ascTuaCD();
				break;
			case 0:
				flag = false;
				System.out.println("Đã thoát");
				break;
			default:
				System.out.println("Vui lòng nhập lại lựa chọn");
				break;
			}
		}while (flag);
	}

}
