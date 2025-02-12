/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu2.pkg1;

/**
 *
 * @author p
 */
public class T1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fName = "Lisa";
        String lName = "Palombo";
        String stuId = "123456789";
        boolean stuStatus;
        stuStatus = true;
        
        System.out.println("Student Name : " + fName + lName);
        System.out.println("Student ID : " +stuId);
        System.out.println("Student Status : " + (stuStatus ? "Active" : "Nonactive"));
    }
    
}
