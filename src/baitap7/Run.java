package baitap7;

public class Run {

	public static void main(String[] args) {
		ToaDo td = new ToaDo(5,5);
		HinhTron ht = new HinhTron();
		ht.setBanKinh(10.5);
		System.out.println(td.name + " tâm O"+ td + " với bán kính " + ht.getBanKinh() + " có diện tích và chu vi lần lượt là " + ht.tinhDienTich() + " và " + ht.tinhChuVi());
	}

}
