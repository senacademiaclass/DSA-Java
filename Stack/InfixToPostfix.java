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
public class InfixToPostfix {

    public static int precedence(char op) {//menentukan prioritas operator
        if (op == '+' || op == '-') {
            return 1;
        }
        if (op == '*' || op == '/') {
            return 2;
        }
        return 0;
    }

    public static String convert(String infix) {
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

    public static void main(String[] args) {
        String infix = "A+B*C";
        System.out.println("Postfix: " + convert(infix)); // ABC*+
    }
}

//1. operand -> tulis ke output
//2. operator:
//jika stack kosong -> push
//jika prioritas operator lebih tinggi -> push (*/ lebih tinggi daripada +-)
//jika prioritas operator lebih rendah/sama -> pop dahulu, baru push
//3. jika tanda kurung:
//( -> push
//) -> pop sampai ketemu (
//A+B*C
//A -> output -> A
//+ -> push
//B -> output -> AB
//* -> push (karena prioritas lebih tinggi)
//C -> output -> ABC
//pop semua operator -> *+
//hasil = ABC*+
