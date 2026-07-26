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
public class PrefixEvaluation {

    public static double evaluatePrefix(String expr) {
        StackEva stack = new StackEva(expr.length());

        //dibaca kanan ke kiri
        for (int i = expr.length() - 1; i >= 0; i--) {
            char ch = expr.charAt(i);

            //jika angka (operand)
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');//karakter disimpan dalam kode ASCII
                // '2' - '0' = 50 - 48 = 2
                // '5' - '0' = 53 - 48 = 5

            } else {//jika operator, maka pop dua elemen, hitung hasilnya, lalu push hasil
                double a = stack.pop();
                double b = stack.pop();
                //pop a dulu, baru pop b
                // - 2 3 
                //push 3, push 2 [3, 2]
                //pop 2, pop 3, hitung

                switch (ch) {
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                        break;
                    case '*':
                        stack.push(a * b);
                        break;
                    case '/':
                        stack.push(a / b);
                        break;
                }

            }
        }
        return stack.pop();
    }
    
    public static void main(String[] args) {
        String prefix= "*+234";// (2+3)*4
        System.out.println("Hasil Prefix: "+evaluatePrefix(prefix));
    }
}
