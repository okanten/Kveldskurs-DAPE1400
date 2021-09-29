package no.olakanten.kveldskurs;

public class Vare {

   private String navn;
   private int antall;
   private double pris;

   // Attributt-navnene i parantesen til konstruktøren (parametere) kan hete hva som helst.
   public Vare(String konstruktorNavn, int konstruktorAntall, double konstruktorPris) {
      // this. peker på _denne instansen_ av klassen. Et spesifikt objekt av Vare sine feltvariabler / attributter
      this.navn = konstruktorNavn;
      this.antall = konstruktorAntall;
      this.pris = konstruktorPris;
   }

   public int getAntall() {
      return this.antall;
   }

   public String getNavn() {
      return this.navn;
   }

   public void setNavn(String navn) {
      this.navn = navn;
   }

   public double totalpris() {
      return (this.antall * this.pris);
   }

}
