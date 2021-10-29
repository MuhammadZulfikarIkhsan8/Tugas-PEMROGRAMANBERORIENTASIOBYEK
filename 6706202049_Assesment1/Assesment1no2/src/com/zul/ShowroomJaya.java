package com.zul;

import java.util.ArrayList;

public class ShowroomJaya {
    static ArrayList<Mobil> arrMobil = new ArrayList<>();

    public static void main(String[] args) {
        // write your code here
        Mobil mobil = new Mobil("Avanza", "2018", 150000000.0, 15);

        tambahMobil(mobil);
        System.out.println("Informasi Mobil");
        viewStok();

        beliMobil("Avanza", "2018", 1);

    }

    static void tambahMobil(Mobil mobil) {
        arrMobil.add(mobil);
    }

    static void beliMobil(String merk, String tahun, int jumlahBeli) {
        System.out.println("=================================");
        System.out.println("Showroom Mobil Jaya - Penjualan");
        System.out.println("INPUT");
        System.out.println("=================================");
        System.out.println("Merk \t\t\t: " + merk);
        System.out.println("Tahun Keluaran \t: " + tahun);
        System.out.println("Jumlah \t\t\t: " + jumlahBeli);
        System.out.println("=================================\n");

        for (Mobil mobil : arrMobil) {
            if (merk.equalsIgnoreCase(mobil.getMerk())
                    && tahun.equalsIgnoreCase(mobil.getTahunKeluaran())
                    && jumlahBeli < mobil.getStok()) {
                mobil.setStok(mobil.getStok() - jumlahBeli);

                double totalHarga;

                totalHarga = (mobil.getHarga() * jumlahBeli);
                System.out.println("=================================");
                System.out.println("OUTPUT");
                System.out.println("=================================");
                System.out.println("Merk \t\t\t: " + mobil.getMerk());
                // %.1f% 1 nol dibelakang angka
                System.out.printf("Harga Satuan \t: %.1f%n", mobil.getHarga());
                System.out.println("Tahun Keluaran \t: " + mobil.getTahunKeluaran());
                System.out.println("Jumlah Beli \t: " + jumlahBeli);
                System.out.printf("Total Harga \t: %.1f%n", totalHarga);

                double totalDiskon = 0.0, bayar;

                if (jumlahBeli == 2) {
                    totalDiskon = 10.0;
                } else if (jumlahBeli > 2) {
                    totalDiskon = 20.0;

                }
                System.out.println("Diskon \t\t\t: " + totalDiskon + " persen");
                mobil.setStok(mobil.getStok() - jumlahBeli);
                totalDiskon = (totalDiskon * totalHarga) / 100;
                mobil.setHarga(totalHarga - totalDiskon);
                bayar = (totalHarga - totalDiskon);
                // %.2f% 2 nol dibelakang angka
                System.out.printf("Total Diskon \t: %.2f%n", totalDiskon);
                System.out.printf("Total Bayar \t: %.2f%n", bayar);
            } else {
                System.out.println("=================================");
                System.out.println("OUTPUT");
                System.out.println("=================================");
                System.out.println("Maaf, Jumlah Stok Tidak Mencukupi");
            }
            System.out.println("=================================\n");
        }
    }

    static void viewStok() {
        for (Mobil mobil : arrMobil) {
            mobil.displayInfo();
        }
    }
}