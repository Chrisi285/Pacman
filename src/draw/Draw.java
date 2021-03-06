package draw;


import game.GameMaster;
import data.Map;
import game.Ghost;
import game.ScoreItem;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Draw extends JLabel {

    Point p;

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);


        g.setColor(Color.BLACK);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
      

        //DrawWall
        for (int x = 0; x <= Map.wallCo.length - 1; x++) {
            for (int y = 0; y <= Map.wallCo[0].length - 1; y++) {

                if(Map.wallCo[x][y] > 0){
                    g.drawImage(IL.wall[Map.wallCo[x][y]-1], x * 32, y * 32, null);
                }
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

        g.setColor(Color.YELLOW);
        g.fillArc(GameMaster.p.getX(), GameMaster.p.getY(),
                GameMaster.p.getWidth(), GameMaster.p.getHeight(),
                GameMaster.p.getAng_1(), GameMaster.p.getAng_2());

       /* for (int i = 0; i < GameMaster.ghosts.length; i++) {
            p = Map.ptc(GameMaster.ghosts[i].getX(),GameMaster.ghosts[i].getY());
            g.drawImage(IL.ghost[i],p.x,p.y,null);
        }*/

        for (int i = 0; i < GameMaster.ghosts.length; i++) {
            g.drawImage(IL.ghost[i],GameMaster.ghosts[i].getX(),GameMaster.ghosts[i].getY(), null);
        }


        repaint();
    }


}
