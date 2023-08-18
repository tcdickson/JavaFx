package com.example.m5_assignment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Orientation;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
// implementing an initializable class to load immediately
public class HelloController implements Initializable {

 //adding the gridpane to reference in the below methods
    @FXML
    private GridPane matrix;
    // initializing the below method immediately. Creating a new instance of random. Then looping through rows and collums to insert the random number bound to 1 or 0.
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Random random = new Random();
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                int value = random.nextInt(2);
                Label label = new Label(String.valueOf(value));
                matrix.add(label, col, row);
            }
        }
    }
    // the below method resets the numbers to 0 using the same base code as the above method.
    @FXML
    private void resetTo0(ActionEvent event) {
        matrix.getChildren().clear();
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                int value = (0);
                Label label = new Label(String.valueOf(value));
                matrix.add(label, col, row);

            }
        }
    }
    // the below method resets the numbers to 1 using the same base code as the above method.
    @FXML
    private void resetTo1(ActionEvent event) {
        matrix.getChildren().clear();
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                int value = (1);
                Label label = new Label(String.valueOf(value));
                matrix.add(label, col, row);
            }
        }
    }
    // the below method resets the numbers to a random number using the same base code as the above method.
    @FXML
    private void resetRandomly(ActionEvent event) {
        matrix.getChildren().clear();
        Random random = new Random();
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                int value = random.nextInt(2);
                Label label = new Label(String.valueOf(value));
                matrix.add(label, col, row);
            }
        }
    }
}