package Pacman.PlayerMechanics;

import Pacman.Draw.Gui;
import Pacman.GameMechanics.Collision;
import Pacman.PlayerMechanics.Dir;
import Pacman.Setup.GameMaster;
import Pacman.Setup.Map;

import java.awt.*;

public class Player {
    int x;
    int y;
    int width;
    int height;
    int ang_1;
    int ang_2;
    int speed;
    int hspeed;
    int vspeed;
    Dir dir = Dir.RIGHT;


    public Player(int x, int y, int width, int height, int ang_1, int ang_2) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.ang_1 = ang_1;
        this.ang_2 = ang_2;
        this.speed = 2;
        this.hspeed = speed;
        this.vspeed = 0;
    }


    public void move() {

        x += hspeed;
        y += vspeed;
    }


    public void changeDir() {
        Point p = Map.ctp(x, y);

        boolean left, right, up, down;
        left = Collision.collideWall(p.x - 1, p.y);
        right = Collision.collideWall(p.x + 1, p.y);
        up = Collision.collideWall(p.x, p.y - 1);
        down = Collision.collideWall(p.x, p.y + 1);

        if (hspeed == speed) {
            if (right) {
                hspeed = 0;
            }
        }

        if (hspeed == -speed) {
            if (left) {
                hspeed = 0;
            }
        }

        if (vspeed == speed) {
            if (down) {
                vspeed = 0;
            }
        }

        if (vspeed == -speed) {
            if (up) {
                vspeed = 0;
            }
        }

        switch (dir) {
            case LEFT:
                if (!left) {
                    hspeed = -speed;
                    vspeed = 0;
                } else {
                    hspeed = 0;
                }
                break;
            case RIGHT:
                if (!right) {
                    hspeed = speed;
                    vspeed = 0;
                } else {
                    hspeed = 0;
                }
                break;
            case UP:
                if (!up) {
                    vspeed = -speed;
                    hspeed = 0;
                } else {
                    vspeed = 0;
                }
                break;
            case DOWN:
                if (!down) {
                    vspeed = speed;
                    hspeed = 0;
                } else {
                    vspeed = 0;
                }
                break;
        }

    }


    public Dir getDir() {
        return dir;
    }

    public void setDir(Dir dir) {
        this.dir = dir;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getAng_1() {
        return ang_1;
    }

    public void setAng_1(int ang_1) {
        this.ang_1 = ang_1;
    }

    public void setAng_2(int ang_2) {
        this.ang_2 = ang_2;
    }

    public int getAng_2() {
        return ang_2;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getSpeed() {
        return speed;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

}
