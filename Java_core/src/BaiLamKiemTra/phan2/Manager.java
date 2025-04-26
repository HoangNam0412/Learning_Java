package BaiLamKiemTra.phan2;

public class Manager extends Employee {
    private String phongBan;

    public Manager(String ten, int tuoi, double luong, String phongBan) {
        super(ten, tuoi, luong);
        this.phongBan = phongBan;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Phòng ban: " + phongBan);
    }

    public void hienThiThongTin(String dinhDang) {
        if ("JSON".equalsIgnoreCase(dinhDang)) {
            System.out.println("{ \"ten\": \"" + ten + "\", \"tuoi\": " + tuoi + ", \"luong\": " + luong + ", \"phongBan\": \"" + phongBan + "\" }");
        } else {
            hienThiThongTin();
        }
    }

    @Override
    public void lamViec() {
        System.out.println(ten + " đang quản lý phòng ban: " + phongBan);
    }

    public String getPhongBan() {
        return phongBan;
    }
}


