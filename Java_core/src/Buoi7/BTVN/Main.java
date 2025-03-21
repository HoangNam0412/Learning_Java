package Buoi7.BTVN;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Khởi tạo ZooAdvanced
        ZooAdvanced zooAdvanced = new ZooAdvanced();

        // Nhập thông tin sẵn cho Dog, Cat, Bird
        Dog dog = new Dog();
        System.out.println("Nhập thông tin cho Chó");
        dog.inputInFo(sc);
        zooAdvanced.addAnimal(dog);

        Cat cat = new Cat();
        System.out.println("\nNhập thông tin cho Mèo");
        cat.inputInFo(sc);
        zooAdvanced.addAnimal(cat);

        Bird bird = new Bird();
        System.out.println("\nNhập thông tin cho Chim");
        bird.inputInFo(sc);
        zooAdvanced.addAnimal(bird);

        // Hiển thị thông tin và phát âm thanh
        System.out.println("\n--- Thông tin tất cả động vật trong vườn thú ---");
        zooAdvanced.displayAllInfo();

        System.out.println("\n--- Âm thanh của tất cả động vật ---");
        zooAdvanced.makeAllSounds();

        // Cho chim bay
        System.out.println("\n--- Chim bay trong vườn thú ---");
        zooAdvanced.flyAllBirds();

        // Thêm nhiều động vật bằng ZooAdvanced
        zooAdvanced.addAnimals();

        // Sau khi thêm, có thể gọi lại các hàm hiển thị
        System.out.println("\n--- Danh sách động vật sau khi thêm mới và sắp xếp ---");
        zooAdvanced.displayAllInfo();
        System.out.println("\n--- Các động vật kêu sau khi thêm mới ---");
        zooAdvanced.makeAllSounds();
    }
}
