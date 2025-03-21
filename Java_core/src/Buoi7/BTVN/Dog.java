package Buoi7.BTVN;

public class  Dog extends Animal {
    private String breed;

    @Override
    public void makeSound(){
        System.out.println("Woof woof!");
    }
    @Override
    public void inputInFo(java.util.Scanner sc){
        super.inputInFo(sc);
        System.out.println("Nhap loai cho: ");
        breed = sc.nextLine();
    }
    @Override
    public void hienThiThongtin(){
        super.hienThiThongtin();
        System.out.println("Giống loài: "+breed);

    }

}
