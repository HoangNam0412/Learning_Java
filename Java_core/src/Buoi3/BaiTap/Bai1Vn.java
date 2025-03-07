package Buoi3.BaiTap;

public class Bai1Vn {
    public static void main(String[] args) {
        int n = Utils.nhapN();
        Long tong = tinhTongLapPhuong(n);
        System.out.println("Tong Lap Phuong: " + tong);
    }
    public static Long tinhTongLapPhuong(int n){
        Long tong = 0;
        for(int i = 1; i <= n; i++){
            tong += Math.pow(i,3);
        }
        return tong;
    }
}
