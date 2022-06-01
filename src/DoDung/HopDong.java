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
    String maHD,tenKH,doCam,diaChi,soDT,soCM,ngayCam,soNgay,soTienCam,laiNgay,giaHanThem,ghiChu;

    public HopDong() {
    }

    public HopDong(String maHD, String tenKH, String doCam, String diaChi, String soDT, String soCM, String ngayCam, String soNgayString, String soTienCamString, String laiNgay, String giaHanThem, String ghiChu) {
        this.maHD = maHD;
        this.tenKH = tenKH;
        this.doCam = doCam;
        this.diaChi = diaChi;
        this.soDT = soDT;
        this.soCM = soCM;
        this.ngayCam = ngayCam;
        this.soNgay = soNgayString;
        this.soTienCam = soTienCamString;
        this.laiNgay = laiNgay;
        this.giaHanThem = giaHanThem;
        this.ghiChu = ghiChu;
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

    public String getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(String soNgay) {
        this.soNgay = soNgay;
    }

    public String getSoTienCam() {
        return soTienCam;
    }

    public void setSoTienCam(String soTienCam) {
        this.soTienCam = soTienCam;
    }

    public String getLaiNgay() {
        return laiNgay;
    }

    public void setLaiNgay(String laiNgay) {
        this.laiNgay = laiNgay;
    }

    public String getGiaHanThem() {
        return giaHanThem;
    }

    public void setGiaHanThem(String giaHanThem) {
        this.giaHanThem = giaHanThem;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    
    
    
    

}
