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
public class PostfixEvaluation {

    public static double evaluatePostfix(String expr) {
        StackEva stack = new StackEva(expr.length());

        //dibaca kiri ke kanan
        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);

            //jika angka (operand)
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');//karakter disimpan dalam kode ASCII
                // '2' - '0' = 50 - 48 = 2
                // '5' - '0' = 53 - 48 = 5
                
            } else {//jika operator, maka pop dua elemen, hitung hasilnya, lalu push hasil
                double b = stack.pop();
                double a = stack.pop();
                //pop b dulu, baru pop a
                // 2 3 -
                //push 2, push 3 [2, 3]
                //pop 3, pop 2, hitung

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
        String postfix = "23+4*"; //((2+3)*4
        System.out.println("Hasil Postfix: "+evaluatePostfix(postfix));
        
    }

}
