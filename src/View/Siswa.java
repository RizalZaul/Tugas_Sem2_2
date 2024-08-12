/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Koneksi.Koneksi;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rizan
 */
public class Siswa extends javax.swing.JPanel {

    public Siswa() {
        initComponents();
        reset();
        ShowTables();
        cb_Class();
    }

    void reset() {

        tf_Nis.setText("");
        tf_Nama.setText("");
        Gender.clearSelection();
        tf_Tempat.setText("");
        tf_Tgl.setCalendar(null);
        tf_No.setText("");
        cb_Kelas.setSelectedItem(null);
        tf_Alamat.setText("");
        tf_Kesan.setText("");
        KotakFoto.setText("FOTO");
        KotakFoto.setIcon(null);
        lb_Foto.setText("");

        tf_Nis.setEditable(true);

    }

    void ShowTables() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NIS");
        model.addColumn("Nama Siswa");
        model.addColumn("L//P");
        model.addColumn("Tmpt Lahir");
        model.addColumn("Tgl Lahir");
        model.addColumn("No. Telp");
        model.addColumn("Kelas");
        model.addColumn("Alamat");
        model.addColumn("Kesan Pesan");
        model.addColumn("Foto");
        try {
            String sql = "SELECT nis, \n"
                    + "nama_siswa, \n"
                    + "gender, \n"
                    + "tempat_lahir, \n"
                    + "tgl_lahir, \n"
                    + "no_hp, \n"
                    + "id_kelas, \n"
                    + "alamat, \n"
                    + "kesan_pesan,\n"
                    + "foto\n"
                    + "FROM siswa;";
            java.sql.Connection conn = Koneksi.ConfigDB();
            java.sql.Statement statement = conn.createStatement();
            java.sql.ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                model.addRow(new Object[]{resultSet.getString("nis"), resultSet.getString("nama_siswa"), resultSet.getString("gender"), resultSet.getString("tempat_lahir"), resultSet.getString("tgl_lahir"), resultSet.getString("no_hp"), resultSet.getString("id_kelas"), resultSet.getString("alamat"), resultSet.getString("kesan_pesan"), resultSet.getString("foto")});
            }
            tb_Siswa.setModel(model);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void cb_Class() {
        try {
            String sql = "SELECT id_kelas FROM kelas";
            java.sql.Connection conn = Koneksi.ConfigDB();
            java.sql.Statement statement = conn.createStatement();
            java.sql.ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                cb_Kelas.addItem(resultSet.getString("id_kelas"));
            }
            cb_Kelas.setSelectedItem(null);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private File selectedFile;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Gender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPG3Hor1 = new jpg3hor.JPG3Hor();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tf_Nis = new javax.swing.JTextField();
        tf_Nama = new javax.swing.JTextField();
        rb_L = new javax.swing.JRadioButton();
        rb_P = new javax.swing.JRadioButton();
        tf_Tempat = new javax.swing.JTextField();
        tf_Tgl = new com.toedter.calendar.JDateChooser();
        tf_No = new javax.swing.JTextField();
        cb_Kelas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tf_Alamat = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tf_Kesan = new javax.swing.JTextArea();
        KotakFoto = new javax.swing.JLabel();
        lb_Foto = new javax.swing.JLabel();
        bt_Tambah = new javax.swing.JButton();
        bt_Ubah = new javax.swing.JButton();
        bt_Hapus = new javax.swing.JButton();
        bt_Reset = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_Siswa = new javax.swing.JTable();
        bt_SimpanFoto = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPG3Hor1.setColorEnd(new java.awt.Color(102, 102, 255));
        jPG3Hor1.setColorMiddle(new java.awt.Color(0, 0, 255));
        jPG3Hor1.setColorStart(new java.awt.Color(0, 0, 153));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Form: Siswa");

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
        jLabel2.setText("NIS");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("Nama");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("Gender");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setText("Tempat Lahir");

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setText("Tanggal Lahir");

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setText("No. HP");

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel8.setText("Kelas");

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel9.setText("Alamat");

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel10.setText("Kesan Pesan");

        tf_Nis.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        tf_Nama.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        Gender.add(rb_L);
        rb_L.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        rb_L.setText("Laki-Laki");
        rb_L.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Gender.add(rb_P);
        rb_P.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        rb_P.setText("Perempuan");
        rb_P.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tf_Tempat.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        tf_Tgl.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        tf_No.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        cb_Kelas.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        tf_Alamat.setColumns(20);
        tf_Alamat.setRows(5);
        jScrollPane1.setViewportView(tf_Alamat);

        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        tf_Kesan.setColumns(20);
        tf_Kesan.setRows(5);
        jScrollPane2.setViewportView(tf_Kesan);

        KotakFoto.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        KotakFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        KotakFoto.setText("FOTO");
        KotakFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        KotakFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        KotakFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KotakFotoMouseClicked(evt);
            }
        });

        lb_Foto.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lb_Foto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

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

        tb_Siswa.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_Siswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_SiswaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tb_Siswa);

        bt_SimpanFoto.setBackground(new java.awt.Color(204, 204, 0));
        bt_SimpanFoto.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        bt_SimpanFoto.setText("Simpan Foto");
        bt_SimpanFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_SimpanFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_SimpanFotoActionPerformed(evt);
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
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rb_L)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb_P))
                            .addComponent(tf_Nama)
                            .addComponent(tf_Nis)
                            .addComponent(tf_Tempat)
                            .addComponent(tf_Tgl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_No)
                            .addComponent(cb_Kelas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(67, 67, 67)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(148, 148, 148)
                        .addComponent(KotakFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 181, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bt_Tambah)
                        .addGap(18, 18, 18)
                        .addComponent(bt_Ubah)
                        .addGap(18, 18, 18)
                        .addComponent(bt_Hapus)
                        .addGap(18, 18, 18)
                        .addComponent(bt_Reset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_SimpanFoto)
                        .addGap(200, 200, 200)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_Foto, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPG3Hor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(KotakFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2)
                                            .addComponent(tf_Nis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3)
                                            .addComponent(tf_Nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(rb_L)
                                            .addComponent(rb_P))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5)
                                            .addComponent(tf_Tempat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(tf_Tgl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tf_No, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(cb_Kelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(lb_Foto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Tambah)
                    .addComponent(bt_Ubah)
                    .addComponent(bt_Hapus)
                    .addComponent(bt_Reset)
                    .addComponent(bt_SimpanFoto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void bt_TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_TambahActionPerformed
        try {
            String gender = rb_L.isSelected() ? "L" : "P";
            String datePattern = "yyyy-MM-dd";
            SimpleDateFormat dateFormat = new SimpleDateFormat(datePattern);
            String tglLahir = dateFormat.format(tf_Tgl.getDate());

            String sql = "INSERT INTO siswa (nis, nama_siswa, gender, tempat_lahir, tgl_lahir, no_hp, id_kelas, alamat, kesan_pesan, foto) "
                    + "VALUES ('" + tf_Nis.getText() + "',"
                    + "'" + tf_Nama.getText() + "',"
                    + "'" + gender + "',"
                    + "'" + tf_Tempat.getText() + "',"
                    + "'" + tglLahir + "',"
                    + "'" + tf_No.getText() + "',"
                    + "'" + cb_Kelas.getSelectedItem() + "',"
                    + "'" + tf_Alamat.getText() + "',"
                    + "'" + tf_Kesan.getText() + "',"
                    + "'" + lb_Foto.getText() + "')";

            java.sql.Connection conn = Koneksi.ConfigDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();

            JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan!");
            reset();
            ShowTables();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal menambahkan data: " + e.getMessage());
        }


    }//GEN-LAST:event_bt_TambahActionPerformed

    private void bt_UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_UbahActionPerformed
        try {
            String nis = tf_Nis.getText();
            String nama = tf_Nama.getText();
            String gender = rb_L.isSelected() ? "L" : "P";
            String tempatLahir = tf_Tempat.getText();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String tglLahir = sdf.format(tf_Tgl.getDate());
            String noHp = tf_No.getText();
            String kelas = cb_Kelas.getSelectedItem().toString();
            String alamat = tf_Alamat.getText();
            String kesanPesan = tf_Kesan.getText();
            String fotoPath = lb_Foto.getText();

            String sql = "UPDATE siswa SET nama_siswa=?, gender=?, tempat_lahir=?, tgl_lahir=?, no_hp=?, id_kelas=?, alamat=?, kesan_pesan=?, foto=? WHERE nis=?";
            java.sql.Connection conn = Koneksi.ConfigDB();
            java.sql.PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, nama);
            ps.setString(2, gender);
            ps.setString(3, tempatLahir);
            ps.setString(4, tglLahir);
            ps.setString(5, noHp);
            ps.setString(6, kelas);
            ps.setString(7, alamat);
            ps.setString(8, kesanPesan);
            ps.setString(9, fotoPath);
            ps.setString(10, nis);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil diubah!");

            reset();
            ShowTables();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_bt_UbahActionPerformed

    private void bt_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_HapusActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try {
                String nis = tf_Nis.getText();
                String sql = "DELETE FROM siswa WHERE nis=?";
                java.sql.Connection conn = Koneksi.ConfigDB();
                java.sql.PreparedStatement ps = conn.prepareStatement(sql);

                ps.setString(1, nis);

                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");

                reset();
                ShowTables();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_bt_HapusActionPerformed

    private void bt_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ResetActionPerformed
        reset();
    }//GEN-LAST:event_bt_ResetActionPerformed

    private void tb_SiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_SiswaMouseClicked
        int baris = tb_Siswa.rowAtPoint(evt.getPoint());

        String nis = tb_Siswa.getValueAt(baris, 0).toString();
        String nama = tb_Siswa.getValueAt(baris, 1).toString();
        String genderValue = tb_Siswa.getValueAt(baris, 2) != null ? tb_Siswa.getValueAt(baris, 2).toString() : "";
        String tempat = tb_Siswa.getValueAt(baris, 3) != null ? tb_Siswa.getValueAt(baris, 3).toString() : "";
        String tgl = tb_Siswa.getValueAt(baris, 4) != null ? tb_Siswa.getValueAt(baris, 4).toString() : "";
        String no = tb_Siswa.getValueAt(baris, 5) != null ? tb_Siswa.getValueAt(baris, 5).toString() : "";
        String kelas = tb_Siswa.getValueAt(baris, 6) != null ? tb_Siswa.getValueAt(baris, 6).toString() : "";
        String alamat = tb_Siswa.getValueAt(baris, 7) != null ? tb_Siswa.getValueAt(baris, 7).toString() : "";
        String kesan = tb_Siswa.getValueAt(baris, 8) != null ? tb_Siswa.getValueAt(baris, 8).toString() : "";
        String foto = tb_Siswa.getValueAt(baris, 9) != null ? tb_Siswa.getValueAt(baris, 9).toString() : "";

        tf_Nis.setText(nis);
        tf_Nama.setText(nama);
        tf_Tempat.setText(tempat);
        tf_No.setText(no);
        cb_Kelas.setSelectedItem(kelas);
        tf_Alamat.setText(alamat);
        tf_Kesan.setText(kesan);
        KotakFoto.setText(foto);

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse(tgl);
            tf_Tgl.setDate(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        if ("L".equals(genderValue)) {
            rb_L.setSelected(true);
        } else if ("P".equals(genderValue)) {
            rb_P.setSelected(true);
        } else {
            Gender.clearSelection();
        }

        // Menampilkan foto jika ada
        if (foto != null && !foto.isEmpty()) {
            try {
                // Menggunakan path relatif dari folder src/Foto
                String fotoPath = "src/Foto/" + foto;
                File file = new File(fotoPath);
                if (file.exists()) {
                    ImageIcon icon = new ImageIcon(fotoPath);
                    Image image = icon.getImage().getScaledInstance(KotakFoto.getWidth(), KotakFoto.getHeight(), Image.SCALE_DEFAULT);
                    KotakFoto.setIcon(new ImageIcon(image));
                } else {
                    KotakFoto.setIcon(null);
                    JOptionPane.showMessageDialog(null, "File not found: " + fotoPath);
                }
            } catch (Exception e) {
                KotakFoto.setIcon(null);
                JOptionPane.showMessageDialog(null, "Error loading image: " + e.getMessage());
            }
        } else {
            KotakFoto.setIcon(null);
        }

        tf_Nis.setEditable(false);
        
    }//GEN-LAST:event_tb_SiswaMouseClicked

    private void KotakFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KotakFotoMouseClicked
        try {
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            selectedFile = chooser.getSelectedFile();

            if (selectedFile != null) {
                ImageIcon icon = new ImageIcon(selectedFile.toString());
                Image image = icon.getImage().getScaledInstance(KotakFoto.getWidth(), KotakFoto.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon ic = new ImageIcon(image);
                KotakFoto.setText(null);
                KotakFoto.setIcon(ic);

                // Mendapatkan nama siswa dari TextField
                String namaSiswa = tf_Nama.getText().replaceAll("\\s+", "_");
                String nis = tf_Nis.getText();

                // Menyimpan nama file ke lb_Foto tanpa path
                String filename = nis + "_" + namaSiswa + ".jpg";
                lb_Foto.setText(filename);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Upload Error: " + e);
        }
    }//GEN-LAST:event_KotakFotoMouseClicked

    private void bt_SimpanFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_SimpanFotoActionPerformed
        try {
            if (selectedFile != null && selectedFile.exists()) {
                // Mendapatkan nama file dari lb_Foto
                String filename = lb_Foto.getText();
                String targetPath = "src/Foto/" + filename;
                File targetFile = new File(targetPath);

                // Buat folder jika belum ada
                targetFile.getParentFile().mkdirs();

                // Copy file dari source ke target
                Files.copy(selectedFile.toPath(), targetFile.toPath(), StandardCopyOption.REPLACE_EXISTING);

                JOptionPane.showMessageDialog(null, "Foto berhasil disimpan!");
            } else {
                JOptionPane.showMessageDialog(null, "File sumber tidak ditemukan atau belum dipilih.");
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error menyimpan foto: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_bt_SimpanFotoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Gender;
    private javax.swing.JLabel KotakFoto;
    private javax.swing.JButton bt_Hapus;
    private javax.swing.JButton bt_Reset;
    private javax.swing.JButton bt_SimpanFoto;
    private javax.swing.JButton bt_Tambah;
    private javax.swing.JButton bt_Ubah;
    private javax.swing.JComboBox<String> cb_Kelas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private jpg3hor.JPG3Hor jPG3Hor1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lb_Foto;
    private javax.swing.JRadioButton rb_L;
    private javax.swing.JRadioButton rb_P;
    private javax.swing.JTable tb_Siswa;
    private javax.swing.JTextArea tf_Alamat;
    private javax.swing.JTextArea tf_Kesan;
    private javax.swing.JTextField tf_Nama;
    private javax.swing.JTextField tf_Nis;
    private javax.swing.JTextField tf_No;
    private javax.swing.JTextField tf_Tempat;
    private com.toedter.calendar.JDateChooser tf_Tgl;
    // End of variables declaration//GEN-END:variables
}
