package fis.topic.practive_02;

import java.util.Scanner;

public class thanhtoan {

		public static void main(String[] args) {
			int xeMay, xeDap,giaxeMay,giaxeDap,thanhTienxeMay,
			thanhTienxeDap,tongTiengia2Xe,tongSoxeGiuTrongNgay,
			tongTienThue,tongChiPhiNhanCong,tienLai;
			
			String bienso;
			Scanner scanner = new Scanner(System.in);
			//nhap so xe may
			System.out.println("xe máy :");
			xeMay =scanner.nextInt();
			//nhap gia xe may
			System.out.println("Giá xe máy :");
			giaxeMay =scanner.nextInt();
			//nhap so xe đạp
			System.out.println("xe đạp :");
			xeDap =scanner.nextInt();
			//nhap gia xe đạp
			System.out.println("giá xe đạp :");
			giaxeDap =scanner.nextInt();
			//thanh tien xe may
			thanhTienxeMay = xeMay*giaxeMay;
			System.out.println("thành tiền xe máy :" +thanhTienxeMay);
			//thanh tien xe đạp	
			thanhTienxeDap = xeDap*giaxeDap;
			System.out.println("thành tiền xe đạp :" +thanhTienxeDap);
			//tong so xe trong ngay
			tongSoxeGiuTrongNgay = xeMay + xeDap;	
			System.out.println("tổng số xe giữ trong ngày :" +tongSoxeGiuTrongNgay);
			//tinh tien gia 2 xe trong ngay
			tongTiengia2Xe = thanhTienxeMay + thanhTienxeDap;
			System.out.println("tổng tiền giá cả 2 xe:" +tongTiengia2Xe);
			//tong tien theu
			tongTienThue = (tongTiengia2Xe*10)/100;
			System.out.println("tổng tiền thuế :"+tongTienThue);
			//tong chi phi nhan cong
			tongChiPhiNhanCong = 100*tongSoxeGiuTrongNgay;
			System.out.println("tổng chi phí nhân công :"+tongChiPhiNhanCong);
			// tiền lãi
			tienLai = tongSoxeGiuTrongNgay - (tongTienThue + tongChiPhiNhanCong);
			System.out.println("tiền lãi :" + tienLai);
			
			
		}
	
}


