package Pacman.Draw;

import Pacman.Setup.GameMaster;
import Pacman.Setup.LoadMap;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.lang.reflect.Array;

public class DrawMap extends JLabel {
    int x,y,width,height,ang_1,ang_2;
    BufferedImage [] wall = LoadMap.getWall();
    int [][] wallCo = LoadMap.getWallCo();
    int [][] pointCo = LoadMap.getPointCo();
    int png_Chooser_wall=0;
    int png_chooser_point = 0;
    int wall_x = 0;
    int wall_y = 0;



    public void paintComponent(Graphics g) {
        x = GameMaster.p.getX();
        y = GameMaster.p.getY();
        width = GameMaster.p.getWidth();
        height = GameMaster.p.getHeight();
        ang_1 = GameMaster.p.getAng_1();
        ang_2 = GameMaster.p.getAng_2();


         Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        g.setColor(Color.YELLOW);
        g.fillArc(x, y, width, height, ang_1, ang_2);
        //Ellipse2D.Double player_body = new Ellipse2D.Double(Player.x,Player.y,Player.width,Player.height) ;

        //DrawWall
        for(int i = 0; i<= Array.getLength(wallCo)-1; i++){
           for(int k = 0; k<= Array.getLength(wallCo[0])-1;k++){
               png_Chooser_wall = wallCo[i][k];
               switch (png_Chooser_wall){
                   case 1:
                       g.drawImage(wall[0],i*32,k*32,null);
                     break ;
                   case 2:
                       g.drawImage(wall[1],i*32,k*32,null);
                       break ;
                   case 3:
                       g.drawImage(wall[2],i*32,k*32,null);
                       break ;
                   case 4:
                       g.drawImage(wall[3],i*32,k*32,null);
                       break ;
                   case 5:
                       g.drawImage(wall[4],i*32,k*32,null);
                       break ;
                   case 6:
                       g.drawImage(wall[5],i*32,k*32,null);
                       break ;
                   case 7:
                       g.drawImage(wall[6],i*32,k*32,null);
                       break ;
                   case 8:
                       g.drawImage(wall[7],i*32,k*32,null);
                       break ;
                   case 9:
                       break;
                   case 10:
                       break;
                   case 11:
                       g.drawImage(wall[8],i*32,k*32,null);
                       break ;
                   case 12:
                       g.drawImage(wall[9],i*32,k*32,null);
                       break ;
                   case 13:
                       g.drawImage(wall[10],i*32,k*32,null);
                       break ;
                   case 14:
                       g.drawImage(wall[11],i*32,k*32,null);
                       break ;


               }
           }

        }
        for (int i = 0;i <= LoadMap.pointCo.length-1; i++){
            for (int k = 0; k<= Array.getLength(LoadMap.pointCo[0])-1;k++){
                if(LoadMap.pointCo[i][k]== 10){
                    g.drawImage(LoadMap.point_pick, i*32,k*32,null);
                }
            }
        }
        repaint();
    }



}
