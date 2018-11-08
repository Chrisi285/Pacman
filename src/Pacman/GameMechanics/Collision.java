package Pacman.GameMechanics;

import Pacman.Setup.Map;

public class Collision {

    public static void collidePoint(int x, int y) {

        for (int i = 0; i < Map.scorepoint.size(); i++) {
            if (x == Map.scorepoint.get(i).getX() && y == Map.scorepoint.get(i).getY()) {
                Map.scorepoint.get(i).setEnabled(false);
            }
        }

    }


    public static boolean collideWall(int x, int y) {
        for (int i = 0; i < Map.colCo.size(); i++) {
            if (x == Map.colCo.get(i).x && y == Map.colCo.get(i).y) {
                return true;
            }
        }
        return false;
    }
}
