package bai6;

import java.util.Comparator;

public class PhongHoc {
	private int maphong;
	private String daynha;
	private float dientich;
	private int sobongden;

	public PhongHoc(int maphong, String daynha, float dientich, int sobongden) {
		this.maphong = maphong;
		this.daynha = daynha;
		this.dientich = dientich;
		this.sobongden = sobongden;
	}

	public PhongHoc() {
	}

	public int getMaphong() {
		return maphong;
	}

	public void setMaphong(int maphong) {
		this.maphong = maphong;
	}

	public String getDaynha() {
		return daynha;
	}

	public void setDaynha(String daynha) {
		this.daynha = daynha;
	}

	public float getDientich() {
		return dientich;
	}

	public void setDientich(float dientich) {
		this.dientich = dientich;
	}

	public int getSobongden() {
		return sobongden;
	}

	public void setSobongden(int sobongden) {
		this.sobongden = sobongden;
	}

	public boolean datchuan() {
		return (dientich / 10 <= sobongden) ? true : false;
	}

	public static Comparator<PhongHoc> compareDN = new Comparator<PhongHoc>() {
		@Override
		public int compare(PhongHoc o1, PhongHoc o2) {
			if (o1.daynha.compareTo(o2.daynha) == 0) {
				return o1.maphong - o2.maphong;
			} else {
				return o1.daynha.compareTo(o2.daynha);
			}
		}
	};

	public static Comparator<PhongHoc> compareDT = new Comparator<PhongHoc>() {
		@Override
		public int compare(PhongHoc o1, PhongHoc o2) {
			if (o1.dientich - o2.dientich == 0) {
				return o1.maphong - o2.maphong;
			} else {
				return (o2.dientich - o1.dientich > 0) ? 1 : -1;
			}
		}
	};

	public static Comparator<PhongHoc> compareBD = new Comparator<PhongHoc>() {
		@Override
		public int compare(PhongHoc o1, PhongHoc o2) {
			if (o1.sobongden - o2.sobongden == 0) {
				return o1.maphong - o2.maphong;
			} else {
				return o1.sobongden - o2.sobongden;
			}
		}
	};
}
