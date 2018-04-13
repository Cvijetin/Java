/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Start;

import java.util.Scanner;

/**
 *
 * @author Cvijetin
 */
public class Deseti {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[] slova = {' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        String[] morseova = {"    ", ". ___", "___ . . .", "___ . ___ .", "___ . .", ".", ". . ___ .", "___ ___ .", ". . . .", ". .", ". ___ ___ ___", "___ . ___", ". ___ . .", "___ ___", "___ .", "___ ___ ___", ". ___ ___ .", "___ ___ . ___", ". ___ .", ". . .", "_", ". . ___", ". . . ___", ". ___ ___", "___ . . ___", "___ . ___ ___", "___ ___ . .", ". ___ ___ ___ ___", ". . ___ ___ ___", ". . . ___ ___", ". . . . ___", ". . . . .", "___ . . . .", "___ ___ . . .", "___ ___ ___ . .", "___ ___ ___ ___ .", "___ ___ ___ ___ ___"};

        String textToChange = "";
        String newText = "";
        System.out.println("Unesite tekst koji želite prevesti u Morseov kod");
        textToChange = input.nextLine();

        textToChange = textToChange.toLowerCase();

        for (int i = 0; i < textToChange.length(); i++) {
            for (short j = 0; j < 37; j++) {
                if (textToChange.charAt(i) == slova[j]) {
                    newText += morseova[j];
                    newText += "   ";

                    break;
                }
            }
        }

        System.out.println("Tekst preveden u Morseov kod");
        System.out.println(newText);
    }
}
