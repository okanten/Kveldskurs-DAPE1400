package com.example.eks2020kontfx;

public class Observasjoner {
    private String dato;
    private double tempratur;
    private double nedbør;

    public Observasjoner(String dato, double tempratur, double nedbør) {
        this.dato = dato;
        this.tempratur = tempratur;
        this.nedbør = nedbør;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public double getTempratur() {
        return tempratur;
    }

    public void setTempratur(double tempratur) {
        this.tempratur = tempratur;
    }

    public double getNedbør() {
        return nedbør;
    }

    public void setNedbør(double nedbør) {
        this.nedbør = nedbør;
    }
}