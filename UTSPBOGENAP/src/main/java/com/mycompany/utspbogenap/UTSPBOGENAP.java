/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.utspbogenap;

/**
 *
 * @author Acer
 */

import java.util.Scanner;
public class UTSPBOGENAP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tiga digit integer: ");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " adalah palindrom");
        } else {
            System.out.println(number + " bukan palindrom");
        }
    }

    // Method untuk mengecek apakah suatu bilangan merupakan palindrom atau tidak
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        // Melakukan pembalikan digit bilangan
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        // Memeriksa apakah bilangan asli sama dengan bilangan terbalik
        return originalNumber == reversedNumber;
}
}
