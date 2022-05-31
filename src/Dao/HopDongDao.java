/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Connect.DatabaseHelper;
import DoDung.HopDong;
import DoDung.NhanVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class HopDongDao {
    public ArrayList<HopDong> getListHopDong() throws Exception{
        ArrayList<HopDong> list = new ArrayList<>();
        String sql ="SELECT * FROM HopDong";
        Connection conn = DatabaseHelper.getConnection();
        
        try {
            PreparedStatement pr = conn.prepareStatement(sql);
            ResultSet rs = pr.executeQuery();
            while(rs.next()){
                HopDong tc = new HopDong();
                tc.setMaHD(rs.getString("maHD"));
                tc.setTenKH(rs.getString("tenKH"));
                tc.setDoCam(rs.getString("doCamCo"));
                tc.setDiaChi(rs.getString("diaChi"));
                tc.setSoDT(rs.getString("soDT"));
                tc.setSoCM(rs.getString("soCM"));
                tc.setSoTienCam(rs.getFloat("soTienCam"));
                tc.setLaiNgay(rs.getFloat("laiNgay"));
                tc.setNgayCam(rs.getString("ngayCam"));
                tc.setSoNgay(rs.getInt("soNgayCam"));               
                list.add(tc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public void insertHD(HopDong tc) throws ClassNotFoundException, SQLException{
        String sql = "insert into HopDong(maHD,tenKH,doCamCo,diaChi,soDT,soCM,soTienCam,laiNgay,ngayCam,soNgayCam)"
                + "values (?,?,?,?,?,?,?,?,?,?)";
        
        Connection conn = DatabaseHelper.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,tc.getMaHD());
        ps.setString(2,tc.getTenKH());
        ps.setString(3,tc.getDoCam());
        ps.setString(4,tc.getDiaChi());
        ps.setString(5,tc.getSoDT());
        ps.setString(6,tc.getSoCM());
        ps.setFloat(7, (float) tc.getSoTienCam());
        ps.setFloat(8, (float) tc.getLaiNgay());
        ps.setString(9,tc.getNgayCam());
        ps.setInt(10,tc.getSoNgay());
        ps.executeUpdate();
    }
    public boolean delete(String maHD) throws Exception{
        String sql = " delete from HopDong where maHD = ? ";
     
            Connection conn = DatabaseHelper.getConnection();
            PreparedStatement pr = conn.prepareStatement(sql);
                pr.setString(1,maHD);
       
        return pr.executeUpdate()>0;
    }
    public void update(HopDong hd ) throws Exception{
        String sql = "UPDATE HopDong "
                + "SET tenKH = ?, doCamCo = ?, diaChi = ?, soDT= ?, soCM = ?, soTienCam = ?, laiNgay = ?, ngayCam = ?, soNgayCam =? "
                + "WHERE maHD = ?";
    
        Connection conn = DatabaseHelper.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, hd.getTenKH());
            ps.setString(2, hd.getDoCam());
            ps.setString(3, hd.getDiaChi());
            ps.setString(4, hd.getSoDT());
            ps.setString(5, hd.getSoCM());
            ps.setFloat(6, (float) hd.getSoTienCam());
            ps.setFloat(7, (float)hd.getLaiNgay());
            ps.setString(8, hd.getNgayCam());
            ps.setInt(9, hd.getSoNgay());
            ps.setString(10, hd.getMaHD());

            ps.executeUpdate();
    }
}
