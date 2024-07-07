/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Hikma
 */
public class ModelProdi {
    private int ID_Prodi;
    private String Nama_Prodi;
    
    public ModelProdi(int ID_Prodi, String Nama_Prodi)
    {
        this.ID_Prodi = ID_Prodi;
        this.Nama_Prodi = Nama_Prodi;
    }

    /**
     * @return the ID_Prodi
     */
    public int getID_Prodi() {
        return ID_Prodi;
    }

    /**
     * @return the Nama_Prodi
     */
    public String getNama_Prodi() {
        return Nama_Prodi;
    }
}
