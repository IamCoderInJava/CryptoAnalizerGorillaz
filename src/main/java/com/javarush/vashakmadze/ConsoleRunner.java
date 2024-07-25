package com.javarush.vashakmadze;

import java.util.Scanner;

public class ConsoleRunner {

    public static String encrypt(String alphabet, int shift) {

        StringBuilder encryptedMessage = new StringBuilder();
        alphabet = alphabet.toLowerCase();

        for (int i = 0; i < alphabet.length(); i++) {
            char c = alphabet.charAt(i);
            if(Character.isLetter(c)) {
                c = (char) ((c - 'a' + shift + 26) % 26 + 'a');
            }
            encryptedMessage.append(c);
        }

        return encryptedMessage.toString();
    }

    public static String decrypt(String alphabet, int shift) {

        StringBuilder decryptedMessage = new StringBuilder();
        alphabet = alphabet.toLowerCase();

        for (int i = 0; i < alphabet.length(); i++) {
            char c = alphabet.charAt(i);
            if(Character.isLetter(c)) {
                c = (char) ((c - 'a' - shift + 26) % 26 + 'a');
            }
            decryptedMessage.append(c);
        }

        return decryptedMessage.toString();

    }

    public static void main(String[] args) {

        System.out.println("=".repeat(50));

        System.out.println("I used below youtube links to create this API: \n- https://www.youtube.com/watch?v=soEQI-aUWGo \n- https://www.youtube.com/watch?v=ZNRd_Yb9Ujw");

        System.out.println("=".repeat(50));

        Scanner consoleEncrypt = new Scanner(System.in);
        System.out.print("Enter a message to encrypt: ");
        String messageEncrypt = consoleEncrypt.nextLine();

        System.out.print("Enter the shift value for the encrypt message: ");
        int shiftEncrypt = consoleEncrypt.nextInt();

        String encryptedMessage = encrypt(messageEncrypt, shiftEncrypt);
        System.out.println("Encrypted message: " + encryptedMessage);

        System.out.println("=".repeat(50));

        Scanner consoleDecrypt = new Scanner(System.in);
        System.out.print("Enter a message to decrypt: ");
        String messageDecrypt = consoleDecrypt.nextLine();

        System.out.print("Enter the shift value for the decrypt message: ");
        int shiftDecrypt = consoleDecrypt.nextInt();

        String decryptedMessage = decrypt(messageDecrypt, shiftDecrypt);
        System.out.println("Decrypted message: " + decryptedMessage);

    }

}
