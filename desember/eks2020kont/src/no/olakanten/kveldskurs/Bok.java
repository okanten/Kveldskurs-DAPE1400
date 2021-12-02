package no.olakanten.kveldskurs;

public class Bok {
    private String tittel;
    private Forfatter forfatter;

    public Bok(String tittel, Forfatter forfatter) {
        this.tittel = tittel;
        this.forfatter = forfatter;
    }


    @Override
    public String toString() {
        return this.tittel + " er skrevet av " + this.forfatter.toString();
    }

}
