package com.program;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Jumlah Segitiga = ");
        n = scanner.nextInt();

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

        System.out.println();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if(i == 1 || i == n || j ==  1|| j == i){
                    System.out.print('*');    
                }else{
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
        
        System.out.println();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(' ');
            }
            for(int k = n; k > i; k--){
                System.out.print('*');
            }
            System.out.println();
        }
        scanner.close();
    }
}
