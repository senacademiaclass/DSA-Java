/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Searching;

/**
 * youtube.com/@senacademia
 *
 * @author sena
 *
 */
public class BinarySearching {

    public static void main(String[] args) {
        int[] data = {3, 5, 6, 8, 11, 23, 25};
        int awal = 0;
        int akhir = data.length - 1;
        int pos = 0;
        int cari = 23;
        boolean ketemu = false;

        while (awal <= akhir && ketemu == false) {
            pos = (awal + akhir) / 2;

            if (data[pos] == cari) {
                ketemu = true;
            } else if (data[pos] > cari) {
                akhir = pos - 1;
            } else {
                awal = pos + 1;
            }
        }

        if (ketemu == true) {
            System.out.println("Data " + cari + " ketemu.");
        } else {
            System.out.println("Data " + cari + " tidak ketemu.");
        }
    }
}

//awal = 0
//akhir = 5
//pos = 0
//cari = 23
//ketemu = false
//0 <= 5 && f -> t
//pos = (0 + 5) / 2 = 2.5 -> 2
//if data[2] = 6 == 23? -> f
//else if 6 > 23? ->
//else awal = 2 + 1 = 3
//
//awal = 3
//akhir = 5
//cari = 23
//ketemu = false
//3 <= 5 && f -> t
//pos = (3 + 5) / 2 = 8 / 2 = 4
//if data[4] = 11 == 23? false
//else if data[4] = 11 > 23? false
//else awal = 4 + 1 = 5
//
//awal = 5
//akhir 5
//ketemu = false
//cari = 23
//5 <= 5 && false -> t
//pos = (5 + 5) / 2 = 10 / 2 = 5
//if data[5] = 23 == 23? true
//ketemu = true
//
//if ketemu == true -> cetak data ketemu.