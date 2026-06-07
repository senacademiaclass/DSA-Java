/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DLLNC;

/**
 * youtube.com/@senacademia
 *
 * @author dsr
 */
public class DLLNC {
    //class yang berisi proses dan logika double linked list

    private Node head;

    public boolean isEmpty() {
        return head == null;
    }

    public void insertDepan(int databaru) {
        Node baru = new Node(databaru);

        if (isEmpty()) {
            head = baru;
        } else {
            baru.next = head;
            head.prev = baru;
            head = baru;
        }
        System.out.println("insertDepan: " + databaru);
    }

    public void insertBelakang(int databaru) {
        Node baru = new Node(databaru);

        if (isEmpty()) {
            head = baru;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = baru;
            baru.prev = temp;
        }
        System.out.println("insertBelakang: " + databaru);
    }

    public void printDepan() {
        if (isEmpty()) {
            System.out.println("printDepan: List Kosong!");
            return;
        }

        System.out.print("printDepan: ");

        Node temp = head;
        System.out.print("head -> ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            System.out.print("<-> ");
            temp = temp.next;
        }
        System.out.println(" null");
    }

    public void printBelakang() {
        if (isEmpty()) {
            System.out.println("printBelakang: List Kosong!");
            return;
        }

        System.out.print("printBelakang: ");

        Node temp = head;

        //ke node terakhir
        while (temp.next != null) {
            temp = temp.next;
        }

        System.out.print("null <-");
        while (temp != null) {
            System.out.print(temp.data + " ");
            System.out.print("<-> ");
            temp = temp.prev;

        }
        System.out.println(" head");
    }

    public int size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void hapusDepan() {
        if (isEmpty()) {
            System.out.println("hapusDepan: List Kosong!");
            return;
        }

        System.out.println("hapusDepan: menghapus " + head.data);
        if (head.next == null) {//hanya ada 1 node
            head = null;
        } else {// ada > 1 node
            head = head.next;
            head.prev = null;
        }
    }

    private Node cariNodeAkhir() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp;
    }

    public void hapusBelakang() {
        if (isEmpty()) {
            System.out.println("hapusBelakang: List Kosong!");
            return;
        }

        System.out.println("hapusBelakang: menghapus " + cariNodeAkhir().data);
        if (head.next == null) {//hanya ada 1 node
            head = null;
        } else {//ada > 1 node
            Node temp = head;
            //berhenti pada node sebelum terakhir
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    public void insertAt(int posisi, int databaru) {
        //posisi < 1
        if (posisi < 1) {
            System.out.println("insertAt: posisi harus >= 1 !!");
            return;
        }

        //posisi = 1, akan sama dengan insertDepan
        if (posisi == 1) {
            System.out.println("insertAt: posisi 1 (=insertDepan)");
            insertDepan(databaru);
            return;
        }

        //posisi melebihi jumlah node
        if (posisi > size() + 1) {
            System.out.println("insertAt: posisi = " + posisi + " melebihi panjang list (" + size() + ")");
            return;
        }

        //penyisipan node baru di posisi tengah / belakang
        Node baru = new Node(databaru);
        Node temp = head;

        //maju sampai posisi node sebelum yang dituju
        //posisi = 2, berhenti di node ke 1
        //posisi = 3, berhenti di node ke 2
        for (int i = 1; i < posisi - 1; i++) {
            temp = temp.next;
        }
        //sebelum => .... <-> [temp] <-> [temp.next] <-> ....
        //sesudah => .... <-> [temp] <-> [baru] <-> [temp.next] <-> ....

        baru.next = temp.next;
        baru.prev = temp;
        //[temp] <- [baru] -> [temp.next], pointer prev dari node temp.next masih menunjuk node temp
        //harusnya menunjuk ke node baru

        temp.next.prev = baru;
        //[temp] <- [baru] <-> [temp.next]
        temp.next = baru;
        //[temp] <-> [baru] <-> [temp.next]

        System.out.println("insertAt: posisi = " + posisi + ", data = " + databaru);
    }

    public void hapusByValue(int nilai) {
        if (isEmpty()) {
            System.out.println("hapusByValue: Lit Kosong!");
            return;
        }

        Node temp = head;

        //jika data di head
        if (head.data == nilai) {
            System.out.println("hapusByValue: (=hapusDepan) menghapus " + nilai);
            hapusDepan();
            return;
        }

        //pencarian node
        while (temp != null && temp.data != nilai) {
            temp = temp.next;
        }
        //        10,20,30

        //data nilai tidak ditemukan
        if (temp == null) {
            System.out.println("hapusByValue: nilai " + nilai + " tidak ditemukan");
            return;
        }

        //berhenti di node terakhir
        if (temp.next == null) {
            System.out.println("hapusByValue: (=hapusBelakang) menghapus " + nilai);
            hapusBelakang();
            return;
        }

        //nilai berada di tengah
        System.out.println("hapusByValue: menghapus " + nilai);
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

        //[temp.prev] [temp] [temp.next]
        //10 <-> 20 <-> 30
    }

    public int cariData(int nilai) {
        if (isEmpty()) {
            System.out.println("cariData: List Kosong!");
        }

        Node temp = head;
        int posisi = 1;

        while (temp != null) {
            if (temp.data == nilai) {
                System.out.println("cariData: nilai = " + nilai + " ditemukan di posisi " + posisi);
                return posisi;
            }
            temp = temp.next;
            posisi++;
        }

        System.out.println("cariData: nilai " + nilai + " tidak ditemukan");
        return -1;
    }
}
