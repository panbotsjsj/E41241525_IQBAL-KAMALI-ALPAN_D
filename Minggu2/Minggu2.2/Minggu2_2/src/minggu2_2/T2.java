/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu2_2;

/**
 *
 * @author p
 */
import java.util.Scanner;
public class T2 {
    public static void main(String[] args) {
        String nama;
        String pilih;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("          Cafe Ceria         ");
        System.out.println("         Aneka Minuman       ");
        System.out.println("-----------------------------");
        System.out.println("        SPECIAL MENU :       ");
        System.out.println("       1. Soft Drinks        ");
        System.out.println("       2. Mix Juice          ");
        System.out.println("       3. Nescafe            ");
        System.out.println("       4. Soda Milk          ");
        System.out.println("       5. Tea                ");
        System.out.println("-----------------------------");
        System.out.print("Masukkan Nama Pembeli: ");
        nama = scan.nextLine();
        System.out.print("Silahkan Masukkan Pilihan Anda: ");
        pilih = scan.nextLine();
        switch (pilih) {
            case "1":
                System.out.println("Menu Yang Anda Pilih Adalah Soft Drinks");
                break;
            case "2":
                System.out.println("Menu Yang Anda Pilih Adalah Mix Juice");
                break;
            case "3":
                System.out.println("Menu Yang Anda Pilih Adalah Nescafe");
                break;
            case "4":
                System.out.println("Menu Yang Anda Pilih Adalah Soda Milk");
                break;
            case "5":
                System.out.println("Menu Yang Anda Pilih Adalah Tea");
                break;
            default:
                System.out.println("Menu Yang Anda Pilih Tidak Ada");
        }
        
    }
}
