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
public class ffos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//PRVI ZADATAK
        String broj = JOptionPane.showInputDialog("Unesi broj");

        int num1 = Integer.parseInt(broj);
        int sum = 0;
        for (int i = 1; i <= num1; i++) {
           sum += i;
            System.out.println(sum);
        }
    }
}
