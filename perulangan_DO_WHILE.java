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

public class perulangan_DO_WHILE {
    static int copys = 5; // VARIABEL UNTUK JUMBLAH KOPY
    static int counter = 0;
    static String text = "Perugan do while";
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
       System.out.println("Text = " + text + " Akan Di copy sebanyak = " + copys);
       do{
            counter++;
            System.out.println((counter) + "." + text);
       }while(counter < copys);
    }
}
