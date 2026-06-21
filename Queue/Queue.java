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
public class Queue {

    private int maxSize;
    private int[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size) {
        this.maxSize = size;
        this.queArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public boolean isFull() {
        return nItems == maxSize;
    }

    public int size() {
        return nItems;
    }

    public void enqueue(int data) {//untuk menambahkan data (paling akhir)
        if (isFull()) {
            throw new RuntimeException("enqueue: Queue Penuh. Tidak bisa tambah data " + data);
        }
        rear = (rear + 1) % maxSize;//circular array
        // maxSize = 4
        // 10 20 30 40 -> rear = 3
        // x x 30 40 -> rear = 3
        // 50 x 30 40 -> rear = (3+1)%4 = 4%4 = 0
        // 50 60 30 40 -> rear = (0+1)%4 = 1%4 = 1
        queArray[rear] = data;
        nItems++;
    }

    public int dequeue() {//untuk mengambil data (posisi paling awal)
        if (isEmpty()) {
            throw new RuntimeException("dequeue: Queue Kosong !!");
        }

        int temp = queArray[front];
        front = (front + 1) % maxSize;//circular array
        // maxSize = 4
        // 10 20 30 40 -> front = 0
        // x 20 30 40 -> front = (0+1)%4 = 1%4 = 1
        // x x 30 40 -> front = (1+1)%4 = 2%4 = 2
        nItems--;
        return temp;
    }

    public int peekFront() {//melihat data paling awal
        if (isEmpty()) {
            throw new RuntimeException("peekFront: Queue Kosong !!");
        }
        return queArray[front];
    }

    public int peekRear() {//melihat data paling akhir
        if (isEmpty()) {
            throw new RuntimeException("peekRear: Queue Kosong !!");
        }
        return queArray[rear];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("display: Queue Kosong !!");
            return;
        }
        System.out.print("Isi Queue: ");
        int count = 0;
        int i = front;

        while (count < nItems) {
            System.out.print(queArray[i] + " ");
            i = (i + 1) % maxSize;
            count++;
        }
        System.out.println("");
    }

    public int cariData(int cari) {
        for (int i = 0; i < nItems; i++) {
            // 50 60 30 40 -> front = 2,rear = 1
            int index = (front + i) % maxSize;
            if (queArray[index] == cari) {
                return i;
            }
        }
        return -1;
    }

}
