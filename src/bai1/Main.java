package bai1;

import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,##0 đ");
		Xenoithanh in = new Xenoithanh(28, "Lê Nhật Hoàng", 10, 23, 50, 500000);
		Xengoaithanh out = new Xengoaithanh(9, "Nguyễn Văn A", 5, "Gia Lai", 500, 50000000);
		System.out.println("Doanh thu xe nội thành là: " + df.format(in.getDoanhthu()*in.getSoxe()));
		System.out.println("Doanh thu xe ngoại thành là: " + df.format(out.getDoanhthu()*out.getSoxe()));
		System.out.println("Tổng doanh thu tất cả chuyến xe là: " + df.format(in.getDoanhthu()*in.getSoxe() + out.getDoanhthu()*out.getSoxe()));
	}

}
