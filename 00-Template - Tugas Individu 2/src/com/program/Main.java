package com.program;
import com.myclass.TabunganPelajar;
import java.util.Scanner;
import java.io.Console;


public class Main {
    static char getOption(){
        Scanner userInput = new Scanner(System.in);
        char pil;
        System.out.println("+++++Program Tabungan Pelajar+++++");
        System.out.println("1. Daftar Tabungan");
        System.out.println("2. Debit Saldo");
        System.out.println("3. Kredit");
        System.out.println("4. Cek Saldo");
        System.out.println("----------------------------------");
        System.out.print("Pilihan [1-4]?: ");
        pil = userInput.next().charAt(0);
          
        return pil;
    }
    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Console input = System.console();
        TabunganPelajar tabungan = new TabunganPelajar();
        
        // boolean next = true;
        double jumlah;
        while(true){
            char pilihan = getOption();
            switch (pilihan) {
                case '1':
                    System.out.println("\n\n+++++Daftar Rekening Baru+++++");
                    System.out.print("No Rekening\t : ");
                    String noRek = input.readLine();
                    System.out.print("NIM\t\t : ");
                    String noNim = input.readLine();
                    System.out.print("Nama\t\t : ");
                    String iNama = input.readLine();
                    System.out.print("Alamat\t\t : ");
                    String iAlamat = input.readLine();
                    System.out.print("No KTP\t\t : ");
                    String noKtp = input.readLine();
                    
                    tabungan.Daftar(noRek, noNim, iNama, iAlamat, noKtp);
                break;

                case '2':
                    System.out.println("+++++Debit Saldo Rekening+++++");
                    System.out.print("Nominal\t\t: ");
                    jumlah = userInput.nextDouble();
                    tabungan.debit(jumlah);
                    System.out.println("Debit saldo succes...");
                break;
        
                case '3':
                    System.out.println("+++++Kredit Saldo Rekening+++++");
                    System.out.print("Nominal\t\t: ");
                    jumlah = userInput.nextDouble();
                    tabungan.kredit(jumlah);
                    System.out.println("Kredit saldo succes...");
                break;
                
                case '4':
                    tabungan.cekSaldo();
                break;
                
                    default:
                    System.out.println("Pilihan tidak ditemukan");
                break;
            }

            System.out.println("--------------------");
            System.out.print("Lanjukan ? [y/n]: ");
            char lanjut = userInput.next().charAt(0);
            if(lanjut == 'y' || lanjut == 'Y'){
                pilihan = getOption();
            }else if(lanjut == 'n' || lanjut == 'N'){
                break;
            }else{
                System.out.println("Inputan salah...");
                break;
            }
        }
        userInput.close();
    }
}
