/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing5_camdo;

import View.TrangChu;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class AddHopDong extends javax.swing.JFrame {

    /**
     * Creates new form AddHopDong
     */
    public AddHopDong() {
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
        tfSoHD = new javax.swing.JTextField();
        btnHuy = new javax.swing.JButton();
        labelTenKH = new javax.swing.JLabel();
        tfDiaChi = new javax.swing.JTextField();
        labelDiaChi = new javax.swing.JLabel();
        tfTienCam = new javax.swing.JTextField();
        tfNgayCam = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thêm Hợp Đồng");
        setLocation(new java.awt.Point(450, 100));

        jPanel1.setBackground(new java.awt.Color(236, 240, 241));

        labelNgayCam.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        labelNgayCam.setText("Ngày cầm:");

        labelSoHD.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        labelSoHD.setText("Số hợp đồng:");

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
        labelTitle.setText("HỢP ĐỒNG CẦM ĐỒ");

        labelDoCamCo.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        labelDoCamCo.setText("Đồ cầm cố:");

        labelSDT.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        labelSDT.setText("Số ĐT:");

        labelLaiNgay.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        labelLaiNgay.setText("Lãi ngày:");

        btnXacNhan.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        btnXacNhan.setText("Xác nhận");

        btnHuy.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        btnHuy.setText("Hủy");

        labelTenKH.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        labelTenKH.setText("Tên khách hàng:");

        labelDiaChi.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        labelDiaChi.setText("Địa chỉ:");

        backBtn.setFont(new java.awt.Font("UTM Avo", 0, 11)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        jLabel1.setText("Hạn cầm:");

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
                                    .addComponent(labelNgayCam)
                                    .addComponent(jLabel1))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1)
                                    .addComponent(tfNgayCam)
                                    .addComponent(labelTitle)
                                    .addComponent(tfDoCamCo)
                                    .addComponent(tfDiaChi)
                                    .addComponent(tfTenKH)
                                    .addComponent(tfSoHD)
                                    .addComponent(tfSoDT, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfTienCam, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfLaiNgay, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTitle)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelSoHD)
                            .addComponent(tfSoHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(labelTenKH))
                    .addComponent(tfTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(labelNgayCam)
                    .addComponent(tfNgayCam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
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

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        try {
            // TODO add your handling code here:
            new TrangChu().show();
        } catch (Exception ex) {
            Logger.getLogger(AddHopDong.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AddHopDong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddHopDong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddHopDong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddHopDong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddHopDong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelCMND;
    private javax.swing.JLabel labelDiaChi;
    private javax.swing.JLabel labelDoCamCo;
    private javax.swing.JLabel labelLaiNgay;
    private javax.swing.JLabel labelNgayCam;
    private javax.swing.JLabel labelSDT;
    private javax.swing.JLabel labelSoHD;
    private javax.swing.JLabel labelTenKH;
    private javax.swing.JLabel labelTienCam;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JTextField tfCMND;
    private javax.swing.JTextField tfDiaChi;
    private javax.swing.JTextField tfDoCamCo;
    private javax.swing.JTextField tfLaiNgay;
    private javax.swing.JTextField tfNgayCam;
    private javax.swing.JTextField tfSoDT;
    private javax.swing.JTextField tfSoHD;
    private javax.swing.JTextField tfTenKH;
    private javax.swing.JTextField tfTienCam;
    // End of variables declaration//GEN-END:variables
}
