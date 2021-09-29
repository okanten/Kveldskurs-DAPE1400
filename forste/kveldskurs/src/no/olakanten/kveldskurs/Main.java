package no.olakanten.kveldskurs;

public class Main {

    public static void main(String[] args) {
        // Oppretter en ny vare
        Vare vare1 = new Vare("melk", 1, 10);
        // Henter ut varenavnet og setter det til en ny String
        String vareNavn = vare1.getNavn();
        System.out.println(vareNavn);
        // Selv om vi endrer vareNavn vil ikke verdien i vare1 bli endret. Disse oppdaterer ikke hverandre automatisk
        vareNavn = "Fløte";
        System.out.println(vare1.getNavn());

        // Hvis vi vil kan vi oppdatere vare1 sitt navn med variabelen vareNavn, som nå er lik "Fløte"
        vare1.setNavn(vareNavn);
        // Dette kan også skrives slik
        // vare1.setNavn("Fløte");

        System.out.println(vare1.getNavn());
        Vare vare2 = new Vare("Brod", 2, 10);
        System.out.println(vare2.getNavn());
    }
}
