package Buoi7.BTVN;
import java.util.ArrayList;

public class Zoo {
    protected ArrayList<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void makeAllSounds() {
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

    public void displayAllInfo() {
        for (Animal animal : animals) {
            animal.hienThiThongtin();
            System.out.println("--------------------");
        }
    }

    public void flyAllBirds() {
        for (Animal animal : animals) {
            if (animal instanceof Bird) {
                ((Bird) animal).fly();
            }
        }
    }
}
