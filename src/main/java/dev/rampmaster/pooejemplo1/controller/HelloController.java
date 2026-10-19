package dev.rampmaster.pooejemplo1.controller;

import dev.rampmaster.pooejemplo1.Navegador;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label resultLabel;
    @FXML
    private TextField numOne;
    @FXML
    private TextField numTwo;

    public void inicializar(String texto){
        System.out.println("Iniciando "+texto);
    }

    @FXML
    protected void onSumar(){
        int a = Integer.parseInt(numOne.getText());
        int b = Integer.parseInt(numTwo.getText());
        int sum = a + b;
        resultLabel.setText(sum+"");
    }

    @FXML
    protected void onRestar(){
        int a = Integer.parseInt(numOne.getText());
        int b = Integer.parseInt(numTwo.getText());
        int resta = a - b;
        resultLabel.setText(resta+"");
    }

    @FXML
    protected void onMultiplicar(){
        int a = Integer.parseInt(numOne.getText());
        int b = Integer.parseInt(numTwo.getText());
        int multiplicacion = a * b;
        resultLabel.setText(multiplicacion+"");
    }

    @FXML
    protected void onDivision(){
        int a = Integer.parseInt(numOne.getText());
        int b = Integer.parseInt(numTwo.getText());
        String respuesta;
        try{
            int division = a / b;
            respuesta = division+"";
        }catch (ArithmeticException e){
            respuesta = "No se puede dividir por cero "+e.getLocalizedMessage();
        }

        resultLabel.setText(respuesta);
    }

    @FXML
    protected void onModulo(){
        int a = Integer.parseInt(numOne.getText());
        int b = Integer.parseInt(numTwo.getText());
        int modulo = a%b;
        resultLabel.setText(modulo+"");
    }

    @FXML
    protected void onAbout() throws IOException {
        AboutController controller = Navegador.navegar("about-view.fxml","Calculadora");
        controller.inicializar("Acerca de: Esta aplicacion es de DSY1102");
    }
}
