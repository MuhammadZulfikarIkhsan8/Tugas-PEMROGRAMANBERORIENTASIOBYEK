/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zulfikar.soal1part2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author muham
 */
public class Main {

    static ArrayList<Buku> buku = new ArrayList<>();
    static ArrayList<String> error = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("========================");
        System.out.println("|  Apk Pendataan Buku  |");
        System.out.println("========================");

        while (true) {
            System.out.println("Menu:\n"
                    + "1. Add Book Data\n"
                    + "2. Change Book Data\n"
                    + "3. Clear Book Data\n"
                    + "4. View All Books\n"
                    + "5. View One Book\n"
                    + "6. Exit\n");
            String menu = input("Select menu: ");
            switch (menu) {
                case "1":
                    do {
                        String isbn = input("ISBN: ");
                        String judul = input("Judul: ");
                        String pengarang = input("Pengarang: ");
                        int tahun = inputInt("Tahun: ");
                        double harga = inputDouble("Harga: ");
                        float rating = inputFloat("Rating: ");
                        if (!error.isEmpty()) {
                            System.out.println("Harap masukkan data dengan benar");
                            cetakError();
                            error = new ArrayList<>();
                        } else {
                            tambahBuku(isbn, judul, pengarang, tahun, harga, rating);
                        }
                        if (!ulang()) {
                            break;
                        }
                    } while (error != null);
                    break;
                case "2":
                    do {
                        String isbn = input("ISBN: ");
                        String judul = input("Judul: ");
                        String pengarang = input("Pengarang: ");
                        int tahun = inputInt("Tahun: ");
                        double harga = inputDouble("Harga: ");
                        float rating = inputFloat("Rating: ");
                        if (!error.isEmpty()) {
                            System.out.println("Harap masukkan data dengan benar");
                            cetakError();
                            error = new ArrayList<>();
                        } else {
                            ubahBuku(isbn, judul, pengarang, tahun, harga, rating);
                        }
                        if (!ulang()) {
                            break;
                        }
                    } while (error != null);
                    break;
                case "3":
                    do {
                        String isbn = input("ISBN buku: ");
                        hapusData(isbn);
                        if (!error.isEmpty()) {
                            cetakError();
                            error = new ArrayList<>();
                        }
                        System.out.println("menu:\n"
                                + "1. Hapus lagi\n"
                                + "2. Ke Menu\n");
                        menu = input("Select menu: ");
                    } while (!menu.equals("2"));
                    break;
                case "4":
                    cetakSemuaData();
                    do {
                        System.out.println("menu:\n"
                                + "1. Ke Menu\n");
                        menu = input("Select menu: ");
                    } while (!menu.equals("1"));
                    break;
                case "5":
                    do {
                        String isbn = input("ISBN buku: ");
                        cetakData(isbn);
                        if (!error.isEmpty()) {
                            cetakError();
                            error = new ArrayList<>();
                        }
                        System.out.println("menu:\n"
                                + "1. Ulang\n"
                                + "2. Ke Menu\n");
                        menu = input("Select menu: ");
                    } while (!menu.equals("2"));
                    break;
                case "6":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu tidak ada");
                    break;
            }
        }
    }

    static void cetakError() {
        for (String e : error) {
            System.out.println(e);
        }
    }

    static boolean ulang() {
        String menu;
        do {
            System.out.println("menu:\n"
                    + "1. Ulang\n"
                    + "2. Ke Menu\n");
            menu = input("Pilih menu: ");
        } while (!menu.equals("1") && !menu.equals("2"));
        return !menu.equals("2");
    }

    static String input(String text) {
        Scanner in = new Scanner(System.in);
        System.out.print(text);
        return in.next();
    }

    static int inputInt(String text) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print(text);
            return in.nextInt();
        } catch (Exception e) {
            error.add(text + " tipe data tidak sesuai");
            return 0;
        }
    }

    static double inputDouble(String text) {
        // Blok kode untuk dicoba
        try {
            Scanner in = new Scanner(System.in);
            System.out.print(text);
            return in.nextDouble();
            // Blok kode untuk menangani kesalahan
        } catch (Exception e) {
            error.add(text + " tipe data tidak sesuai");
            return 0;
        }
    }

    static float inputFloat(String text) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print(text);
            return in.nextFloat();
        } catch (Exception e) {
            error.add(text + " tipe data tidak sesuai");
            return 0;
        }
    }

    static void tambahBuku(String isbn, String judul, String pengarang, int tahun, double harga, float rating) {
        for (Buku b : buku) {
            if (b.getIsbn().equals(isbn)) {
                error.add("buku sudah ada");
                return;
            }
        }
        buku.add(new Buku(isbn, judul, pengarang, tahun, harga, rating));
    }

    static void ubahBuku(String isbn, String judul, String pengarang, int tahun, double harga, float rating) {
        for (Buku b : buku) {
            if (b.getIsbn().equals(isbn)) {
                if (!judul.equals("")) {
                    b.setJudul(judul);
                }
                if (!pengarang.equals("")) {
                    b.setPengarang(pengarang);
                }
                if (tahun != 0) {
                    b.setTahun(tahun);
                }
                if (harga != 0) {
                    b.setHarga(harga);
                }
                if (rating != 0) {
                    b.setRating(rating);
                }
                return;
            }
        }
        error.add("tidak ada buku");
    }

    static void hapusData(String isbn) {
        for (Buku b : buku) {
            if (b.getIsbn().equals(isbn)) {
                buku.remove(b);
                return;
            }
        }
        error.add("tidak ada buku");
    }

    static void cetakSemuaData() {
        for (Buku b : buku) {
            System.out.println("ISBN: " + b.getIsbn());
            System.out.println("Judul Buku: " + b.getJudul());
            System.out.println("Pengarang Buku: " + b.getPengarang());
            System.out.println("Tahun Terbit: " + b.getTahun());
            System.out.println("Harga Buku: " + b.getHarga());
            System.out.println("Rating Buku: " + b.getRating());
            System.out.println();
        }
    }

    static void cetakData(String isbn) {
        for (Buku b : buku) {
            if (b.getIsbn().equals(isbn)) {
                System.out.println("ISBN: " + b.getIsbn());
                System.out.println("Judul Buku: " + b.getJudul());
                System.out.println("Pengarang Buku: " + b.getPengarang());
                System.out.println("Tahun Terbit: " + b.getTahun());
                System.out.println("Harga Buku: " + b.getHarga());
                System.out.println("Rating Buku: " + b.getRating());
                return;
            }
        }
        error.add("tidak ada buku");
    }
}
