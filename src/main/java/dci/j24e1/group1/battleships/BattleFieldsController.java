package dci.j24e1.group1.battleships;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class BattleFieldsController {
    @FXML
    private VBox computerBox;

    @FXML
    private void initialize() {
        Field field = new Field(computerBox, new ComputerShips().getComputerShips());
    }

}