//Tyler Dickson
//CSC2040C00 Java Programming
// This program will generate random numbers in a matrix Using JavaFx.

package com.example.m5_assignment;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {

    //Setting the stage, scene, loading the fxml to reference, and loading the CSS document to reference. Also, here we set the initial size of the scene.
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 500);
        String css = Objects.requireNonNull(this.getClass().getResource("css.css")).toExternalForm();
        scene.getStylesheets().add(css);
        stage.setTitle("Random Matrix Generator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}