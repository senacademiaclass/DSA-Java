/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Searching;

/**
 * youtube.com/@senacademia
 *
 * @author sena
 */
public class SimpleLinearSearching {

    public static void main(String[] args) {
        int[] arrAngka = {23, 54, 11, 5, 7, 4};
        boolean penanda = false;
        int cari = 44;

        for (int i = 0; i < arrAngka.length; i++) {
            if (cari == arrAngka[i]) {
                penanda = true;
                break;
            }
        }

        if (penanda == true) {
            System.out.println("Angka " + cari + " ada di dalam array");
        } else {
            System.out.println("Angka " + cari + " tidak ada di dalam array");
        }
    }

}
