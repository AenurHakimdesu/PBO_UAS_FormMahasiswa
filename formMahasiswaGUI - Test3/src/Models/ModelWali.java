/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Hikma
 */
public class ModelWali {
    private int ID_Wali;
    private String Nama_Wali;
    private String Jenis_Kelamin_Wali;
    private String Umur_Wali;
    
    public ModelWali(int ID_Wali, String Nama_Wali, String Jenis_Kelamin_Wali, String Umur_Wali)
    {
        this.ID_Wali = ID_Wali;
        this.Nama_Wali = Nama_Wali;
        this.Jenis_Kelamin_Wali = Jenis_Kelamin_Wali;
        this.Umur_Wali = Umur_Wali;
    }

    /**
     * @return the ID_Wali
     */
    public int getID_Wali() {
        return ID_Wali;
    }

    /**
     * @return the Nama_Wali
     */
    public String getNama_Wali() {
        return Nama_Wali;
    }

    /**
     * @return the Jenis_Kelamin_Wali
     */
    public String getJenis_Kelamin_Wali() {
        return Jenis_Kelamin_Wali;
    }

    /**
     * @return the Umur_Wali
     */
    public String getUmur_Wali() {
        return Umur_Wali;
    }
}
