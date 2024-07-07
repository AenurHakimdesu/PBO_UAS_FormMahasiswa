/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DataMahasiswa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
//import javax.swing.JOptionsPane;
import java.util.*;
import Models.ModelPendaftaran;

/**
 *
 * @author HP
 */
public class DataPendaftaran extends javax.swing.JFrame {
        
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
        static final String DB_URL = "jdbc:mysql://localhost/db_pendaftaranmhs";
        static final String USER = "root";
        static final String PASS = "";
        
        List<ModelPendaftaran> items = new ArrayList<>();
        static Connection conn;
        static Statement stmt;
        static ResultSet rs;

    /**
     * Creates new form DataPendaftaran
     */
    public DataPendaftaran() {
        initComponents();
        btnEditPendaftaran.setEnabled(false);
        btnHapusPendaftaran.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fldNamaSiswa = new javax.swing.JTextField();
        fldTgl = new javax.swing.JTextField();
        fldAsal = new javax.swing.JTextField();
        fldNamaWali = new javax.swing.JTextField();
        fldEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cbKlmn = new javax.swing.JComboBox<>();
        cbProdi = new javax.swing.JComboBox<>();
        btnSimpanPendaftaran = new javax.swing.JButton();
        btnHapusPendaftaran = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDataMhs = new javax.swing.JTable();
        btnEditPendaftaran = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        fldAsalSklh = new javax.swing.JTextField();
        btnKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Data Pendaftaran Mahasiswa");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("FORMULIR PENDAFTARAN");

        jLabel2.setText("NAMA SISWA :");

        jLabel3.setText("ASAL SEKOLAH :");

        jLabel4.setText("JENIS KELAMIN :");

        jLabel5.setText("KOTA ASAL:");

        jLabel6.setText("NAMA WALI :");

        jLabel8.setText("EMAIL SISWA :");

        fldNamaSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldNamaSiswaActionPerformed(evt);
            }
        });

        fldAsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldAsalActionPerformed(evt);
            }
        });

        fldNamaWali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldNamaWaliActionPerformed(evt);
            }
        });

        jLabel10.setText("PILIHAN PRODI :");

        cbKlmn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--PILIH--", "Laki-Laki", "Perempuan" }));

        cbProdi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--PILIH--", "1. Bla bla", "2. a", "3. b", "4. c", "5. d", "6. e", "7. f", "8. g", "9. h", "10. i", "11. j", "12. k", "13. l" }));
        cbProdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProdiActionPerformed(evt);
            }
        });

        btnSimpanPendaftaran.setText("SIMPAN");
        btnSimpanPendaftaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanPendaftaranActionPerformed(evt);
            }
        });

        btnHapusPendaftaran.setText("HAPUS");

        tblDataMhs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID SISWA", "NAMA SISWA", "ASAL SEKOLAH", "JENIS KELAMIN", "KOTA ASAL", "EMAIL SISWA", "ID WALI", "ID PRODI"
            }
        ));
        jScrollPane1.setViewportView(tblDataMhs);

        btnEditPendaftaran.setText("EDIT");
        btnEditPendaftaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditPendaftaranActionPerformed(evt);
            }
        });

        jLabel7.setText("TANGGAL LAHIR :");

        btnKeluar.setText("KELUAR");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(1, 1, 1)))
                .addGap(122, 122, 122)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(fldTgl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
                    .addComponent(fldAsalSklh, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbKlmn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(btnEditPendaftaran)
                        .addGap(18, 18, 18)
                        .addComponent(btnHapusPendaftaran)
                        .addGap(18, 18, 18)
                        .addComponent(btnKeluar))
                    .addComponent(fldAsal, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fldNamaSiswa))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 934, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(366, 366, 366))
            .addGroup(layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(btnSimpanPendaftaran)
                .addGap(0, 655, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fldNamaWali, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
                    .addComponent(cbProdi, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fldEmail))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fldNamaSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fldTgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(fldAsalSklh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbKlmn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fldAsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fldNamaWali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbProdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpanPendaftaran)
                    .addComponent(btnHapusPendaftaran)
                    .addComponent(btnEditPendaftaran)
                    .addComponent(btnKeluar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fldNamaSiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldNamaSiswaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldNamaSiswaActionPerformed

    private void btnSimpanPendaftaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanPendaftaranActionPerformed
        // TODO add your handling code here:
        String nama_siswa = fldNamaSiswa.getText();
        String tgl_lahir = fldTgl.getText();
        String asal_sekolah = fldAsalSklh.getText();
        String jenis_kelamin = cbKlmn.getSelectedItem().toString();
        String kota_asal = fldAsal.getText();
        String id_wali = fldNamaWali.getText();
        String email_siswa = fldEmail.getText();
        int id_prodi = cbProdi.getSelectedIndex();
        
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            
            String sql = 
            "INSERT INTO data_mhs (Nama_Siswa, Tgl_Lahir, Asal_Sekolah, Jenis_Kelamin, Kota_Asal, Email_Siswa, ID_Wali, ID_Prodi) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, nama_siswa);
            ps.setString(2, tgl_lahir);
            ps.setString(3, asal_sekolah);
            ps.setString(4, jenis_kelamin);
            ps.setString(5, kota_asal);
            ps.setString(6, email_siswa);
            ps.setString(7, id_wali);
            ps.setInt(8, id_prodi);
            
            ps.execute();
            stmt.close();
            conn.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        showTableData();
    }//GEN-LAST:event_btnSimpanPendaftaranActionPerformed

    private void cbProdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProdiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbProdiActionPerformed

    private void btnEditPendaftaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditPendaftaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditPendaftaranActionPerformed

    private void fldNamaWaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldNamaWaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldNamaWaliActionPerformed

    private void fldAsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldAsalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldAsalActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        showTableData();
    }//GEN-LAST:event_formWindowOpened
    
    public void showTableData()
    {
        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID SISWA");
            model.addColumn("NAMA SISWA");
            model.addColumn("TANGGAL LAHIR");
            model.addColumn("ASAL SEKOLAH");
            model.addColumn("JENIS KELAMIN");
            model.addColumn("KOTA ASAL");
            model.addColumn("EMAIL SISWA");
            model.addColumn("ID WALI");
            model.addColumn("ID PRODI");

            
            stmt = conn.createStatement();
            String sql = "SELECT * FROM data_mhs";
            items.clear();
            rs = stmt.executeQuery(sql);
            while(rs.next()) {
                items.add(new ModelPendaftaran(rs.getInt("ID_Siswa"),rs.getString("Nama_Siswa"),rs.getString("Tgl_Lahir"),rs.getString("Asal_Sekolah"),rs.getString("Jenis_Kelamin"),rs.getString("Kota_Asal"),rs.getString("Email_Siswa"),rs.getInt("ID_Wali"),rs.getInt("ID_Prodi")));
            }
            int i = 1;
            for (ModelPendaftaran p : items)
            {
                model.addRow(new Object[]{
                    i,
                    p.getNama_Siswa(),
                    p.getTgl_Lahir(),
                    p.getAsal_Sekolah(),
                    p.getJenis_Kelamin(),
                    p.getKota_Asal(),
                    p.getEmail_Siswa(),
                    p.getID_Wali(),
                    p.getID_Prodi()
                });
                i++;
            }
            
            rs.close();
            stmt.close();
            tblDataMhs.setModel(model);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditPendaftaran;
    private javax.swing.JButton btnHapusPendaftaran;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSimpanPendaftaran;
    private javax.swing.JComboBox<String> cbKlmn;
    private javax.swing.JComboBox<String> cbProdi;
    private javax.swing.JTextField fldAsal;
    private javax.swing.JTextField fldAsalSklh;
    private javax.swing.JTextField fldEmail;
    private javax.swing.JTextField fldNamaSiswa;
    private javax.swing.JTextField fldNamaWali;
    private javax.swing.JTextField fldTgl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDataMhs;
    // End of variables declaration//GEN-END:variables
}
