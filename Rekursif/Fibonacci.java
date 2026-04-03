/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rekursif;

/**
 *
 * @author sena youtube.com/@senacademia
 */
public class Fibonacci {

    static int fibo(int i) {
        if (i == 0) {
            return 0;
        } else if (i == 1) {
            return 1;
        } else {
            return fibo(i - 1) + fibo(i - 2);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.print(fibo(i)+", ");
        }
    }
}
//0 1 1 2 3 5 8 ...
// i = 0 -> fibo(0) -> return 0 -> nilai = 0 -> cetak 0
// i = 1 -> fibo(1) -> return 1 -> nilai = 1 -> cetak 1
// i = 2 -> fibo(2) -> return fibo(2-1) + fibo(2-2) = fibo(1) + fibo(0) = 1 + 0 = 1 -> cetak 1
// i = 3 -> fibo(3) -> return fibo(3-1) + fibo(3-2) = fibo(2) + fibo(1) = 1 + 1 = 2 -> cetak 2
// i = 4 -> fibo(4) -> return fibo(4-1) + fibo(4-2) = fibo(3) + fibo(2) = 2 + 1 = 3 -> cetak 3
// 0, 1, 1, 2, 3