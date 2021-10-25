package com.program;
import com.myclass.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Person user = new Person("Angga", 12345);
        user.show();

        
        scanner.close();
    }  
}
