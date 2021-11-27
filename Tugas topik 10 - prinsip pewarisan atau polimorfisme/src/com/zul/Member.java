package com.zul;

public abstract class Member { // abstract class disimpan paling awal (parent class)
    // deklarasi
    protected String nik, nama, numberPhone;
    protected double saldocash;

    // costruktor - parameter
    public Member(String nik, String nama, String numberPhone, double saldocash) {
        this.nik = nik;
        this.nama = nama;
        this.numberPhone = numberPhone;
        this.saldocash = saldocash;
    }

    public String getNik() {
        return nik;
    }

    public void transaction(Member other, double payment) {
        this.saldocash = this.saldocash + payment;
        other.saldocash = other.saldocash - payment;
    }

    // kelas abstract menggunakan ; , bukan {}
    public abstract void display();
}
