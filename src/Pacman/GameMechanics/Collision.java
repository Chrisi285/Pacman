package Pacman.GameMechanics;


import Pacman.Setup.Map;

public class Collision {
    static int sc_point = 0;

    public static  boolean collidePoint(int x, int y){

        for(int i = 0; i<= Map.pointCo.length;i++){
            for(int k= 0; k<= Map.pointCo.length;k++){
               if(Map.scorepoint.get(sc_point).getX() == i && Map.scorepoint.get(sc_point).getY() == y && Map.scorepoint.get(sc_point).isEnabled()){
                Map.scorepoint.get(sc_point).setEnabled(false);
                sc_point ++;
               }
            }
        }
        return true;
    }


    public static boolean collideWall(int x, int y){
        for(int i = 0; i< Map.colCo.size(); i++){
            if (x == Map.colCo.get(i).x && y == Map.colCo.get(i).y){
                return true;
            }
        }
        return false;
    }
}
