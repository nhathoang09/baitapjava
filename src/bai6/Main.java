package bai6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		QuanlyDSPH dsph = new QuanlyDSPH();
		LyThuyet lt1 = new LyThuyet(1112, "A", 30, 3, false);
		LyThuyet lt2 = new LyThuyet(1111, "F", 35, 4, true);
		MayTinh mt1 = new MayTinh(2121, "B", 30, 3, 20);
		MayTinh mt2 = new MayTinh(2111, "B", 30, 3, 10);
		ThiNghiem tn1 = new ThiNghiem(3111, "C", 40, 4, "Sinh học", 100, true);
		dsph.addLT(lt1);
		dsph.addLT(lt2);
		dsph.addMT(mt1);
		dsph.addMT(mt2);
		dsph.addTN(tn1);

		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		do {
			System.out.println("---------------------------- \n" + "Nhập 1 để thêm phòng học vào danh sách. \n"
					+ "Nhập 2 để tìm kiếm phòng học dựa trên mã phòng. \n"
					+ "Nhập 3 để lấy thông tin toàn bộ danh sách phòng học. \n"
					+ "Nhập 4 để lấy thông tin phòng học đạt chuẩn. \n"
					+ "Nhập 5 để sắp xếp danh sách tăng dần theo dãy nhà. \n"
					+ "Nhập 6 để sắp xếp danh sách giảm dần theo diện tích. \n"
					+ "Nhập 7 để sắp xếp danh sách tăng dần theo số bóng đèn. \n" + "Nhập 0 để thoát." + "\n");
			System.out.println("Nhập lựa chọn: ");
			int choose = sc.nextInt();
			System.out.println("----------------------------");

			switch (choose) {
			case 1:
				System.out.println("Nhập 1 để thêm phòng học lý thuyết. \n" + "Nhập 2 để thêm phòng học máy tính. \n"
						+ "Nhập 3 để thêm phòng học thí nghiệm \n" + "\n" + "Nhập loại phòng cần thêm vào danh sách: ");
				int loaiphong = sc.nextInt();
				if (loaiphong >= 1 && loaiphong <= 3) {
					System.out.println("----------------------------");
					System.out.println("Nhập mã phòng: ");
					int maphong = sc.nextInt();
					sc.nextLine();
					System.out.println("Nhập dãy nhà: ");
					String daynha = sc.nextLine();
					System.out.println("Nhập diện tích phòng: ");
					float dientich = sc.nextFloat();
					System.out.println("Nhập số bóng đèn:  ");
					int sobongden = sc.nextInt();
					switch (loaiphong) {
					case 1:
						System.out.println("Có máy chiếu hay không(true/false): ");
						boolean maychieu = sc.nextBoolean();
						LyThuyet lt = new LyThuyet(maphong, daynha, dientich, sobongden, maychieu);
						dsph.addLT(lt);
						break;
					case 2:
						System.out.println("Nhập số máy tính: ");
						int maytinh = sc.nextInt();
						MayTinh mt = new MayTinh(maphong, daynha, dientich, sobongden, maytinh);
						dsph.addMT(mt);
						break;
					case 3:
						System.out.println("Nhập chuyên ngành: ");
						String chuyennganh = sc.nextLine();
						sc.nextLine();
						System.out.println("Nhập sức chứa: ");
						int succhua = sc.nextInt();
						System.out.println("Có bồn chứa hay không(true/false): ");
						boolean bonchua = sc.nextBoolean();
						ThiNghiem tn = new ThiNghiem(maphong, daynha, dientich, sobongden, chuyennganh, succhua,
								bonchua);
						dsph.addTN(tn);
						break;
					}
				} else {
					System.out.println("Loại phòng không tồn tại!");
				}
				break;
			case 2:
				System.out.println("Nhập mã phòng học: ");
				int ma = sc.nextInt();
				dsph.searchPhong(ma);
				break;
			case 3:
				dsph.showPhong();
				break;
			case 4:
				dsph.showPhongDC();
				break;
			case 5:
				dsph.ascDaynha();
				break;
			case 6:
				dsph.descDientich();
				break;
			case 7:
				dsph.ascBongden();
				break;
			case 0:
				flag = false;
				System.out.println("Đã thoát");
				break;
			default:
				System.out.println("Vui lòng nhập lại lựa chọn");
				break;
			}
		} while (flag);
	}

}
