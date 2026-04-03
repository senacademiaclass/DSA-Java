/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rekursif;

/**
 * youtube.com/@senacademia
 *
 * @author sena
 */
public class Perpangkatan {

//    a ^ 1 = a
//    a ^ 0 = 1
    static double hasil_pangkat(double a, double b) {
        if (b == 1) {
            return a;
        } else if (b == 0) {
            return 1;
        } else {
            return a * hasil_pangkat(a, b - 1);
        }
    }

    public static void main(String[] args) {
        double a = 2;
        double b = 3;
        double hasil = Math.pow(a, b);
        System.out.println("Hasil dari " + a + " ^ " + b + " = " + hasil);

        System.out.println("(Rekursif) Hasil dari " + a + " ^ " + b + " = " + hasil_pangkat(a, b));
    }
}
//pemanggilan 1 => a = 2, b = 4, return 2 * 2 ^ 3
//pemanggilan 2 => a = 2, b = 3, return 2 * 2 * 2 ^ 2
//pemanggilan 3 => a = 2, b = 2, return 2 * 2 * 2 * 2 ^ 1
//pemanggilan 4 => a = 2, b = 1, return 2 * 2 * 2 * 2 * 2 ^ 0 = 2 * 2 * 2 * 2 = 16
