/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum;

/**
 *
 * @author cakkr
 */
public class tambahsewa extends isi{
 //atribut tambahan
 int durasitambah, biaya;
 
 //method tambahan//Overriding
 void dataDurasiTambah(int Dtambah, int Biaya) {//Overriding
        this.durasitambah = Dtambah;
        this.biaya = Biaya;
    }
 void dataDurasiTambah(int Dtambah){
 this.durasitambah = Dtambah;
 }
 void dataBiaya(int Biaya){
 this.biaya = Biaya;
 }
 int cetakDurasiTambah(){
 return durasitambah;
 }
 int cetakBiaya(){
 return biaya;
 }
}
