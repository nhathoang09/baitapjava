package baitap4;

public class Main {

	public static void main(String[] args) {
		Vehicle xe1 = new Vehicle("Lê Nhật Hoàng", "Winner", 32000000, 150);
		Vehicle xe2 = new Vehicle("Nguyễn Văn A", "SH350i", 300000000, 300);
		Vehicle xe3 = new Vehicle("Trần Thị B", "Cup50", 8000000, 50);
		System.out.println("Thuế trước bạ xe 1 là: " + xe1.thuetruocba());
		System.out.println("Thuế trước bạ xe 2 là: " + xe2.thuetruocba());
		System.out.println("Thuế trước bạ xe 3 là: " + xe3.thuetruocba());
	}

}
