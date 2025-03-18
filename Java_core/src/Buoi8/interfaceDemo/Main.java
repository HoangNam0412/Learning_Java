package Buoi8.interfaceDemo;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        System.out.println("Nhap 2 so: ");
        float soA = new Scanner(System.in).nextInt();
        float soB = new Scanner(System.in).nextInt();
        //triển khai thông thường
        IPhepToan phepToan1 = new PhepToanlmpl();
        System.out.println(phepToan1.phepChia(soA,soB));

        //Triển khai qua anonymous class
        IPhepToan phepToan2 = new IPhepToan() {
            @Override
            public float phepChia(float soA, float soB) {
                return soA / soB;
            }
        };
            System.out.println(phepToan2.phepChia(soA,soB));
            // Triển khai lamda

        IPhepToan phepToan3 = (a,b) -> a / b;
        System.out.println(phepToan3.phepChia(soA, soB));
    }
}
