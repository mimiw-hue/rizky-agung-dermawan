/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan6;

/**
 *
 * @author lenovo
 */
import java.util.Queue;
import java.util.LinkedList;

public class queuelibrary {
    public static void main(String[] args) {
        // Membuat queue menggunakan LinkedList
        Queue<String> materiJava = new LinkedList<>();

        // Menambahkan elemen ke queue
        materiJava.offer("Dasar-dasar Java");
        materiJava.offer("Kontrol Alur Program");
        materiJava.offer("Fungsi dan Metode");
        materiJava.offer("Pemrograman OOP");
        materiJava.offer("Struktur Data Dasar");
        materiJava.offer("Exception Handling");
        materiJava.offer("File I/O");
        materiJava.offer("Java Collection Framework");
        materiJava.offer("Java Tingkat Lanjut");
        materiJava.offer("Project Akhir");

        // Menampilkan semua elemen dalam queue
        System.out.println("Isi queue studi Java:");
        for (String materi : materiJava) {
            System.out.println("- " + materi);
        }

        // Simulasi mengerjakan satu per satu
        System.out.println("\nMulai mempelajari materi:");
        while (!materiJava.isEmpty()) {
            String sekarang = materiJava.poll(); // Mengambil dan menghapus elemen terdepan
            System.out.println("📘 Sedang dipelajari: " + sekarang);
        }

        System.out.println("\n✅ Semua materi telah selesai dipelajari!");
    }
}

