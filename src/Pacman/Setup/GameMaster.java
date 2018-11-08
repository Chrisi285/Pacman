package Pacman.Setup;

import Pacman.PlayerMechanics.Player;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GameMaster {
    public static Player p;

    static FileReader Map;
   static  BufferedReader br;
    static ArrayList<String> objectsCo = new ArrayList<>();

    public static void setup(){
        p = new Player(200,200,32,32, 23,317);





    }
}
