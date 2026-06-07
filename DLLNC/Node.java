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
public class Node {
    //class ini berfungsi sebagai blueprint objek double linked list
    
    int data;
    Node prev;
    Node next;
    
    //constructor kosong
    public Node(){}
    
    //constructor berisi data
    public Node(int d){
        data = d;
        prev = null;
        next = null;
    }
}
