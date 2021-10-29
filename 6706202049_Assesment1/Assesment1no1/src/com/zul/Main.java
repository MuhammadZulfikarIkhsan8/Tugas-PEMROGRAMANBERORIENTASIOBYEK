package com.zul;

public class Main {

    public static void main(String[] args) {
        // write your code here - Construktor di Main class
        // Asuransi dan Dropship
        new MarketPlace(1, "N0001", "JNE", 21000, "Dropship1", "Surabaya", "Bejo", "DayeuhKolot", true, true, 40000);

        // Asuransi
        new MarketPlace(2, "N0003", "J&T", 16000, "Eiger", "Bandung Kopo", "Tini", "DayeuhKolot", true, 40000);

        // Normal
        new MarketPlace(3, "N0004", "Pos Indonesia", 23000, "Eiger", "Bandung Kopo", "Bambang", "DayeuhKolot");

        // Dropship
        new MarketPlace(4, "N0002", "Si Cepat", 24000, "Dropship2", "Pontianak", "Joko", "DayeuhKolot", true);
        // untuk menginisialisasi Objek dengan keyword new
        // Lalu membawa sebuah parameter
    }
}
