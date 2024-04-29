package dci.j24e1.group1.battleships;

import java.util.HashMap;

public class UserShips {
    private Ship[] ship;

    public UserShips(int count) {
        ship = new Ship[count];
        for (int i = 0; i < count; i++) {
            ship[i] = new Ship(0, i);
        }
    }

    public Ship[] getShip() {
        return ship;
    }
}
