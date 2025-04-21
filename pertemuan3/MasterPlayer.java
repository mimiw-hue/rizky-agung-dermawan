/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan3;

/**
 *
 * @author lenovo
 */
public class MasterPlayer {

    // Superclass
    static class Player {
        String nama;
        int level;

        public Player(String nama, int level) {
            this.nama = nama;
            this.level = level;
        }

        public void tampilInfo() {
            System.out.println("Nama  : " + nama);
            System.out.println("Level : " + level);
        }

        public void serang() {
            System.out.println(nama + " menyerang musuh!");
        }
    }

    // Subclass: Warrior
    static class Warrior extends Player {
        int kekuatan;

        public Warrior(String nama, int level, int kekuatan) {
            super(nama, level);
            this.kekuatan = kekuatan;
        }

        @Override
        public void serang() {
            System.out.println(nama + " menyerang dengan pedang! Kekuatan: " + kekuatan);
        }
    }

    // Subclass: Mage
    static class Mage extends Player {
        int mana;

        public Mage(String nama, int level, int mana) {
            super(nama, level);
            this.mana = mana;
        }

        @Override
        public void serang() {
            System.out.println(nama + " melempar bola api! Mana: " + mana);
        }
    }

    // Subclass: Archer
    static class Archer extends Player {
        int akurasi;

        public Archer(String nama, int level, int akurasi) {
            super(nama, level);
            this.akurasi = akurasi;
        }

        @Override
        public void serang() {
            System.out.println(nama + " menembakkan panah! Akurasi: " + akurasi + "%");
        }
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("=== Master PBO Player ===\n");

        Warrior w = new Warrior("Leon", 10, 120);
        Mage m = new Mage("Ayla", 12, 150);
        Archer a = new Archer("Rin", 8, 95);

        System.out.println(">> Warrior");
        w.tampilInfo();
        w.serang();

        System.out.println("\n>> Mage");
        m.tampilInfo();
        m.serang();

        System.out.println("\n>> Archer");
        a.tampilInfo();
        a.serang();
    }
}

