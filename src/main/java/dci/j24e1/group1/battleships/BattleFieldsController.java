package dci.j24e1.group1.battleships;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

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
        UserShips userShips = new UserShips(4);
        UserField userField = new UserField(userBox, userShips);
        //computerBox(userBox);
    }



}

