package com.zul;

public class Customer extends Member {

    // costruktor - parameter
    public Customer(String nik, String nama, String numberPhone, double saldocash) {
        super(nik, nama, numberPhone, saldocash); // karna child jadi menggunakan super
    }

    @Override
    public void display() {
        System.out.println("=======================");
        System.out.println("\t Data Customer");
        System.out.println("=======================");
        System.out.println("NIK             : " + this.nik);
        System.out.println("Nama            : " + this.nama);
        System.out.println("Number Phone    : " + this.numberPhone);
        System.out.println("Saldo           : " + this.saldocash);
        System.out.println();

    }
}
