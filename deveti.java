/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Start;

import java.util.Random;

/**
 *
 * @author Cvijetin
 */
public class Deveti {

    public static void main(String[] args) {

        String[] niz = {"A", "b", "N", "g", "t", "M", "R", "p", "q", "o", "D", "C"};
        Random r = new Random();

        int red = 0;
        int i = 0;

        for (;;) {
            if (++red % 50 == 0) {
                System.out.println("");
               try {
                    Thread.sleep(100);
                } catch (Exception e) {

                }
            }
            if (--i < 0) {
                System.out.print(niz[r.nextInt(niz.length - 1 - 0 + 1) + 0]);
            }

        }

    }
}
