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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Float
        float jariJari1 = 7;        // karena tidak menggunakan floating point, jika ingin menggunakan maka harus diberi "f"
        float jariJari2 = 5.5f;     // untuk mengkonversi dari double ke float maka di beri "f"

        // Double
        double diameter = 20.4;

        // Otomatis memilih function yang sesuai dengan parameter yang diberikan
        System.out.println("Lingkaran dengan jari-jari : " + jariJari1);
        Lingkaran.hitungLuasKeliling(jariJari1);        // Panggil fungsi dari class lingkaran
        System.out.println();

        System.out.println("Lingkaran dengan jari-jari : " + jariJari2);
        Lingkaran.hitungLuasKeliling(jariJari2);		// Panggil fungsi dari class lingkaran
        System.out.println();

        System.out.println("Lingkaran dengan diameter : " + diameter);
        Lingkaran.hitungLuasKeliling(diameter);			// Panggil fungsi dari class lingkaran
        System.out.println();
    }
}
