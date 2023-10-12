/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DataApotek;

/**
 *
 * @author anggr
 */
public interface Obat { // deklarasi awal interface Obat
    //sebuah interface yang mendefinisikan metode yg harus diimplementasikan oleh class class yg menggunakan interface ini.
    String getNama();//Metode ini harus mengembalikan sebuah string yang merupakan nama obat.
    void setNama(String nama);//Metode ini digunakan untuk mengatur nama obat.
    double getHarga();//Metode ini harus mengembalikan nilai harga obat dalam bentuk bilangan pecahan (double).
    void setHarga(double Harga);//Metode ini digunakan untuk mengatur harga obat.
    int getStok();//Metode ini harus mengembalikan nilai stok obat dalam bentuk bilangan bulat (int).
    void tambahStok(int jumlah);//Metode ini digunakan untuk menambahkan jumlah stok obat.
  

    public void setStok(int stokBaru);// Metode ini digunakan untuk mengatur stok obat dengan jumlah baru.
}
