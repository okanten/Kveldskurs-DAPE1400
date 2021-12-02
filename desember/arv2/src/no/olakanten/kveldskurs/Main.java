package no.olakanten.kveldskurs;

import no.olakanten.kveldskurs.Person.Barn;
import no.olakanten.kveldskurs.Person.Person;
import no.olakanten.kveldskurs.Yrke.Snekker;

public class Main {

    public static void main(String[] args) {
        Person jens = new Person("Jens Petter", 45, 500000, new Snekker());
        Barn karl = new Barn("Karl Petter", 12, jens);
        Snekker andersen = new Snekker("Navn", 10000);

        System.out.println("Formuen til Jens");
        System.out.println(jens.getFormue());

        System.out.println("Formuen til Karl:");
        System.out.println(karl.getFormue());



    }
}
