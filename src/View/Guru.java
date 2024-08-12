/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Koneksi.Koneksi;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rizan
 */
public class Guru extends javax.swing.JPanel {

    /**
     * Creates new form Guru
     */
    public Guru() {
        initComponents();
        ShowTables();
        reset();
    }

    void ShowTables() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NIP/NIK");
        model.addColumn("Nama Guru");
        model.addColumn("Gender");
        model.addColumn("Alamat");
        try {
            String sql = "SELECT * FROM guru";
            java.sql.Connection conn = Koneksi.ConfigDB();
            java.sql.Statement statement = conn.createStatement();
            java.sql.ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                model.addRow(new Object[]{resultSet.getString("nip"), resultSet.getString("nama_guru"), resultSet.getString("Gender"), resultSet.getString("Alamat")});
            }
            tb_Guru.setModel(model);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void reset() {

        tf_Nik.setText("");
        tf_Nama.setText("");
        tf_Alamat.setText("");
        gender.clearSelection();
        tf_Nik.setEditable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPG3Hor1 = new jpg3hor.JPG3Hor();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_Nik = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_Nama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rb_L = new javax.swing.JRadioButton();
        rb_P = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tf_Alamat = new javax.swing.JTextArea();
        bt_Tambah = new javax.swing.JButton();
        bt_Ubah = new javax.swing.JButton();
        bt_Hapus = new javax.swing.JButton();
        bt_Reset = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_Guru = new javax.swing.JTable();

        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPG3Hor1.setColorEnd(new java.awt.Color(102, 102, 255));
        jPG3Hor1.setColorMiddle(new java.awt.Color(0, 0, 255));
        jPG3Hor1.setColorStart(new java.awt.Color(0, 0, 153));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Form: Guru");

        javax.swing.GroupLayout jPG3Hor1Layout = new javax.swing.GroupLayout(jPG3Hor1);
        jPG3Hor1.setLayout(jPG3Hor1Layout);
        jPG3Hor1Layout.setHorizontalGroup(
            jPG3Hor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPG3Hor1Layout.createSequentialGroup()
                .addContainerGap(1014, Short.MAX_VALUE)
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
        jLabel2.setText("NIK/NIP");

        tf_Nik.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("Nama");

        tf_Nama.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("Jenis Kelamin");

        gender.add(rb_L);
        rb_L.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        rb_L.setText("Laki-Laki");
        rb_L.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        gender.add(rb_P);
        rb_P.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        rb_P.setText("Perempuan");
        rb_P.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setText("Alamat");

        jScrollPane1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        tf_Alamat.setColumns(20);
        tf_Alamat.setRows(5);
        jScrollPane1.setViewportView(tf_Alamat);

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

        tb_Guru.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_Guru.setEnabled(false);
        tb_Guru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_GuruMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_Guru);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPG3Hor1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bt_Tambah)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(rb_L)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                            .addComponent(rb_P))
                                        .addComponent(tf_Nik)
                                        .addComponent(tf_Nama))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(bt_Ubah)
                                .addGap(18, 18, 18)
                                .addComponent(bt_Hapus)
                                .addGap(18, 18, 18)
                                .addComponent(bt_Reset)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPG3Hor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_Nik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_Nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rb_L)
                    .addComponent(rb_P))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Reset)
                    .addComponent(bt_Hapus)
                    .addComponent(bt_Ubah)
                    .addComponent(bt_Tambah))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void bt_TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_TambahActionPerformed
        String nip = tf_Nik.getText();
        String nama_guru = tf_Nama.getText();
        String Gender = "";
        if (rb_L.isSelected()) {
            Gender = "L";
        } else if (rb_P.isSelected()) {
            Gender = "P";
        }

        String alamat = tf_Alamat.getText();

        try {
            String sql = "INSERT INTO guru(nip,nama_guru,Gender,Alamat) VALUES('" + nip + "','" + nama_guru + "','" + Gender + "','" + alamat + "')";
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
        String nip = tf_Nik.getText().trim();
        String nama_guru = tf_Nama.getText().trim();
        String Gender = rb_L.isSelected() ? "L" : rb_P.isSelected() ? "P" : ""; // Tangani jika tidak ada gender yang dipilih
        String alamat = tf_Alamat.getText().trim();

        if (nip.isEmpty()) {
            JOptionPane.showMessageDialog(this, "NIK/NIP harus dipilih terlebih dahulu dari tabel.");
            return;
        }

        try {
            String sql = "UPDATE guru SET nama_guru = ?, Gender = ?, Alamat = ? WHERE nip = ?";
            java.sql.Connection conn = Koneksi.ConfigDB();
            java.sql.PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, nama_guru);
            preparedStatement.setString(2, Gender);
            preparedStatement.setString(3, alamat);
            preparedStatement.setString(4, nip);
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        ShowTables();
        reset();
    }//GEN-LAST:event_bt_UbahActionPerformed

    private void bt_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_HapusActionPerformed
        String nip = tf_Nik.getText();

        if (nip.isEmpty()) {
            JOptionPane.showMessageDialog(this, "NIK/NIP harus dipilih terlebih dahulu dari tabel.");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try {
                String sql = "DELETE FROM guru WHERE nip = ?";
                java.sql.Connection conn = Koneksi.ConfigDB();
                java.sql.PreparedStatement preparedStatement = conn.prepareStatement(sql);
                preparedStatement.setString(1, nip);
                preparedStatement.executeUpdate();
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

    private void tb_GuruMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_GuruMouseClicked
        int baris = tb_Guru.rowAtPoint(evt.getPoint());

        String nip = tb_Guru.getValueAt(baris, 0).toString();
        String nama = tb_Guru.getValueAt(baris, 1).toString();
        String genderValue = tb_Guru.getValueAt(baris, 2) != null ? tb_Guru.getValueAt(baris, 2).toString() : "";
        String alamat = tb_Guru.getValueAt(baris, 3) != null ? tb_Guru.getValueAt(baris, 3).toString() : "";

        tf_Nik.setText(nip);
        tf_Nama.setText(nama);
        tf_Alamat.setText(alamat);

        if ("L".equals(genderValue)) {
            rb_L.setSelected(true);
        } else if ("P".equals(genderValue)) {
            rb_P.setSelected(true);
        } else {
            gender.clearSelection(); 
        }

        tf_Nik.setEditable(false);

    }//GEN-LAST:event_tb_GuruMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Hapus;
    private javax.swing.JButton bt_Reset;
    private javax.swing.JButton bt_Tambah;
    private javax.swing.JButton bt_Ubah;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private jpg3hor.JPG3Hor jPG3Hor1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rb_L;
    private javax.swing.JRadioButton rb_P;
    private javax.swing.JTable tb_Guru;
    private javax.swing.JTextArea tf_Alamat;
    private javax.swing.JTextField tf_Nama;
    private javax.swing.JTextField tf_Nik;
    // End of variables declaration//GEN-END:variables
}
