package BaiLamKiemTra.Phan_3;

import java.util.Scanner;

public class ChuoiDoiXUng {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi: ");
        String chuoiKyTu = scanner.nextLine();
        String chuocDaoNguoc = new StringBuilder(chuoiKyTu).reverse().toString();
        if (chuoiKyTu.equalsIgnoreCase(chuocDaoNguoc)){
            System.out.println("Chuoi la Palindrome");
        }else {
            System.out.println("Chuoi khong phai la Palindrome");
        }
    }
}
