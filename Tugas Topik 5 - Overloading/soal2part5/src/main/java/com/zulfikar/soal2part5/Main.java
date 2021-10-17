/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zulfikar.soal2part5;

import java.util.Scanner;

/**
 *
 * @author muham
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner userInput = new Scanner(System.in);
        boolean run = true;
        int menu;
        double sisi, tinggi;

        // Perulangan While
        while (run) {
            System.out.println("======================");
            System.out.println("Hitung Luas Segitiga");
            System.out.println("======================");
            System.out.println("1. Sisi dan Tinggi\n2. Sisi\n3. Keluar");
            System.out.println("======================");
            menu = userInput.nextInt();

            switch (menu) {
                case 1 -> {
                    System.out.println("Sisi : ");
                    sisi = userInput.nextDouble();

                    System.out.println("Tinggi : ");
                    tinggi = userInput.nextDouble();

                    System.out.println("\nHasil");

                    // Objek terlebih dahulu, jadi hasil inputan sisi dan tinggi tadi
                    // Akan diinstansiasikan objeknya
                    // Kemudian objek yang telah dibuat tadi akan memakai function
                    Segitiga segitigaSisiTinggi = new Segitiga(sisi, tinggi);

                    System.out.println("Luas : " + segitigaSisiTinggi.luasSegitiga());
                    System.out.println("Keliling : " + segitigaSisiTinggi.kelilingSegitiga());
                }

                case 2 -> {
                    System.out.println("Sisi : ");
                    sisi = userInput.nextDouble();

                    System.out.println("\nHasil");

                    Segitiga segitigaSisi = new Segitiga(sisi);     // Hanya mengirim parameter sisi dari segitiga

                    System.out.println("Luas : " + segitigaSisi.luasSegitiga());    // memanggil function untuk menghitung luas
                    System.out.println("Keliling : " + segitigaSisi.kelilingSegitiga());    // memanggil function untuk menghitung keliling
                }

                case 3 -> {
                    System.out.println("Keluar");
                    run = false;
                }
                default ->
                    System.out.println("Tidak Ada Dalam Menu");
            }
        }
    }
}
