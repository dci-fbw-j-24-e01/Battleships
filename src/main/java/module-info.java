module dci.j24e1.group1.battleships {
    requires javafx.controls;
    requires javafx.fxml;


    opens dci.j24e1.group1.battleships to javafx.fxml;
    exports dci.j24e1.group1.battleships;
}