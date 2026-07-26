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
public class InfixToPrefix {
    //reverse infix
    //tukar ( menjadi ) dan sebaliknya
    //konversi ke postfix
    //reverse hasilnya

    public static int precedence(char op) {//menentukan prioritas operator
        if (op == '+' || op == '-') {
            return 1;
        }
        if (op == '*' || op == '/') {
            return 2;
        }
        return 0;
    }

    //reverse infix dan tukar ( menjadi ) dan sebaliknya
    public static String reverse(String infix) {
        String result = "";

        for (int i = infix.length() - 1; i >= 0; i--) {
            char ch = infix.charAt(i);

            if (ch == '(') {
                result += ')';
            } else if (ch == ')') {
                result += '(';
            } else {
                result += ch;
            }
        }
        return result;
    }

    public static String infixToPostfix(String infix) {
        StackAr stack = new StackAr(infix.length());
        String output = "";

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);

            if (Character.isLetterOrDigit(ch)) {//jika operand huruf / angka
                output += ch;
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    output += stack.pop();
                }
                stack.pop();//buang (
            } else {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)) {
                    output += stack.pop();
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {//keluarkan sisa operator
            output += stack.pop();
        }
        return output;
    }

    public static String convert(String infix) {
        String reversed = reverse(infix);
        String postfix = infixToPostfix(reversed);

        return new StringBuilder(postfix).reverse().toString();//reverse hasil menjadi prefix
    }
    
    public static void main(String[] args) {
        String infix = "(A+B)*C";
        System.out.println("Prefix: "+convert(infix));// *+ABC
    }
}
