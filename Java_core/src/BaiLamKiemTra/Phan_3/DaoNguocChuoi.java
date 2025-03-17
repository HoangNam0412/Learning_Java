package BaiLamKiemTra.Phan_3;

import java.util.Scanner;

public class DaoNguocChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot chuoi: ");
        String chuoi = scanner.nextLine();
        StringBuilder sb = new StringBuilder(chuoi);
        String daoNguoc = sb.reverse().toString();

        System.out.println("Chuoi Dao Nguoc: "+ daoNguoc);

    }
}