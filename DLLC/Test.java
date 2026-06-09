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
public class Test {

    public static void main(String[] args) {
        DLLC list = new DLLC();
        
        list.insertDepan(5);
        list.insertDepan(2);
        list.insertDepan(7);
        list.insertBelakang(9);
        list.printDepan();
        list.printBelakang();
        System.out.println("Total Node: "+list.size());
        System.out.println("");
        
        list.hapusDepan();
        list.printDepan();
        list.printBelakang();
        System.out.println("Total Node: "+list.size());
        System.out.println("");
        
        list.hapusBelakang();
        list.printDepan();
        list.printBelakang();
        System.out.println("Total Node: "+list.size());
        System.out.println("");
        
        list.insertAt(-1, 15);
        list.printDepan();
        list.printBelakang();
        System.out.println("Total Node: "+list.size());
        System.out.println("");
        
        list.insertAt(2, 25);
        list.printDepan();
        list.printBelakang();
        System.out.println("Total Node: "+list.size());
        System.out.println("");
        
        list.insertAt(1, 11);
        list.printDepan();
        list.printBelakang();
        System.out.println("Total Node: "+list.size());
        System.out.println("");
        
        list.insertAt(5, 99);
        list.printDepan();
        list.printBelakang();
        System.out.println("Total Node: "+list.size());
        System.out.println("");
        
        list.insertAt(13, 66);
        list.printDepan();
        list.printBelakang();
        System.out.println("Total Node: "+list.size());
        System.out.println("");
        
        list.hapusDepan();
        list.printDepan();
        list.printBelakang();
        System.out.println("Total Node: "+list.size());
        System.out.println("");
        
        list.hapusBelakang();
        list.printDepan();
        list.printBelakang();
        System.out.println("Total Node: "+list.size());
        System.out.println("");
        
        list.hapusByValue(25);
        list.printDepan();
        list.printBelakang();
        System.out.println("Total Node: "+list.size());
        System.out.println("");
        
        list.hapusByValue(5);
        list.printDepan();
        list.printBelakang();
        System.out.println("Total Node: "+list.size());
        System.out.println("");
        
        list.hapusByValue(2);
        list.printDepan();
        list.printBelakang();
        System.out.println("Total Node: "+list.size());
        System.out.println("");
        
        list.insertDepan(5);
        list.insertDepan(2);
        list.insertDepan(7);
        list.insertBelakang(9);
        list.printDepan();
        list.printBelakang();
        System.out.println("Total Node: "+list.size());
        System.out.println("");
        
        list.cariData(2);
        list.cariData(9);
        list.cariData(7);
        list.cariData(10);
        list.printDepan();
        list.printBelakang();
        System.out.println("Total Node: "+list.size());
        System.out.println("");
        
    }
}
