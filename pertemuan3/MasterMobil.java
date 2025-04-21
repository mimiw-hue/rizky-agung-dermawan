/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan3;

/**
 *
 * @author lenovo
 */

public class MasterMobil {
    // Superclass
    static class Mobil {
        String merk;
        String model;
        int tahun;

        public Mobil(String merk, String model, int tahun) {
            this.merk = merk;
            this.model = model;
            this.tahun = tahun;
        }

        public void infoMobil() {
            System.out.println("Merk : " + merk);
            System.out.println("Model: " + model);
            System.out.println("Tahun: " + tahun);
        }

        public void suaraMesin() {
            System.out.println("Mesin mobil menyala...");
        }
    }

    // Subclass: Mobil Sport
    static class MobilSport extends Mobil {
        public MobilSport(String merk, String model, int tahun) {
            super(merk, model, tahun);
        }

        @Override
        public void suaraMesin() {
            System.out.println("VROOOM! Suara mesin sport bertenaga!");
        }
    }

    // Subclass: Mobil Truk
    static class MobilTruk extends Mobil {
        double kapasitasMuatan;

        public MobilTruk(String merk, String model, int tahun, double kapasitasMuatan) {
            super(merk, model, tahun);
            this.kapasitasMuatan = kapasitasMuatan;
        }

        @Override
        public void suaraMesin() {
            System.out.println("BROOOOM! Mesin truk berbunyi berat.");
        }

        public void tampilMuatan() {
            System.out.println("Kapasitas muatan: " + kapasitasMuatan + " ton");
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
        public void suaraMesin() {
            System.out.println("... (Hening) Mobil listrik nyaris tak bersuara.");
        }

        public void tampilBaterai() {
            System.out.println("Kapasitas baterai: " + kapasitasBaterai + " kWh");
        }
    }

    // Main Program
    public static void main(String[] args) {
        System.out.println("=== Master PBO Mobil ===\n");

        MobilSport sport = new MobilSport("Lamborghini", "Aventador", 2022);
        MobilTruk truk = new MobilTruk("Hino", "500 Series", 2019, 15);
        MobilListrik listrik = new MobilListrik("Tesla", "Model S", 2023, 100);

        System.out.println("Mobil Sport:");
        sport.infoMobil();
        sport.suaraMesin();

        System.out.println("\nMobil Truk:");
        truk.infoMobil();
        truk.suaraMesin();
        truk.tampilMuatan();

        System.out.println("\nMobil Listrik:");
        listrik.infoMobil();
        listrik.suaraMesin();
        listrik.tampilBaterai();
    }
}
