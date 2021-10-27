package com.program;
import com.myclass.Penjualan;


public class Main{

    static void hargaTotal(Penjualan barang1, Penjualan barang2, Penjualan barang3){
        int total = barang1.getTotal() + barang2.getTotal() + barang3.getTotal();
        System.out.println("Total uang jika semua terjual : Rp." + total + "\n");
    }

    public static void main(String[] args) {
        
        Penjualan barang1 = new Penjualan("Barang 1");
        
        barang1.setNamaBarang("Bolpoint");
        barang1.setStokBarang(10);
        barang1.setHarga(2000);
        barang1.setHarga();
        
        System.out.println("Nama Barang\t: " + barang1.getNamaBarang());
        System.out.println("Stok Barang\t: " + barang1.getStok());
        System.out.println("Harga Satuan\t: Rp." + barang1.getHarga());
        System.out.println("Harga Barang\t: Rp." + barang1.getTotal() + "\n");
        //barang1.view();

        Penjualan barang2 = new Penjualan("Barang 2");
        barang2.setNamaBarang("Pensil");
        barang2.setStokBarang(10);
        barang2.setHarga(1000);
        barang2.setHarga();
        
        System.out.println("Nama Barang\t: " + barang2.getNamaBarang());
        System.out.println("Stok Barang\t: " + barang2.getStok());
        System.out.println("Harga Satuan\t: Rp." + barang2.getHarga());
        System.out.println("Harga Barang\t: Rp." + barang2.getTotal() + "\n");
       // barang2.view();

        Penjualan barang3 = new Penjualan("Barang 3");
        barang3.setNamaBarang("Penghapus");
        barang3.setStokBarang(10);
        barang3.setHarga(500);
        barang3.setHarga();

        System.out.println("Nama Barang\t: " + barang3.getNamaBarang());
        System.out.println("Stok Barang\t: " + barang3.getStok());
        System.out.println("Harga Satuan\t: Rp." + barang3.getHarga());
        System.out.println("Harga Barang\t: Rp." + barang3.getTotal() + "\n");
        //barang3.view();

        hargaTotal(barang1, barang2, barang3);
    }
    
}

