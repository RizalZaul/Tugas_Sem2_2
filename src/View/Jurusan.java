/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Koneksi.Koneksi;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rizan
 */
public class Jurusan extends javax.swing.JPanel {

    public Jurusan() {
        initComponents();
        reset();
        ShowTables();
    }

    void reset() {
        tf_KodeJur.setText("");
        tf_Nama.setText("");
        tf_KodeJur.setEditable(true);
    }

    void ShowTables() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Kode Jurusan");
        model.addColumn("Nama Jurusan");
        try {
            String sql = "SELECT * FROM jurusan";
            java.sql.Connection conn = Koneksi.ConfigDB();
            java.sql.Statement statement = conn.createStatement();
            java.sql.ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                model.addRow(new Object[]{resultSet.getString("kode_jur"), resultSet.getString("nama_jurusan")});
            }
            tb_Jurusan.setModel(model);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPG3Hor1 = new jpg3hor.JPG3Hor();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_KodeJur = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_Nama = new javax.swing.JTextField();
        bt_Tambah = new javax.swing.JButton();
        bt_Ubah = new javax.swing.JButton();
        bt_Hapus = new javax.swing.JButton();
        bt_Reset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Jurusan = new javax.swing.JTable();

        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPG3Hor1.setColorEnd(new java.awt.Color(102, 102, 255));
        jPG3Hor1.setColorMiddle(new java.awt.Color(0, 0, 255));
        jPG3Hor1.setColorStart(new java.awt.Color(0, 0, 153));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Form: Jurusan");

        javax.swing.GroupLayout jPG3Hor1Layout = new javax.swing.GroupLayout(jPG3Hor1);
        jPG3Hor1.setLayout(jPG3Hor1Layout);
        jPG3Hor1Layout.setHorizontalGroup(
            jPG3Hor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPG3Hor1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPG3Hor1Layout.setVerticalGroup(
            jPG3Hor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPG3Hor1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("Kode Jurusan");

        tf_KodeJur.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("Nama Jurusan");

        tf_Nama.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        bt_Tambah.setBackground(new java.awt.Color(0, 0, 204));
        bt_Tambah.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        bt_Tambah.setForeground(new java.awt.Color(255, 255, 255));
        bt_Tambah.setText("Tambah");
        bt_Tambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_TambahActionPerformed(evt);
            }
        });

        bt_Ubah.setBackground(new java.awt.Color(0, 153, 0));
        bt_Ubah.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        bt_Ubah.setForeground(new java.awt.Color(255, 255, 255));
        bt_Ubah.setText("Ubah");
        bt_Ubah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_Ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_UbahActionPerformed(evt);
            }
        });

        bt_Hapus.setBackground(new java.awt.Color(204, 0, 0));
        bt_Hapus.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        bt_Hapus.setForeground(new java.awt.Color(255, 255, 255));
        bt_Hapus.setText("Hapus");
        bt_Hapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_HapusActionPerformed(evt);
            }
        });

        bt_Reset.setBackground(new java.awt.Color(255, 102, 0));
        bt_Reset.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        bt_Reset.setForeground(new java.awt.Color(255, 255, 255));
        bt_Reset.setText("Reset");
        bt_Reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ResetActionPerformed(evt);
            }
        });

        tb_Jurusan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tb_Jurusan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tb_Jurusan.setEnabled(false);
        tb_Jurusan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_JurusanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_Jurusan);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPG3Hor1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(bt_Tambah)
                            .addGap(18, 18, 18)
                            .addComponent(bt_Ubah)
                            .addGap(18, 18, 18)
                            .addComponent(bt_Hapus)
                            .addGap(18, 18, 18)
                            .addComponent(bt_Reset))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(21, 21, 21)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tf_KodeJur)
                                .addComponent(tf_Nama, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(460, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPG3Hor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_KodeJur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_Nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Tambah)
                    .addComponent(bt_Ubah)
                    .addComponent(bt_Hapus)
                    .addComponent(bt_Reset))
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 61, Short.MAX_VALUE))
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void bt_TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_TambahActionPerformed
        String kode_jur = tf_KodeJur.getText();
        String nama_jurusan = tf_Nama.getText();

        try {
            String sql = "INSERT INTO jurusan(kode_jur,nama_jurusan) VALUES('" + kode_jur + "','" + nama_jurusan + "')";
            java.sql.Connection conn = Koneksi.ConfigDB();
            java.sql.Statement statement = conn.createStatement();
            statement.execute(sql);
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        ShowTables();
        reset();

    }//GEN-LAST:event_bt_TambahActionPerformed

    private void bt_UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_UbahActionPerformed
        String kode_jur = tf_KodeJur.getText();
        String nama_jurusan = tf_Nama.getText();

        try {
            String sql = "UPDATE jurusan SET nama_jurusan = ? WHERE kode_jur = ?";
            java.sql.Connection conn = Koneksi.ConfigDB();
            java.sql.PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, nama_jurusan);
            preparedStatement.setString(2, kode_jur);

            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
            } else {
                JOptionPane.showMessageDialog(null, "Data Gagal Diubah atau kode_jur tidak ditemukan");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        ShowTables();
        reset();
    }//GEN-LAST:event_bt_UbahActionPerformed

    private void bt_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_HapusActionPerformed
        String kode_jur = tf_KodeJur.getText();
        int confirm = JOptionPane.showConfirmDialog(this,
                "Apakah Anda yakin ingin menghapus data dengan kode jurusan '" + kode_jur + "'?",
                "Konfirmasi Penghapusan",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);

        if (confirm == JOptionPane.YES_OPTION) {
            try {
                String sql = "DELETE FROM jurusan WHERE kode_jur ='" + kode_jur + "'";
                java.sql.Connection conn = Koneksi.ConfigDB();
                java.sql.Statement statement = conn.createStatement();
                statement.execute(sql);
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
            ShowTables();
            reset();
        }
    }//GEN-LAST:event_bt_HapusActionPerformed

    private void bt_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ResetActionPerformed
        reset();
    }//GEN-LAST:event_bt_ResetActionPerformed

    private void tb_JurusanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_JurusanMouseClicked
        int baris = tb_Jurusan.rowAtPoint(evt.getPoint());
        String kode_jur = tb_Jurusan.getValueAt(baris, 0).toString();
        String nama_jurusan = tb_Jurusan.getValueAt(baris, 1).toString();
        tf_KodeJur.setText(kode_jur);
        tf_Nama.setText(nama_jurusan);
        tf_KodeJur.setEditable(false);
    }//GEN-LAST:event_tb_JurusanMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Hapus;
    private javax.swing.JButton bt_Reset;
    private javax.swing.JButton bt_Tambah;
    private javax.swing.JButton bt_Ubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private jpg3hor.JPG3Hor jPG3Hor1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_Jurusan;
    private javax.swing.JTextField tf_KodeJur;
    private javax.swing.JTextField tf_Nama;
    // End of variables declaration//GEN-END:variables
}
