package BaiLamKiemTra.Phan_2;

import java.util.Scanner;

public class Cau_1 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên: ");
        int number = scanner.nextInt();
        if (number % 2 == 0){
            System.out.println("Số Chẵn");
        }else {
            System.out.println("Số lẻ");
        }
    }
}
