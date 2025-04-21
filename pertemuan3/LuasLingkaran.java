/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan3;


/**
 *
 * @author lenovo
 */

import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double jariJari, luas;

        System.out.print("Masukkan jari-jari lingkaran: ");
        jariJari = input.nextDouble();

        luas = hitungLuasLingkaran(jariJari);

        System.out.println("Luas lingkaran = " + luas);
    }

    // Fungsi terpisah untuk menghitung luas lingkaran
    public static double hitungLuasLingkaran(double r) {
        return Math.PI * r * r;
    }
}
