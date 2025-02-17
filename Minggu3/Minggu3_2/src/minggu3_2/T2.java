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
        int baris,kolom;
        
        Scanner scan = new Scanner(System.in);
        Random random = new Random();       
                
        System.out.print("Masukkan Jumlah Barisnya Sayang : ");
        baris = scan.nextInt();
        System.out.print("Masukkan Jumlah Kolomnya Sayang : ");
        kolom = scan.nextInt();
        
        int[][] deret = new int [baris][kolom];
        
        for (int i=0; i<baris; i++){
            for (int j=0; j<kolom; j++){
                deret[i][j] = random.nextInt(100);
                System.out.print(deret[i][j]+" ");
            }
        System.out.println("");    
        }
        
        
    }
}
