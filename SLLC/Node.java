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
public class Node {
//class ini berisi data node dan pointer next
    int data;
    Node next;
    
    //contructtor kosong
    public Node(){}
    
    //constructor berisi data
    public Node (int d){
        data = d;
        next = null;
    }
}
