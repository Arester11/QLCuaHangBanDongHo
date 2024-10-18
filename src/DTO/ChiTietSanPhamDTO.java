package DTO;

public class ChiTietSanPhamDTO {
    private int masp;
    private String duongKinh;
    private String doChiuNuoc;
    private String chatLieuMat;
    private String chatLieuDay;
    private String chatLieuVo;
    private String sizeDay;

    public ChiTietSanPhamDTO() {
    }

    public ChiTietSanPhamDTO(int masp, String duongKinh, String doChiuNuoc, String chatLieuMat, String chatLieuDay, String chatLieuVo, String sizeDay) {
        this.masp = masp;
        this.duongKinh = duongKinh;
        this.doChiuNuoc = doChiuNuoc;
        this.chatLieuMat = chatLieuMat;
        this.chatLieuDay = chatLieuDay;
        this.chatLieuVo = chatLieuVo;
        this.sizeDay = sizeDay;
    }

    public int getMasp() {
        return masp;
    }

    public void setMasp(int masp) {
        this.masp = masp;
    }

    public String getDuongKinh() {
        return duongKinh;
    }

    public void setDuongKinh(String duongKinh) {
        this.duongKinh = duongKinh;
    }

    public String getDoChiuNuoc() {
        return doChiuNuoc;
    }

    public void setDoChiuNuoc(String doChiuNuoc) {
        this.doChiuNuoc = doChiuNuoc;
    }

    public String getChatLieuMat() {
        return chatLieuMat;
    }

    public void setChatLieuMat(String chatLieuMat) {
        this.chatLieuMat = chatLieuMat;
    }

    public String getChatLieuDay() {
        return chatLieuDay;
    }

    public void setChatLieuDay(String chatLieuDay) {
        this.chatLieuDay = chatLieuDay;
    }

    public String getChatLieuVo() {
        return chatLieuVo;
    }

    public void setChatLieuVo(String chatLieuVo) {
        this.chatLieuVo = chatLieuVo;
    }

    public String getSizeDay() {
        return sizeDay;
    }

    public void setSizeDay(String sizeDay) {
        this.sizeDay = sizeDay;
    }
}
