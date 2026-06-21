/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

/**
 * youtube.com/@senacademia
 *
 * @author dsr
 */
public class PriorityQueue {

    private int maxSize;
    private int[] queArray;
    private int nItems;

    public PriorityQueue(int s) {
        maxSize = s;
        queArray = new int[maxSize];
        nItems = 0;
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public boolean isFull() {
        return nItems == maxSize;
    }

    public void insert(int data) {
        if (isFull()) {
            System.out.println("insert: Queue penuh!! Tidak bisa menambahkan data baru");
            return;
        }

        if (isEmpty()) {
            queArray[nItems++] = data;
        } else {
            int j;
            for (j = nItems - 1; j >= 0; j--) {
                if (data > queArray[j]) {//terurut menurun / descending
                    queArray[j + 1] = queArray[j];
                } else {
                    break;
                }
            }
            queArray[j + 1] = data;
            nItems++;
        }
        System.out.println("insert: " + data);
    }
//    30, - - - - => nItems = 1, j = 0, 50 > 30 T => queArray[1] = 30 => 30,30,-,-,- => j= -1
//    queArray[0] = data = 50 => 50,30,-,-,- nItems = 2
    
//    j = 1, 10 > 30 F => break => queArray[2] = data = 10 => 50,30,10,-,- nItems = 3
    
//    j = 2, 40 > 10 T => queArray[3] = 10 => 50,30,10,10,- j = 1
//    j = 1, 40 > 30 T => queArray[2] = 30 => 50,30,30,10,- j = 0
//    j = 0, 40 > 50 F => break => queArray[1] = data = 40 => 50,40,30,10,- nItems = 4
    
//    j = 3, 20 > 10 T => queArray[4] = 10 => 50,40,30,10,10 => j= 2
//    j = 2, 20 > 30 F => break => queArray[3] = data = 20 => 50,40,30,20,10 nItems = 5

    public void cetakSemua() {
        if (isEmpty()) {
            System.out.println("cetakSemua: Queue kosong!!");
            return;
        }
        
        System.out.println("Isi queue (sesuai penyimpanan indeks array):");
        for (int i = 0; i < nItems; i++) {
            System.out.println("[" + i + "] " + queArray[i]);
        }

        System.out.println("Isi queue (sesuai urutan prioritas): ");//terurut naik / ascending
        for (int i = nItems - 1; i >= 0; i--) {
            System.out.println("[" + (nItems - 1 - i) + "] " + queArray[i]);
        }
    }

    public int size() {
        return nItems;
    }

    public void peekMin() {
        if (isEmpty()) {
            System.out.println("peekMin: Queue kosong!!");
            return;
        }
        System.out.println("peekMin: Data pertama (prioritas paling tinggi): " + queArray[nItems - 1]);
    }

    public void peekMax() {
        if (isEmpty()) {
            System.out.println("peekMax: Queue kosong!!");
            return;
        }
        System.out.println("peekMax: Data terakhir (prioritas paling rendah): " + queArray[0]);
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("remove: Queue kosong!!");
            return -1;
        }
        return queArray[--nItems];
    }
    
//    nItems++ -> post increment -> pakai dulu, baru tambah
//    --nItems -> pre decrement -> kurang dulu, baru pakai
//    nItems = 3
//    int x = nItems++; x = 3 (nilai lama yang dipakai dulu), nItems = 4
//    int x = --nItems; nItems = 2 (langsung berubah karena dikurang dulu), x = 2
    

    public int cariData(int data) {
        if (isEmpty()) {
            System.out.println("cariData: Queue kosong!!");
            return -1;
        }

        for (int i = 0; i < nItems; i++) {
            if (queArray[i] == data) {
                int posisi = nItems - 1 - i;
                System.out.println("cariData: Data " + data + " ditemukan di posisi ke-" + posisi);
                return i;
            }
        }

        System.out.println("cariData: Data " + data + " tidak ditemukan");
        return -1;
    }
}
