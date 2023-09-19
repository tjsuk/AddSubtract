package com.example.addsubtract;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;

import java.util.Optional;

public class HelloController {
    Integer iCounter = 0;
    @FXML
    private Label lblAnswer = new Label(Integer.toString(iCounter));

    public Label getLblAnswer() {
        lblAnswer.setText(iCounter.toString());
        return lblAnswer;
    }

    @FXML
    protected void addToValue()
    {
        iCounter++;
        lblAnswer.setText(String.valueOf(iCounter));
    }

    @FXML
    protected void subtractFromValue()
    {
        iCounter--;
        // lblAnswer.setText(String.valueOf(iCounter));
        lblAnswer.setText(iCounter.toString());
    }

    @FXML
    protected void closeApplication()
    {
        Alert a = new Alert(Alert.AlertType.WARNING, "Are you sure?", ButtonType.YES, ButtonType.NO);
        Optional<ButtonType> r = a.showAndWait();
        if (r.isPresent() && r.get() == ButtonType.YES) {
            System.exit(0);
        }
    }
}