/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predavanje4;

/**
 *
 * @author Korisnik
 */
public class Zadatak {

    public static void main(String[] args) {
        Integer[] niz = {8, 2, 6, 7, 0, 1, 4, 9, 5, 3};

        for (int i = niz.length; i > 0; i--) {
            System.out.print(niz[i - 1] + " ");
        }

    }
}
