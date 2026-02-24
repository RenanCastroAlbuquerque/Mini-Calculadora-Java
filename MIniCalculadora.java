package fundamentos.Exercicios;

import javax.swing.*;

public class MIniCalculadora {
    public static void main(String[]args) {
        Double num1 = Double.parseDouble(JOptionPane.showInputDialog("Escolha o primeiro numero"));
        Double num2 = Double.parseDouble(JOptionPane.showInputDialog("Escolha o segundo numero "));
        String operator = JOptionPane.showInputDialog("Escolha a operação matemática ");

        if (operator.equals("+")) {
            JOptionPane.showMessageDialog(null, num1 + num2);
        } else if (operator.equals("-")) {
            JOptionPane.showMessageDialog(null, num1 - num2);
        } else if (operator.equals("*")) {
            JOptionPane.showMessageDialog(null, num1 * num2);
        } else if (operator.equals("/")) {
                JOptionPane.showMessageDialog(null, num1 / num2);
            }else{
                JOptionPane.showMessageDialog(null, "Error 404 not found");
        }
    }
}
