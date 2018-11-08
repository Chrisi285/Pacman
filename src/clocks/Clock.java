package clocks;

import game.GameMaster;

import java.util.Timer;
import java.util.TimerTask;

public class Clock {
    static Timer time = new Timer();
    static Timer mouthmove = new Timer();
    static boolean auf = true;
    int ang_1;
    int ang_2;


    public static void start() {
        time.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                GameMaster.p.move();

            }
        }, 15, 10);
    }

}
