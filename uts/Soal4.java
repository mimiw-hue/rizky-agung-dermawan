/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
import java.util.*;
public class Soal4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 3, 4, 5};
        List<Integer> result = new ArrayList<>();
        for (int num : arr) {
            if (!result.contains(num)) result.add(num);
        }
        System.out.println("Soal 4 - Array tanpa duplikat: " + result);
    }
}
