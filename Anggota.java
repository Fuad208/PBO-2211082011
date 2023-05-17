/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_B.Model;
/**
 *
 * @author TI 10
 */
public class Anggota {
    public class Pesanan {
    private String pesanan;
    private String pemesan;
    private String tgl_pesan;
    private String harga;
    private String ongkir;
    private String diskon;
    
    public Pesanan(){
    
    }
    public Pesanan(String pesanan, String pemesan, String tgl_pesan, String harga, String ongkir, String diskon){
        this.pesanan = pesanan;
        this.pemesan = pemesan;
        this.tgl_pesan = tgl_pesan;
        this.harga = harga;
        this.ongkir = ongkir;
        this.diskon = diskon;
    }
    
    public String getPesanan(){
        return this.pesanan;
    }
    public String getPemesan(){
        return this.pemesan;
    }
    public String getTgl_Pesan(){
        return this.tgl_pesan;
    }
    
    public String getHarga(){
        return this.harga;
    }
    
    public String getOngkir(){
        return this.ongkir;
    }
    
    public String getDiskon(){
        return this.diskon;
    }
    public void setPesanan(String pesanan){
        this.pesanan = pesanan;
    }
    public void setPemesan(String pemesan){
        this.pemesan = pemesan;
    }
    public void setTgl_Pesan(String tgl_pesan){
        this.tgl_pesan = tgl_pesan;
    }
    public void setHarga(String harga){
        this.harga = harga;
    }
    public void setOngkir(String ongkir){
    this.ongkir = ongkir;
    }
    public void setDiskon(String diskon){
    this.diskon = diskon;
    }
}
}
