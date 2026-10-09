package dev.rampmaster.pooejemplo1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label resultLabel;
    @FXML
    private TextField numOne;
    @FXML
    private TextField numTwo;

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
}
