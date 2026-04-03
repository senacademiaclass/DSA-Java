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
public class InterpolationSearching {

    public static void main(String[] args) {
        int[] data = {3, 6, 8, 11, 15}; // harus terurut
        int bawah = 0;
        int atas = data.length - 1;
        int cari = 11;

        while (bawah <= atas && cari >= data[bawah] && cari <= data[atas]) {
            int pos = bawah + (cari - data[bawah]) / (data[atas] - data[bawah]) * (atas - bawah);

            if (data[pos] == cari) {
                System.out.println("Data " + cari + " ditemukan pada indeks ke-" + pos);
                return;
            }

            if (data[pos] < cari) {
                bawah = pos + 1;
            } else {
                atas = pos - 1;
            }
        }
        System.out.println("Data "+cari+" tidak ditemukan");
    }
}
//pos = bawah + (cari - data[bawah]) / (data[atas] - data[bawah]) * (atas - bawah)

//bawah = 0
//atas = 4
//cari = 8
//data[bawah] = 3
//data[atas] = 15
//pos = 0 + (8 - 3) / (15 - 3) * (4 - 0) = 0 + 5 / 12 * 4 = 1.66667 -> 1
//6 < 8 -> T 
//bawah = 1 + 1 = 2
//
//bawah = 2
//atas = 4
//cari = 8
//data[bawah] = 8
//data[atas] = 15
//pos = 2 + (8 - 8) / (15 - 8) * (4 - 0) = 2 + 0 / 7 * 4 = 2
//8 = 8 ? -> T -> cetak data ditemukan -> kode program
//
//1. tentukan batas atas dan bawah
//2. hitung perkiraan posisi data yang dicari -> menggunakan rumus
//3. jika posisi pencarian cocok -> selesai
//4. jika posisi lebih kecil -> geser ke kanan
//5. jika posisi lebih besar -> geser ke kiri
//6. ulangi sampai ketemu data yang cari