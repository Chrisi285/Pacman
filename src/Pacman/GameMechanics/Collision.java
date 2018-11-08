package Pacman.GameMechanics;

import Pacman.Setup.GameMaster;
import Pacman.Setup.Map;

import java.util.Timer;
import java.util.TimerTask;

public class Collision {

    public static boolean collideWall(int x, int y){
        for(int i = 0; i< Map.colCo.size(); i++){
            if (x == Map.colCo.get(i).x && y == Map.colCo.get(i).y){
                return true;
            }
        }
        return false;
    }
}
