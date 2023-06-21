package ifpr.pgua.eic.exemplo.controllers;

import ifpr.pgua.eic.exemplo.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class TelaPrincipal {

    @FXML
    void abrirTelaCadastro(ActionEvent event) {
        App.pushScreen("CADASTRO");
    }

    @FXML
    void abrirTelaVizualizar(ActionEvent event) 
    {
        App.pushScreen("VIZUALIZAR");
    }

}
