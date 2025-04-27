/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan4;

/**
 *
 * @author lenovo
 */

public class ContohFungsiParameter {

    // Fungsi menghitung keliling persegi panjang
    public static int hitungKeliling(int panjang, int lebar) {
        return 2 * (panjang + lebar);
    }

    public static void main(String[] args) {
        int panjang = 8;
        int lebar = 5;
        int keliling = hitungKeliling(panjang, lebar);
        System.out.println("Keliling persegi panjang: " + keliling);
    }
}
