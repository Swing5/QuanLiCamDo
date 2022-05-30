/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Connect.DatabaseHelper;
import DoDung.NhanVien;
import DoDung.TrangChu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class TrangChuDao {
    public ArrayList<TrangChu> getListHopDong() throws Exception{
        ArrayList<TrangChu> list = new ArrayList<>();
        String sql ="SELECT * FROM HopDong";
        Connection conn = DatabaseHelper.getConnection();
        
        try {
            PreparedStatement pr = conn.prepareStatement(sql);
            ResultSet rs = pr.executeQuery();
            while(rs.next()){
                TrangChu tc = new TrangChu();
                tc.setMaHD(rs.getString("maHD"));
                tc.setTenKH(rs.getString("tenKH"));
                tc.setDoCam(rs.getString("doCamCo"));
                tc.setDiaChi(rs.getString("diaChi"));
                tc.setSoDT(rs.getString("soDT"));
                tc.setSoCM(rs.getString("soCM"));
                tc.setSoTienCam(rs.getFloat("soTienCam"));
                tc.setLaiNgay(rs.getFloat("laiNgay"));
                tc.setNgayCam(rs.getString("ngayCam"));
                tc.setHanCam(rs.getString("hanCam"));               
                list.add(tc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
