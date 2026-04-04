/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;

/**
 * youtube.com/@senacademia
 *
 * @author dsr
 */
public class BubbleSortAngka {

    public static void main(String[] args) {
        int[] angka = {64, 34, 25, 12, 11, 22};
        System.out.println("Sebelum terurut:");
        for (int i : angka) {
            System.out.print(i + ", ");
        }
        System.out.println("");

        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < angka.length - 1 - i; j++) {
                if (angka[j] > angka[j + 1]) {// jika elemen kiri > elemen kanan, maka tukar posisi
                    int bantu = angka[j];
                    angka[j] = angka[j + 1];
                    angka[j + 1] = bantu;
                }
            }
        }
        
        System.out.println("Setelah terurut:");
        for(int i:angka){
            System.out.print(i+", ");
        }
    }
}
