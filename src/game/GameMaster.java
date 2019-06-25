package game;

import data.Map;
import game.Player;

import java.awt.*;
import java.io.BufferedReader;
import java.util.ArrayList;

public class GameMaster {
    public static Player p;
    public static Ghost[] ghosts = new Ghost[1];

    static BufferedReader br;
    static ArrayList<String> objectsCo = new ArrayList<>();

    public static void setup() {

        Point point = Map.ptc(18,9);
        p = new Player(point.x, point.y, 32, 32, 23, 317);

        for (int i = 0; i < ghosts.length; i++) {
            Point ghostPos = Map.ptc(15+i,9);
            ghosts[i] = new Ghost(ghostPos.x,ghostPos.y);
        }




    }
}
