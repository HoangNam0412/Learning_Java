package BaiLamKiemTra.Phan_2;

import java.util.Scanner;

public class Cau_3 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số chuyến: ");
        int tongChuyen = scanner.nextInt();


        int giaVe = 10000;
        double tongTien = tongChuyen * giaVe;
        double giamGia = 0;

        if (tongChuyen >= 10){
            giamGia = 0.2;
        }else if (tongChuyen >= 5){
            giamGia = 0.1;
        }
        double tienPhaiTra = tongTien * (1 - giamGia);
        System.out.println("Số chuyến đi: " + tongChuyen);
        System.out.println("Tổng tiền trước giảm giá: " + tongTien + " VNĐ");
        System.out.println("Mức giảm giá: " + (giamGia * 100) + "%");
        System.out.println("Tổng tiền phải trả: " + tienPhaiTra + " VNĐ");


    }
}
