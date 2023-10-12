/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataApotek;

/**
 *
 * @author anggr
 */

//kelas ObatTablet harus memberikan implementasi untuk semua metode yang didefinisikan dalam interface Obat.
public class ObatTablet implements Obat { 
    private String nama;
    private int stok;
    private double harga;
    
//Konstruktor ini menerima tiga argumen: nama, harga, dan stok, dan menginisialisasi variabel instance sesuai dengan nilai-nilai ini.
    public ObatTablet(String nama, double harga, int stok) { 
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public int getStok() {
        return stok;
    }

    @Override
    public double getHarga() {
        return harga;
    }

    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public void setStok(int stok) {
        this.stok = stok;
    }

    @Override
    public void setHarga(double harga) {
        this.harga = harga;
    }
    @Override
    public void tambahStok(int jumlah) {
        stok += jumlah;
    }
}
