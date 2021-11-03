package com.myclass;

public class Pelajar extends Orang{
    private String NIM;

    public void setNIM(String nim){
        this.NIM = nim;
    }

    String getNIM(){
        return this.NIM;
    }

    public void show(){
        System.out.println("Nama\t : " + getNama());
        System.out.println("NIM\t : " + getNIM());
        System.out.println("No KTP\t : " + getNoKTP());
        System.out.println("Alamat\t : " + getAlamat());

    }
}
