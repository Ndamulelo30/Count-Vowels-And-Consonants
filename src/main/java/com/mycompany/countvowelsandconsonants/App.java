/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.countvowelsandconsonants;

/**
 *
 * @author Sanele
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String input = scanner.nextLine().toLowerCase(); // Convert input to lowercase
        
        int vowels = 0, consonants = 0;
        
        // Iterate through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                // Check if the letter is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
        
        scanner.close();
    }
}
