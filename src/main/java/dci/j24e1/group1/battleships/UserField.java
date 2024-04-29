package dci.j24e1.group1.battleships;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class UserField {
    private VBox buttons;
    private UserShips ships;

    public UserField(VBox vbox, UserShips ships) {
        this.buttons = vbox;
        this.ships = ships;
        userBox();
    }


    public void userBox() {
        for (int i = 0; i < 10; i++) {
            HBox hBox = new HBox();
            for (int j = 0; j < 10; j++) {
                Button button = createButton(i, j);
                hBox.getChildren().add(button);
            }
            buttons.getChildren().add(hBox);
        }
    }

    private Button createButton(int i, int j) {
        Button button = new Button();
        button.setMinHeight(30);
        button.setMinWidth(30);
        button.getProperties().put("x", i);
        button.getProperties().put("y", j);
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Button button = (Button) event.getSource();
                Object x = button.getProperties().get("x");
                Object y = button.getProperties().get("y");

                if ((int)x == ships.getShip()[0].getX() && (int)y == ships.getShip()[0].getY()) {
                    //System.out.println("true");
                    button.setDisable(true);
                    button.setStyle("-fx-background-color: #000000");
                }

                System.out.println("x = " + j + " y = " + i);
            }
        });
        return button;
    }
}
