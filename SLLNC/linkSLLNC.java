/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SLLNC;

/**
 * youtube.com/@senacademia
 *
 * @author dsr
 */
//head -> [7|*] -> [2|*] -> [5|null]

public class linkSLLNC {
    //class hanya berisi data node dan pointer next

    public int data;
    public linkSLLNC next;

    //constructor kosong
    public linkSLLNC() {
    }

    //constructor berisi data
    public linkSLLNC(int d) {
        data = d;
        next = null;
    }

    public void displaynode() {
        System.out.print(data + "");
    }
}
