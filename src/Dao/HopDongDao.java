/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Connect.DatabaseHelper;
import DoDung.HopDong;
import DoDung.NhanVien;
import java.io.ObjectStreamConstants;
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
                tc.setSoTienCam(rs.getString("soTienCam"));
                tc.setLaiNgay(rs.getString("laiNgay"));
                tc.setNgayCam(rs.getString("ngayCam"));
                tc.setSoNgay(rs.getString("soNgayCam"));               
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
        ps.setString(7, tc.getSoTienCam());
        ps.setString(8,  tc.getLaiNgay());
        ps.setString(9,tc.getNgayCam());
        ps.setString(10,tc.getSoNgay());
        ps.executeUpdate();
    }
    public boolean delete(String maHD) throws Exception{
        String sql = " delete from HopDong where maHD = ? or soCM = ?";
     
            Connection conn = DatabaseHelper.getConnection();
            PreparedStatement pr = conn.prepareStatement(sql);
                pr.setString(1,maHD);
                pr.setString(2,maHD);
       
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
            ps.setString(6, hd.getSoTienCam());
            ps.setString(7, hd.getLaiNgay());
            ps.setString(8, hd.getNgayCam());
            ps.setString(9, hd.getSoNgay());
            ps.setString(10, hd.getMaHD());

            ps.executeUpdate();
    }
    public HopDong findByCMND(String soCM) throws Exception{
        String sql = "select maHD,tenKH,ngayCam,doCamCo,soNgayCam,soTienCam,laiNgay,giaHan "
                + "from HopDong "
                + "where soCM = ?";
            
        try {
            Connection conn = DatabaseHelper.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            {
            pstmt.setString(1, soCM);
            
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                HopDong hd = new HopDong();
                hd.setMaHD(rs.getString("maHD"));
                hd.setTenKH(rs.getString("tenKH"));
                hd.setNgayCam(rs.getString("ngayCam"));
                hd.setDoCam(rs.getString("doCamCo"));
                hd.setSoNgay(rs.getString("soNgayCam"));
                hd.setSoTienCam(rs.getString("soTienCam"));
                hd.setLaiNgay(rs.getString("laiNgay")); 
                hd.setGiaHanThem(rs.getString("giaHan"));
                return hd;
            }
            }
        } catch (Exception e) {
        }
        return null;
            
        }
    
    public boolean deleteThanhLi(String SoCM) throws Exception{
        String sql = " delete from HopDong where soCM = ?";
     
            Connection conn = DatabaseHelper.getConnection();
            PreparedStatement pr = conn.prepareStatement(sql);
                pr.setString(1,SoCM);
       
        return pr.executeUpdate()>0;
    }
    
    public ArrayList<HopDong> findHD(String maHD) throws ClassNotFoundException, SQLException{
        Connection conn = DatabaseHelper.getConnection();
        HopDong tc = new HopDong();
        ArrayList<HopDong> list = new ArrayList<HopDong>();
        String sql = "select * from HopDong where maHD like ?";
        try {
            PreparedStatement pr = conn.prepareStatement(sql);
            pr.setString(1,"%"+maHD+"%");
            ResultSet rs = pr.executeQuery();
            while(rs.next()){

                tc.setMaHD(rs.getString("maHD"));
                tc.setTenKH(rs.getString("tenKH"));
                tc.setDoCam(rs.getString("doCamCo"));
                tc.setDiaChi(rs.getString("diaChi"));
                tc.setSoDT(rs.getString("soDT"));
                tc.setSoCM(rs.getString("soCM"));
                tc.setSoTienCam(rs.getString("soTienCam"));
                tc.setLaiNgay(rs.getString("laiNgay"));
                tc.setNgayCam(rs.getString("ngayCam"));
                tc.setSoNgay(rs.getString("soNgayCam"));  
                list.add(tc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public void GiaHanHD(HopDong hd ) throws Exception{
        String sql = "UPDATE HopDong "
                + "SET giaHan = ?, liDo = ? "
                + "WHERE maHD = ?";
    
        Connection conn = DatabaseHelper.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, hd.getGiaHanThem());
            ps.setString(2, hd.getGhiChu());
            ps.setString(3, hd.getMaHD());

            ps.executeUpdate();
    }
    
    public ArrayList<HopDong> getListGiaHan() throws Exception{
        ArrayList<HopDong> lsGH = new ArrayList<>();
        String sql ="select maHD,tenKH,soNgayCam,giaHan,liDo" 
                    +"from HopDong " 
                    ;
        Connection conn = DatabaseHelper.getConnection();
        
        try {
            PreparedStatement pr = conn.prepareStatement(sql);
            ResultSet rs = pr.executeQuery();
            while(rs.next()){
                HopDong tc = new HopDong();
                tc.setMaHD(rs.getString("maHD"));
                tc.setTenKH(rs.getString("tenKH"));
                tc.setSoNgay(rs.getString("soNgayCam"));  
                tc.setGiaHanThem(rs.getString("giaHan"));
                tc.setGhiChu(rs.getString("liDO"));
                lsGH.add(tc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lsGH;
    }
}
