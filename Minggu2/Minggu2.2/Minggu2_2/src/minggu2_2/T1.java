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
public class T1 {
    public static void main(String[] args) {
        double harga;
        String nama;
        double total = 0;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("--------------------------------------------------------");
        System.out.println("                Karisma Agung Plaza < KAP >             ");
        System.out.println("                 Promo Belanja Berhadiah                ");
        System.out.println("             Khusus Pembelian 5 Barang Pertama          ");
        System.out.println("             Dengan Harga Minimum Rp 100000,00          ");
        System.out.println("--------------------------------------------------------");
        
        System.out.print("Masukkan Nama Pembeli : ");
        nama = scan.nextLine();
        
        for (int i=1; i<=5; i++){
            System.out.print("Masukkan Harga Barang ke-"+i+":");
            harga = scan.nextDouble();
            total += harga;
        }
        System.out.println("Total Harga Pembelian Atas Nama " + nama + " Adalah Rp " + total);
        
        if (total>=100000){
            System.out.println("Selamat....");
            System.out.println("Anda Mendapatkan 1 Buah Mug Cantik");
        } else {
            System.out.println("NT BOSSSS!");
        }
            System.out.println("--------------------------------------------------------");
            System.out.println("                    Terima Kasih                        ");
            System.out.println("        Anda Sudah Belanja DI Karisma Agung Plaza       ");
    }
}
