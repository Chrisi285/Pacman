package draw;


import game.GameMaster;
import data.Map;
import game.ScoreItem;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Draw extends JLabel {
    int png_Chooser_wall = 0;

    Point p;

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);


        g.setColor(Color.BLACK);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        g.setColor(Color.YELLOW);
        g.fillArc(GameMaster.p.getX(), GameMaster.p.getY(),
                GameMaster.p.getWidth(), GameMaster.p.getHeight(),
                GameMaster.p.getAng_1(), GameMaster.p.getAng_2());

        //DrawWall
        for (int x = 0; x <= Map.wallCo.length - 1; x++) {
            for (int y = 0; y <= Map.wallCo[0].length - 1; y++) {
                //  png_Chooser_wall = Map.wallCo[x][y];
                /*  for(int i = 0; i<14; i++){
                    if(i < 9){
                        if(png_Chooser_wall == i){
                            g.drawImage(IL.wall[i], x*32,y*32,null);
                        }
                    }else if(i > 10){
                        if(png_Chooser_wall == i){
                            g.drawImage(IL.wall[i-2], x*32,y*32,null);
                        }
                    }*/
                if(Map.wallCo[x][y] < 12){
                    g.drawImage(IL.wall[Map.wallCo[x][y]], x * 32, y * 32, null);
                }


                /*switch (png_Chooser_wall) {
                    case 1:
                        g.drawImage(IL.wall[0], i * 32, k * 32, null);
                        break;
                    case 2:
                        g.drawImage(IL.wall[1], i * 32, k * 32, null);
                        break;
                    case 3:
                        g.drawImage(IL.wall[2], i * 32, k * 32, null);
                        break;
                    case 4:
                        g.drawImage(IL.wall[3], i * 32, k * 32, null);
                        break;
                    case 5:
                        g.drawImage(IL.wall[4], i * 32, k * 32, null);
                        break;
                    case 6:
                        g.drawImage(IL.wall[5], i * 32, k * 32, null);
                        break;
                    case 7:
                        g.drawImage(IL.wall[6], i * 32, k * 32, null);
                        break;
                    case 8:
                        g.drawImage(IL.wall[7], i * 32, k * 32, null);
                        break;
                    case 11:
                        g.drawImage(IL.wall[8], i * 32, k * 32, null);
                        break;
                    case 12:
                        g.drawImage(IL.wall[9], i * 32, k * 32, null);
                        break;
                    case 13:
                        g.drawImage(IL.wall[10], i * 32, k * 32, null);
                        break;
                    case 14:
                        g.drawImage(IL.wall[11], i * 32, k * 32, null);
                        break;
                }*/
            }
        }


        for (int x = 0; x < Map.scorepoints.length; x++) {
            for (int y = 0; y < Map.scorepoints[0].length; y++) {
                if (Map.scorepoints[x][y].isEnabled()) {
                    p = Map.ptc(x, y);
                    g.drawImage(IL.point_pick, p.x, p.y, null);
                }
            }
        }


        repaint();
    }


}
