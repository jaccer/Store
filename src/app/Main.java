package app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;

        BorderPane layout = new BorderPane();
        window.setTitle("Store Manager");
        window.setScene(new Scene(layout, 800, 600));
        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
