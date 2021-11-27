package com.zul;

public class Driver extends Member {
    // deklarasi
    private final String numberPlate;
    private final String type;

    // costruktor - parameter
    public Driver(String nik, String nama, String numberPhone, double saldocash, String numberPlate, String type) {
        super(nik, nama, numberPhone, saldocash); // karna child jadi menggunakan super
        this.numberPlate = numberPlate;
        this.type = type;
    }

    @Override
    public void display() {
        System.out.println("=======================");
        System.out.println("\t  Data Driver");
        System.out.println("=======================");
        System.out.println("NIK             : " + this.nik);
        System.out.println("Nama            : " + this.nama);
        System.out.println("Number Phone    : " + this.numberPhone);
        System.out.println("Saldo           : " + this.saldocash);
        System.out.println("No Plat         : " + this.numberPlate);
        System.out.println("Jenis Kendaraan : " + this.type);
        System.out.println();
    }
}
