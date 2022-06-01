/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoDung;

/**
 *
 * @author thuyd
 */
public class KhachHang {
    private String maKH;
    private String tenKH;
    private String diaChi;
    private String SDT;

    public KhachHang() {
    }

    public KhachHang(String maKH, String tenKH, String diaChi, String SDT) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.diaChi = diaChi;
        this.SDT = SDT;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
    
}
