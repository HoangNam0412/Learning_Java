package BaiLamKiemTra.phan2;
import BaiLamKiemTra.phan2.Employee;
import BaiLamKiemTra.phan2.Manager;
import BaiLamKiemTra.phan2.Company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Company congTy = new Company();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Menu Quản Lý Công Ty ===");
            System.out.println("1. Hiển thị tất cả nhân viên");
            System.out.println("2. Thêm nhân viên mới");
            System.out.println("3. Cập nhật lương nhân viên");
            System.out.println("4. Tìm kiếm lương theo tên nhân viên");
            System.out.println("5. Thêm phòng ban mới");
            System.out.println("6. Hiển thị tất cả phòng ban");
            System.out.println("7. Sắp xếp nhân viên theo lương giảm dần");
            System.out.println("8. Tìm kiếm nhân viên theo tên");
            System.out.println("0. Thoát chương trình");
            System.out.print("Vui lòng chọn chức năng: ");

            int luaChon = scanner.nextInt();
            scanner.nextLine();

            switch (luaChon) {
                case 1:
                    congTy.hienThiTatCaNhanVien();
                    break;
                case 2:
                    System.out.print("Nhập 1 để thêm Nhân viên, 2 để thêm Quản lý: ");
                    int loai = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nhập tên: ");
                    String ten = scanner.nextLine();
                    System.out.print("Nhập tuổi: ");
                    int tuoi = scanner.nextInt();
                    System.out.print("Nhập lương: ");
                    double luong = scanner.nextDouble();
                    scanner.nextLine();

                    if (loai == 1) {
                        congTy.themNhanVien(new Employee(ten, tuoi, luong));
                    } else if (loai == 2) {
                        System.out.print("Nhập tên phòng ban: ");
                        String phongBan = scanner.nextLine();
                        congTy.themNhanVien(new Manager(ten, tuoi, luong, phongBan));
                    } else {
                        System.out.println("Loại nhân viên không hợp lệ!");
                    }
                    break;
                case 3:
                    System.out.print("Nhập tên nhân viên cần cập nhật lương: ");
                    String tenCapNhat = scanner.nextLine();
                    System.out.print("Nhập lương mới: ");
                    double luongMoi = scanner.nextDouble();
                    congTy.capNhatLuongNhanVien(tenCapNhat, luongMoi);
                    break;
                case 4:
                    System.out.print("Nhập tên nhân viên cần tìm lương: ");
                    String tenTim = scanner.nextLine();
                    congTy.timKiemLuongTheoTen(tenTim);
                    break;
                case 5:
                    System.out.print("Nhập tên phòng ban cần thêm: ");
                    String phongMoi = scanner.nextLine();
                    congTy.themPhongBan(phongMoi);
                    break;
                case 6:
                    congTy.hienThiDanhSachPhongBan();
                    break;
                case 7:
                    congTy.sapXepNhanVienTheoLuongGiamDan();
                    break;
                case 8:
                    System.out.print("Nhập tên nhân viên cần tìm kiếm: ");
                    String tenNhanVien = scanner.nextLine();
                    congTy.timKiemNhanVienTheoTen(tenNhanVien);
                    break;
                case 0:
                    System.out.println("Đang thoát chương trình...");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại!");
            }
        }
    }
}
