/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zulfikar.soal2part5;

/**
 *
 * @author muham
 */
public class Segitiga {

    private double sisi, tinggi;

    // construktor
    public Segitiga(double sisi, double tinggi) {
        this.sisi = sisi;
        this.tinggi = tinggi;
    }

    // construktor
    public Segitiga(double sisi) {
        this(sisi, 0);
    }

    private double cariTinggi(double sisi) {
        return sisi = Math.sqrt(3) / 2;
    }

    // Jika mencari luas segitiga, hanya sisi saja yang dimasukkan, 
    // akan dicari tingginya terlebih dahulu
    public double luasSegitiga() {
        if (tinggi == 0) {
            return sisi * cariTinggi(sisi) / 2;
        } else {
            return sisi * tinggi / 2;
        }
    }

    public double kelilingSegitiga() {
        return 3 * sisi;
    }
}
