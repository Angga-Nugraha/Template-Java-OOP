package com.myclass;
// import com.myclass.Rekening;
// import com.myclass.Pelajar;

public class TabunganPelajar{
    Rekening rekeningNasabah = new Rekening();
    Pelajar nasabah = new Pelajar();

    public void Daftar(String noRek, String noNIM, String iNama, String iAlamat, String noKtp){
        rekeningNasabah.noRekening = noRek;
        nasabah.setNIM(noNIM);
        nasabah.setName(iNama);
        nasabah.setAlamat(iAlamat);
        nasabah.setNoKTP(noKtp);
    }

    public void cekSaldo(){
        nasabah.show();
        System.out.println("No Rek\t : " + rekeningNasabah.noRekening);
        System.out.println("Saldo\t : Rp." + rekeningNasabah.saldo);
    }

    public void debit(double jumlah){
        rekeningNasabah.debet(jumlah);
    }
    public void kredit(double jumlah){
        rekeningNasabah.kredit(jumlah);
    }


}

