/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan5;


/**
 *
 * @author lenovo
 */

import java.util.Stack;

public class StackContoh {
    public static void main(String[] args) {
        Stack<String> tumpukan = new Stack<>();

        // Menambahkan elemen ke stack
        tumpukan.push("Buku");
        tumpukan.push("Pensil");
        tumpukan.push("Penghapus");

        // Menampilkan isi stack
        System.out.println("Isi tumpukan: " + tumpukan);

        // Menghapus elemen paling atas
        String item = tumpukan.pop();
        System.out.println("Item yang di-pop: " + item);

        // Melihat item paling atas
        System.out.println("Item paling atas sekarang: " + tumpukan.peek());

        // Mengecek apakah stack kosong
        System.out.println("Apakah tumpukan kosong? " + tumpukan.isEmpty());
    }
}
