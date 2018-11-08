package Pacman.GameMechanics;

import Pacman.Setup.GameMaster;

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

            }
        },15,80);
    }
}
