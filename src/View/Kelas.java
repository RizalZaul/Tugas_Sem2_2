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
public class Kelas extends javax.swing.JPanel {

    /**
     * Creates new form Jurusan
     */
    public Kelas() {
        initComponents();
        ShowTables();
        reset();
        cb_Jurusan();
        cb_WaliKel();
        cb_tingkatan();
    }

    void ShowTables() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Kode Kelas");
        model.addColumn("Nama Kelas");
        model.addColumn("Tingkatan");
        model.addColumn("Jurusan");
        model.addColumn("Wali Kelas");
        try {
            String sql = "SELECT k.id_kelas, k.nama_kelas, k.tingkatan, j.nama_jurusan, g.nama_guru\n"
                    + "FROM kelas k LEFT JOIN jurusan j\n"
                    + "ON k.kode_jur=j.kode_jur\n"
                    + "LEFT JOIN guru g\n"
                    + "ON k.nip_wali_kelas = g.nip;";
            java.sql.Connection conn = Koneksi.ConfigDB();
            java.sql.Statement statement = conn.createStatement();
            java.sql.ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                model.addRow(new Object[]{resultSet.getString("id_kelas"), resultSet.getString("nama_kelas"), resultSet.getString("tingkatan"), resultSet.getString("nama_jurusan"), resultSet.getString("nama_guru")});
            }
            tb_Kelas.setModel(model);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void reset() {
        tf_KodKelas.setText("");
        tf_Nama.setText("");
        cb_Tingkatan.setSelectedItem(null);
        cb_Jurusan.setSelectedItem(null);
        cb_Wali.setSelectedItem(null);
        
        tf_KodKelas.setEditable(true);
    }

