/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan3;

    
import java.util.Scanner;

public class BangunDatarPBO {
    // Superclass
    static class BangunDatar {
        public double hitungLuas() {
            return 0;
        }

        public double hitungKeliling() {
            return 0;
        }
    }

    // Subclass Lingkaran
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

    // Subclass Persegi
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

    // Subclass Persegi Panjang
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

    // Subclass Segitiga
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
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== PBO Bangun Datar ===");

        // Contoh penggunaan:
        BangunDatar lingkaran = new Lingkaran(10);
        BangunDatar persegi = new Persegi(5);
        BangunDatar pp = new PersegiPanjang(4, 6);
        BangunDatar segitiga = new Segitiga(6, 4, 5, 5, 6);

        System.out.println("\nLuas & Keliling Lingkaran:");
        System.out.println("Luas      = " + lingkaran.hitungLuas());
        System.out.println("Keliling  = " + lingkaran.hitungKeliling());

        System.out.println("\nLuas & Keliling Persegi:");
        System.out.println("Luas      = " + persegi.hitungLuas());
        System.out.println("Keliling  = " + persegi.hitungKeliling());

        System.out.println("\nLuas & Keliling Persegi Panjang:");
        System.out.println("Luas      = " + pp.hitungLuas());
        System.out.println("Keliling  = " + pp.hitungKeliling());

        System.out.println("\nLuas & Keliling Segitiga:");
        System.out.println("Luas      = " + segitiga.hitungLuas());
        System.out.println("Keliling  = " + segitiga.hitungKeliling());

        scanner.close();
    }
}
