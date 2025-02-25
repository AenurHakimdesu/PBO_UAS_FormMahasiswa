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
import java.util.*;
import Models.ModelDataLengkap;

/**
 *
 * @author Hikma
 */
public class DataLengkap extends javax.swing.JFrame {
    
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
        static final String DB_URL = "jdbc:mysql://localhost/db_pendaftaranmhs";
        static final String USER = "root";
        static final String PASS = "";
        
        List<ModelDataLengkap> items = new ArrayList<>();
        static Connection conn;
        static Statement stmt;
        static ResultSet rs;

    /**
     * Creates new form DataLengkap
     */
    public DataLengkap() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDataLengkap = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnKeluar = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(967, 618));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDataLengkap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID SISWA", "NAMA SISWA", "ASAL SEKOLAH", "JENIS KELAMIN", "KOTA ASAL", "EMAIL SISWA", "ID WALI", "NAMA WALI", "ID PRODI", "NAMA PRODI"
            }
        ));
        jScrollPane1.setViewportView(tblDataLengkap);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 72, 920, 440));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DATA LENGKAP PENDAFTARAN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        btnKeluar.setText("KELUAR");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(btnKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 530, 111, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/background1.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        showTableData();
    }//GEN-LAST:event_formWindowOpened

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

    public void showTableData() {
        try {
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
            model.addColumn("NAMA WALI");
            model.addColumn("ID PRODI");
            model.addColumn("NAMA PRODI");
            stmt = conn.createStatement();
            
            String sql = "SELECT data_mhs.ID_Siswa, data_mhs.Nama_Siswa, data_mhs.Tgl_Lahir, data_mhs.Asal_Sekolah, data_mhs.Jenis_Kelamin, data_mhs.Kota_Asal, data_mhs.Email_Siswa, wali_mhs.ID_Wali, wali_mhs.Nama_Wali, prodi_mhs.ID_Prodi, prodi_mhs.Nama_Prodi FROM data_mhs JOIN wali_mhs ON data_mhs.ID_Wali = wali_mhs.ID_Wali JOIN prodi_mhs ON data_mhs.ID_Prodi = prodi_mhs.ID_Prodi;";
            items.clear();
            rs = stmt.executeQuery(sql);
            while(rs.next()) {
                items.add(new ModelDataLengkap(rs.getInt("ID_Siswa"),rs.getString("Nama_Siswa"),rs.getString("Tgl_Lahir"),rs.getString("Asal_Sekolah"),rs.getString("Jenis_Kelamin"),rs.getString("Kota_Asal"),rs.getString("Email_Siswa"),rs.getInt("ID_Wali"),rs.getString("Nama_Wali"),rs.getInt("ID_Prodi"),rs.getString("Nama_Prodi")));
            }
            int i = 1;
            for (ModelDataLengkap p : items) {
                model.addRow(new Object[]{
                    i,
                    p.getNama_Siswa(),
                    p.getTgl_Lahir(),
                    p.getAsal_Sekolah(),
                    p.getJenis_Kelamin(),
                    p.getKota_Asal(),
                    p.getEmail_Siswa(),
                    p.getID_Wali(),
                    p.getNama_Wali(),
                    p.getID_Prodi(),
                    p.getNama_Prodi()
                });
                i++;
            }
            
            rs.close();
            stmt.close();
            tblDataLengkap.setModel(model);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnKeluar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDataLengkap;
    // End of variables declaration//GEN-END:variables
}
