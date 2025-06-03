/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
public class Soal5 {
    public static void main(String[] args) {
        int[][] mtx = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
        boolean identitas = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i == j && mtx[i][j] != 1) || (i != j && mtx[i][j] != 0)) {
                    identitas = false;
                    break;
                }
            }
        }
        System.out.println("Soal 5 - Matriks identitas: " + identitas);
    }
}
