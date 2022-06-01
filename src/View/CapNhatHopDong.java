/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Connect.DatabaseHelper;
import Dao.HopDongDao;
import Dao.NhanVienDao;
import DoDung.HopDong;
import DoDung.NhanVien;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class CapNhatHopDong extends javax.swing.JFrame {
    private List<HopDong> list;
    /**
     * Creates new form CapNhatHopDong
     */
    public CapNhatHopDong() {
        initComponents();
        LoadCCB();
    }

    public void LoadCCB(){
        try {
            String sql = "select maHD from HopDong";
            Connection conn = DatabaseHelper.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {                
                String id = rs.getString("maHD");
                jComboBox1.addItem(id);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfDoCamCo = new javax.swing.JTextField();
        labelNgayCam = new javax.swing.JLabel();
        labelSoHD = new javax.swing.JLabel();
        labelCMND = new javax.swing.JLabel();
        tfCMND = new javax.swing.JTextField();
        tfLaiNgay = new javax.swing.JTextField();
        tfTenKH = new javax.swing.JTextField();
        labelTienCam = new javax.swing.JLabel();
        labelTitle = new javax.swing.JLabel();
        labelDoCamCo = new javax.swing.JLabel();
        tfSoDT = new javax.swing.JTextField();
        labelSDT = new javax.swing.JLabel();
        labelLaiNgay = new javax.swing.JLabel();
        btnXacNhan = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        labelTenKH = new javax.swing.JLabel();
        tfngayCam = new javax.swing.JTextField();
        tfDiaChi = new javax.swing.JTextField();
        labelDiaChi = new javax.swing.JLabel();
        labelSoNgayCam = new javax.swing.JLabel();
        tfTienCam = new javax.swing.JTextField();
        tfsoNgay = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cập nhật hợp đồng");
        setLocation(new java.awt.Point(450, 100));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(236, 240, 241));

        labelNgayCam.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        labelNgayCam.setText("Ngày cầm:");

        labelSoHD.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        labelSoHD.setText("Mã Hợp Đồng:");

        labelCMND.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        labelCMND.setText("Số CMND/CCCD:");

        tfCMND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCMNDActionPerformed(evt);
            }
        });

        labelTienCam.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        labelTienCam.setText("Tổng số tiền cầm:");

        labelTitle.setFont(new java.awt.Font("UTM Avo", 1, 18)); // NOI18N
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle.setText("Cập nhật hợp đồng");

        labelDoCamCo.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        labelDoCamCo.setText("Đồ cầm cố:");

        labelSDT.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        labelSDT.setText("Số ĐT:");

        labelLaiNgay.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        labelLaiNgay.setText("Lãi ngày:");

        btnXacNhan.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        btnXacNhan.setText("Xác nhận");
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });

        btnHuy.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        btnHuy.setText("Hủy");

        labelTenKH.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        labelTenKH.setText("Tên khách hàng:");

        labelDiaChi.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        labelDiaChi.setText("Địa chỉ:");

        labelSoNgayCam.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        labelSoNgayCam.setText("Số ngày cầm:");

        backBtn.setFont(new java.awt.Font("UTM Avo", 0, 11)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(236, 240, 241));
        jComboBox1.setFont(new java.awt.Font("UTM Avo", 0, 11)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 102, 102));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(btnXacNhan)
                                .addGap(97, 97, 97)
                                .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelSoHD)
                                    .addComponent(labelTenKH)
                                    .addComponent(labelDoCamCo)
                                    .addComponent(labelDiaChi)
                                    .addComponent(labelSDT)
                                    .addComponent(labelCMND)
                                    .addComponent(labelTienCam)
                                    .addComponent(labelLaiNgay)
                                    .addComponent(labelSoNgayCam)
                                    .addComponent(labelNgayCam))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfDoCamCo, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                                    .addComponent(tfDiaChi)
                                    .addComponent(tfTenKH)
                                    .addComponent(tfsoNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfSoDT, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                    .addComponent(tfCMND)
                                    .addComponent(tfTienCam)
                                    .addComponent(tfLaiNgay)
                                    .addComponent(tfngayCam, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(labelTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTitle)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelTenKH)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelSoHD))
                        .addGap(18, 18, 18)
                        .addComponent(tfTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDoCamCo)
                    .addComponent(tfDoCamCo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDiaChi)
                    .addComponent(tfDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSDT)
                    .addComponent(tfSoDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCMND)
                    .addComponent(tfCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTienCam)
                    .addComponent(tfTienCam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLaiNgay)
                    .addComponent(tfLaiNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfngayCam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNgayCam))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfsoNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSoNgayCam))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXacNhan)
                    .addComponent(btnHuy))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfCMNDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCMNDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCMNDActionPerformed

    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanActionPerformed
        // TODO add your handling code here:
        HopDong hd = new HopDong();
        try {
            hd.setTenKH(tfTenKH.getText());
            hd.setDoCam(tfDoCamCo.getText());
            hd.setDiaChi(tfDiaChi.getText());
            hd.setSoDT(tfSoDT.getText());
            hd.setSoCM(tfCMND.getText());
            hd.setSoTienCam(tfTienCam.getText());
            hd.setLaiNgay(tfLaiNgay.getText());
            hd.setNgayCam(tfngayCam.getText());
            hd.setSoNgay(tfsoNgay.getText());
            hd.setMaHD((String) jComboBox1.getSelectedItem());

            HopDongDao dao = new HopDongDao();
            dao.update(hd);
            JOptionPane.showMessageDialog(this, "Cập Nhật thành công");
            new TrangChu().show();
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Thất Bại");
            e.printStackTrace();
        }
            
        
        

    }//GEN-LAST:event_btnXacNhanActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        try {
            new TrangChu().show();
        } catch (Exception ex) {
            Logger.getLogger(CapNhatHopDong.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String sql = "select * from HopDong where maHD = ?";
        String id = ((String) jComboBox1.getSelectedItem());
        try {
            Connection conn = DatabaseHelper.getConnection();
            PreparedStatement pr = conn.prepareStatement(sql); 
            pr.setString(1, id );
            ResultSet rs = pr.executeQuery();
            if(rs.next()){
                tfTenKH.setText(rs.getString("tenKH"));
                tfDoCamCo.setText(rs.getString("doCamCo"));
                tfDiaChi.setText(rs.getString("diachi"));
                tfSoDT.setText(rs.getString("soDT"));
                tfCMND.setText(rs.getString("soCM"));
                tfTienCam.setText(rs.getString("soTienCam"));
                tfLaiNgay.setText(rs.getString("laiNgay"));
                tfngayCam.setText(rs.getString("ngayCam"));
                tfsoNgay.setText(rs.getString("soNgayCam"));
                
                
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CapNhatHopDong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CapNhatHopDong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CapNhatHopDong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CapNhatHopDong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CapNhatHopDong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCMND;
    private javax.swing.JLabel labelDiaChi;
    private javax.swing.JLabel labelDoCamCo;
    private javax.swing.JLabel labelLaiNgay;
    private javax.swing.JLabel labelNgayCam;
    private javax.swing.JLabel labelSDT;
    private javax.swing.JLabel labelSoHD;
    private javax.swing.JLabel labelSoNgayCam;
    private javax.swing.JLabel labelTenKH;
    private javax.swing.JLabel labelTienCam;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JTextField tfCMND;
    private javax.swing.JTextField tfDiaChi;
    private javax.swing.JTextField tfDoCamCo;
    private javax.swing.JTextField tfLaiNgay;
    private javax.swing.JTextField tfSoDT;
    private javax.swing.JTextField tfTenKH;
    private javax.swing.JTextField tfTienCam;
    private javax.swing.JTextField tfngayCam;
    private javax.swing.JTextField tfsoNgay;
    // End of variables declaration//GEN-END:variables
}
