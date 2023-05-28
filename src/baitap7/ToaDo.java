package baitap7;

public class ToaDo {
	public String name = "Hình tròn";
	private int x;
	private int y;

	public ToaDo() {
	}

	public ToaDo(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}
