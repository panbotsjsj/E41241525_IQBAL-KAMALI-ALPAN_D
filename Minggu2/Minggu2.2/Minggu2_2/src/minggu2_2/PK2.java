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
public class PK2 {
    public static void main(String[] args) {
        String lampu;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingfokan Warna Lampu: ");
        lampu = scan.nextLine();
        
        switch (lampu) {
            case "merah":
                System.out.println("Lampu Merah, Berhenti!");
                break;
            case "kuning":
                System.out.println("Lampu Kuning, Hati-Hati!");
                break;
            case "hijau":
                System.out.println("Lampu Hijau, Let's Goo!");
                break;
            default:
                System.out.println("Warna Lampu Salah Boss!");
        }
    }
}
