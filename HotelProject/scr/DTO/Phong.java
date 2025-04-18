package DTO;

public class Phong {
    private int Gia;
    private String TenPhong;
    private String MaPhong;
    private String DichVu;
    public Phong()
    {
        Gia = 0;
        TenPhong = " ";
        MaPhong = " ";
        DichVu = " ";  
    }
    public String getDichVu() {
        return DichVu;
    }
    public void setDichVu(String dichVu) {
        DichVu = dichVu;
    }
    public int getGia() {
        return Gia;
    }
    public void setGia(int gia) {
        Gia = gia;
    }
    public String getMaPhong() {
        return MaPhong;
    }
    public void setMaPhong(String maPhong) {
        MaPhong = maPhong;
    }
    public String getTenPhong() {
        return TenPhong;
    }
    public void setTenPhong(String tenPhong) {
        TenPhong = tenPhong;
    }
    
}
