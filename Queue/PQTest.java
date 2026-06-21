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
public class PQTest {

    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue(5);

        pq.insert(30);
        pq.insert(50);
        pq.insert(10);
        pq.insert(40);
        pq.insert(20);

        pq.cetakSemua();

        System.out.println("");
        pq.peekMin();
        pq.peekMax();
        System.out.println("Ukuran Queue: " + pq.size());
        pq.insert(66);

        System.out.println("");
        int[] cari = {10, 30, 50, 99};
        for (int i = 0; i < cari.length; i++) {
            pq.cariData(cari[i]);
        }

        System.out.println("");
        while (!pq.isEmpty()) {
            System.out.println("Remove: " + pq.remove());
        }
        
        System.out.println("");
        pq.peekMin();
        pq.peekMax();
        System.out.println("Ukuran Queue: " + pq.size());
        pq.remove();
        pq.remove();
    }
}
