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
public class StackEva {

    private int maxSize;
    private double[] stackArray;
    private int top;

    public StackEva(int size) {
        maxSize = size;
        stackArray = new double[maxSize];
        top = -1;
    }

    public void push(double value) {
        stackArray[++top] = value;
    }

    public double pop() {
        return stackArray[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
