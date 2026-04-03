/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;

/**
 *
 * youtube.com/@senacademia
 *
 * @author sena
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] angka = {1, 9, 5, 4};
        int temp, awal;
        
        System.out.println("Sebelum terurut");
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i]+", ");
        }
        System.out.println("");

        for (int i = 0; i < angka.length; i++) {
            awal = i;
            for (int j = i + 1; j < angka.length; j++) {
                if (angka[awal] > angka[j]) {
                    awal = j;
                }
            }

            temp = angka[i];
            angka[i] = angka[awal];
            angka[awal] = temp;
        }
        
        System.out.println("Setelah terurut");
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i]+", ");
        }
    }
}
//{1, 9, 5, 4}
//
//i=0, awal=0
//j=1, angka[awal] = angka[0] = 1, angka[j] = angka[1] = 9 --> 1 > 9 --> f
//j=2, angka[awal] = angka[0] = 1, angka[j] = angka[2] = 5 --> 1 > 5 --> f
//j=3, angka[awal] = angka[0] = 1, angka[j] = angka[3] = 4 --> 1 > 4 --> f
//temp = angka[i] = angka[0] = 1
//angka[i] = angka[0] = angka [awal] = angka[0] = 1
//angka[awal] = angka[0] = temp = 1
//{1, 9, 5, 4}
//
//i=1, awal=1
//j=2, angka[awal] = angka[1] = 9, angka[j] = angka[2] = 5 --> 9 > 5 --> t --> awal = j = 2
//j=3, angka[awal] = angka[2] = 5, angka[j] = angka[3] = 4 --> 5 > 4 --> t --> awal = j = 3
//temp = angka[i] = angka[1] = 9
//angka[i] = angka[1] = angka[awal] = angka[3] = 4
//angka[awal] = angka[3] = temp = 9
//{1, 4, 5, 9}
//
//i=2, awal=2
//j=3, angka[awal] = angka[2] = 5, angka[j] = angka[3] = 9 --> 5 > 9 --> f
//temp = angka[i] = angka[2] = 5
//angka[i] = angka[2] = angka[awal] = angka[2] = 5
//angka[awal] = angka[2] = temp = 5
//{1, 4, 5, 9}
//
//i=3, awal=3
//j=4 --> tidak masuk looping
//temp = angka[i] = angka[3] = 9
//angka[i] = angka[3] = angka[awal] = angka[3] = 9
//angka[awal] = angka[3] = temp = 9
//{1, 4, 5, 9}
//
//i=4 --> tidak masuk looping, looping berhenti
//{1, 4, 5, 9}