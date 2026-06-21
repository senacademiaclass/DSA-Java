/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

/**
 *
 * @author dsr
 */
public class QueueApp {

    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(10);
        q.display();
        System.out.println("Data Pertama: " + q.peekFront());
        System.out.println("Data Terakhir: " + q.peekRear());
        System.out.println("Total Data: " + q.size());
        System.out.println("");

        q.enqueue(20);
        q.display();
        System.out.println("Data Pertama: " + q.peekFront());
        System.out.println("Data Terakhir: " + q.peekRear());
        System.out.println("Total Data: " + q.size());
        System.out.println("");

        q.enqueue(30);
        q.display();
        System.out.println("Data Pertama: " + q.peekFront());
        System.out.println("Data Terakhir: " + q.peekRear());
        System.out.println("Total Data: " + q.size());
        System.out.println("");

        q.enqueue(40);
        q.display();
        System.out.println("Data Pertama: " + q.peekFront());
        System.out.println("Data Terakhir: " + q.peekRear());
        System.out.println("Total Data: " + q.size());
        System.out.println("");

        System.out.println("Dequeue: " + q.dequeue());
        q.display();
        System.out.println("Data Pertama: " + q.peekFront());
        System.out.println("Data Terakhir: " + q.peekRear());
        System.out.println("Total Data: " + q.size());
        System.out.println("");

        System.out.println("Dequeue: " + q.dequeue());
        q.display();
        System.out.println("Data Pertama: " + q.peekFront());
        System.out.println("Data Terakhir: " + q.peekRear());
        System.out.println("Total Data: " + q.size());
        System.out.println("");

        System.out.println("Dequeue: " + q.dequeue());
        q.display();
        System.out.println("Data Pertama: " + q.peekFront());
        System.out.println("Data Terakhir: " + q.peekRear());
        System.out.println("Total Data: " + q.size());
        System.out.println("");

        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(70);
        q.enqueue(80);
//        q.enqueue(90);

        q.display();
        System.out.println("Data Pertama: " + q.peekFront());
        System.out.println("Data Terakhir: " + q.peekRear());
        System.out.println("Total Data: " + q.size());
        System.out.println("");

        int[] dataCari = {40, 70, 99};
        for (int i = 0; i < dataCari.length; i++) {
            int posisi = q.cariData(dataCari[i]);
            if (posisi != -1) {
                System.out.println("Data " + dataCari[i] + " ditemukan di posisi " + posisi);
            } else {
                System.out.println("Data " + dataCari[i] + " tidak ditemukan");
            }
        }
        System.out.println("");

        while (!q.isEmpty()) {
            System.out.println("Dequeue: " + q.dequeue());
        }
        q.display();
        q.display();
    }
}
