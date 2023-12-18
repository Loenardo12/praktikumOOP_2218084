/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum;

/**
 *
 * @author cakkr
 */
public class batalsewa extends isi {
    //atribut tambahan
    int durasibatal;
    private int denda;
   

    //method tambahan
    void dataDurasiBatal(int Dbatal) {
        this.durasibatal = Dbatal;
    }

    //Overriding dataDenda untuk menghitung denda sesuai durasi batal
    @Override
    void dataDenda(int Denda) {
        super.dataDenda(Denda); // Panggil metode asli dari superclass
        this.denda = this.durasibatal * Denda; // Hitung denda sesuai durasi batal
    }

    int cetakDurasiBatal() {
        return durasibatal;
    }

    int cetakDenda() {
        return denda;
    }
        
}

