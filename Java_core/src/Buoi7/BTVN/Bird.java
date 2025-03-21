package Buoi7.BTVN;

public class Bird extends Animal {
    private double wingSpan;

    @Override
    public void makeSound(){
        System.out.println("Tweet tweet!");
    }
    @Override
    public void inputInFo(java.util.Scanner sc){
        super.inputInFo(sc);
        System.out.println("Chiều dài sải cánh: ");
        wingSpan = sc.nextFloat();
        sc.nextLine();
    }
    @Override
    public void hienThiThongtin(){
        super.hienThiThongtin();
        System.out.println("Sải cánh: "+wingSpan+" cm");
    }
    public void fly(){
        System.out.println(name + " đang bay trên bầu trời với sải cánh " +wingSpan+" cm");
    }
}
