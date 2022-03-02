package com.company;

import java.util.Scanner;

public class Main {
    public char stringTilChar(String tekstStringDerSkalKrypteres){
        // Vi skal dele String op til bogstaver
        // Derefter skal bogstavets tal findes
        // Derefter skal tallet shiftes
        // Efter shiftet skal tallet laves om til char igen
            //Dette loopes og plusses sammen med det tidligere loop


        String tekst = tekstStringDerSkalKrypteres;
        // Vi skal dele String op til bogstaver
        for (int perBogstav = 0; perBogstav < tekst.length(); perBogstav++){
            String StringTekstTilBogstav = (tekst.substring(perBogstav,perBogstav+1));
            //String bogstaver laves til Char bogstaver
            char StringBogstavTilChar = StringTekstTilBogstav.charAt(0);
            charTilInt(StringBogstavTilChar);
        }

        char bogstav;

        return 0;
    }
    public int charTilInt(char bogstav) {
        //Der skal laves en metode, som modtager en char og laver den om til tal i alfabetet

        //Vi kan starte med at lave et aray af alfabetet, så vi har positionen i alfabetet
        char[] alfabetet = {' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
            'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'X', 'Y', 'Z', 'Æ', 'Ø', 'Å'};

        //Så skal der laves et loop, som tager vores bogstav,
        // og looper gennemd et indtil den matcher med alfabetet
        // Hvis den finder et match så skal den skrive matchets index tal ud
        for (int i = 0; alfabetet.length >= i; i++) {
            if (alfabetet[i] == bogstav) {
                System.out.println(i);
                return i;
            }
        }
        return 0;
    }
    public char inttilChar(int index) {
        // Vi skal kunne modtage små bogstaver og laver dem alle til store bogstaver
        // Vi skal finde en måde at lave char til .toUpperCase
        char[] alfabetet = {' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'X', 'Y', 'Z', 'Æ', 'Ø', 'Å'};

        char indexNummer = alfabetet[index];
        return indexNummer;
    }

    public static void main(String[] args) {
	// write your code here

        //Velkommen
        System.out.println("Velkommen til Ferhat krypteringsprogram!");
        System.out.println();

        // Få brugeren til at indtaste tekst som skal krypteres
        Scanner sc = new Scanner(System.in);
        System.out.print("Indtast tekst som skal krypteres: ");
        String tekstTilKryption = sc.nextLine();
        System.out.println();
        System.out.print("Indtast tal, som teksten skal shiftes med: ");
        int talTilShift = sc.nextInt();
        System.out.println();

        //Lav en metode som kan tage tekstTilKryption og finde deres index værdi i alfabetet
    }
}
