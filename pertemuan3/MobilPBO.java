/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan3;

/**
 *
 * @author lenovo
 */
public class MobilPBO {

    // Superclass Mobil
    static class Mobil {
        String merk;
        String model;
        int tahun;

        public Mobil(String merk, String model, int tahun) {
            this.merk = merk;
            this.model = model;
            this.tahun = tahun;
        }

        public void tampilInfo() {
            System.out.println("Merk : " + merk);
            System.out.println("Model: " + model);
            System.out.println("Tahun: " + tahun);
        }

        public void nyalakanMesin() {
            System.out.println("Mesin mobil " + model + " menyala.");
        }
    }

    // Subclass: Mobil Sport
    static class MobilSport extends Mobil {
        int kecepatanMaks;

        public MobilSport(String merk, String model, int tahun, int kecepatanMaks) {
            super(merk, model, tahun);
            this.kecepatanMaks = kecepatanMaks;
        }

        @Override
        public void nyalakanMesin() {
            System.out.println("Mobil sport " + model + " mengeluarkan suara VROOOM!");
        }

        public void tampilKecepatan() {
            System.out.println("Kecepatan Maksimum: " + kecepatanMaks + " km/jam");
        }
    }

    // Subclass: Mobil Listrik
    static class MobilListrik extends Mobil {
        int kapasitasBaterai;

        public MobilListrik(String merk, String model, int tahun, int kapasitasBaterai) {
            super(merk, model, tahun);
            this.kapasitasBaterai = kapasitasBaterai;
        }

        @Override
        public void nyalakanMesin() {
            System.out.println("Mobil listrik " + model + " berjalan tanpa suara.");
        }

        public void tampilBaterai() {
            System.out.println("Kapasitas Baterai: " + kapasitasBaterai + " kWh");
        }
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("=== Program PBO Mobil ===\n");

        MobilSport sport = new MobilSport("Ferrari", "488 GTB", 2020, 330);
        MobilListrik listrik = new MobilListrik("Hyundai", "IONIQ 5", 2023, 77);

        System.out.println("Mobil Sport:");
        sport.tampilInfo();
        sport.nyalakanMesin();
        sport.tampilKecepatan();

        System.out.println("\nMobil Listrik:");
        listrik.tampilInfo();
        listrik.nyalakanMesin();
        listrik.tampilBaterai();
    }
}

