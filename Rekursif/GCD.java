package Rekursif;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/**
 *
 * @author sena youtube.com/@senacademia
 */
public class GCD {

    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        System.out.println("Nilai GCD " + a + " dan " + b + " = " + gcd(a, b));
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}

//pemanggilan gcd(8,24) -> a = 8, b = 24, a % b = 8
//pemanggilan gcd(24,8) -> a = 24, b = 8, a % b = 0
//pemanggilan gcd(8,0) -> a = 8, b = 0, -> GCD atau FPB = 8
//pemanggilan gcd(4,6) -> a = 4, b = 6, a % b = 2
//pemanggilan gcd(6,2) -> a = 6, b = 2, a % b = 0
//pemanggilan gcd(2,0) -> a = 2, b = 0, => GCD atau FPB dari 4 dan 6 adalah 2
