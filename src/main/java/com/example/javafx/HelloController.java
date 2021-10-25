package com.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    TextArea chatText;
    @FXML
    TextField inputText;

    @FXML
    protected void onHelloButtonClick(ActionEvent actionEvent) {
        chatText.appendText(inputText.getText() + "\n" );
    }
}