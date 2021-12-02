package no.olakanten.kveldskurs;

public class KonverterTemperatur {

   //Lag en klasse kalt KonverterTemperatur. Denne klassen skal inneholde to statiske metoder kalt
    //tilCelsius og tilFahrenheiht.  Metodene skal regne ut fra Fahernheit til Celsius i den ene metoden og motsatt i
    //den andre. Metodene skal motta og returnere et desimal tall.
    //
    //Formelene for konverteringene er:
    //C = (F - 32) / 1.8
    //F = C * 1.8 + 32
    //
    //Skriv så kode i main-metoden for å vise hvordan man benytter seg av klassen / metodene :

    public static double tilCelsius(double fahrenheiht) {
        double celsius = (fahrenheiht - 32) / 1.8;
        return celsius;
    }

    public static double tilFahrenheiht(double celsius) {
        double fahrenheiht = (celsius * 1.8) + 32;
        return fahrenheiht;
    }

    public static void main(String args[]) {
        // Oppgave 2
        System.out.println("Til Celsius: ");
        System.out.println(tilCelsius(47));
        System.out.println("Til fahrenheiht");
        System.out.println(tilFahrenheiht(20));

        // Oppgave 3
        Forfatter nesbo = new Forfatter("Jo Nesbo", "1970");
        Bok bok = new Bok("Sorgenfri", nesbo);
        System.out.println(bok);
    }

}
