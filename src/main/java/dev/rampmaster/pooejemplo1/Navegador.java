package dev.rampmaster.pooejemplo1;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public final class Navegador {
    private static final String RUTA_VISITAS = "dev/rampmaster/pooejemplo1";
    private static Stage stage;

    public Navegador() {}

    public static Stage getStage() {
        return stage;
    }

    public static void setStage(Stage stage) {
        Navegador.stage = stage;
    }

    public static <T> T navegar(String fxml, String titulo) throws IOException {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxml));
            Parent root = fxmlLoader.load();
            if (stage.getScene() == null) {
                stage.setScene(new Scene(root, 600, 250));
            }else{
                stage.getScene().setRoot(root);
            }
            stage.setTitle(titulo);
            return fxmlLoader.getController();
        }catch (IOException e){
            throw new IllegalStateException("No se puede cargar la vista: "+fxml);
        }
    }
}
