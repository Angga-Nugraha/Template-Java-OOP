package com.myclass;

public class Rekening {
    public double saldo;
    public String noRekening;

    public double debet(double jumlah){
        saldo += jumlah;
        return this.saldo;
    }
    double kredit(double jumlah){
        saldo -= jumlah;
        return saldo;
    }
}
