/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataApotek;

/**
 *
 * @author anggr
 */
public class ObatCair implements Obat {//class yang dengan kata kunci implements menunjukkan bahwa mengimplementasikan interface Obat.
   //class ini harus memberikan semua metode yang sudah didefinisikan di interface Obat
    private String nama;
    private int stok;
    private double harga;
    //Konstruktor ini menerima tiga argumen: nama, harga, dan stok, dan menginisialisasi variabel instance sesuai dengan nilai-nilai ini.
    public ObatCair(String nama, double harga, int stok) {
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }
    
    @Override
    public String getNama() {//Mengembalikan nilai dari variabel nama.
        return nama;
    }

    @Override
    public int getStok() {// Mengembalikan nilai dari variabel stok.
        return stok;
    }

    @Override
    public double getHarga() {//Mengembalikan nilai dari variabel harga.
        return harga;
    }

    @Override
    public void setNama(String nama) {//Mengatur variabel nama sesuai dengan nilai yang diberikan.
        this.nama = nama;
    }

    @Override
    public void setStok(int stok) {// Mengatur variabel stok sesuai dengan nilai yang diberikan.
        this.stok = stok;
    }

    @Override
    public void setHarga(double harga) {//Mengatur variabel harga sesuai dengan nilai yang diberikan.
        this.harga = harga;
    }

    @Override
    public void tambahStok(int jumlah) {//Menambahkan jumlah tertentu ke variabel stok.
        stok += jumlah;
    }
    
}
