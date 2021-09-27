/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muham
 */
public class Soal2tugaspertama {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        // item1-2 objek
        Book item1 = new Book("Harry Potter", "J.K. Rowling", 300000);
        Book item2 = new Book("UML", "Ivar Jacobson", 400000);
        item1.print();
        item2.print();
    }
}

class Book {

    String judul;
    String pengarang;
    double price;

    Book(String judul, String pengarang, double price) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.price = price;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public double getPrice() {
        return price;
    }

    public void print() {
        System.out.println(getJudul() + " | " + getPengarang() + " | " + getPrice());
    }
}
