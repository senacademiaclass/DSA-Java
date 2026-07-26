/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack;

/**
 * youtube.com/@senacademia
 *
 * @author dsr
 */
public class StackTest {

    public static void main(String[] args) {
        StackAr stack = new StackAr(10);

        stack.push('p');
        stack.push('b');
        stack.push('6');
        stack.push('(');
        stack.push('%');

        System.out.println("Data stack paling atas: " + stack.peek());
        System.out.println("Ukuran stack: " + stack.size());
        System.out.println("Apakah stack kosong? " + stack.isEmpty());
        System.out.println("Apakah stack penuh " + stack.isFull());
        stack.displayStack();
        stack.tampilStack();

        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Data stack paling atas: " + stack.peek());
        System.out.println("Ukuran stack: " + stack.size());
        System.out.println("Apakah stack kosong? " + stack.isEmpty());
        System.out.println("Apakah stack penuh? " + stack.isFull());
        stack.displayStack();
        stack.tampilStack();
        System.out.println("");

        stack.push(']');
        stack.push('*');
        stack.push('&');
        stack.push('4');
        stack.push('g');
        stack.push('|');
        stack.push('~');
        stack.push('<');
        stack.push('v');
        System.out.println("Data stack paling atas: " + stack.peek());
        System.out.println("Ukuran stack: " + stack.size());
        System.out.println("Apakah stack kosong? " + stack.isEmpty());
        System.out.println("Apakah stack penuh? " + stack.isFull());
        stack.displayStack();
        stack.tampilStack();
        stack.push('A');

        while (!stack.isEmpty()) {
            System.out.println("Pop: " + stack.pop());
        }
        
        System.out.println("Pop: " + stack.pop());
    }
}
