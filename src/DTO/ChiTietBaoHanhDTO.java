package DTO;

import java.util.Date;

public class ChiTietBaoHanhDTO {
    private int mabh;
    private Date ngaynhan;
    private Date ngaytra;
    private String noidung;
    private double chiphi;

    public ChiTietBaoHanhDTO() {
    }

    public ChiTietBaoHanhDTO(int mabh, Date ngaynhan, Date ngaytra, String noidung, double chiphi) {
        this.mabh = mabh;
        this.ngaynhan = ngaynhan;
        this.ngaytra = ngaytra;
        this.noidung = noidung;
        this.chiphi = chiphi;
    }

    public int getMabh() {
        return mabh;
    }

    public void setMabh(int mabh) {
        this.mabh = mabh;
    }

    public Date getNgaynhan() {
        return ngaynhan;
    }

    public void setNgaynhan(Date ngaynhan) {
        this.ngaynhan = ngaynhan;
    }

    public Date getNgaytra() {
        return ngaytra;
    }

    public void setNgaytra(Date ngaytra) {
        this.ngaytra = ngaytra;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    public double getChiphi() {
        return chiphi;
    }

    public void setChiphi(double chiphi) {
        this.chiphi = chiphi;
    }
    
    
}
