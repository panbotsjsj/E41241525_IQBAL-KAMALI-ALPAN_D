/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;

/**
 *
 * @author p
 */
import java.util.Scanner;
public class T3 {
    public static void main(String[] args) {
        int tinggi;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan Tinggi Yang Anda Inginkan Sayangku : ");
        tinggi = scan.nextInt();
        
        for (int i=tinggi; i>0; i--) {
            for (int j=0; j<tinggi-i; j++) {
                System.out.print(" ");
            }
            for (int j=0; j<(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
