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
public class StackAr {

    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackAr(int s) {
        maxSize = s;
        stackArray = new char[maxSize];
        top = -1;
    }

    public boolean isEmpty() {//memeriksa apakah stack kosong
        return top == -1;
    }

    public boolean isFull() {//memeriksa apakah stack penuh
        return top == maxSize - 1;
    }

    public int size() {//memeriksa banyak data yang ada pada stack
        return top + 1;
    }

    public void push(char j) {//menambahkan data ke dalam stack
        if (isFull()) {
            System.out.println("Stack Penuh! Tidak bisa push " + j);
            return;
        }
        stackArray[++top] = j;// ++top -> pre-increment, tambah dulu baru pakai
        //top = -1 => -1+1 = 0 => stackArray[0] = j
    }

    public char pop() {//mengambil data paling atas dari stack
        if (isEmpty()) {
            System.out.println("Stack Kosong! Tidak bisa pop");
            return '\0';// karaktek null
        }
        return stackArray[top--];// top-- => post-decrement, pakai dulu baru kurangi
        //top = 10 => stackArray[10] akan direturn terlebih dahulu
        //top = 10-1 = 9
    }

    public char peek() {//melihat data paling atas dari stack
        if (isEmpty()) {
            System.out.println("Stack Kosong! Tidak bisa peek");
            return '\0';
        }
        return stackArray[top];
    }

    public void displayStack() {
        System.out.print("Stack (bottom -> top): ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println("");
    }

    public void tampilStack() {
        System.out.print("Stack (top -> bottom): ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println("");
    }
}
//infix -> A+B -> operator terletak di tengah operand
//-> mudah dibaca manusia, membutuhkan (), memiliki prioritas operator */ lebih tinggi daripada +-

//prefix -> +AB -> operator terletak di depan operand
//-> lebih mudah diproses komputer, tidak butuh (), tidak ada aturan prioritas operator

//postfix -> AB+ -> operator terletak di belakang operand
//-> lebih mudah diproses komputer, tidak butuh (), tidak ada aturan prioritas operator