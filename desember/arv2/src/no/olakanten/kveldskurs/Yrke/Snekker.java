package no.olakanten.kveldskurs.Yrke;

public class Snekker extends Yrke{

    public Snekker() {
        super("Snekker", 450000, 420000, 3);
    }

    public Snekker(String navn, int lonn) {
        super(navn, lonn, 420000, 3);
    }
}
