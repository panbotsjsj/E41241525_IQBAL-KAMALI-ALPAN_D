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
public class T1 {
    public static void main(String[] args) {
        int awal,akhir;       
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan Bilangan Awalnya Masbro : ");
        awal = scan.nextInt();
        System.out.print("Masukkan Bilangan Akhirnya Masbro : ");
        akhir = scan.nextInt();
        
        System.out.print("Bilangan Genap Mulai "+awal+" Hingga "+akhir+" Adalah : ");
        if (awal %2 !=0){
            awal++;
        }
        for (int i=awal; i<=akhir; i+=2) {
            System.out.print(i+" ");    
        }
        System.out.println("");
    }
}
