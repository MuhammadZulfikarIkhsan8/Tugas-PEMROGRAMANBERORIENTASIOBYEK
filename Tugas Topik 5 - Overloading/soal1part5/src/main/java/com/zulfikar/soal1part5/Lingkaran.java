/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zulfikar.soal1part5;

/**
 *
 * @author muham
 */
public class Lingkaran {

    // PI = 3.14
    static final double PI = Math.PI;

    // Function (Overloading) ==> Parameter Jari-jari
    public static void hitungLuasKeliling(float jariJari) {

        // Rumus
        double keliling = 2 * PI * jariJari;
        double luas = PI * (jariJari * jariJari);

        System.out.println("Keliling Lingkaran : " + keliling);
        System.out.println("Luas lingkaran : " + luas);
    }

    // Function (Overloading) ==> Parameter Diameter
    public static void hitungLuasKeliling(double diameter) {

        // Rumus
        double keliling = PI * diameter;
        double luas = PI * (diameter * diameter) / 44;

        System.out.println("Keliling Lingkaran : " + keliling);
        System.out.println("Luas Lingkaran : " + luas);
    }
}
