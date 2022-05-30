/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoDung;

/**
 *
 * @author Admin
 */
public class TrangChu {
    String maHD,tenKH,doCam,diaChi,soDT,soCM,ngayCam,hanCam;
    double soTienCam,laiNgay;

    public TrangChu() {
    }

    public TrangChu(String maHD, String tenKH, String doCam, String diaChi, String soDT, String soCM, String ngayCam, String hanCam, double soTienCam, double laiNgay) {
        this.maHD = maHD;
        this.tenKH = tenKH;
        this.doCam = doCam;
        this.diaChi = diaChi;
        this.soDT = soDT;
        this.soCM = soCM;
        this.ngayCam = ngayCam;
        this.hanCam = hanCam;
        this.soTienCam = soTienCam;
        this.laiNgay = laiNgay;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getDoCam() {
        return doCam;
    }

    public void setDoCam(String doCam) {
        this.doCam = doCam;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getSoCM() {
        return soCM;
    }

    public void setSoCM(String soCM) {
        this.soCM = soCM;
    }

    public String getNgayCam() {
        return ngayCam;
    }

    public void setNgayCam(String ngayCam) {
        this.ngayCam = ngayCam;
    }

    public String getHanCam() {
        return hanCam;
    }

    public void setHanCam(String hanCam) {
        this.hanCam = hanCam;
    }

    public double getSoTienCam() {
        return soTienCam;
    }

    public void setSoTienCam(double soTienCam) {
        this.soTienCam = soTienCam;
    }

    public double getLaiNgay() {
        return laiNgay;
    }

    public void setLaiNgay(double laiNgay) {
        this.laiNgay = laiNgay;
    }

    
    
    
}
