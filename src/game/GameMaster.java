package game;

import data.Map;
import game.Player;

import java.awt.*;
import java.io.BufferedReader;
import java.util.ArrayList;

public class GameMaster {
    public static Player p;

    static BufferedReader br;
    static ArrayList<String> objectsCo = new ArrayList<>();

    public static void setup() {

        Point point = Map.ptc(2,2);
        p = new Player(point.x, point.y, 32, 32, 23, 317);

    }
}
