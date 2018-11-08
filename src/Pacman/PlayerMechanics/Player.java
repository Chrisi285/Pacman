package Pacman.PlayerMechanics;

import Pacman.Draw.Gui;
import Pacman.GameMechanics.Collision;
import Pacman.PlayerMechanics.Dir;
import Pacman.Setup.GameMaster;

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
        this.hspeed = 2;
        this.vspeed = 0;
    }


    public void move() {

        x += hspeed;
        y += vspeed;
    }

    public void changeDir() {
        switch (dir) {
            case LEFT:
                hspeed = -2;
                vspeed = 0;
                break;
            case RIGHT:
                hspeed = 2;
                vspeed = 0;
                break;
            case UP:
                vspeed = -2;
                hspeed = 0;
                break;
            case DOWN:
                vspeed = 2;
                hspeed = 0;
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
