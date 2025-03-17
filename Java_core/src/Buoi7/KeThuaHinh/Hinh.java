package Buoi7.KeThuaHinh;

public class Hinh {
    private String tenHinh;
    private double cHuVi;
    private double dienTich;

    public Hinh (String tenHinh) {
        this.tenHinh = tenHinh;
        this.cHuVi = 0;
        this.dienTich = 0;
    }
        // Getter và Setter cho tenHinh
        public String gettenHinh() {
            return tenHinh;
        }

        public void settenHinh(String tenHinh) {
            this.tenHinh = tenHinh;
        }

        // Getter và Setter cho chuVi
        public double getcHuVi() {
            return cHuVi;
        }

        public void setcHuVi(double cHuVi) {
            this.cHuVi = cHuVi;
        }

        // Getter và Setter cho dienTich
        public double getdienTich() {
            return dienTich;
        }

        public void setdienTich(double dienTich) {
            this.dienTich = dienTich;
        }
        public void tinhChuVi(){}
        public void tinhDienTich(){}

        public void hienThi(){
        System.out.println("Hình: "+ tenHinh);
        System.out.println("Chu vi: " +cHuVi);
        System.out.println("");
        }

    }

