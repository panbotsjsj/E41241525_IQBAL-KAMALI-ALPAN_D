/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu3_2;

/**
 *
 * @author p
 */
import java.util.Scanner;
import java.util.Random;
public class T2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();       
                
        System.out.print("Masukkan Panjang Deretnya Sayang : ");
        int deret = scan.nextInt();
        
        int [] hasil = new int [deret];
        
        for (int i=0; i<deret; i++){
                hasil[i] = random.nextInt(100);
                System.out.print(hasil[i]+" ");
            }
        System.out.println("");    
    }
}
