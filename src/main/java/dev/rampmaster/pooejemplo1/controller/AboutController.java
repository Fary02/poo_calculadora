package dev.rampmaster.pooejemplo1.controller;

import dev.rampmaster.pooejemplo1.Navegador;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.io.IOException;

public class AboutController {
    @FXML private TextArea aboutText;
    @FXML private Button volverButton;

    public void inicializar(String texto){
        System.out.println("Iniciando "+texto);
        aboutText.setText(texto);
    }

    public TextArea getAboutText() {
        return aboutText;
    }

    public void setAboutText(TextArea aboutText) {
        this.aboutText = aboutText;
    }

    public Button getVolverButton() {
        return volverButton;
    }

    public void setVolverButton(Button volverButton) {
        this.volverButton = volverButton;
    }

    @FXML
    public void onVolver() throws IOException {
        HelloController controller = Navegador.navegar("hello-view.fxml","Calculadora");
        controller.inicializar("Iniciando");
    }
}
