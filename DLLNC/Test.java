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
public class Test {

    public static void main(String[] args) {
        DLLNC list = new DLLNC();

        list.insertDepan(6);
        list.insertDepan(3);
        list.insertDepan(9);
        list.insertBelakang(7);
        list.printDepan();
        list.printBelakang();
        System.out.println("Total Node: " + list.size());
        System.out.println("");
        
        list.insertAt(2, 15);
        list.printDepan();
        list.printBelakang();
        System.out.println("Total Node: " + list.size());
        System.out.println("");
        
        list.hapusDepan();
        list.printDepan();
        list.printBelakang();
        System.out.println("Total Node: " + list.size());
        System.out.println("");
        
        list.hapusBelakang();
        list.printDepan();
        list.printBelakang();
        System.out.println("Total Node: " + list.size());
        System.out.println("");
        
        list.insertBelakang(8);
        list.insertDepan(4);
        list.printDepan();
        list.cariData(15);
        list.cariData(3);
        list.cariData(6);
        list.cariData(8);
        list.cariData(11);
        System.out.println("");
        
        list.hapusByValue(4);
        list.printDepan();
        list.hapusByValue(8);
        list.printDepan();
        list.hapusByValue(3);
        list.printDepan();
        list.hapusByValue(10);
        System.out.println("");
        
        list.hapusBelakang();
        list.hapusDepan();
        list.hapusBelakang();
        list.hapusDepan();
        
    }
}
