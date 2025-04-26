package BaiLamKiemTra.phan2;

public class Employee implements Workable {
    public String ten;
    public Double luong;
    protected int tuoi;

    public Employee(String ten, int tuoi, double luong) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.luong = luong;
        lamViec();
    }

    public void hienThiThongTin() {
        System.out.println("Tên: " + ten + ", Tuổi: " + tuoi + ", Lương: " + luong);
    }

    public void capNhatLuong(double luongMoi) {
        if (luongMoi < 0) {
            throw new IllegalArgumentException("Lương không thể nhỏ hơn 0");
        }
        this.luong = luongMoi;
    }

    @Override
    public void lamViec() {
        System.out.println(ten + " đang làm việc như một nhân viên.");
    }

    @Override
    public void work() {

    }
}


