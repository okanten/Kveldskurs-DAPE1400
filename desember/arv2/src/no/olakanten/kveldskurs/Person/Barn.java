package no.olakanten.kveldskurs.Person;

public class Barn extends Person {
    private Person forelder;

    public Barn(String navn, int alder, long formue, Person forelder) {
        super(navn, alder, formue);
        this.forelder = forelder;
        overforFormue();
    }

    public Barn(String navn, int alder, Person forelder) {
        super(navn, alder, 0);
        this.forelder = forelder;
        overforFormue();
    }

    public void overforFormue() {
        long pappasBank = this.getForelder().getFormue();
        long minBank = this.getFormue();
        long fraPappa = (long) (pappasBank * 0.10);
        this.setFormue(minBank + fraPappa);
        this.getForelder().setFormue(pappasBank - fraPappa);
    }

    public Person getForelder() {
        return this.forelder;
    }

}
