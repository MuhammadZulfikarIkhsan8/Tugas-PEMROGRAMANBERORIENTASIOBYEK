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
public class gameCharacter {

    private String name;
    private int attackHitPoint, attackKickPoint, lifePoint;

    public gameCharacter(String name, int attackHitPoint, int attackKickPoint) {
        this.lifePoint = 100;
        this.name = name;
        this.attackHitPoint = attackHitPoint;
        this.attackKickPoint = attackKickPoint;
    }

    public void hit(gameCharacter karB) {
        System.out.println(this.getName() + " memukul " + karB.getName());
        karB.lifePoint = karB.getLifePoint() - this.attackHitPoint;
        System.out.println("Lifepoint " + karB.getName() + ": " + karB.getLifePoint());
        System.out.println();
    }

    public void kick(gameCharacter karB) {
        System.out.println(this.getName() + " menendang " + karB.getName());
        karB.lifePoint = karB.getLifePoint() - this.attackKickPoint;
        System.out.println("Lifepoint " + karB.getName() + ": " + karB.getLifePoint());
        System.out.println();
    }

    public int getLifePoint() {
        return this.lifePoint;
    }

    public String getName() {
        return this.name;
    }
}
