/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan3;

/**
 *
 * @author lenovo
 */

public class MasterBangunDatar {
    // Superclass
    static class BangunDatar {
        public double hitungLuas() {
            return 0;
        }

        public double hitungKeliling() {
            return 0;
        }
    }

    // Subclass: Lingkaran
    static class Lingkaran extends BangunDatar {
        double jariJari;

        public Lingkaran(double jariJari) {
            this.jariJari = jariJari;
        }

        @Override
        public double hitungLuas() {
            return Math.PI * jariJari * jariJari;
        }

        @Override
        public double hitungKeliling() {
            return 2 * Math.PI * jariJari;
        }
    }

    // Subclass: Persegi
    static class Persegi extends BangunDatar {
        double sisi;

        public Persegi(double sisi) {
            this.sisi = sisi;
        }

        @Override
        public double hitungLuas() {
            return sisi * sisi;
        }

        @Override
        public double hitungKeliling() {
            return 4 * sisi;
        }
    }

    // Subclass: Persegi Panjang
    static class PersegiPanjang extends BangunDatar {
        double panjang, lebar;

        public PersegiPanjang(double panjang, double lebar) {
            this.panjang = panjang;
            this.lebar = lebar;
        }

        @Override
        public double hitungLuas() {
            return panjang * lebar;
        }

        @Override
        public double hitungKeliling() {
            return 2 * (panjang + lebar);
        }
    }

    // Subclass: Segitiga
    static class Segitiga extends BangunDatar {
        double alas, tinggi, sisi1, sisi2, sisi3;

        public Segitiga(double alas, double tinggi, double sisi1, double sisi2, double sisi3) {
            this.alas = alas;
            this.tinggi = tinggi;
            this.sisi1 = sisi1;
            this.sisi2 = sisi2;
            this.sisi3 = sisi3;
        }

        @Override
        public double hitungLuas() {
            return 0.5 * alas * tinggi;
        }

        @Override
        public double hitungKeliling() {
            return sisi1 + sisi2 + sisi3;
        }
    }

    // Main method
    public static void main(String[] args) {
        // Contoh objek dan hasilnya
        {
            // Contoh objek dan hasilnya
            BangunDatar lingkaran = new Lingkaran(7);
            BangunDatar persegi = new Persegi(5);
            BangunDatar pp = new PersegiPanjang(4, 6);
            BangunDatar segitiga = new Segitiga(6, 4, 5, 5, 6);
            
            System.out.println("=== Hasil Perhitungan Bangun Datar ===");
            System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas());
            System.out.println("Keliling Lingkaran: " + lingkaran.hitungKeliling());
            
            System.out.println("Luas Persegi: " + persegi.hitungLuas());
            System.out.println("Keliling Persegi: " + persegi.hitungKeliling());
            
            System.out.println("Luas Persegi Panjang: " + pp.hitungLuas());
            System.out.println("Keliling Persegi Panjang: " + pp.hitungKeliling());
            
            System.out.println("Luas Segitiga: " + segitiga.hitungLuas());
            System.out.println("Keliling Segitiga: " + segitiga.hitungKeliling());
        }
    }
}
