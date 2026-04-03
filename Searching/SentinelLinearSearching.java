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
public class SentinelLinearSearching {

    public static void main(String[] args) {
        int[] angka = new int[5];
        angka[0] = 3;
        angka[1] = 4;
        angka[2] = 5;
        angka[3] = 6;

        int cari = 4;
        int counter = 0;

        angka[4] = cari;

        while (cari != angka[counter]) {
            counter++;
        }

        if (counter < (angka.length - 1)) {
            System.out.println("Angka " + cari + " ada");
        } else {
            System.out.println("Angka " + cari + " tidak ada");
        }
    }
}
