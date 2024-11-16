package DTO;

import java.util.Date;

public class BaoHanhDTO {
    private int mabh;
    private String dieukien;
    private Date ngayBd;
    private Date ngayKt;
    private int trangThai;
    
    public BaoHanhDTO(){}

    public BaoHanhDTO(int mabh, String dieukien, Date ngayBd, Date ngayKt) {
        this.mabh = mabh;
        this.dieukien = dieukien;
        this.ngayBd = ngayBd;
        this.ngayKt = ngayKt;
    }

    public int getMabh() {
        return mabh;
    }

    public void setMabh(int mabh) {
        this.mabh = mabh;
    }

    public String getDieukien() {
        return dieukien;
    }

    public void setDieukien(String dieukien) {
        this.dieukien = dieukien;
    }

    public Date getNgayBd() {
        return ngayBd;
    }

    public void setNgayBd(Date ngayBd) {
        this.ngayBd = ngayBd;
    }

    public Date getNgayKt() {
        return ngayKt;
    }

    public void setNgayKt(Date ngayKt) {
        this.ngayKt = ngayKt;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    
    
    
}
