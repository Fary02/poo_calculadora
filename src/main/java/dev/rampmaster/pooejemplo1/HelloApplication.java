package dev.rampmaster.pooejemplo1;

import dev.rampmaster.pooejemplo1.controller.HelloController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Navegador.setStage(stage);
        stage.setMinWidth(600);
        stage.setMinHeight(250);
        HelloController controller = Navegador.navegar("hello-view.fxml","Calculadora");
        controller.inicializar("Iniciando");
        stage.show();
    }
}
