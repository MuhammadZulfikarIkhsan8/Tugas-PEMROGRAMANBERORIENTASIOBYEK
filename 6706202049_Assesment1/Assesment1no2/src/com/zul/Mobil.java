package com.zul;

class Mobil {
    String merk, tahunKeluaran;
    double harga;
    int stok;

    Mobil(String merk, String tahunKeluaran, double harga, int stok) {
        this.merk = merk;
        this.tahunKeluaran = tahunKeluaran;
        this.harga = harga;
        this.stok = stok;
    }

    String getMerk() {
        return merk;
    }

    String getTahunKeluaran() {
        return tahunKeluaran;
    }

    double getHarga() {
        return harga;
    }

    int getStok() {
        return stok;
    }

    void setStok(int stok) {
        this.stok = stok;
    }

    void setHarga(double harga) {
        this.harga = harga;
    }

    void displayInfo() {
        System.out.println("Merk \t\t\t: " + getMerk());
        System.out.printf("Harga \t\t\t: %.1f%n", getHarga());
        System.out.println("Tahun Keluaran \t: " + getTahunKeluaran());
        System.out.println("Sisa Stok \t\t: " + getStok() + "\n");
    }
}
