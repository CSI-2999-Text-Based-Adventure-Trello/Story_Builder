package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Story_Builder extends Application {
    
    public static String storyLocation = ".\\Story";
    public static String textNumber = null;
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/UI/FXMLDocument.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Monty Python and the Quest for the Holy Grail");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
