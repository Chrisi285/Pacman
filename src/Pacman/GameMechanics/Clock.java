package Pacman.GameMechanics;

import Pacman.PlayerMechanics.Dir;
import Pacman.Setup.GameMaster;
import Pacman.Draw.Gui;

import java.util.Timer;
import java.util.TimerTask;

public class Clock {
    static Timer time = new Timer();
    static Timer mouthmove = new Timer();
    static boolean auf = true;
    int ang_1;
    int ang_2;





    public static void start(){
        time.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
           GameMaster.p.move();

            }
        }, 15,10);
    }

    public  static void start_mouth(){


        mouthmove.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Dir dir;
                dir = GameMaster.p.getDir();

                switch (dir){
                    case RIGHT:
                        if(auf== true){
                            GameMaster.p.setAng_1(0);
                            GameMaster.p.setAng_2(360);
                            auf = false;
                        }
                        else{
                            GameMaster.p.setAng_1(23);
                            GameMaster.p.setAng_2(317);
                            auf = true;
                        }
                        break;

                    case LEFT:
                        if(auf== true){
                            GameMaster.p.setAng_1(203);
                            GameMaster.p.setAng_2(317);

                            auf = false;
                        }
                        else{
                            GameMaster.p.setAng_1(0);
                            GameMaster.p.setAng_2(360);
                            auf = true;
                        }
                        break;

                    case UP:
                        if(auf== true){
                            GameMaster.p.setAng_1(113);
                            GameMaster.p.setAng_2(317);

                            auf = false;
                        }
                        else{
                            GameMaster.p.setAng_1(0);
                            GameMaster.p.setAng_2(360);
                            auf = true;
                        }
                        break;

                    case DOWN:
                        if(auf== true){
                            GameMaster.p.setAng_1(293);
                            GameMaster.p.setAng_2(317);

                            auf = false;
                        }
                        else{
                            GameMaster.p.setAng_1(0);
                            GameMaster.p.setAng_2(360);
                            auf = true;
                        }
                        break;
                }


            }
        },500,150);
    }
}
