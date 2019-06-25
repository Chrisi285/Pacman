package clocks;

import game.GameMaster;

import java.util.Timer;
import java.util.TimerTask;

public class Clock {
    static Timer time = new Timer();


    public static void start() {
        time.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                GameMaster.p.move();
                GameMaster.ghosts[0].move();

            }
        }, 10, 10);
    }

}
