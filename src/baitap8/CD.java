package baitap8;

import java.util.Comparator;

public class CD {
	private int maCD;
	private String tuaCD;
	private int sobaihat;
	private float giathanh;

	public CD() {
	}

	public CD(int maCD, String tuaCD, int sobaihat, float giathanh) {
		this.maCD = maCD;
		this.tuaCD = tuaCD;
		this.sobaihat = sobaihat;
		this.giathanh = giathanh;
	}

	public int getMaCD() {
		return maCD;
	}

	public void setMaCD(int maCD) {
		if (maCD > 0) {
			this.maCD = maCD;
		} else {
			this.maCD = 999999;
		}
	}

	public String getTuaCD() {
		return tuaCD;
	}

	public void setTuaCD(String tuaCD) {
		this.tuaCD = tuaCD;
	}

	public int getSobaihat() {
		return sobaihat;
	}

	public void setSobaihat(int sobaihat) {
		try {
			if (sobaihat > 0) {
				this.sobaihat = sobaihat;
			}
		} catch (Exception e) {
			System.out.println("Số bài hát phải lớn hơn 0");
		}
	}

	public float getGiathanh() {
		return giathanh;
	}

	public void setGiathanh(float giathanh) {
		try {
			if (sobaihat > 0) {
				this.giathanh = giathanh;
			}
		} catch (Exception e) {
			System.out.println("Giá thành phải lớn hơn 0");
		}
	}

	@Override
	public String toString() {
		return "Mã CD: " + maCD + ", tựa CD: " + tuaCD + ", số bài hát: " + sobaihat + ", giá thành: " + giathanh;
	}

	public static Comparator<CD> compare = new Comparator<CD>() {
		@Override
		public int compare(CD c1, CD c2) {
			if (c1.tuaCD.compareTo(c2.tuaCD) == 0) {
				return c1.maCD - c2.maCD;
			} else {
				return c1.tuaCD.compareTo(c2.tuaCD);
			}
		}
	};
	
	public static Comparator<CD> compareMon = new Comparator<CD>() {
		@Override
		public int compare(CD c1, CD c2) {
			if (c1.giathanh - c2.giathanh == 0) {
				return c2.maCD - c1.maCD;
			} else {
				return (c2.giathanh - c1.giathanh) > 0 ? 1 : -1;
			}
		}
	};
}
