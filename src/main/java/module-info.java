module dev.rampmaster.pooejemplo1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;

    opens dev.rampmaster.pooejemplo1 to javafx.fxml;
    exports dev.rampmaster.pooejemplo1;
    exports dev.rampmaster.pooejemplo1.controller;
    opens dev.rampmaster.pooejemplo1.controller to javafx.fxml;
}