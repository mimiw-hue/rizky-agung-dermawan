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

public class Percabangan_ELSE_IF {
    public static void main(String[] args) {
//        Contoh Percabangan dengan IF dan ELSE UNTUK CONVERSI NILAI MAHASISWA
        int nilaimahasiswa = 40;
        char nilai_conversi;
        
        if(nilaimahasiswa >= 96){
            nilai_conversi = 'A';
        }else if(nilaimahasiswa >= 82){
            nilai_conversi = 'B';
        }else if(nilaimahasiswa >= 75){
            nilai_conversi = 'C';
        }else if(nilaimahasiswa >= 69){
            nilai_conversi = 'D';
        }else{
            nilai_conversi = 'F';
        }
        
        System.out.println("Nilai anda adalah " + nilaimahasiswa);
        System.out.println("Grade anda adalah " +  nilai_conversi);
    }
}
