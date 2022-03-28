package com.demo1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController  {
    @FXML
    private Label welcomeText;
 /*   @FXML
    private Button btnbutton;
    @FXML
    private TextField textField;*/


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }


}