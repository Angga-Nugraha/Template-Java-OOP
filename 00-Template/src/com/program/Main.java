package com.program;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Jumlah Segitiga = ");
        int n = scanner.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print('*');    
                }else{
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}