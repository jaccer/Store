package sample;

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
        window.setTitle("Hello World");
        window.setScene(new Scene(layout, 300, 275));
        window.show();

        System.out.println("hi");
    }


    public static void main(String[] args) {
        launch(args);
    }
}
