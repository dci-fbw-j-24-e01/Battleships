package dci.j24e1.group1.battleships;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.util.Arrays;

public class BattleFieldsController {
    @FXML
    private VBox computerBox;

    @FXML
    private void initialize() {
        Ships computerShips = new Ships();
        Field field = new Field(computerBox, computerShips.getShips());
        for (int i = 0; i < computerShips.getShips().length; i++) {
            System.out.println(Arrays.toString(computerShips.getShips()[i]));
        }
    }

}