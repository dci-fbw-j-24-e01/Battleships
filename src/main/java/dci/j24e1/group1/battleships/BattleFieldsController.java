package dci.j24e1.group1.battleships;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class BattleFieldsController {
    @FXML
    public Label messageText;
    @FXML
    private VBox computerBox;

    @FXML
    private void initialize() {
        Ships computerShips = new Ships();
        Field field = new Field(computerBox, computerShips.getShips());

        for (int i = 0; i < computerShips.getShips().length; i++) {
            for (int j = 0; j < computerShips.getShips()[i].length; j++) {
                if (computerShips.getShips()[i][j].getId() == 0) {
                    System.out.print(computerShips.getShips()[i][j].getId() + "  ");
                } else {
                    System.out.print(computerShips.getShips()[i][j].getId() + " ");
                }
            }
            System.out.println();
        }
    }

}