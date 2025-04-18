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
public class Array {
    public static void main(String[] args) {  
        int[][] nilai = {
            {85, 90, 50}, 
            {78, 88, 40},
            {92, 95, 31}  
        };
        
        String[]matkul ={"IPS", "GEOGRAFI", "SOSIOLOGI"};
        for(int siswa = 0; siswa<nilai.length; siswa++){
            System.out.println("Siswa ke 0" + (siswa+1) + ": ");
            for(int i= 0; i<nilai[siswa].length; i++){
                System.out.println("  " + matkul[i] + ": " + nilai[siswa][i]);
            }
            
        }
    }
}
