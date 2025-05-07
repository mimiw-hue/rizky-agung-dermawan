/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan6;

/**
 *
 * @author lenovo
 */
public class QueueManual {
    private final int maxSize;
    private final String[] queueArray;
    private int front;
    private int rear;
    private int itemCount;

    // Constructor
    public QueueManual(int size) {
        maxSize = size;
        queueArray = new String[maxSize];
        front = 0;
        rear = -1;
        itemCount = 0;
    }

    // Menambahkan item ke dalam queue
    public void enqueue(String item) {
        if (isFull()) {
            System.out.println("Queue penuh! Tidak bisa menambahkan: " + item);
            return;
        }
        rear = (rear + 1) % maxSize;
        queueArray[rear] = item;
        itemCount++;
    }

    // Menghapus dan mengembalikan item terdepan
    public String dequeue() {
        if (isEmpty()) {
            return "Queue kosong!";
        }
        String item = queueArray[front];
        front = (front + 1) % maxSize;
        itemCount--;
        return item;
    }

    // Mengecek apakah queue kosong
    public boolean isEmpty() {
        return itemCount == 0;
    }

    // Mengecek apakah queue penuh
    public boolean isFull() {
        return itemCount == maxSize;
    }

    // Menampilkan semua item dalam queue
    public void displayQueue() {
        System.out.println("Isi queue:");
        int count = 0;
        int i = front;
        while (count < itemCount) {
            System.out.println("- " + queueArray[i]);
            i = (i + 1) % maxSize;
            count++;
        }
    }

    // Main method untuk demo
    public static void main(String[] args) {
        QueueManual queue = new QueueManual(10);

        // Enqueue materi
        queue.enqueue("Dasar-dasar Java");
        queue.enqueue("Kontrol Alur Program");
        queue.enqueue("Fungsi dan Metode");
        queue.enqueue("Pemrograman OOP");
        queue.enqueue("Struktur Data Dasar");
        queue.enqueue("Exception Handling");
        queue.enqueue("File I/O");
        queue.enqueue("Java Collection Framework");
        queue.enqueue("Java Tingkat Lanjut");
        queue.enqueue("Project Akhir");

        queue.displayQueue();

        System.out.println("\nMempelajari materi satu per satu:");
        while (!queue.isEmpty()) {
            System.out.println("📘 Sedang dipelajari: " + queue.dequeue());
        }

        System.out.println("\n✅ Semua materi telah selesai dipelajari!");
    }
}
