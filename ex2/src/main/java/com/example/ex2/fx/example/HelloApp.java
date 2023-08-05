package com.example.ex2.fx.example;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
// import lombok.SneakyThrows;

public class HelloApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private Parent createContent() {
        return new StackPane(new Text("Hello World"));
    }

    // @SneakyThrows
    @Override
    public void start(Stage stage) {
        stage.setScene(new Scene(createContent(), 300, 300));
        stage.show();
    }
}
