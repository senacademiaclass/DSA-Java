package Rekursif;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


/**
 * www.youtube.com/@senacademia
 *
 * @author sena
 */
// n! = n x (n-1) x (n-2) x (n-3) x ... x 3 x 2 x 1
// 4! = 4 x 3 x 2 x 1 = 24
// 4! = 4 x 3! = 4 x 3 x 2! = 24
// 1! = 1
// 0! = 1
// faktorial tidak bisa diterapkan pada bilangan negatif
public class Faktorial {

    public static long hitung_faktorial(long angka) {
        if (angka == 1 || angka == 0) {
            return 1;
        } else {
            return angka * hitung_faktorial(angka - 1);
        }
    }

    public static void main(String[] args) {
        long angka = 4;
        if (angka < 0) {
            System.out.println("Faktorial harus > 0");
        } else {
            System.out.println("Hasil " + angka + "! = " + hitung_faktorial(angka));
        }
    }
}
