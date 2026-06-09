/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DLLC;

/**
 * youtube.com/@senacademia
 *
 * @author dsr
 */
public class DLLC {

    //class yang berisi logika dan proses double linked list circular
    Node head;

    public boolean isEmpty() {
        return head == null;
    }

    public void insertDepan(int databaru) {
        Node baru = new Node(databaru);

        if (isEmpty()) {
            baru.next = baru;
            baru.previous = baru;
            head = baru;
        } else {
            Node tail = head.previous;
            baru.next = head;
            baru.previous = tail;
            tail.next = baru;
            head.previous = baru;
            head = baru;
        }
        System.out.println("insertDepan: " + databaru);
    }

    public void insertBelakang(int databaru) {
        Node baru = new Node(databaru);

        if (isEmpty()) {
            baru.next = baru;
            baru.previous = baru;
            head = baru;
        } else {
            Node tail = head.previous;
            tail.next = baru;
            baru.previous = tail;
            baru.next = head;
            head.previous = baru;
        }
        System.out.println("insertBelakang: " + databaru);
    }

    public void printDepan() {
        if (isEmpty()) {
            System.out.println("printDepan: List Kosong !");
            return;
        }

        System.out.print("printDepan: ");
        Node bantu = head;
        do {
            System.out.print(bantu.data + " ");
            bantu = bantu.next;
        } while (bantu != head);
        System.out.println("");
    }

    public void printBelakang() {
        if (isEmpty()) {
            System.out.println("printBelakang: List Kosong !");
            return;
        }

        System.out.print("printBelakang: ");
        Node tail = head.previous;
        Node bantu = tail;
        do {
            System.out.print(bantu.data + " ");
            bantu = bantu.previous;
        } while (bantu != tail);
        System.out.println("");
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        }

        int count = 0;
        Node temp = head;

        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }

    public void hapusDepan() {
        if (isEmpty()) {
            System.out.println("hapusDepan: List Kosong !");
            return;
        }

        System.out.println("hapusDepan: menghapus " + head.data);
        if (head.next == head) {//hanya ada 1 node
            head = null;
        } else { //berisi > 1 node
            Node tail = head.previous;
            head = head.next;
            tail.next = head;
            head.previous = tail;
        }
    }

    public void hapusBelakang() {
        if (isEmpty()) {
            System.out.println("hapusBelakang: List Kosong !");
            return;
        }

        System.out.println("hapusBelakang: menghapus " + head.previous.data); // head.previous adalah node terakhir (tail)
        if (head.next == head) {//berisi 1 node
            head = null;
        } else {//berisi > 1 node
            Node tail = head.previous;
            Node newTail = tail.previous;
            newTail.next = head;
            head.previous = newTail;
        }
    }

    public void insertAt(int posisi, int databaru) {
        //posisi < 1
        if (posisi < 1) {
            System.out.println("insertAt: posisi harus >= 1 !");
            return;
        }

        if (posisi == 1) {//sama dengan proses insertDepan
            System.out.println("insertAt: posisi 1 (=insertDepan)");
            insertDepan(databaru);
            return;
        }

        //posisi melebihi jumlah node yang ada
        if (posisi > size() + 1) {
            System.out.println("insertAt: posisi " + posisi + " melebihi jumlah node / panjang list (" + size() + ")");
            return;
        }

        //penyisipan data baru di posisi tengah / belakang
        Node baru = new Node(databaru);
        Node temp = head;

        //maju ke posisi node tepat satu node sebelum node yang dituju
        for (int i = 1; i < posisi - 1; i++) {
            temp = temp.next;
        }
        //sebelum => [temp] [temp.next]
        //sesudah => [temp] <- [baru] -> [temp.next]
        baru.next = temp.next;
        baru.previous = temp;

        //[temp] <- [baru] -> [temp.next], pointer previous node temp.next masih terhubung ke node temp
        //harusnya terhubung ke node baru
        temp.next.previous = baru;//[temp] <- [baru] <-> [temp.next]
        temp.next = baru;//[temp] <-> [baru] <-> [temp.next]

        System.out.println("insertAt: posisi " + posisi + " nilai = " + databaru);
    }

    public void hapusByValue(int nilai) {
        if (isEmpty()) {
            System.out.println("hapusByValue: List Kosong !");
            return;
        }

        if (head.data == nilai) {
            System.out.println("hapusByValue: (=hapusDepan) menghapus " + nilai);
            hapusDepan();
            return;
        }

        //data yang dihapus berada di tengah atau di belakang
        Node sebelum = head;
        Node cari = head.next;
        // ...[sebelum] [cari] [cari.next]...

        while (cari != head) {
            if (cari.data == nilai) {
                //[sebelum] <-> [cari] <-> [cari.next]
                sebelum.next = cari.next; //[sebelum] -> [cari.next]
                cari.next.previous = sebelum;//[sebelum] <-> [cari.next], node cari dilewati
                System.out.println("hapusByValue: menghapus " + nilai);
                return;
            }
            sebelum = cari;
            cari = cari.next;
        }

        System.out.println("hapusByValue: data " + nilai + " tidak ditemukan");
    }

    public int cariData(int nilai) {
        if (isEmpty()) {
            System.out.println("cariData: List Kosong !");
            return -1;
        }

        Node temp = head;
        int posisi = 1;

        do {
            if (temp.data == nilai) {
                System.out.println("cariData: nilai " + nilai + " ada di posisi " + posisi);
                return posisi;
            }
            temp = temp.next;
            posisi++;
        } while (temp != head);

        System.out.println("cariData: nilai " + nilai + " tidak ditemukan");
        return -1;
    }
}
