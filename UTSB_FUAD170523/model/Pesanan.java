/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTSB_FUAD170523.model;

/**
 *
 * @author Microsoft 10
 */
public class Pesanan {
     private String kodePesanan;
    private String namaPesanan;
    private String tglPesanan;
    private int harga;
    private int ongkir;
    private int total;
    private int diskon;
    
    public Pesanan(){
    
    }
    
    public Pesanan(String kodePesanan, String namaPesanan, String tglPesanan, int harga, int ongkir, int diskon) {
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.tglPesanan = tglPesanan;
        this.harga = harga;
        this.ongkir = ongkir;
        this.diskon = diskon;
    }
    
    public String getKodePesanan() {
        return kodePesanan;
    }
    
    public void setKodePesanan(String kodePesanan) {
        this.kodePesanan = kodePesanan;
    }
    
    public String getNamaPesanan() {
        return namaPesanan;
    }
    
    public void setNamaPesanan(String namaPesanan) {
        this.namaPesanan = namaPesanan;
    }
    
    public String getTglPesanan() {
        return tglPesanan;
    }
    
    public void setTglPesanan(String tglPesanan) {
        this.tglPesanan = tglPesanan;
    }
    
    public int getHarga() {
        return harga;
    }
    
    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public int getOngkir() {
        return ongkir;
    }
    
    public void setOngkir(int ongkir) {
        this.ongkir = ongkir;
    }
    
    public int setTotal(){
        total = harga + ongkir - diskon;
        return total;
    }
            
            
    public int getDiskon() {
        return diskon;
    }
    
    public void setDiskon(int diskon) {
        this.diskon = diskon;
    }
}   