/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu2.pkg1;

/**
 *
 * @author p
 */
class Book {
    int price;
    int pages;

    public void set(int price, int pages) {
        this.price = price;
        this.pages = pages;
    }

    public void show() {
        System.out.println("book's information");
        System.out.println("book's price: " + price);
        System.out.println("number of pages: " + pages);
    }
}

public class PK3 {  
    public static void main(String[] args) {
        Book javabook = new Book();
        javabook.set(60000, 100);
        javabook.show();
    }    
}
