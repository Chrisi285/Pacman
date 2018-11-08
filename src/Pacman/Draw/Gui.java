package Pacman.Draw;

import Pacman.Setup.KeyHandler;

import javax.swing.*;

public class Gui {
    static JFrame frame;
    DrawMap panel;
    public Gui(){
        frame = new JFrame("Pacman");
        frame.setSize(1041,808);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.requestFocus();
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.addKeyListener(new KeyHandler());

        panel = new DrawMap();
        panel.setBounds(0,0,1041,808);
        frame.add(panel);
        frame.setVisible(true);
    }

}
