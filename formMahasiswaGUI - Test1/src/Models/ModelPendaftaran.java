/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Hikma
 */
public class ModelPendaftaran {
    private int ID_Siswa;
    private String Nama_Siswa;
    private String Tgl_Lahir;
    private String Asal_Sekolah;
    private String Jenis_Kelamin;
    private String Kota_Asal;
    private String Email_Siswa;
    private int ID_Wali;
    private int ID_Prodi;
    
    public ModelPendaftaran(int ID, String Nama_Siswa, String Tgl_Lahir, String Asal_Sekolah, String Jenis_Kelamin, String Kota_Asal, String Email_Siswa, int ID_Wali, int ID_Prodi)
    {
        this.ID_Siswa = ID_Siswa;
        this.Nama_Siswa = Nama_Siswa;
        this.Tgl_Lahir = Tgl_Lahir;
        this.Asal_Sekolah = Asal_Sekolah;
        this.Jenis_Kelamin = Jenis_Kelamin;
        this.Kota_Asal = Kota_Asal;
        this.Email_Siswa = Email_Siswa;
        this.ID_Wali = ID_Wali;
        this.ID_Prodi = ID_Prodi;

    }

    /**
     * @return the ID_Siswa
     */
    public int getID_Siswa() {
        return ID_Siswa;
    }

    /**
     * @return the Nama_Siswa
     */
    public String getNama_Siswa() {
        return Nama_Siswa;
    }

    /**
     * @return the Tgl_Lahir
     */
    public String getTgl_Lahir() {
        return Tgl_Lahir;
    }

    /**
     * @return the Asal_Sekolah
     */
    public String getAsal_Sekolah() {
        return Asal_Sekolah;
    }

    /**
     * @return the Jenis_Kelamin
     */
    public String getJenis_Kelamin() {
        return Jenis_Kelamin;
    }

    /**
     * @return the Kota_Asal
     */
    public String getKota_Asal() {
        return Kota_Asal;
    }

    /**
     * @return the Email_Siswa
     */
    public String getEmail_Siswa() {
        return Email_Siswa;
    }

    /**
     * @return the ID_Wali
     */
    public int getID_Wali() {
        return ID_Wali;
    }

    /**
     * @return the ID_Prodi
     */
    public int getID_Prodi() {
        return ID_Prodi;
    }
}



