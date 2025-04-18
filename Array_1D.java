/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertumuan2;

/**
 *
 * @author x260
 */
public class Array_1D {
    public static void main(String[] args) {
        String[] barang = {"Beras", "Minyak goreng", "Garam", "Gula", "Rokok", "Sabun mandi\n\n"};
        System.out.println("Daftar produk toko : ");
        for(int i = 0; i<barang.length; i++){
            System.out.println((i+1) + ". " + barang[i]);
        }
    }
}
