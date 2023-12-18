/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum;

/**
 *
 * @author cakkr
 */

public class isi extends harga implements totalkeseluruhan{
    String user,kamar,judul, mode,denda;
    int waktu, harga,admin =50000;
    int nomor;
    private String incognito,normal,gold,silver,diamond;
    //membuat objek
    int setnomor;


    
    public void setIncognito(String incognito) {
        this.incognito = incognito;
    }

    public void setNormal(String normal) {
        this.normal = normal;
    }

    public void setGold(String gold) {
        this.gold = gold;
    }

    public void setSilver(String silver) {
        this.silver = silver;
    }

    public void setDiamond(String diamond) {
        this.diamond = diamond;
    }

    public String getIncognito() {
        return incognito;
    }

    public String getNormal() {
        return normal;
    }

    public String getGold() {
        return gold;
    }

    public String getSilver() {
        return silver;
    }

    public String getDiamond() {
        return diamond;
    }
       
    void datamode(String mode){
 this.mode = mode;
 } 
     //Overriding hargajam untuk menghitung harga jam sesuai kamar kamar
    @Override
    void hargajam(int harga) {
        super.hargajam(harga); // Panggil metode asli dari superclass
        this.harga = this.waktu * harga; // Hitung harga sesuai waktu
    }
    void datakamar(String kamar){
 this.kamar = kamar;
    }
 
 void datakamar(String kamar, int harga) {
        this.kamar = kamar + " " + harga + "/jam";
        this.harga = this.waktu * harga;
    }
     String mencetakuser(){
            return user;
 }        
      int mencetaknomor(){                                         
            return nomor;
 }
       String mencetakmode(){
 return mode;
 }
       String mencetakkamar(){
 return kamar;
 }
       int mencetakhargajam(){
 return harga;}
       public isi(){
           this.judul = "PERSEWAAN KAMAR APARTEMEN"; 
}

    void dataDenda(int Denda) {
        this.denda = denda;  }

    void setuser(String text) {
        this.user=text;}

    void setnomor(int text) {
        this.nomor=text;}

    @Override
    int total() {
        return harga;
                }
    
    
      @Override
 public int admin() { // Penerapan Polymorfisme yaitu Dynamic Polimorfisme
 return  admin;
 }

    @Override
    public int hittotalkeseluruhan() {
        return (( total() + admin));
    }

 
}
