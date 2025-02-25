package buoi2;

import java.util.Scanner;

public class Baitap {
    public static void main(String[] args) {
//        //bai1
//        System.out.println("Nhap ho:");
//        String ho = new Scanner(System.in).nextLine();
//        System.out.println("Nhap ten");
//        String ten = new Scanner(System.in).nextLine();
//        System.out.println("Ngay sinh la:");
//        int ngay = new Scanner(System.in).nextInt();
//        System.out.println("Ngay thang la:");
//        int thang = new Scanner(System.in).nextInt();
//        System.out.println("Ngay nam la:");
//        int nam = new Scanner(System.in).nextInt();
//        System.out.println("Que quan la:");
//        String quequan = new Scanner(System.in).nextLine();
//        System.out.println("Truong hoc:");
//        String truonghoc = new Scanner(System.in).nextLine();
//
//        System.out.println("Xin chao ban, toi la "+ ho + ten +" den tu " + quequan + ", sinh ngay" + ngay + "/" + thang + "/" + nam + "truong hoc la" + truonghoc);

//        // nhap vao hai so tinh
//        System.out.println("Nhap so tinh 1:");
//        int soTinh1 = new Scanner(System.in).nextInt();
//        System.out.println("Nhap so tinh 2:");
//        int soTinh2 = new Scanner(System.in).nextInt();
//        int soTong = soTinh1 + soTinh2;
//        int soTich = soTinh1 - soTinh2;
//        int soThuong = soTinh1 * soTinh2;
//        int soDu = soTinh1 % soTinh2;
//        System.out.println("So tong la: " + soTong);
//        System.out.println("So tich la: " + soTich);
//        System.out.println("So thuong la: " + soThuong);
//        System.out.println("So du la: " + soDu);


        // Cho phép nhận vào hai cạnh hình chữ nhật tính diện tích hình chữ nhật
        System.out.println("Nhap chieu dai");
        int chieuDai = new Scanner(System.in).nextInt();
        System.out.println("Nhap chieu rong");
        int chieuRong = new Scanner(System.in).nextInt();
        int dienTinh = chieuDai * chieuRong;
        System.out.println("Dien tinh la: " + dienTinh);
    }
}
