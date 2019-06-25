package game;

import data.Collision;
import data.Map;

import java.awt.*;

public class Ghost {
    int x, y, width = 32, height = 32, targetx, targety, lastx, lasty, speed = 2;
    //float distx, disty;
    double dist[] = new double[4];
    int temp = 0;
    int dir = 0;
    GhostState state = GhostState.WANDER;

    public Ghost(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean[] possiblePos() {
        Point p = Map.ctp(x, y);

        boolean left, right, up, down;
        left = Collision.collideWall(p.x - 1, p.y);
        right = Collision.collideWall(p.x + 1, p.y);
        up = Collision.collideWall(p.x, p.y - 1);
        down = Collision.collideWall(p.x, p.y + 1);

        return new boolean[]{left, right, up, down};
    }

    public int calcDir() {

        boolean[] pos = possiblePos();

        for (int i = 0; i < pos.length; i++) {
            dist[i] = -1;

            if (!pos[i]) {

                switch (i) {
                    case 0:
                        dist[0] = Math.sqrt(Math.pow((double) (Math.abs(GameMaster.p.x - x) + 32), 2.)
                                + Math.pow((double) (Math.abs(GameMaster.p.y - y)), 2.));
                        break;
                    case 1:
                        dist[1] = Math.sqrt(Math.pow((double) (Math.abs(GameMaster.p.x - x) - 32), 2.)
                                + Math.pow((double) (Math.abs(GameMaster.p.y - y)), 2.));
                        break;
                    case 2:
                        dist[2] = Math.sqrt(Math.pow((double) (Math.abs(GameMaster.p.x - x)), 2.)
                                + Math.pow((double) (Math.abs(GameMaster.p.y - y) + 32), 2.));
                        break;
                    case 3:
                        dist[3] = Math.sqrt(Math.pow((double) (Math.abs(GameMaster.p.x - x)), 2.)
                                + Math.pow((double) (Math.abs(GameMaster.p.y - y) - 32), 2.));
                        break;
                }
            }
        }
        double smallest = Integer.MAX_VALUE;
        int dir = -1;
        for (int i = 0; i < pos.length; i++) {
            if (dist[i] != -1) {
                if (dist[i] < smallest) {
                    smallest = dist[i];
                    dir = i;
                }
            }
        }

        return dir;

    }

    public void move() {

        if (dir != -1) {
            temp++;

            switch (dir){
                case 0: x-= speed;
                    break;
                case 1: x+= speed;
                    break;
                case 2: y-= speed;
                    break;
                case 3: y+= speed;
                    break;
            }

            if(temp == 16){
                dir = calcDir();
                temp = 0;

            }
        }

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getTargetx() {
        return targetx;
    }

    public void setTargetx(int targetx) {
        this.targetx = targetx;
    }

    public int getTargety() {
        return targety;
    }

    public void setTargety(int targety) {
        this.targety = targety;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public GhostState getState() {
        return state;
    }

    public void setState(GhostState state) {
        this.state = state;
    }

    public int getLastx() {
        return lastx;
    }

    public void setLastx(int lastx) {
        this.lastx = lastx;
    }

    public int getLasty() {
        return lasty;
    }

    public void setLasty(int lasty) {
        this.lasty = lasty;
    }
}
