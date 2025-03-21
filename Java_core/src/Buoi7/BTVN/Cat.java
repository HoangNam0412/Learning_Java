package Buoi7.BTVN;

public class  Cat extends Animal {
    private String breed;

    @Override
    public void makeSound(){
        System.out.println("Meow Meow!");
    }
    @Override
    public void inputInFo(java.util.Scanner sc){
        super.inputInFo(sc);
        System.out.println("Nhap loai meo: ");
        breed = sc.nextLine();
    }
    @Override
    public void hienThiThongtin(){
        super.hienThiThongtin();
        System.out.println("Giống loài: "+breed);

    }

}