    void cb_Jurusan() {
        try {
            String sql = "SELECT * FROM Jurusan";
            java.sql.Connection conn = Koneksi.ConfigDB();
            java.sql.Statement statement = conn.createStatement();
            java.sql.ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                cb_Jurusan.addItem(resultSet.getString("nama_jurusan"));
            }
            cb_Jurusan.setSelectedItem(null);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void cb_WaliKel() {
        try {
            String sql = "SELECT * FROM Guru";
            java.sql.Connection conn = Koneksi.ConfigDB();
            java.sql.Statement statement = conn.createStatement();
            java.sql.ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                cb_Wali.addItem(resultSet.getString("nama_guru"));
            }
            cb_Wali.setSelectedItem(null);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void cb_tingkatan() {
        try {
            String sql = "SELECT tingkatan FROM kelas";
            java.sql.Connection conn = Koneksi.ConfigDB();
            java.sql.Statement statement = conn.createStatement();
            java.sql.ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                cb_Tingkatan.addItem(resultSet.getString("tingkatan"));
            }
            cb_Tingkatan.setSelectedItem(null);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    String kj(String nama_jurusan) {
        try {
            String sql = "SELECT kode_jur FROM jurusan WHERE nama_jurusan = ?";
            java.sql.Connection conn = Koneksi.ConfigDB();
            java.sql.PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, nama_jurusan);
            java.sql.ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                return resultSet.getString("kode_jur");

            }
        } catch (Exception e) {
            return "";
        }
        return "";
    }

    String nipwali(String nama_wali) {
        try {
            String sql = "SELECT nip FROM guru WHERE nama_guru = ?";
            java.sql.Connection conn = Koneksi.ConfigDB();
            java.sql.PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, nama_wali);
            java.sql.ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                return resultSet.getString("nip");

            }
        } catch (Exception e) {
            return "";
        }
        return "";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jPG3Hor1 = new jpg3hor.JPG3Hor();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_KodKelas = new javax.swing.JTextField();
        tf_Nama = new javax.swing.JTextField();
        cb_Tingkatan = new javax.swing.JComboBox<>();
        cb_Jurusan = new javax.swing.JComboBox<>();
        cb_Wali = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Kelas = new javax.swing.JTable();
        bt_Tambah = new javax.swing.JButton();
        bt_Ubah = new javax.swing.JButton();
        bt_Hapus = new javax.swing.JButton();
        bt_Reset = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1174, 756));

        jPG3Hor1.setColorEnd(new java.awt.Color(102, 102, 255));
        jPG3Hor1.setColorMiddle(new java.awt.Color(0, 0, 255));
        jPG3Hor1.setColorStart(new java.awt.Color(0, 0, 153));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Form: Kelas");

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
        jLabel2.setText("Kode Kelas");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("Nama Kelas");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("Tingkatan");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setText("Jurusan");

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setText("Wali Kelas");

        tf_KodKelas.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        tf_Nama.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        cb_Tingkatan.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        cb_Jurusan.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        cb_Wali.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        tb_Kelas.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_Kelas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_KelasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_Kelas);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPG3Hor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1168, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_KodKelas)
                                    .addComponent(tf_Nama)
                                    .addComponent(cb_Tingkatan, 0, 259, Short.MAX_VALUE)
                                    .addComponent(cb_Jurusan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cb_Wali, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bt_Tambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bt_Ubah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bt_Hapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bt_Reset)))
                        .addContainerGap(799, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPG3Hor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_KodKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_Nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cb_Tingkatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cb_Jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cb_Wali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Tambah)
                    .addComponent(bt_Ubah)
                    .addComponent(bt_Hapus)
                    .addComponent(bt_Reset))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void bt_TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_TambahActionPerformed
        String kode_kelas = tf_KodKelas.getText();
        String nama_kelas = tf_Nama.getText();
        String tingkatan = (cb_Tingkatan.getSelectedItem() != null) ? cb_Tingkatan.getSelectedItem().toString() : "";
        String jurusan = (cb_Jurusan.getSelectedItem() != null) ? cb_Jurusan.getSelectedItem().toString() : "";
        String wali_kelas = (cb_Wali.getSelectedItem() != null) ? cb_Wali.getSelectedItem().toString() : "";

        // Validasi jika kode_kelas atau nama_kelas kosong, tampilkan pesan peringatan
        if (kode_kelas.isEmpty() || nama_kelas.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Kode Kelas dan Nama Kelas harus diisi!");
            return;
        }

        try {
            String kode_jur = kj(jurusan);
            String nip_wali = nipwali(wali_kelas);

            String sql = "INSERT INTO kelas (id_kelas, nama_kelas, tingkatan, kode_jur, nip_wali_kelas) VALUES (?, ?, ?, ?, ?)";
            java.sql.Connection conn = Koneksi.ConfigDB();
            java.sql.PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, kode_kelas);
            statement.setString(2, nama_kelas);
            statement.setString(3, tingkatan);
            statement.setString(4, kode_jur.isEmpty() ? null : kode_jur);
            statement.setString(5, nip_wali.isEmpty() ? null : nip_wali);

            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

        ShowTables();
        reset();
    }//GEN-LAST:event_bt_TambahActionPerformed

    private void bt_UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_UbahActionPerformed
        String kode_kelas = tf_KodKelas.getText();
        String nama_kelas = tf_Nama.getText();
        String tingkatan = (cb_Tingkatan.getSelectedItem() != null) ? cb_Tingkatan.getSelectedItem().toString() : "";
        String jurusan = (cb_Jurusan.getSelectedItem() != null) ? cb_Jurusan.getSelectedItem().toString() : "";
        String wali_kelas = (cb_Wali.getSelectedItem() != null) ? cb_Wali.getSelectedItem().toString() : "";
        String kode_jurusan = kj(jurusan);
        String nip_wali = nipwali(wali_kelas);

        try {
            String sql = "UPDATE kelas SET nama_kelas = '" + nama_kelas + "', tingkatan = '" + tingkatan
                    + "', kode_jur = '" + kode_jurusan + "', nip_wali_kelas = '" + nip_wali
                    + "' WHERE id_kelas = '" + kode_kelas + "'";
            java.sql.Connection conn = Koneksi.ConfigDB();
            java.sql.Statement statement = conn.createStatement();
            statement.execute(sql);
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

        ShowTables();
        reset();
    }//GEN-LAST:event_bt_UbahActionPerformed

    private void bt_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_HapusActionPerformed
        String kode_kelas = tf_KodKelas.getText();

        int confirm = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try {
                String sql = "DELETE FROM kelas WHERE id_kelas = '" + kode_kelas + "'";
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

    private void tb_KelasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_KelasMouseClicked
        int baris = tb_Kelas.rowAtPoint(evt.getPoint());

        String kode_kelas = tb_Kelas.getValueAt(baris, 0) != null ? tb_Kelas.getValueAt(baris, 0).toString() : "";
        String nama_kelas = tb_Kelas.getValueAt(baris, 1) != null ? tb_Kelas.getValueAt(baris, 1).toString() : "";
        String tingkatan = tb_Kelas.getValueAt(baris, 2) != null ? tb_Kelas.getValueAt(baris, 2).toString() : "";
        String jurusan = tb_Kelas.getValueAt(baris, 3) != null ? tb_Kelas.getValueAt(baris, 3).toString() : "";
        String wali_kelas = tb_Kelas.getValueAt(baris, 4) != null ? tb_Kelas.getValueAt(baris, 4).toString() : "";

        tf_KodKelas.setText(kode_kelas);
        tf_Nama.setText(nama_kelas);
        cb_Tingkatan.setSelectedItem(tingkatan);
        cb_Jurusan.setSelectedItem(jurusan);
        cb_Wali.setSelectedItem(wali_kelas);
        tf_KodKelas.setEditable(false);


    }//GEN-LAST:event_tb_KelasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Hapus;
    private javax.swing.JButton bt_Reset;
    private javax.swing.JButton bt_Tambah;
    private javax.swing.JButton bt_Ubah;
    private javax.swing.JComboBox<String> cb_Jurusan;
    private javax.swing.JComboBox<String> cb_Tingkatan;
    private javax.swing.JComboBox<String> cb_Wali;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private jpg3hor.JPG3Hor jPG3Hor1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable tb_Kelas;
    private javax.swing.JTextField tf_KodKelas;
    private javax.swing.JTextField tf_Nama;
    // End of variables declaration//GEN-END:variables
}
