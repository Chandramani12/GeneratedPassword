package com.info.password;

import java.util.*;

public class Main {
public static void main(String[] args) {
	
        int passwordLength = 5; // change as you wish
        
        // Define the characters that can be used in the password
        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String specialChars = "!@#$%^&*()_+-=[]{}|;':\",./<>?";
        
        // Combine the characters into a single string
        String allChars = letters + numbers + specialChars;
        
        // Use a random number generator to select characters from the string
        Random random = new Random();
        char[] password = new char[passwordLength];
        for (int i = 0; i < passwordLength; i++) {
            password[i] = allChars.charAt(random.nextInt(allChars.length()));
        }
        
        // Print the generated password
        System.out.println("Your generated password is: " + new String(password));
    }
}


	