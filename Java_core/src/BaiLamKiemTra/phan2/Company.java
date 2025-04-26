package BaiLamKiemTra.phan2;

import BaiLamKiemTra.phan2.Employee;
import BaiLamKiemTra.phan2.Manager;

import java.util.*;

public class Company {
    private ArrayList<Employee> danhSachNhanVien = new ArrayList<>();
    private HashMap<String, Double> bangLuong = new HashMap<>();
    private HashSet<String> danhSachPhongBan = new HashSet<>();

    public Company() {
        danhSachNhanVien.add(new Employee("An", 25, 5000));
        danhSachNhanVien.add(new Manager("Bình", 35, 10000, "Công nghệ thông tin"));
        danhSachNhanVien.add(new Employee("Châu", 28, 6000));
        capNhatBangLuong();
        capNhatDanhSachPhongBan();
    }

    private void capNhatBangLuong() {
        for (Employee nv : danhSachNhanVien) {
            bangLuong.put(nv.ten, nv.luong);
        }
    }

    private void capNhatDanhSachPhongBan() {
        for (Employee nv : danhSachNhanVien) {
            if (nv instanceof Manager) {
                danhSachPhongBan.add(((Manager) nv).getPhongBan());
            }
        }
    }

    public void themNhanVien(Employee nhanVien) {
        danhSachNhanVien.add(nhanVien);
        bangLuong.put(nhanVien.ten, nhanVien.luong);
        if (nhanVien instanceof Manager) {
            danhSachPhongBan.add(((Manager) nhanVien).getPhongBan());
        }
        System.out.println("Đã thêm nhân viên thành công!");
    }

    public void hienThiTatCaNhanVien() {
        for (Employee nv : danhSachNhanVien) {
            nv.hienThiThongTin();
        }
    }

    public void capNhatLuongNhanVien(String ten, double luongMoi) {
        for (Employee nv : danhSachNhanVien) {
            if (nv.ten.equalsIgnoreCase(ten)) {
                try {
                    nv.capNhatLuong(luongMoi);
                    bangLuong.put(nv.ten, luongMoi);
                    System.out.println("Cập nhật lương thành công!");
                } catch (IllegalArgumentException e) {
                    System.out.println("Lỗi: " + e.getMessage());
                }
                return;
            }
        }
        System.out.println("Không tìm thấy nhân viên!");
    }

    public void timKiemLuongTheoTen(String ten) {
        if (bangLuong.containsKey(ten)) {
            System.out.println("Lương của " + ten + " là: " + bangLuong.get(ten));
        } else {
            System.out.println("Không tìm thấy nhân viên!");
        }
    }

    public void themPhongBan(String phongBan) {
        if (danhSachPhongBan.add(phongBan)) {
            System.out.println("Đã thêm phòng ban thành công!");
        } else {
            System.out.println("Phòng ban đã tồn tại!");
        }
    }

    public void hienThiDanhSachPhongBan() {
        System.out.println("Danh sách phòng ban:");
        for (String pb : danhSachPhongBan) {
            System.out.println(pb);
        }
    }

    public void sapXepNhanVienTheoLuongGiamDan() {
        danhSachNhanVien.sort((nv1, nv2) -> Double.compare(nv2.luong, nv1.luong));
        System.out.println("Danh sách nhân viên sau khi sắp xếp theo lương giảm dần:");
        hienThiTatCaNhanVien();
    }

    public void timKiemNhanVienTheoTen(String ten) {
        for (Employee nv : danhSachNhanVien) {
            if (nv.ten.equalsIgnoreCase(ten)) {
                nv.hienThiThongTin();
                return;
            }
        }
        System.out.println("Không tìm thấy nhân viên!");
    }
}
