package Pacman.Setup;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Map {
    public static String[] line_1;
    public static String[] line_2;
    public static String[] line_3;
    public static String[] line_4;
    public static String[] line_5;
    public static int[][] wallCo;
    public static int[][] pointCo;
    public static ArrayList<Point> colCo = new ArrayList<>();
    public static BufferedImage[] wall = new BufferedImage[12];
    public static BufferedImage point_pick;


    public static void load() {

        File file = new File("rsc/mapdata.txt");
        Scanner sc = null;

        try {


            for (int i = 1; i <= 14; i++) {
                if (i <= 8) {
                    wall[i - 1] = ImageIO.read(new File("rsc/tiles/" + (i) + ".png"));
                }
                if (i >= 11) {
                    wall[i - 3] = ImageIO.read(new File("rsc/tiles/" + (i) + ".png"));
                }

            }

            point_pick = ImageIO.read(new File("rsc/tiles/10.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        String s4 = sc.nextLine();
        String s5 = sc.nextLine();

        line_1 = s1.split(",");
        line_2 = s2.split(",");
        line_3 = s3.split(",");
        line_4 = s4.split(",");
        line_5 = s5.split(",");

        //Walldaten in Array laden
        wallCo = new int[Integer.parseInt(line_1[0])][Integer.parseInt(line_1[1])];
        int kachelnx = Integer.parseInt((line_1[0]));
        int kachelny = Integer.parseInt((line_1[1]));
        int pickLine_wall = 0;
        for (int i = 0; i <= kachelnx - 1; i++) {
            for (int k = 0; k <= kachelny - 1; k++) {
                wallCo[i][k] = Integer.parseInt(line_4[pickLine_wall]);
                pickLine_wall++;
            }
        }

        //Punktdaten in Array laden
        pointCo = new int[Integer.parseInt(line_1[0])][Integer.parseInt(line_1[1])];
        int pickLine_point = 0;
        for (int i = 0; i <= kachelnx - 1; i++) {
            for (int k = 0; k <= kachelny - 1; k++) {
                pointCo[i][k] = Integer.parseInt(line_5[pickLine_point]);
                pickLine_point++;
            }
        }

        //Collisionsdaten in Array laden
        colCo.clear();

        for (int i = 0; i < line_2.length - 1; i+=2) {
            colCo.add(new Point(Integer.parseInt(line_2[i]), Integer.parseInt(line_2[i + 1])));
        }

    }

    //pos to coordinates
    public static Point ptc(int x, int y){
        Point p = new Point(0,0);
        p.x = x * 32;
        p.y = y * 32;
        return p;
    }

    public static Point ctp(int x, int y){
        Point p = new Point(0,0);
        p.x = x / 32;
        p.y = y / 32;
        return p;
    }

   /* public static int[][] getWallCo() {
        return wallCo;
    }

    public static int[][] getPointCo() {
        return pointCo;
    }

    public static BufferedImage[] getWall() {
        return wall;
    }

    public static BufferedImage getPoint_pick() {
        return point_pick;
    }*/

}
