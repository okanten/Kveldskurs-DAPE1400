package no.olakanten.kveldskurs;

public class Lokker {
    public static void main(String[] args) {

        int[] karakterer = {3, 4, 2, 5, 4};
        // index i array starter på 0. Så element 0 her er 3
        // hvis jeg skriver ut karakterer[0] får jeg 3
        // Øv på dette

        int sum = 0;
        // Vi lager en for-løkke som kjører så lenge i er mindre enn lengden på arrayet med karakterene.
        for (int i = 0; i < karakterer.length; i++) {
            System.out.println(String.format("%d plusses med %d", sum, karakterer[i]));
            sum = sum + karakterer[i];
        }

        // En for-loop kan også skrives som en while løkke. Dette utgjør akkurat det samme som for-løkken over:
        int i = 0;
        int sumWhile = 0;
        while (i < karakterer.length) {
            System.out.println(String.format("%d plusses med %d", sumWhile, karakterer[i]));
            sumWhile += karakterer[i];
            i++;
        }
    }
}
