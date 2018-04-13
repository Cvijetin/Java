/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Start;

import javax.swing.JOptionPane;

/**
 *
 * @author Cvijetin
 */
public class Osmi {

    public static void main(String[] args) {
        String broj = JOptionPane.showInputDialog("Unesi broj");
        int num1 = Integer.parseInt(broj);

        for (int i = 0; i < num1; i++) {
            System.out.println(num1);

        }
    }
}
