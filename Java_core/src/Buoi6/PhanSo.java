package Buoi6;

public class PhanSo {
    private int tuSo;
    private int mauSo;
    //ham khoi tao
    public PhanSo(){
        this.tuSo = 1;
        this.mauSo = 1;
    }

    public void congPhanso(PhanSo phanSoduocCong){
        if (this.mauSo == phanSoduocCong.getMauSo()){
            this.tuSo = this.tuSo + phanSoduocCong.getMauSo();
//            this.mauSo = this.mauSo + phanSoduocCong.getMauSo();
            return;
        }
        this.tuSo = this.tuSo * phanSoduocCong.getMauSo() + (this.mauSo * phanSoduocCong.getTuSo());
        this.mauSo = this.mauSo * phanSoduocCong.getMauSo();
    }
    // getter setter
   public void setTuSo (int tuSotruyenVao){
        this.tuSo = tuSotruyenVao;
    }
    public int getTuSo(){
        return this.tuSo;
    }
    public void setMauSo (int mauSotruyenVao){
        this.mauSo = mauSotruyenVao;
    }
    public int getMauSo(){
        return this.mauSo;
    }
}
