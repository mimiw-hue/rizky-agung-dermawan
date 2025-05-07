/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan6;

/**
 *
 * @author lenovo
 */
import java.util.LinkedList;
import java.util.Queue;

public class QueueStudiJava {

    public static void main(String[] args) {
        // Membuat queue studi
        Queue<String> queueStudi = new LinkedList<>();

        // Menambahkan item ke dalam queue
        queueStudi.add("1. Dasar-dasar Java");
        queueStudi.add("2. Kontrol Alur Program");
        queueStudi.add("3. Fungsi dan Metode");
        queueStudi.add("4. Pemrograman Berbasis Objek (OOP)");
        queueStudi.add("5. Struktur Data Dasar di Java");
        queueStudi.add("6. Exception Handling");
        queueStudi.add("7. File I/O");
        queueStudi.add("8. Java Collection Framework");
        queueStudi.add("9. Java Tingkat Lanjut");
        queueStudi.add("10. Project Akhir");

        System.out.println("Queue Studi Java:");
        while (!queueStudi.isEmpty()) {
            // Mengambil dan menghapus elemen terdepan dari queue
            String materi = queueStudi.poll();
            System.out.println("➡️ Sedang dipelajari: " + materi);

            // Simulasi jeda belajar (bisa dihilangkan kalau tidak dibutuhkan)
            try {
                Thread.sleep(1000); // jeda 1 detik
            } catch (InterruptedException e) {
                System.out.println("Terjadi kesalahan jeda");
            }
        }

        System.out.println("✅ Semua materi telah selesai dipelajari!");
    }
}

