package dci.j24e1.group1.battleships;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class computerField {
    public static void computerBox(VBox box) {
        for (int i = 0; i < 10; i++) {
            HBox hBox = new HBox();

            for (int j = 0; j < 10; j++) {
                Button button = new Button();
                button.setMinHeight(30);
                button.setMinWidth(30);
                button.getProperties().put("x", i);
                button.getProperties().put("y", j);
                hBox.getChildren().add(button);
                button.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        Button button = (Button) event.getSource();
                        Object x = button.getProperties().get("x");
                        Object y = button.getProperties().get("y");
                        System.out.println(x);
                        System.out.println(y);
                    }
                });
            }
            box.getChildren().add(hBox);
        }
    }
}
