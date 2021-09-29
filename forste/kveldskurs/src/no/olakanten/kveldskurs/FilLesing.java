package no.olakanten.kveldskurs;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilLesing {

    public static void main(String[] args) throws FileNotFoundException {
        // Se forelesningsnotater på try/catch
        try {
            File fil = new File("/tmp/navn.txt");
            Scanner myReader = new Scanner(fil);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        // Siden vi har try/catch kræsjer ikke programmet, og linjen under vil kjøres.
        // Fjerner vi try/catch vil programmet kræsje om filen ikke eksisterer og vil aldri skrive ut denne linjen.
        System.out.println("Programmet kjører");
    }
}
