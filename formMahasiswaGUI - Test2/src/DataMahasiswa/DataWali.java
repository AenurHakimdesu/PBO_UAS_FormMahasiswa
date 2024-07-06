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
import Models.ModelWali;

/**
 *
 * @author HP
 */
public class DataWali extends javax.swing.JFrame {
    
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
        static final String DB_URL = "jdbc:mysql://localhost/db_pendaftaranmhs";
        static final String USER = "root";
        static final String PASS = "";
        
        List<ModelWali> items = new ArrayList<>();
        static Connection conn;
        static Statement stmt;
        static ResultSet rs;

    /**
     * Creates new form DataWali
     */
    public DataWali() {
        initComponents();
        btnEditWali.setEnabled(false);
        btnHapusWali.setEnabled(false);
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
        btnSimpanWali = new javax.swing.JButton();
        btnHapusWali = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDataMhs = new javax.swing.JTable();
        fldNamaWali = new javax.swing.JTextField();
        btnEditWali = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fldUmurWali = new javax.swing.JTextField();
        cbKlmnWali = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Data Wali");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("DATA WALI");

        jLabel2.setText("NAMA WALI :");

        btnSimpanWali.setText("SIMPAN");
        btnSimpanWali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanWaliActionPerformed(evt);
            }
        });

        btnHapusWali.setText("HAPUS");

        tblDataMhs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID WALI", "NAMA WALI", "JENIS KELAMIN", "UMUR"
            }
        ));
        jScrollPane1.setViewportView(tblDataMhs);

        fldNamaWali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldNamaWaliActionPerformed(evt);
            }
        });

        btnEditWali.setText("EDIT");
        btnEditWali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditWaliActionPerformed(evt);
            }
        });

        btnKeluar.setText("KELUAR");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        jLabel3.setText("JENIS KELAMIN:");

        jLabel4.setText("UMUR:");

        fldUmurWali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldUmurWaliActionPerformed(evt);
            }
        });

        cbKlmnWali.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--PILIH--", "Laki-Laki", "Perempuan" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(423, 423, 423))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 934, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fldUmurWali)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fldNamaWali)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSimpanWali)
                                .addGap(18, 18, 18)
                                .addComponent(btnEditWali)
                                .addGap(18, 18, 18)
                                .addComponent(btnHapusWali)
                                .addGap(18, 18, 18)
                                .addComponent(btnKeluar))
                            .addComponent(cbKlmnWali, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fldNamaWali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbKlmnWali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fldUmurWali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpanWali)
                    .addComponent(btnEditWali)
                    .addComponent(btnHapusWali)
                    .addComponent(btnKeluar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanWaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanWaliActionPerformed
        // TODO add your handling code here:
        String nama_wali = fldNamaWali.getText();
        String jenis_kelamin_wali = cbKlmnWali.getSelectedItem().toString();
        String umur_wali = fldUmurWali.getText();
        
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            
            String sql = 
            "INSERT INTO wali_mhs (Nama_Wali, Jenis_Kelamin, Umur) VALUES (?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, nama_wali);
            ps.setString(2, jenis_kelamin_wali);
            ps.setString(3, umur_wali);
            
            ps.execute();
            stmt.close();
            conn.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        showTableData();
    }//GEN-LAST:event_btnSimpanWaliActionPerformed

    private void fldNamaWaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldNamaWaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldNamaWaliActionPerformed

    private void btnEditWaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditWaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditWaliActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        showTableData();
    }//GEN-LAST:event_formWindowOpened

    private void fldUmurWaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldUmurWaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldUmurWaliActionPerformed

    public void showTableData()
    {
        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID WALI");
            model.addColumn("NAMA WALI");
            model.addColumn("JENIS KELAMIN WALI");
            model.addColumn("UMUR WALI");

            stmt = conn.createStatement();
            String sql = "SELECT * FROM wali_mhs";
            items.clear();
            rs = stmt.executeQuery(sql);
            while(rs.next()) {
                items.add(new ModelWali(rs.getInt("ID_Wali"),rs.getString("Nama_Wali"),rs.getString("Jenis_Kelamin"),rs.getString("Umur")));
            }
            int i = 1;
            for (ModelWali p : items)
            {
                model.addRow(new Object[]{
                    i,
                    p.getNama_Wali(),
                    p.getJenis_Kelamin_Wali(),
                    p.getUmur_Wali()
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
    private javax.swing.JButton btnEditWali;
    private javax.swing.JButton btnHapusWali;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSimpanWali;
    private javax.swing.JComboBox<String> cbKlmnWali;
    private javax.swing.JTextField fldNamaWali;
    private javax.swing.JTextField fldUmurWali;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDataMhs;
    // End of variables declaration//GEN-END:variables
}
