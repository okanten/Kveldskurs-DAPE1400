package no.olakanten.kveldskurs.Yrke;

public abstract class Yrke {
    private String navn;
    private double lonn;
    private double startlonn;
    private double okningsProsent;

    public Yrke(String navn, double lonn, double startlonn, double okningsProsent) {
        this.navn = navn;
        this.lonn = lonn;
        this.startlonn = startlonn;
        this.okningsProsent = okningsProsent;
    }

    public String getNavn() {
        return this.navn;
    }

    public double getLonn() {
        return this.lonn;
    }

    public double getStartlonn() {
        return this.startlonn;
    }

    public double getOkningsProsent() {
        return this.okningsProsent;
    }

    public void setNavn(String nyttNavn) {
        this.navn = nyttNavn;
    }

    public void setLonn(double nyLonn) {
        this.lonn = nyLonn;
    }



}
