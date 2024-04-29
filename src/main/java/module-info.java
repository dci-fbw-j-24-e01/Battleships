module dci.j24e1.group1.battleships {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens dci.j24e1.group1.battleships to javafx.fxml;
    exports dci.j24e1.group1.battleships;
}