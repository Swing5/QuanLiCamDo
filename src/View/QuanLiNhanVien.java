/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Connect.DatabaseHelper;
import Dao.NhanVienDao;
import DoDung.NhanVien;
import java.awt.Color;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Admin
 */
public class QuanLiNhanVien extends javax.swing.JFrame {
    private List<NhanVien> list;
    DefaultTableModel model;
    /**
     * Creates new form QuanLiNhanVien
     */
    public QuanLiNhanVien() throws Exception {
        initComponents();
        list = new NhanVienDao().getListNhanVien();
        model = (DefaultTableModel) jTable1.getModel();
        LoadData(new NhanVienDao().getListNhanVien());
    }

    private void LoadData(List<NhanVien> list){
        model.setRowCount(0);
        for(NhanVien nv : list){
            model.addRow(new Object[]{
                nv.getMaNV(),nv.getHoTen(),nv.getNgaySinh(),nv.getChucVu(),nv.getEmail(),nv.getSDT(),nv.getGioiTinh(),nv.getDiaChi()
            });
        }
            jTable1.setModel(model);
            jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {                 
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    if (jTable1.getSelectedRow() >= 0) {
                        tfMNV.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
                        tfHoten.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
                        tfNgaysinh.setText(jTable1.getValueAt(jTable1.getSelectedRow(),2).toString());
                        tfChucVu.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
                        tfEmail.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
                        tfSDT.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString());
                        String s = jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString();
                        if (s.equals("Nam")) {
                            rbNam.setSelected(true);
                        } else {
                            rbNu.setSelected(true);
                        }
                        tfDiaChi.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 7).toString());
                        
                    }
                }      
            });
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        rdbGioiTinh = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rbNu = new javax.swing.JRadioButton();
        tfEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfSDT = new javax.swing.JTextField();
        btADD = new javax.swing.JButton();
        tfNgaysinh = new javax.swing.JTextField();
        tfDiaChi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        tfHoten = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfChucVu = new javax.swing.JTextField();
        btUpdate = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btDelete = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        rbNam = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfMNV = new javax.swing.JTextField();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lí Nhân Viên");
        setLocation(new java.awt.Point(400, 50));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(236, 240, 241));

        jLabel3.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        jLabel3.setText("Ngày sinh:");

        jLabel5.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        jLabel5.setText("Email:");

        rdbGioiTinh.add(rbNu);
        rbNu.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        rbNu.setText("Nữ");

        jLabel6.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        jLabel6.setText("Số điện thoại:");

        btADD.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        btADD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_add_30px.png"))); // NOI18N
        btADD.setText("Thêm");
        btADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btADDActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        jLabel4.setText("Chức vụ:");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton5.setFont(new java.awt.Font("UTM Avo", 0, 11)); // NOI18N
        jButton5.setText("Ảnh");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 179, Short.MAX_VALUE)
                .addComponent(jButton5))
        );

        jLabel2.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        jLabel2.setText("Họ tên:");

        btUpdate.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        btUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_refresh_30px.png"))); // NOI18N
        btUpdate.setText("Sửa");
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        jLabel9.setText("Địa chỉ:");

        btDelete.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        btDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_delete_30px.png"))); // NOI18N
        btDelete.setText("Xoá");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        btExit.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        btExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_export_30px.png"))); // NOI18N
        btExit.setText("Đóng");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        jLabel7.setText("Giới tính:");

        rdbGioiTinh.add(rbNam);
        rbNam.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        rbNam.setText("Nam");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "Họ tên", "Ngày sinh", "Chức vụ", "Email", "Số điện thoại", "Giới tính", "Địa chỉ"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("UTM Avo", 1, 18)); // NOI18N
        jLabel1.setText("Quản lý nhân viên");

        jLabel10.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        jLabel10.setText("Mã NV:");

        tfMNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMNVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1)
                .addGap(10, 10, 10))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfSDT)
                            .addComponent(tfEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfChucVu, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNgaysinh, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfHoten, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfMNV, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(rbNam, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rbNu))
                            .addComponent(tfDiaChi)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btADD)
                                .addGap(40, 40, 40)
                                .addComponent(btDelete)
                                .addGap(31, 31, 31)
                                .addComponent(btUpdate)))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btExit)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(jLabel1)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfMNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfHoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfNgaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tfSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(rbNam)
                            .addComponent(rbNu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(tfDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btADD, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        try {
            // TODO add your handling code here:
            new TrangChu().show();
        } catch (Exception ex) {
            Logger.getLogger(QuanLiNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.hide();
    }//GEN-LAST:event_btExitActionPerformed

    private void tfMNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMNVActionPerformed

    private void btADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btADDActionPerformed
        // TODO add your handling code here:
        if (tfMNV.getText().equals("")) {
            JOptionPane.showMessageDialog(this,"Vui lòng nhập mã nhân viên");
            return;
        }
        if (tfHoten.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ họ tên");
            return;
        }
        try {
            NhanVien nv = new NhanVien();
            nv.setMaNV(tfMNV.getText());
            nv.setHoTen(tfHoten.getText());
            nv.setNgaySinh(tfNgaysinh.getText());
            nv.setChucVu(tfChucVu.getText());
            nv.setEmail(tfEmail.getText());
            nv.setSDT(tfSDT.getText());
            nv.setGioiTinh(rbNam.isSelected()? "Nam" : "Nữ");
            nv.setDiaChi(tfDiaChi.getText());
            
            NhanVienDao dao = new NhanVienDao();
            dao.insertNV(nv);
            
            LoadData(new NhanVienDao().getListNhanVien());
            JOptionPane.showMessageDialog(this,"Thêm Nhân viên thành công");
            
            
            
                    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Đã tồn tại mã nhân viên trong danh sách");
        }
    }//GEN-LAST:event_btADDActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        // TODO add your handling code here:
        String id = tfMNV.getText();
        StringBuilder sb = new StringBuilder();
        if(tfMNV.getText().equals("")){
            sb.append("Mã sinh viên không được để trống");
            tfMNV.setBackground(Color.red);
       }else{
            tfMNV.setBackground(Color.WHITE);
        }
        if(sb.length()>0){
            JOptionPane.showMessageDialog(this, sb);
            return;
        }
        int confirm = JOptionPane.showConfirmDialog(QuanLiNhanVien.this, "Bạn có chắc chắn muốn xoá không");
            
            if(confirm == JOptionPane.YES_OPTION){
                try {
                    NhanVienDao dao = new NhanVienDao();
                    dao.delete(id);
                    LoadData(new NhanVienDao().getListNhanVien());
                    JOptionPane.showMessageDialog(this,"Đã xoá khỏi danh sách");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Error" + e.getMessage());
                    e.printStackTrace();
                }
            }
        
    }//GEN-LAST:event_btDeleteActionPerformed

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        // TODO add your handling code here:
        NhanVien nv = new NhanVien();
        try {
            nv.setHoTen(tfHoten.getText());
            nv.setNgaySinh(tfNgaysinh.getText());
            nv.setChucVu(tfChucVu.getText());
            nv.setEmail(tfEmail.getText());
            nv.setSDT(tfSDT.getText());
            nv.setGioiTinh(rbNam.isSelected()? "Nam" : "Nữ");
            nv.setDiaChi(tfDiaChi.getText());
            nv.setMaNV(tfMNV.getText());

            NhanVienDao dao = new NhanVienDao();
            dao.update(nv);
            LoadData(new NhanVienDao().getListNhanVien());
            JOptionPane.showMessageDialog(this, "Cập Nhật thành công");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Thất Bại");
            e.printStackTrace();
        }   
    }//GEN-LAST:event_btUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLiNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLiNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLiNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLiNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new QuanLiNhanVien().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(QuanLiNhanVien.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btADD;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btUpdate;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rbNam;
    private javax.swing.JRadioButton rbNu;
    private javax.swing.ButtonGroup rdbGioiTinh;
    private javax.swing.JTextField tfChucVu;
    private javax.swing.JTextField tfDiaChi;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfHoten;
    private javax.swing.JTextField tfMNV;
    private javax.swing.JTextField tfNgaysinh;
    private javax.swing.JTextField tfSDT;
    // End of variables declaration//GEN-END:variables
}
