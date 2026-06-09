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
public class Node {
    //class yang berisi blueprint objeck double linked list circular

    int data;
    Node previous;
    Node next;

    public Node() {
    }

    public Node(int d) {
        data = d;
        previous = null;
        next = null;
    }
}
