package gui;


import actions.KeyHandler;
import draw.Draw;

import javax.swing.*;

public class Gui {

    static JFrame frame;
    public static Draw d;

    public Gui() {
        frame = new JFrame("Pacman");
        frame.setSize(1041, 808);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.requestFocus();
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.addKeyListener(new KeyHandler());

        d = new Draw();

        d.setBounds(0, 0, 1041, 808);
        frame.add(d);
        frame.setVisible(true);
    }


}
