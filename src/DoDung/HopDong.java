/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoDung;

import Connect.DatabaseHelper;
import java.sql.*;
/**
 *
 * @author Admin
 */
public class HopDong {
    String maHD,tenKH,doCam,diaChi,soDT,soCM,ngayCam;
    double soTienCam,laiNgay;
    int soNgay;

    public HopDong(String maHD, String tenKH, String doCam, String diaChi, String soDT, String soCM, String ngayCam, double soTienCam, double laiNgay, int soNgay) {
        this.maHD = maHD;
        this.tenKH = tenKH;
        this.doCam = doCam;
        this.diaChi = diaChi;
        this.soDT = soDT;
        this.soCM = soCM;
        this.ngayCam = ngayCam;
        this.soTienCam = soTienCam;
        this.laiNgay = laiNgay;
        this.soNgay = soNgay;
    }

    public HopDong() {
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

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }
    

}
