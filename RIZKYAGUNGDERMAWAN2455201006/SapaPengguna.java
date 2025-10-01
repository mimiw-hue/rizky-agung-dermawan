/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package RIZKYAGUNGDERMAWAN2455201006;

/**
 *
 * @author pc7
 */

import java.util.Scanner;

public class SapaPengguna {
    
    // Method utama
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur Anda: ");
        int umur = input.nextInt();

        sapa(nama, umur);

        input.close();
    }

    // Method untuk menyapa
    public static void sapa(String nama, int umur) {
        System.out.println("\nHai, " + nama + "!");

        if (umur < 12) {
            System.out.println("Kamu masih anak-anak.");
        } else if (umur < 18) {
            System.out.println("Kamu remaja.");
        } else {
            System.out.println("Kamu sudah dewasa.");
        }
    }
}


