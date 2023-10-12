
package com.apotek1;

import DataApotek.Obat; //mengimpor kelas Obat dari package DataApotek
import DataApotek.ObatCair;//mengimpor kelas ObatCair dari package DataApotek
import DataApotek.ObatTablet;//engimpor kelas ObatTablet dari package DataApotek.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class Apotek1 { // Kelas ini mendefinisikan beberapa fungsi untuk mengelola obat-obat di apotek.
    private static final List<Obat> namaobat = new ArrayList<>();//ni adalah daftar (List) obat-obatan yang digunakan dalam program. 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//objek Scanner yang akan digunakan untuk mengambil input dari pengguna.
        boolean isRunning = true;//variabel boolean digunakan untuk mengontrol apakah program akan terus berjalan atau tidak.

        while (isRunning) { //loop while yang akan berjalan selama isRunning bernilai true.
            System.out.println("|===Pilihan Menu====|");
            System.out.println("|   1. Tambah Obat  |");
            System.out.println("|   2. Lihat Obat   |");
            System.out.println("|   3. Edit Obat    |");
            System.out.println("|   4. Hapus Obat   |");
            System.out.println("|   5. Keluar       |");
            System.out.println("|===================|");
            System.out.print("Masukkan pilihan: ");
            int choice = scanner.nextInt(); //mengambil input integer dari pengguna dan menyimpannya dalam variabel choice.
            scanner.nextLine(); 

            switch (choice) { //salah satu pilihan menu dan akan menjalankan metode yang sesuai ketika pengguna memilihnya.
                //CRUD
                case 1 -> tambahObat();
                case 2 -> tampilkanObat();
                case 3 -> editObat();
                case 4 -> hapusObat();
                case 5 -> isRunning = false;
                default -> System.out.println("Pilihan tidak valid");//dijalankan jika pengguna memasukkan pilihan yang tidak valid.
            }
        }
    }

    public static void tambahObat() { // Metode ini digunakan untuk menambahkan obat ke daftar namaobat
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama obat: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan harga obat: ");
        double harga = scanner.nextDouble();
        System.out.print("Masukkan stok obat: ");
        int stok = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Jenis obat (Cair / Tablet): ");
        String jenisObat = scanner.nextLine();
        //metode akan membuat objek ObatCair atau ObatTablet dan menambahkannya ke daftar namaobat.
        if (jenisObat.equalsIgnoreCase("Cair")) {
            ObatCair obatCair = new ObatCair(nama, harga, stok);
            namaobat.add(obatCair);
        } else if (jenisObat.equalsIgnoreCase("Tablet")) {
            ObatTablet obatTablet = new ObatTablet(nama, harga, stok);
            namaobat.add(obatTablet);
        } else {
            System.out.println("Jenis obat tidak valid.");
        }
    }

    public static void tampilkanObat() { //Metode ini digunakan untuk menampilkan semua obat yang ada dalam daftar namaobat.
        for (Obat obat : namaobat) {
            System.out.println("Nama: " + obat.getNama());
            System.out.println("Jenis: " + (obat instanceof ObatCair ? "Cair" : "Tablet"));
            System.out.println("Harga: " + obat.getHarga());
            System.out.println("Stok: " + obat.getStok());
            System.out.println();
  } //mengiterasi melalui daftar obat dan menampilkan informasi seperti nama, jenis (Cair atau Tablet), harga, dan stok dari setiap obat.
    }

    public static void editObat() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama obat yang ingin diubah: ");
        String namaObat = scanner.nextLine();
        //Metode ini memungkinkan pengguna untuk mengubah harga dan stok obat tertentu dalam daftar.
        // pengguna memasukkan nama obat yang ingin diubah, kemudian meminta harga dan stok baru untuk obat tersebut. 
        //kemmudian mencari obat dengan nama yang sesuai dalam daftar namaobat dan mengubah nilainya sesuai dengan input baru pengguna.
        for (Obat obat : namaobat) {
            if (obat.getNama().equals(namaObat)) {
                System.out.print("Masukkan harga baru: ");
                double hargaBaru = scanner.nextDouble();
                System.out.print("Masukkan stok baru: ");
                int stokBaru = scanner.nextInt();
                obat.setHarga(hargaBaru);
                obat.setStok(stokBaru);
                break;
            }
        }
    }

    public static void hapusObat() { //Metode ini memungkinkan pengguna untuk menghapus obat tertentu dari daftar.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama obat yang ingin dihapus: ");
        String namaObat = scanner.nextLine();
//Pengguna diminta untuk memasukkan nama obat yang ingin dihapus. 
//Metode akan mencari obat dengan nama yang sesuai dalam daftar namaobat dan menghapusnya jika ditemukan.

        Obat obatToDelete = null;
        for (Obat obat : namaobat) {
            if (obat.getNama().equals(namaObat)) {
                obatToDelete = obat;
                break;
            }
      //Jika obat tidak ditemukan, program akan memberikan pesan bahwa obat tidak ditemukan.
        }
        if (obatToDelete != null) {
            namaobat.remove(obatToDelete);
            System.out.println("Obat berhasil dihapus.");
        } else {
            System.out.println("Obat tidak ditemukan.");
        }
    }
}
