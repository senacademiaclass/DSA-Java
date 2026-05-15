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
public class Test {

    public static void main(String[] args) {
        SLLC list = new SLLC();

        list.insertDepan(5);
        list.insertDepan(2);
        list.insertDepan(7);
        list.insertBelakang(9);
        list.printSemua();
        System.out.println("Total node: " + list.size());
        System.out.println();
        
        list.insertDepan(6);
        list.printSemua();
        System.out.println("Total node: " + list.size());
        System.out.println();
        
        list.hapusDepan();
        list.printSemua();
        System.out.println("Total node: " + list.size());
        System.out.println();
        
        list.hapusBelakang();
        list.printSemua();
        System.out.println("Total node: " + list.size());
        System.out.println();
        
        list.insertBelakang(4);
        list.printSemua();
        System.out.println("Total node: " + list.size());
        System.out.println();
        
        list.insertAt(1, 11);
        list.printSemua();
        System.out.println("Total node: " + list.size());
        System.out.println();
        
        System.out.println("insertAt: melebihi panjang list");
        list.insertAt(10, 22);
        list.printSemua();
        System.out.println("Total node: " + list.size());
        System.out.println();
        
        System.out.println("insertAt: posisi < 1");
        list.insertAt(0, 33);
        list.printSemua();
        System.out.println("Total node: " + list.size());
        System.out.println();
        
        list.insertAt(3, 99);
        list.printSemua();
        System.out.println("Total node: " + list.size());
        System.out.println();
        
        list.hapusByValue(99);
        list.printSemua();
        System.out.println("Total node: "+list.size());
        System.out.println();
        
        list.hapusByValue(11);
        list.printSemua();
        System.out.println("Total node: "+list.size());
        System.out.println();
        
        list.hapusByValue(4);
        list.printSemua();
        System.out.println("Total node: "+list.size());
        System.out.println();
        
        list.cariData(8);
        list.cariData(2);
        list.cariData(5);
        list.cariData(10);
    }
}
