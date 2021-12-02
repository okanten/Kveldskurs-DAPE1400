package com.example.eks2020kontfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;
//import arraylist

public class Controller {
    // legg inn en ArrayList kalt register her (av type Observasjoner)
    ArrayList<Observasjoner> observasjonsListe = new ArrayList<>();
    @FXML
    private Label lblSnittRegn;
    @FXML
    private Label lblSnittTemp;
    @FXML
    private TextField txtDato;
    @FXML
    private TextField txtTemp;
    @FXML
    private TextField txtRegn;
    @FXML
    void btnRegistrerVær(ActionEvent event) {
        // legg inn kode her
        String dato = txtDato.getText();
        double temp = Double.parseDouble(txtTemp.getText());
        double nedbor = Double.parseDouble(txtRegn.getText());

        Observasjoner observasjon = new Observasjoner(dato, temp, nedbor);
        observasjonsListe.add(observasjon);
    }
    @FXML
    void btnSnittRegn(ActionEvent event) {
        // legg inn kode her
        double sum = 0;
        for(Observasjoner observasjon: observasjonsListe) {
            sum += observasjon.getNedbør();
        }

        double gjennomsnitt = (sum / observasjonsListe.size());

        lblSnittRegn.setText(String.valueOf(gjennomsnitt));

    }
    @FXML
    void btnSnittTemperatur(ActionEvent event) {

        double sum = 0;
        for(Observasjoner observasjon: observasjonsListe) {
            sum += observasjon.getTempratur();
        }

        double gjennomsnitt = (sum / observasjonsListe.size());

        lblSnittRegn.setText(String.valueOf(gjennomsnitt));

    }
    @FXML
    void btnSlettRegister(ActionEvent event) {
        // legg inn kode her
        lblSnittRegn.setText("");
        lblSnittTemp.setText("");
        txtDato.setText("");
        txtRegn.setText("");
        txtTemp.setText("");
        observasjonsListe.clear();
    }
}