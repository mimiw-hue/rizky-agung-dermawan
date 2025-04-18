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



public class perulangan_FOR {
    static int copys = 5; // VARIABEL UNTUK JUMBLAH KOPY
    static String text = "Hallo, Semoga Hari Anda Lancar!! ";
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {;
       System.out.println("Text = " + text + " Akan Di copy sebanyak = " + copys);
       for(int i = 0; i<copys; i++){
           System.out.println((i+1) + "." + text);
       }
    }
}
