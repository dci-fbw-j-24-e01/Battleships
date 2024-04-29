package dci.j24e1.group1.battleships;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import static dci.j24e1.group1.battleships.UserField.userBox;
import static dci.j24e1.group1.battleships.computerField.computerBox;


public class BattleFieldsController {
    @FXML
    private VBox computerBox;
    @FXML
    private VBox userBox;

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private void initialize() {
        userBox(computerBox);
        computerBox(userBox);
    }



}

