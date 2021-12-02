package no.olakanten.kveldskurs.Person;

import no.olakanten.kveldskurs.Yrke.Yrke;

public class Person {
    private String navn;
    private int alder;
    private long formue;
    private Yrke yrke;

    public Person() {

    }

    public Person(String navn, int alder) {
        this.navn = navn;
        this.alder = alder;
    }

    public Person(String navn, int alder, long formue) {
        this.navn = navn;
        this.alder = alder;
        this.formue = formue;
    }

    public Person(String navn, int alder, long formue, Yrke yrke) {
        this.navn = navn;
        this.alder = alder;
        this.formue = formue;
        this.yrke = yrke;
    }

    public long getFormue() {
        return this.formue;
    }

    public void setFormue(long nyFormue) {
        this.formue = nyFormue;
    }



}
