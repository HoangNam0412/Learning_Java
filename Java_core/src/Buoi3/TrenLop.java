package Buoi3;

import java.util.Scanner;

public class TrenLop {
     public static void main (String[] args){
         Scanner scanner = new Scanner(System.in);
         int soLuongSoAm = 0;
         int soLuongSoDuong = 0;
         int tongAm = 0;
         int tongDuong = 0;
         System.out.println("Nhập vào 10 số nguyên: ");
         int soNguyen = new Scanner(System.in).nextInt();
         for (int i = 0; i < 10; i++) {
             System.out.println("Nhập vào số thứ "+ (i+1) + ": ");
             int numBer = scanner.nextInt();

             if (numBer < 0){
                    soLuongSoAm++;
                   tongAm = tongAm - numBer;
             }
             if (numBer > 0){
                    soLuongSoDuong++;
                    tongDuong = tongDuong + numBer;
             }
         }
         System.out.println("Số lượng số âm: "+soLuongSoAm);
         System.out.println("So lượng số dương: "+soLuongSoDuong);
         System.out.println("Tổng Âm: "+tongAm);
         System.out.println("Tổng Dương: "+tongDuong);
     }
}
