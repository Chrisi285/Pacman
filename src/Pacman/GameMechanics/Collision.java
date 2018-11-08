package Pacman.GameMechanics;

public class Collision {
    public static boolean collideLeft(int x, int r){
        return(x<=1);
    }
    public static boolean collideRight(int x, int r){
        return (x + r>= 1004);
    }
    public static boolean collideTop(int y, int r){
        return(y<= 1);
    }
    public static boolean collideBottom(int y, int r){
        return(y+r>=728);
    }
}
