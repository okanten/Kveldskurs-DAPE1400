package no.olakanten.kveldskurs;

public class Forfatter {

    private String navn;
    private String født;

    public Forfatter(String navn, String fodt) {
        this.navn = navn;
        this.født = fodt;
    }

    public String getNavn() {
        return this.navn;
    }

    public String getFodt() {
        return this.født;
    }

    @Override
    public String toString() {
        return this.navn + " er fodt i " + this.født;
    }
}
