package com.myclass;

public class Orang{
    private String namaOrang;
    private String alamatOrang;
    private String noKTPOrang;

    public void setName(String nama){
        this.namaOrang = nama;
    }
    String getNama(){
        return this.namaOrang;
    }
    public void setAlamat(String alamat){
        this.alamatOrang = alamat;
    }
    String getAlamat(){
        return this.alamatOrang;
    }
    public void setNoKTP(String KTP){
        this.noKTPOrang = KTP;
    }
    String getNoKTP(){
        return this.noKTPOrang;
    }
}
