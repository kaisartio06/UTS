/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utspbogenap;

/**
 *
 * @author Acer
 */
public class UTSPBOGENAP2 {

    public static void main(String[] args) {
        // Pattern A
        System.out.println("Pattern A:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println(); // Add an empty line between patterns

        // Pattern B
        System.out.println("Pattern B:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 3; j <= i + 2; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println(); // Add an empty line between patterns

        // Pattern C
        System.out.println("Pattern C:");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println(); // Add an empty line between patterns

        // Pattern D
        System.out.println("Pattern D:");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("  "); // Print two spaces for better alignment
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
}
}
}
