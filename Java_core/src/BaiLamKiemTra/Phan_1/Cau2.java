package BaiLamKiemTra.Phan_1;

import java.util.Scanner;

public class Cau2 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao ban kinh hinh tron: ");
        double banKinh = scanner.nextDouble();
        // tính diện tích hình tròn
        double dienTich = Math.PI * banKinh * banKinh;
        // chuyển vể int để kiem tra
        int kiemTraDienTich = (int) dienTich;
        //Kiểm tra chẵn lẻ
        System.out.println("Dien tich hinh tron la: "+ dienTich);
        if (kiemTraDienTich % 2 == 0){
            System.out.println("Chẵn");
        }else {
            System.out.println("Lẻ");
        }

    }
}
