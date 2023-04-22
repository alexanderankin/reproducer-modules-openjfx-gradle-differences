package com.example.fx.examplejavafx;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;

import static java.awt.Event.ESCAPE;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Parent parent = fxmlLoader.load();
        Scene scene = new Scene(parent, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        stage.addEventHandler(KeyEvent.KEY_TYPED, keyEvent -> {
            if (keyEvent.getCharacter().charAt(0) == ESCAPE) {
                stage.close();
                stage.hide();
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}
