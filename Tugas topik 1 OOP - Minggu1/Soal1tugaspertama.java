/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muham
 */
public class Soal1tugaspertama {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Item brg1 = new Item("BRG-001", "Tas Gucci");
        Item brg2 = new Item("BRG-002", "Printer Epson L355");
        brg1.setTarif(1200);
        brg2.setTarif(200);

        brg1.print();
        brg2.print();

        Item brg3 = new Item("BRG-003", "Koper", 150);
        Item brg4 = new Item("BRG-004", "Helm", 20);

        brg3.print();
        brg4.print();

        System.out.println(brg1.getTarif() + brg3.getTarif() + brg4.getTarif());
    }
}

class Item {

    // artibut
    String idProduk;
    String nama;
    double tarif;

    // contruktor isinya sesuai dari artibut
    Item(String idProduk, String nama, double tarif) {
        this.idProduk = idProduk;
        this.nama = nama;
        this.tarif = tarif;
    }

    // contruktor parameter 2
    Item(String idProduk, String nama) {
        this.idProduk = idProduk;
        this.nama = nama;
    }

    // objek bisa set nama/pasang
    public void setNama(String nama) {
        this.nama = nama;
    }

    // buat manggil nama objek
    public String getNama() {
        return nama;
    }

    public void setTarif(double tarif) {
        this.tarif = tarif;
    }

    public double getTarif() {
        return tarif;
    }

    public String getidProduk() {
        return idProduk;
    }

    public void print() {
        System.out.println(getidProduk() + " | " + getNama() + " | " + getTarif());
    }
}
