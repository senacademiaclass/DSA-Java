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
public class InsertionSort {

    public static void main(String[] args) {
        int[] data = {5, 2, 4, 6, 1, 3};
        System.out.println("Sebelum terurut");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");

        for (int i = 1; i < data.length; i++) {
            int key = data[i];
            int j = i - 1;

            while (j >= 0 && data[j] > key) {//proses menggeser angka yang lebih besar ke kanan
                data[j + 1] = data[j];
                j--;
            }

            //proses memasukkan data key yang benar ke benar
            data[j + 1] = key;
        }

        System.out.println("Setelah terurut");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
//5, 2, 4, 6, 1, 3
//
//i=1, key = data[i] = 2
//j = i-1 = 1-1 = 0
//0 >= 0 && 5 > 2 -> t
//data[0+1] = data[0] = 5
//j-- -> j=0-1 = -1
//-1 >= 0 -> f
//data[-1+1] = key -> data[0] = 2
//2 5 4 6 1 3
//
//i=2, key = data[i] = 4
//j = i-1 = 2-1 = 1
//1 >= 0 && 5 > 4 -> t
//data[2] = data[1] = 5
//j-- -> 1-1 = 0
//0 >= 0 && 2 > 4 -> f
//data[0+1] = key -> data[1] = 4
//2 4 5 6 1 3
//
//i=3. key = data[3] = 6
//j = i-1 = 3-1 = 2
//2 >=0 && 5 > 6 -> f
//data[2+1] = key -> data[3] = 6
//2 4 5 6 1 3
//
//i=4, key = data[4] = 1
//j = i-1 = 4-1 = 3
//3 >= 0 && 6 > 1 -> t
//data[4] = data[3] = 6
//j-- -> 3-1 = 2
//2 >=0 && 5 > 1 -> t
//data[3] = data[2] = 5
//j-- -> 2-1 = 1
//1 >= 0 && 4 > 1 -> t
//data[2] = data[1] = 4
//j-- -> 1-1 = 0
//0 >= 0 && 2 > 1 -> t
//j-- -> 0-1 = -1
//-1 >=0 -> f
//data[-1+1] = key -> data[0] = 1
//1 2 4 5 6 3
//
//i=5. key = data[5] = 3
//j = i-1 = 5-1 = 4
//4 >= 0 && 6 > 3 -> t
//data[5] = data[4] = 6
//j-- -> 4-1 = 3
//3 >= 0 && 5 > 3 -> t
//data[4] = data[3] = 5
//j-- -> 3-1 = 2
//2 >= 0 && 4 > 3 -> t
//data[3] = data[2] = 4
//j-- -> 2-1 = 1
//1 >= 0 && 2 > 3 -> f
//data[1+1] = key -> data[2] = 3
//1 2 3 4 5 6

//ada variabel key sebagai key dengan elemen sebelumnya
//ada proses pergeseran elemen (bukan swap)
//elemen yang dibandingkan kiri