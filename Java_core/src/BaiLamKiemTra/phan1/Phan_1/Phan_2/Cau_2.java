package BaiLamKiemTra.phan1.Phan_1.Phan_2;

import java.util.Scanner;

public class Cau_2 {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên từ 1 đến 7: ");
        int soNguyen = scanner.nextInt();
        String day;
        switch (soNguyen){
            case 1:
                day = "Chủ nhật";
                break;
            case 2:
                day = "Thu hai";
                break;
            case 3:
                day = "Thu ba";
                break;
            case 4:
                day = "Thu tu";
                break;
            case 5:
                day = "Thu nam";
                break;
            case 6:
                day = "Thu sau";
                break;
            case 7:
                day = "Thu bay";
                break;
            default:
                day = "Nhap tu so 1 den 7";
        }
        System.out.println(day);
    }
}
