/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Dao.NguoiDungDao;
import DoDung.NguoiDung;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.text.IconView;

/**
 *
 * @author Admin
 */
public class DangKi extends javax.swing.JFrame {

    /**
     * Creates new form DangKi
     */
    public DangKi() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        NgonNgu = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btDK = new javax.swing.JButton();
        lbTieuDe = new javax.swing.JLabel();
        lbNhapSDT = new javax.swing.JLabel();
        tfSDT = new javax.swing.JTextField();
        lbCFMK = new javax.swing.JLabel();
        lbMK = new javax.swing.JLabel();
        btback = new javax.swing.JButton();
        lbTenDN = new javax.swing.JLabel();
        tfTenDN = new javax.swing.JTextField();
        tfMK = new javax.swing.JPasswordField();
        tfXNMK = new javax.swing.JPasswordField();
        rbVIE = new javax.swing.JRadioButton();
        rbENG = new javax.swing.JRadioButton();
        lbNN = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng kí tài khoản");
        setLocation(new java.awt.Point(400, 150));

        jPanel1.setBackground(new java.awt.Color(236, 240, 241));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btDK.setBackground(new java.awt.Color(46, 204, 113));
        btDK.setFont(new java.awt.Font("UTM Avo", 1, 12)); // NOI18N
        btDK.setForeground(new java.awt.Color(255, 255, 255));
        btDK.setText("Đăng kí");
        btDK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDKActionPerformed(evt);
            }
        });
        jPanel1.add(btDK, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 327, 225, 34));

        lbTieuDe.setFont(new java.awt.Font("UTM Avo", 1, 24)); // NOI18N
        lbTieuDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTieuDe.setLabelFor(lbTieuDe);
        lbTieuDe.setText("Đăng kí tài khoản");
        lbTieuDe.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(lbTieuDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 49, 536, -1));

        lbNhapSDT.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        lbNhapSDT.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbNhapSDT.setText("Nhập SĐT:");
        jPanel1.add(lbNhapSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 173, 118, -1));
        jPanel1.add(tfSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 168, 315, 30));

        lbCFMK.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        lbCFMK.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbCFMK.setText("Xác nhận mật khẩu:");
        jPanel1.add(lbCFMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 269, 120, -1));

        lbMK.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        lbMK.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbMK.setText("Mật Khẩu:");
        jPanel1.add(lbMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 221, 118, -1));

        btback.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        btback.setText("Trờ lại");
        btback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbackActionPerformed(evt);
            }
        });
        jPanel1.add(btback, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 73, -1));

        lbTenDN.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        lbTenDN.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbTenDN.setText("Tên đăng nhập:");
        jPanel1.add(lbTenDN, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 125, 118, -1));
        jPanel1.add(tfTenDN, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 120, 315, 30));
        jPanel1.add(tfMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 216, 315, 30));
        jPanel1.add(tfXNMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 264, 315, 30));

        NgonNgu.add(rbVIE);
        rbVIE.setFont(new java.awt.Font("UTM Avo", 1, 12)); // NOI18N
        rbVIE.setSelected(true);
        rbVIE.setText("VIE");
        rbVIE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbVIEActionPerformed(evt);
            }
        });
        jPanel1.add(rbVIE, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 402, -1, -1));

        NgonNgu.add(rbENG);
        rbENG.setFont(new java.awt.Font("UTM Avo", 1, 12)); // NOI18N
        rbENG.setText("ENG");
        rbENG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbENGActionPerformed(evt);
            }
        });
        jPanel1.add(rbENG, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 402, -1, -1));

        lbNN.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        lbNN.setText("Ngôn ngữ");
        jPanel1.add(lbNN, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbackActionPerformed
        // TODO add your handling code here:
        if (rbVIE.isSelected()){
            if(JOptionPane.showConfirmDialog(this,"Bạn có muốn quay lại trang đăng nhập không ?")==0){
                new Login().show();
                this.hide();
            }
        }else{
            if(JOptionPane.showConfirmDialog(this,"Do you want to go back to the login ?")==0){
                new Login().show();
                this.hide();
            }
        }
    }//GEN-LAST:event_btbackActionPerformed

    private void btDKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDKActionPerformed
        // TODO add your handling code here:
        String pass = tfMK.getText();
        String confilm = tfXNMK.getText();
        
        if(tfTenDN.getText().equals("")){
        JOptionPane.showMessageDialog(this, "Tên đăng nhập không được để trông");
        return;
        }
        if(tfSDT.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập SĐT");
            return;
        }
        if(tfMK.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mật khẩu");
            return;
        }
        if(tfXNMK.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Vui lòng xác nhận mật khẩu");
            return;
        }
        
        if(pass.equals(confilm)){
            try {
                NguoiDung nd = new NguoiDung();
                nd.setUser(tfTenDN.getText());
                nd.setSdt(tfSDT.getText());
                nd.setPass(tfMK.getText());

                NguoiDungDao dao = new NguoiDungDao();
                dao.insertTK(nd);
                JOptionPane.showMessageDialog(this,"Đăng kí thành công");
                new Login().show();
                this.hide();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this,"Tên đăng nhập đã tồn tại");
                tfTenDN.setText("");
            }
        }else{
            JOptionPane.showMessageDialog(this,"Mật khẩu và xác nhận cần khớp với nhau");
            
        }
        
    }//GEN-LAST:event_btDKActionPerformed

    private void rbVIEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbVIEActionPerformed
        // TODO add your handling code here:
        btback.setText("Trở lại");
        lbTieuDe.setText("Đăng kí tài khoản");
        lbTenDN.setText("Tên đăng nhập:");
        lbNhapSDT.setText("Nhập SĐT:");
        lbMK.setText("Mật khẩu:");
        lbCFMK.setText("Xác nhận mật khẩu:");
        btDK.setText("Đăng kí");
        lbNN.setText("Ngôn Ngữ");
    }//GEN-LAST:event_rbVIEActionPerformed

    private void rbENGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbENGActionPerformed
        // TODO add your handling code here:
        btback.setText("Back");
        lbTieuDe.setText("Sign Up");
        lbTenDN.setText("User Name:");
        lbNhapSDT.setText("Number phone:");
        lbMK.setText("Password:");
        lbCFMK.setText("Confirm password:");
        btDK.setText("Sign Up");
        lbNN.setText("Language");
    }//GEN-LAST:event_rbENGActionPerformed

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
            java.util.logging.Logger.getLogger(DangKi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangKi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangKi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangKi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangKi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup NgonNgu;
    private javax.swing.JButton btDK;
    private javax.swing.JButton btback;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCFMK;
    private javax.swing.JLabel lbMK;
    private javax.swing.JLabel lbNN;
    private javax.swing.JLabel lbNhapSDT;
    private javax.swing.JLabel lbTenDN;
    private javax.swing.JLabel lbTieuDe;
    private javax.swing.JRadioButton rbENG;
    private javax.swing.JRadioButton rbVIE;
    private javax.swing.JPasswordField tfMK;
    private javax.swing.JTextField tfSDT;
    private javax.swing.JTextField tfTenDN;
    private javax.swing.JPasswordField tfXNMK;
    // End of variables declaration//GEN-END:variables
}
