package Buoi6;

public class Animal {
    String name;
    String species;
    public Animal(String name, String species ){
        this.name = name;
        this.species = species;
    }
    public void eat(){
        System.out.println(name + " (" +species +") đang ăn." );
    }
    public void run(){
        System.out.println(name+ "(" +species+ " đang chạy. ");
    }
    public void Info(){
        System.out.println("Tên " +name + "Loài " +species);
    }

}
