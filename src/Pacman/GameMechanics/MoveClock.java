package Pacman.GameMechanics;

import Pacman.Setup.GameMaster;
import Pacman.Setup.Map;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class MoveClock {
    public static Timer timer;

    public static void start(){
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                GameMaster.p.changeDir();
                Point pnt = Map.ctp(GameMaster.p.getX(), GameMaster.p.getY());
                Collision.collidePoint(pnt.x, pnt.y);

            }
        },15,160);
    }
}
