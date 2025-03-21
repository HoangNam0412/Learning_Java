package Buoi7.BTVN;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ZooAdvanced extends Zoo {

    // Phương thức nhập số lượng và thêm động vật
    public void addAnimals() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng động vật muốn thêm: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("----- Thêm động vật thứ " + (i + 1) + " -----");
            System.out.print("Chọn loại động vật (1: Dog, 2: Cat, 3: Bird): ");
            int choice = Integer.parseInt(sc.nextLine());
            Animal animal = null;

            switch (choice) {
                case 1:
                    animal = new Dog();
                    break;
                case 2:
                    animal = new Cat();
                    break;
                case 3:
                    animal = new Bird();
                    break;
                default:
                    System.out.println("Loại không hợp lệ, bỏ qua!");
                    continue;
            }

            if (animal != null) {
                animal.inputInFo(sc);
                addAnimal(animal);
            }
        }

        // Sau khi thêm xong, sắp xếp theo tuổi
        sortByAge();
    }

    // Sắp xếp theo tuổi tăng dần
    private void sortByAge() {
        Collections.sort(animals, new Comparator<Animal>() {
            @Override
            public int compare(Animal a1, Animal a2) {
                return Integer.compare(a1.getTuoi(), a2.getTuoi());
            }
        });

        System.out.println("\n----- Danh sách sau khi sắp xếp theo tuổi -----");
        displayAllInfo();
    }
}

