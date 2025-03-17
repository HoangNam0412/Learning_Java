package BaiLamKiemTra.Phan_1;

import java.util.Scanner;

public class Cau1 {
    public static void main (String[] args){
        // tạo Scanner
        Scanner scanner = new Scanner(System.in);
        // nhập số nguyên
        System.out.println("Nhập vào số nguyên thứ 1: ");
        int sO1 = scanner.nextInt();//nhap 1
        System.out.println("Nhap vao so nguyen thu 2: ");
        int sO2 = scanner.nextInt(); //nhap 3

        // tính tổng
        int  sum = sO1 + sO2;


        //in ra
        System.out.println("Tong cua 2 so la: " +sum);
    }
}
