/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SLLNC;

/**
 *
 * youtube.com/@senacademia
 *
 * @author dsr
 */
public class SLLNC {
    //class ini berisi semua proses logika linked list

    linkSLLNC head = null;
    linkSLLNC bantu = null;

    //cek list kosong atau tidak
    public boolean isEmpty() {
        return head == null;
    }

    //menampilkan semua isi list
    public void printSemua() {
        if (!isEmpty()) {
            System.out.print("head -> ");
            bantu = head;
            while (bantu != null) {
                bantu.displaynode();
                if (bantu.next != null) {
                    System.out.print(" -> ");
                }
                bantu = bantu.next;
            }
            System.out.println(" -> null");
        } else {
            System.out.println("[Kosong]");
        }
    }

    public void insertDepan(int databaru) {
        linkSLLNC baru = new linkSLLNC(databaru);
        if (isEmpty()) {
            head = baru;
            baru.next = null;
        } else {
            baru.next = head;
            head = baru;
        }
        System.out.println("[+] insertDepan " + databaru);
    }

    public void insertBelakang(int databaru) {
        linkSLLNC baru = new linkSLLNC(databaru);
        if (isEmpty()) {
            head = baru;
            baru.next = null;
        } else {
            bantu = head;
            while (bantu.next != null) {
                bantu = bantu.next;
            }
            bantu.next = baru;
        }
        System.out.println("[+] insertBelakang " + databaru);
    }

    public int size() {
        int count = 0;
        bantu = head;
        while (bantu != null) {
            count++;
            bantu = bantu.next;
        }
        return count;
    }

    public void hapusDepan() {
        if (isEmpty()) {
            System.out.println("[!] hapusDepan: List Kosong !!!");
            return;
        } else {
            System.out.println("[-] hapusDepan: menghapus " + head.data);
            if (head.next == null) {//hanya ada 1 node
                head = null;
            } else {//berisi > 1 node
                head = head.next;
            }
        }
    }

    private linkSLLNC cariNodeTerakhir() {
        linkSLLNC temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp;
    }

    public void hapusBelakang() {
        if (isEmpty()) {
            System.out.println("[!] hapusBelakang: List Kosong !!!");
            return;
        } else {
            System.out.println("[-] hapusBelakang: menghapus " + cariNodeTerakhir().data);
            if (head.next == null) {//hanya berisi 1 node
                head = null;
            } else {//berisi > 1 node
//                head -> [A] -> [B] -> [C|null]
                bantu = head;
                while (bantu.next.next != null) {
                    bantu = bantu.next;
                }
                bantu.next = null;
            }
        }
    }

    public void insertAt(int posisi, int databaru) {
        //posisi tidak boleh < 1
        if (posisi < 1) {
            System.out.println("[!] insertAt: posisi harus >= 1");
            return;
        }

        //posisi 1 sama dengan insertDepan
        if (posisi == 1) {
            insertDepan(databaru);
            return;
        }

        //posisi melebihi jumlah node yang ada
        int jumlah = size();
        if (posisi > jumlah + 1) {
            System.out.println("[!] insertAt: posisi " + posisi + " melebihi panjang list (" + jumlah + ")");
            return;
        }

        //sisipkan node baru di posisi tengah / belakang list
        linkSLLNC baru = new linkSLLNC(databaru);
        bantu = head;

        //maju sampai posisi sebelum yang dituju
        //jika posisi = 2, maka berhenti di node ke 1
        //jika posisi = 3, maka berhenti di node ke 2
        //dst....
        for (int i = 1; i < posisi - 1; i++) {
            bantu = bantu.next;
        }

        //keadaan sebelum -> .... [bantu] -> [bantu.next] -> ....
        //keadaan sesudah -> .... [bantu] -> [baru] -> [bantu.next] -> ....
        baru.next = bantu.next;
        bantu.next = baru;

        System.out.println("[+] insertAt (posisi=" + posisi + "), data=" + databaru + ")");
    }

    public void hapusByValue(int nilai) {
        if (isEmpty()) {
            System.out.println("[!] hapusByValue: List Kosong !!!");
            return;
        }

        //data yang akan dihapus adalah node pertama
        if (head.data == nilai) {
            System.out.println("[!] hapusByValue: menghapus " + nilai);
            head = head.next;
            return;
        }

        //data yang dihapus berada di tengah atau di belakang
        linkSLLNC sebelum = head;
        linkSLLNC cari = head.next;
        //[sebelum] [cari] [cari.next]

        while (cari != null) {
            if (cari.data == nilai) {
                //keadaan sebelum -> [sebelum] -> [cari] -> [cari.next]
                //keadaan sesudah -> [sebelum.next] -> [cari.next], [cari] dilewati
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
            System.out.println("[!] cariData: List Kosong !!!");
        }

        bantu = head;
        int posisi = 1;

        while (bantu != null) {
            if (bantu.data == nilai) {
                System.out.println("[?] cariData (nilai=" + nilai + ") ditemukan di posisi (" + posisi + ")");
                return posisi;
            }
            bantu = bantu.next;
            posisi++;
        }

        System.out.println("[?] cariData (nilai=" + nilai + ") tidak ditemukan");
        return -1;
    }

    public static void main(String[] args) {
        SLLNC linkedlist = new SLLNC();
        linkedlist.insertDepan(5);
        linkedlist.insertDepan(2);
        linkedlist.insertDepan(7);
        linkedlist.insertBelakang(9);
        linkedlist.printSemua();
        System.out.println("Total node: " + linkedlist.size());
        System.out.println("");

//        linkedlist.hapusDepan();
//        linkedlist.hapusBelakang();
//        linkedlist.printSemua();
//        System.out.println("Total node: " + linkedlist.size());
//        System.out.println("");
//
//        linkedlist.hapusDepan();
//        linkedlist.hapusBelakang();
//        linkedlist.printSemua();
//        System.out.println("Total node: " + linkedlist.size());
//        System.out.println("");
//
//        linkedlist.hapusDepan();
//        linkedlist.hapusBelakang();
//        linkedlist.printSemua();
//        System.out.println("Total node: " + linkedlist.size());
//        System.out.println("");
        System.out.println("insertAt: sisipkan 11 di posisi 1 (=insertDepan)");
        linkedlist.insertAt(1, 11);
        linkedlist.printSemua();
        System.out.println("");

        System.out.println("insertAt: melebihi panjang list");
        linkedlist.insertAt(999, 77);
        System.out.println("");

        System.out.println("insertAt: posisi < 1");
        linkedlist.insertAt(0, 77);
        System.out.println("");

        System.out.println("insertAt: posisi 2");
        linkedlist.insertAt(2, 99);
        linkedlist.printSemua();
        System.out.println("");

        linkedlist.hapusByValue(99);
        linkedlist.printSemua();
        System.out.println("");

        linkedlist.hapusByValue(11);
        linkedlist.printSemua();
        System.out.println("");

        linkedlist.hapusByValue(9);
        linkedlist.printSemua();
        System.out.println("");

        linkedlist.hapusByValue(9999);
        linkedlist.printSemua();
        System.out.println("");
        
        linkedlist.cariData(7);
        linkedlist.cariData(2);
        linkedlist.cariData(5);
        linkedlist.cariData(10);

    }
}
