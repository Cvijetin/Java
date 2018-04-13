/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Start;

import java.util.Scanner;
import javax.swing.JOptionPane;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author Cvijetin
 */
public class kalkultaor {

    public static void main(String[] args) {

        
        String broj1 = JOptionPane.showInputDialog("Unesi prvi broj");
        int num1 = Integer.parseInt(broj1);
        String broj2 = JOptionPane.showInputDialog("Unesi drugi broj");
        int num2 = Integer.parseInt(broj2);

        String operacija = JOptionPane.showInputDialog("Unesi operaciju (+ ili *)");

        if (operacija.equals("+")) {
            JOptionPane.showMessageDialog(null, "Vaš rezultat je " + " " + (num1 + num2));
        }
        if (operacija.equals("*")) {
            JOptionPane.showMessageDialog(null, "Vaš rezultat je " + " " + (num1 * num2));
        }

    }
}
