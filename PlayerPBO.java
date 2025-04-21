/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan3;

/**
 *
 * @author lenovo
 */
public class PlayerPBO {

    // Superclass Player
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
            System.out.println(nama + " melakukan serangan dasar.");
        }
    }

    // Subclass Warrior
    static class Warrior extends Player {
        public Warrior(String nama, int level) {
            super(nama, level);
        }

        @Override
        public void serang() {
            System.out.println(nama + " menyerang dengan pedang!");
        }
    }

    // Subclass Mage
    static class Mage extends Player {
        public Mage(String nama, int level) {
            super(nama, level);
        }

        @Override
        public void serang() {
            System.out.println(nama + " menyerang dengan sihir!");
        }
    }

    // Main Method
    public static void main(String[] args) {
        System.out.println("=== Program PBO Player ===\n");

        Warrior w = new Warrior("Ragnar", 15);
        Mage m = new Mage("Elora", 18);

        System.out.println(">> Warrior");
        w.tampilInfo();
        w.serang();

        System.out.println("\n>> Mage");
        m.tampilInfo();
        m.serang();
    }
}

