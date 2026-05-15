/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SLLC;

/**
 * youtube.com/@senacademia
 *
 * @author dsr
 */
public class SLLC {
//class ini berisi logika dan proses single linked list circular

    Node head = null;

    public boolean isEmpty() {
        return head == null;
    }

    public void printSemua() {
        if (isEmpty()) {
            System.out.println("List kosong");
            return;
        }

        Node temp = head;

        System.out.print("head -> ");
        do {
            System.out.print(temp.data);
            if (temp.next != head) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        } while (temp != head);
        System.out.println(" -> head");
    }

    public void insertDepan(int databaru) {
        Node newNode = new Node(databaru);

        if (isEmpty()) {
            head = newNode;
            head.next = head;
        } else {
            Node temp = head;

            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
            head = newNode;
        }
        System.out.println("[+] insertDepan: " + databaru);
    }

    public void insertBelakang(int databaru) {
        Node newNode = new Node(databaru);

        if (isEmpty()) {
            head = newNode;
            head.next = head;
        } else {
            Node temp = head;

            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
        System.out.println("[+] insertBelakang: " + databaru);
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
            System.out.println("[!] hapusDepan: List kosong");
            return;
        }

        Node temp = head;
        System.out.println("[-] hapusDepan: menghapus " + head.data);

        if (head.next == head) {//node hanya ada 1
            head = null;
        } else {//bersisi > 1 node
            while (temp.next != head) {
                temp = temp.next;
            }
            head = head.next;
            temp.next = head;
        }
    }

    public void hapusBelakang() {
        if (isEmpty()) {
            System.out.println("[!] hapusBelakang: List Kosong");
            return;
        }

        Node temp = head;
        System.out.println("[!] hapusBelakang: " + cariNodeTerakhir().data);
        if (head.next == head) {//hanya 1 node
            head = null;
        } else {//berisi > 1 node
            while (temp.next.next != head) {
                temp = temp.next;
            }
            temp.next = head;
        }
    }

    private Node cariNodeTerakhir() {
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        return temp;
    }

    public void insertAt(int posisi, int databaru) {
        //posisi < 1
        if (posisi < 1) {
            System.out.println("[!] insertAt: posisi harus >= 1");
            return;
        }

        //posisi 1, sama dengan insertDepan
        if (posisi == 1) {
            insertDepan(databaru);
            System.out.println("insertAt: sisipkan " + databaru + " posisi 1 (=insertDepan)");
            return;
        }

        //posisi melebihi jumlah node yang ada
        if (posisi > size() + 1) {
            System.out.println("[!] insertAt: posisi " + posisi + " melebihi panjang list (" + size() + ")");
            return;
        }

        //sisipkan node baru di posisi tengah / belakang
        Node newNode = new Node(databaru);
        Node temp = head;

        //maju sampai posisi node sebelum yang dituju
        //posisi = 2, maka berhenti di node ke 1
        //posisi = 3, maka berhenti di node ke 2
        //dst....
        for (int i = 1; i < posisi - 1; i++) {
            temp = temp.next;
        }
        //kondisi sebelum => .... [temp] -> [temp.next] -> ....
        //kondisi sesudah => .... [temp] -> [newNode] -> [temp.next] -> ....
        newNode.next = temp.next;
        temp.next = newNode;

        System.out.println("[+] insertAt (posisi=" + posisi + "), (data=" + databaru + ")");
    }

    public void hapusByValue(int nilai) {
        if (isEmpty()) {
            System.out.println("[!] hapusByValue: List kosong");
            return;
        }

        //data yang akan dihapus adalah node pertama
        if (head.data == nilai) {
            System.out.println("[!] hapusByValue: menghapus " + nilai);
            Node lastNode = cariNodeTerakhir();
            head = head.next;
            lastNode.next = head;
            return;
        }

        //data yang dihapus berada di tengah atau di belakang
        Node sebelum = head;
        Node cari = head.next;

        //[sebelum] [cari] [cari.next]
        while (cari != head) {
            if (cari.data == nilai) {
                //kondisi sebelum -> [sebelum] [cari] [cari.next]
                //kondisi sesudah -> [sebelum.next] [cari.next], [cari] dilewati
                sebelum.next = cari.next;
                System.out.println("[!] hapusByValue: menghapus " + nilai);
                return;
            }
            sebelum = cari;
            cari = cari.next;
        }

        System.out.println("[!] hapusByValue: data " + nilai + " tidak ditemukan");
    }

    public int cariData(int nilai) {
        if (isEmpty()) {
            System.out.println("[!] cariData: List kosong");
            return -1;
        }

        Node temp = head;
        int posisi = 1;

        do {
            if (temp.data == nilai) {
                System.out.println("[?] cariData: (nilai=" + nilai + ") ditemukan pada (posisi=" + posisi + ")");
                return posisi;
            }
            temp = temp.next;
            posisi++;
        } while (temp != head);

        System.out.println("[?] cariData: (nilai=" + nilai + ") tidak ditemukan");
        return -1;
    }
}
