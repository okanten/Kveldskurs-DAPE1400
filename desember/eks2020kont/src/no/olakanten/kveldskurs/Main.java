package no.olakanten.kveldskurs;

public class Main {

    public static void main(String[] args) {
        int [] liste = {1,3,6,2,7,10,23,6,3,6};

       //a) Skriv ut arrayet på System.out med mellomrom mellom. Bruk en foreach-løkke.
        //b) Skriv ut arrayet på System.out baklengs med mellomrom mellom (6 3 6 23 10 7 2 6 3 1). Bruk en for-løkke.
        //c) Regn ut gjennomsnittet av tallene i arrayet og skriv resultatet på System.out. Bruk en while-løkke.

        // a
        for(int i: liste) {
            System.out.print(i + " ");
        }

        System.out.println("");
        // b
        for (int i = (liste.length - 1); i >= 0; i--) {
            System.out.print(liste[i] + " ");
        }

        System.out.println("");
        int i = 0;
        double sum = 0;
        while(i < liste.length) {
            sum += liste[i];
            i++;
        }

        double gjennomsnittRegn = gjennomsnitt(sum, liste.length);

        System.out.print(gjennomsnittRegn);


    }

    public static double gjennomsnitt(double sum, int antall) {
        return (sum / antall);
    }
}
