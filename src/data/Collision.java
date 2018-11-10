package data;

import game.ScoreItem;

import java.awt.*;

public class Collision {

    public static void collidePoint(int x, int y) {
      //  if (Map.scorepoints[x][y] != null) {
            if (Map.scorepoints[x][y].isEnabled()) {
                Map.scorepoints[x][y].setEnabled(false);
            }
      //  }

    }


    public static boolean collideWall(int x, int y) {
      /*  for (int i = 0; i < Map.colCo.size(); i++) {
            if (x == Map.colCo.get(i).x && y == Map.colCo.get(i).y) {
                return true;
            }
        }
        return false;*/
        // System.out.println(Map.collCo[x][y] + ", "+x+", "+y);
        return Map.collCo[x][y];
    }
}
