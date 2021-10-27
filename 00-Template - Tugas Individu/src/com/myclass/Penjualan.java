package com.myclass;


public class Penjualan{
    private String namaBarang;
    private int stokBarang;
    private int hargaSatuan;
    private int harga;

    //constructor
    public Penjualan(String nama){
        this.namaBarang = nama;
    }

    //setter
    public void setNamaBarang(String nama){
        this.namaBarang = nama;
    }

    public void setStokBarang(int value){
        this.stokBarang = value;
    }

    public void setHarga(int price){
        this.hargaSatuan = price;
    }

    public void setHarga(){
        this.harga = this.hargaSatuan*this.stokBarang;
    }


    //getter
    public String getNamaBarang(){
        return this.namaBarang;
    }
    public int getStok(){
        return this.stokBarang;
    }
    public int getHarga(){
        return this.hargaSatuan;
    }
    public int getTotal(){
        return this.harga;
    }

    //methods
//     public void view(){
//         System.out.println("Nama Barang\t: " + this.namaBarang);
//         System.out.println("Stok Barang\t: " + this.stokBarang);
//         System.out.println("Harga Satuan\t: Rp." + this.hargaSatuan);
//         System.out.println("Harga Barang\t: Rp." + this.harga + "\n");
//     }
}

