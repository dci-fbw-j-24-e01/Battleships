package dci.j24e1.group1.battleships;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.net.URISyntaxException;

public class HelloController {
//    private Battleship battleship;

    @FXML
    private VBox box1;


    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private void initialize() {


        for (int i = 0; i < 10; i++) {
            HBox hBox = new HBox();
            for (int j = 0; j < 10; j++) {
                Button button = new Button();
                button.getProperties().put("x", i);
                button.getProperties().put("y", j);
                hBox.getChildren().add(button);

                button.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        Button button = (Button) event.getSource();
                        Object x = button.getProperties().get("x");
                        Object y = button.getProperties().get("y");
                    }
                });
            }
            box1.getChildren().add(hBox);
        }

    }


}

