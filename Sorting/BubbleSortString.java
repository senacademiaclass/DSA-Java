/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;

/**
 * youtube.com/@senacademia
 *
 * @author sena
 */
public class BubbleSortString {

    public static void main(String[] args) {
        String[] mugiwara = {"naruto", "kakashi", "sakura", "sasuke", "konohamaru"};
        System.out.println("Sebelum Sorting:");
        for (String s : mugiwara) {
            System.out.print(s + ", ");
        }

        int n = mugiwara.length;
        String temp;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (mugiwara[j].compareTo(mugiwara[j + 1]) > 0) {
                    temp = mugiwara[j];
                    mugiwara[j] = mugiwara[j + 1];
                    mugiwara[j + 1] = temp;
                }
            }
        }
        
        System.out.println("");
        System.out.println("Setelah Sorting:");
        for (String s : mugiwara) {
            System.out.print(s + ", ");
        }
    }
}
//Bubble sort bekerja dengan membandingkan 2 elemen array yang bersebelahan
//Jika urutannya salah, maka tukar posisi
//Ulangi proses sampai semua data terurut