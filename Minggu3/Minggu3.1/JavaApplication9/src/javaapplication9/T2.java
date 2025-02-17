/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;

/**
 *
 * @author p
 */
public class T2 {
    public static void main(String[] args) {
        int i = 2;
        System.out.println("          Do While          ");
        System.out.println("Bilangan kelipatan 2 (0-100)");
        System.out.println("============================");
        
        do {
            System.out.print(i+" ");
            i*=2;
        } while (i<=100);
        System.out.println("");
    }
}
