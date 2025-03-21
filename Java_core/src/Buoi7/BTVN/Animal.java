package Buoi7.BTVN;

public abstract class Animal {
    protected String name;
    protected int tuoi;
    protected String loaiDongvat;
    protected String mauSac;

    public abstract void makeSound();

    public void inputInFo(java.util.Scanner sc){
        System.out.println("Nhập tên: ");
        name = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        tuoi = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập loài: ");
        loaiDongvat = sc.nextLine();
        System.out.println("Nhập màu sắc: ");
        mauSac = sc.nextLine();
    }
    public void hienThiThongtin(){
        System.out.println("Tên: " +name);
        System.out.println("Tuổi: "+ tuoi);
        System.out.println("Loài: "+loaiDongvat);
        System.out.println("Màu: "+mauSac);
    }
    public int getTuoi(){
        return tuoi;
    }

}
