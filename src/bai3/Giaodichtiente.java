package bai3;

import java.time.LocalDate;

public class Giaodichtiente extends Giaodichvang {
	private float tigia;
	private String loaitiente;
	public Giaodichtiente(int magd, LocalDate ngaygd, float dongia, int soluong, float tigia,
			String loaitiente) {
		super(magd, ngaygd, dongia, soluong);
		this.tigia = tigia;
		this.loaitiente = loaitiente;
	}
	public float thanhtien() {
		if (loaitiente.compareTo("VN") == 0) {
			return getSoluong()*getDongia();
		}else {
			return getDongia()*getSoluong()*tigia;
		}
	}
}
