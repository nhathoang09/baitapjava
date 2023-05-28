package baitap4;

public class Vehicle {
	private String chuxe;
	private String loaixe;
	private int trigiaxe;
	private int dungtichxilanh;

	public Vehicle() {

	}

	public Vehicle(String chuxe, String loaixe, int trigiaxe, int dungtichxilanh) {
		this.chuxe = chuxe;
		this.loaixe = loaixe;
		this.trigiaxe = trigiaxe;
		this.dungtichxilanh = dungtichxilanh;
	}

	public String getChuxe() {
		return chuxe;
	}

	public void setChuxe(String chuxe) {
		this.chuxe = chuxe;
	}

	public String getLoaixe() {
		return loaixe;
	}

	public void setLoaixe(String loaixe) {
		this.loaixe = loaixe;
	}

	public int getTrigiaxe() {
		return trigiaxe;
	}

	public void setTrigiaxe(int trigiaxe) {
		this.trigiaxe = trigiaxe;
	}

	public int getDungtichxilanh() {
		return dungtichxilanh;
	}

	public void setDungtichxilanh(int dungtichxilanh) {
		this.dungtichxilanh = dungtichxilanh;
	}

	@Override
	public String toString() {
		return "Vehicle [chuxe=" + chuxe + ", loaixe=" + loaixe + ", trigiaxe=" + trigiaxe + ", dungtichxilanh="
				+ dungtichxilanh + "]";
	}
	
	public int thuetruocba() {
		if (dungtichxilanh < 100) {
			return trigiaxe*1/100;
		}else if (dungtichxilanh <= 200) {
			return trigiaxe*3/100;
		}else {
			return trigiaxe*5/100;
		}
	}
}
