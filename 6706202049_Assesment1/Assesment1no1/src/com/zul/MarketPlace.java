package com.zul;

public class MarketPlace {

    private final int noTransaksi;
    private final String namaPengirim;
    private final String alamatPengirim;
    private final String namaPenerima;
    private final String alamatPenerima;
    private final double Ongkir;
    private final String namaEkspedisi;
    private final String noResi;
    private boolean statusAsuransi;
    private boolean statusDropshipper;
    private double nominalAsuransi;

    // Data utama + data asuransi + data dropshipper
    MarketPlace(int noTransaksi, String noResi, String namaEkspedisi, double Ongkir, String namaPengirim, String alamatPengirim, String namaPenerima, String alamatPenerima, boolean statusDropshipper, boolean statusAsuransi, int nominalAsuransi) {
        this.noTransaksi = noTransaksi;
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.Ongkir = Ongkir;
        this.namaPengirim = namaPengirim;
        this.alamatPengirim = alamatPengirim;
        this.namaPenerima = namaPenerima;
        this.alamatPenerima = alamatPenerima;
        this.statusDropshipper = statusDropshipper;
        this.statusAsuransi = statusAsuransi;
        this.nominalAsuransi = nominalAsuransi;
        print(this.statusAsuransi, this.statusDropshipper);
    }

    // Data utama + data asuransi
    MarketPlace(int noTransaksi, String noResi, String namaEkspedisi, double Ongkir, String namaPengirim, String alamatPengirim, String namaPenerima, String alamatPenerima, boolean statusAsuransi, int nominalAsuransi) {
        this.noTransaksi = noTransaksi;
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        if (Ongkir > 20000) {
            Ongkir = Ongkir - 5000;
        }
        this.Ongkir = Ongkir;
        this.namaPengirim = namaPengirim;
        this.alamatPengirim = alamatPengirim;
        this.namaPenerima = namaPenerima;
        this.alamatPenerima = alamatPenerima;
        this.statusAsuransi = statusAsuransi;
        this.nominalAsuransi = nominalAsuransi;
        print(this.statusAsuransi, false);
    }

    // Data utama saja
    MarketPlace(int noTransaksi, String noResi, String namaEkspedisi, double Ongkir, String namaPengirim, String alamatPengirim, String namaPenerima, String alamatPenerima) {
        this.noTransaksi = noTransaksi;
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.Ongkir = Ongkir;
        this.namaPengirim = namaPengirim;
        this.alamatPengirim = alamatPengirim;
        this.namaPenerima = namaPenerima;
        this.alamatPenerima = alamatPenerima;
        print(false, false);
    }

    // Data utama + data dropshipper
    MarketPlace(int noTransaksi, String noResi, String namaEkspedisi, double Ongkir, String namaPengirim, String alamatPengirim, String namaPenerima, String alamatPenerima, boolean statusDropshipper) {
        this.noTransaksi = noTransaksi;
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.Ongkir = Ongkir;
        this.namaPengirim = namaPengirim;
        this.alamatPengirim = alamatPengirim;
        this.namaPenerima = namaPenerima;
        this.alamatPenerima = alamatPenerima;
        this.statusDropshipper = statusDropshipper;
        print(false, this.statusDropshipper);
    }

    public void print(boolean statusAsuransi, boolean statusDropshipper) {
        if (statusAsuransi && statusDropshipper) {
            System.out.println("==============================");
            System.out.println("\tAsuransi dan Dropship");
            System.out.println("==============================");
            System.out.println("No Transaksi  \t : " + this.noTransaksi + "\nNo Resi  \t\t : " + this.noResi + "\nNama Ekspedisi   : " + this.namaEkspedisi + "\nOngkos Kirim  \t : " + this.Ongkir + "\nNama Pengirim  \t : " + this.namaPengirim + "\nAlamat Pengirim  : " + this.alamatPengirim + "\nNama Penerima\t : " + this.namaPenerima + "\nAlamat Penerima  : " + this.alamatPenerima + "\nNominal Asuransi : " + this.nominalAsuransi);
            System.out.println("==============================");
        } else if (statusAsuransi) {
            System.out.println("==============================");
            System.out.println("\t\t   Asuransi");
            System.out.println("==============================");
            System.out.println("No Transaksi  \t : " + this.noTransaksi + "\nNo Resi  \t\t : " + this.noResi + "\nNama Ekspedisi   : " + this.namaEkspedisi + "\nOngkos Kirim  \t : " + this.Ongkir + "\nNama Pengirim  \t : " + this.namaPengirim + "\nAlamat Pengirim  : " + this.alamatPengirim + "\nNama Penerima\t : " + this.namaPenerima + "\nAlamat Penerima  : " + this.alamatPenerima + "\nNominal Asuransi : " + this.nominalAsuransi);
            System.out.println("==============================");
        } else if (statusDropshipper) {
            System.out.println("==============================");
            System.out.println("\t\t   Dropship");
            System.out.println("==============================");
            System.out.println("No Transaksi \t: " + this.noTransaksi + "\nNo Resi \t\t: " + this.noResi + "\nNama Ekspedisi  : " + this.namaEkspedisi + "\nOngkos Kirim \t: " + this.Ongkir + "\nNama Pengirim \t: " + this.namaPengirim + "\nAlamat Pengirim : " + this.alamatPengirim + "\nNama Penerima \t: " + this.namaPenerima + "\nAlamat Penerima : " + this.alamatPenerima);
            System.out.println("==============================");
        } else {
            System.out.println("==============================");
            System.out.println("\t\t    Normal");
            System.out.println("==============================");
            System.out.println("No Transaksi \t: " + this.noTransaksi + "\nNo Resi \t\t: " + this.noResi + "\nNama Ekspedisi  : " + this.namaEkspedisi + "\nOngkos Kirim \t: " + this.Ongkir + "\nNama Pengirim \t: " + this.namaPengirim + "\nAlamat Pengirim : " + this.alamatPengirim + "\nNama Penerima \t: " + this.namaPenerima + "\nAlamat Penerima : " + this.alamatPenerima);
            System.out.println("==============================");
        }
    }
}
