package Buoi7.KeThuaHinh;

//import Buoi7.KeThuaHinh.Hinh;

class HinhTron extends Hinh {
    private double banKinh;

    public HinhTron(double banKinh) {
        super("Hình tròn");
        this.banKinh = banKinh;
        tinhChuVi();
        tinhDienTich();
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
        tinhChuVi();
        tinhDienTich();
    }

    @Override
    public void tinhChuVi() {
        super.setcHuVi(2 * Math.PI * banKinh);
    }
}

