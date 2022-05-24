/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Connect.DatabaseHelper;
import DoDung.NhanVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Set;

/**
 *
 * @author Admin
 */
public class NhanVienDao {
    public ArrayList<NhanVien> getListNhanVien() throws Exception{
        ArrayList<NhanVien> list = new ArrayList<>();
        String sql ="SELECT * FROM NhanVien";
        Connection conn = DatabaseHelper.getConnection();
        
        try {
            PreparedStatement pr = conn.prepareStatement(sql);
            ResultSet rs = pr.executeQuery();
            while(rs.next()){
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString("maNV"));
                nv.setHoTen(rs.getString("hoTen"));
                nv.setNgaySinh(rs.getString("ngaySinh"));
                nv.setChucVu(rs.getString("chucVu"));
                nv.setEmail(rs.getString("email"));
                nv.setSDT(rs.getString("sdt"));
                nv.setGioiTinh(rs.getString("gioiTinh"));
                nv.setDiaChi(rs.getString("diaChi"));
                list.add(nv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public void insertNV(NhanVien nv) throws ClassNotFoundException, SQLException{
        String sql = "insert into NhanVien(maNV,hoTen,ngaySinh,chucVu,email,sdt,gioiTinh,diaChi)"
                + "values (?,?,?,?,?,?,?,?)";
        
        Connection conn = DatabaseHelper.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,nv.getMaNV());
        ps.setString(2, nv.getHoTen());
        ps.setString(3, nv.getNgaySinh());
        ps.setString(4,nv.getChucVu());
        ps.setString(5,nv.getEmail());
        ps.setString(6,nv.getSDT());
        ps.setString(7,nv.getGioiTinh());
        ps.setString(8,nv.getDiaChi());
        
        ps.executeUpdate();
    }
}
