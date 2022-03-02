package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {
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
                return i;
            }
        }
        return 0;
    }

    public int shiftInt(int talDerSkalShiftes, int shift) {
        int shiftetTal = talDerSkalShiftes + shift;
        if (shiftetTal<0){
            shiftetTal = 29 + shiftetTal; //29 er alfabetets længde
            return shiftetTal;
        }
        return shiftetTal;
    }

    public char inttilChar(int index) {
        // Vi skal kunne modtage små bogstaver og laver dem alle til store bogstaver
        // Vi skal finde en måde at lave char til .toUpperCase
        char[] alfabetet = {' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'X', 'Y', 'Z', 'Æ', 'Ø', 'Å'};

        char indexNummer = alfabetet[index];
        return indexNummer;
    }

    public void krypterTekst(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Indtast tekst som skal krypteres: ");
        String tekstStringDerSkalKrypteres = sc.nextLine();
        tekstStringDerSkalKrypteres = tekstStringDerSkalKrypteres.toUpperCase(Locale.ROOT);
        System.out.println();
        System.out.print("Indtast tal, som teksten skal shiftes med: ");
        int shift = sc.nextInt();
        System.out.println();

        Main obj = new Main();
        System.out.println("Denne tekst: ");
        System.out.println(tekstStringDerSkalKrypteres);
        System.out.println("Bliver til dette: ");


        String tekst = tekstStringDerSkalKrypteres;
        // Vi skal dele String op til bogstaver
        for (int perBogstav = 0; perBogstav < tekst.length(); perBogstav++) {

            //Her spytter den per bogstav ud som en String
            String StringTekstTilBogstav = (tekst.substring(perBogstav, perBogstav + 1));

            //String bogstaver laves til Char bogstaver
            char StringBogstavTilChar = StringTekstTilBogstav.charAt(0);

            // Laver en char om til int
            int tal = obj.charTilInt(StringBogstavTilChar);

            // vi Shifter Int
            int shiftetTal = obj.shiftInt(tal, shift);

            // Tage det shiftede Int og lav det om til en Char
            char krypteretTekst = obj.inttilChar(shiftetTal);


            // konkatenere char
            System.out.print(krypteretTekst);
            //Lav en metode som kan tage tekstTilKryption og finde deres index værdi i alfabetet
        }
    }

    public void dekrypterTekst(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Indtast tekst som skal dekrypteres: ");
        String tekstStringDerSkalKrypteres = sc.nextLine();
        tekstStringDerSkalKrypteres = tekstStringDerSkalKrypteres.toUpperCase(Locale.ROOT);
        System.out.println();
        System.out.print("Indtast tal, som teksten skal shiftes med: ");
        int shift = sc.nextInt();
        shift = shift*-1; //Shift ændres
        System.out.println();

        Main obj = new Main();
        System.out.println("Denne tekst: ");
        System.out.println(tekstStringDerSkalKrypteres);
        System.out.println("Bliver til dette: ");


        String tekst = tekstStringDerSkalKrypteres;
        // Vi skal dele String op til bogstaver
        for (int perBogstav = 0; perBogstav < tekst.length(); perBogstav++) {

            //Her spytter den per bogstav ud som en String
            String StringTekstTilBogstav = (tekst.substring(perBogstav, perBogstav + 1));

            //String bogstaver laves til Char bogstaver
            char StringBogstavTilChar = StringTekstTilBogstav.charAt(0);

            // Laver en char om til int
            int tal = obj.charTilInt(StringBogstavTilChar);

            // vi Shifter Int
            int shiftetTal = obj.shiftInt(tal, shift);

            // Tage det shiftede Int og lav det om til en Char
            char krypteretTekst = obj.inttilChar(shiftetTal);


            // konkatenere char
            System.out.print(krypteretTekst);
            //Lav en metode som kan tage tekstTilKryption og finde deres index værdi i alfabetet
        }
    }

    public static void main(String[] args) {
        // write your code here
        Main obj = new Main();
        Scanner sc = new Scanner(System.in);

        //Velkommen
        System.out.println("Velkommen til Ferhats krypteringsprogram!");
        System.out.println();

        System.out.println("Vil du kryptere eller dekryptere en tekst?");
        System.out.println("Skriv K eller D");
        String brugerValg = sc.nextLine();
        brugerValg = brugerValg.toUpperCase(Locale.ROOT);

        if (brugerValg == "S"){
            obj.krypterTekst();
        } else{
            obj.dekrypterTekst();
        }

        // Få brugeren til at indtaste tekst som skal krypteres

    }
}
