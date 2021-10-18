package bsu.comp152.firstjavafxmonwed;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Paint;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
        var textColor = Paint.valueOf("Green");
        welcomeText.setTextFill(textColor);
        welcomeText.setText("Welcome to Java FX comp 152!!");
    }
}