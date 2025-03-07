package Buoi4;

import java.util.Scanner;

public class TrenLop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào phần tử của mảng:");
        int n = sc.nextInt();
        int [] array = new int[n];
        int sum = 0;

        //Nhập phần tử vào mảng
        System.out.println("Nhập vào các phần từ:");
        for (int i = 0; i < n; i++) {
            System.out.println("phan tu thứ " + (i + 1) + ": ");
            array[i] = sc.nextInt();
            sum += array[i];
        }
        for (int i = 0 ; i < array.length ; i++) { }
        //hien thi cac so

        System.out.println("Các so trong mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i] + " ");
        }
        //tinh tong cac so
        System.out.println("Tổng các số trong mảng là: "+ sum);

        //tim so lon nhat so nho nhat

    }
}
