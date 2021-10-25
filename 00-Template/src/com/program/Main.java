package com.program;
import com.myclass.User;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        User user = new User("Angga", 12345);
        user.show();


        scanner.close();
    }  
}
