package Buoi3.BaiTap;

import java.util.Scanner;

public class Utils {
    public static int nhapN() {
        int n = 0;
        do{
            System.out.println("Nhập vào n: ");
            n = new Scanner(System.in).nextInt();
            if (n<0){
                System.out.println("N phải > 0");
            }
        } while (n < 0);
        return n;
    }
}
