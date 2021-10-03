/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zulfikar.soal2part2;

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
        gameCharacter pemain1 = new gameCharacter("Raiden", 10, 20);
        gameCharacter pemain2 = new gameCharacter("Sub-Zero", 5, 25);

        pemain1.kick(pemain2);
        pemain2.kick(pemain1);

        for (int i = 0; i < 3; i++) {
            pemain2.hit(pemain1);
        }
        for (int i = 0; i < 4; i++) {
            pemain1.kick(pemain2);
        }

        System.out.println("Lifepoint " + pemain1.getName() + ": " + pemain1.getLifePoint());
        System.out.println("Lifepoint " + pemain2.getName() + ": " + pemain2.getLifePoint());

        if (pemain1.getLifePoint() == pemain2.getLifePoint()) {
            System.out.println("Seimbang");
        } else if (pemain1.getLifePoint() > pemain2.getLifePoint()) {
            System.out.println(pemain1.getName() + " Win!");
        } else {
            System.out.println(pemain2.getName() + " Win!");
        }
    }
}