/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan4;

/**
 *
 * @author lenovo
 */

public class ContohFungsi {

    // Method fungsi untuk menghitung luas persegi
    public static int hitungLuasPersegi(int sisi) {
        return sisi * sisi;
    }

    public static void main(String[] args) {
        int sisi = 4;
        int luas = hitungLuasPersegi(sisi);
        System.out.println("Luas persegi dengan sisi " + sisi + " adalah: " + luas);
    }
}
