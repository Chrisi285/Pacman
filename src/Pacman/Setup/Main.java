package Pacman.Setup;

import Pacman.Draw.Gui;
import Pacman.GameMechanics.Clock;
import Pacman.Setup.GameMaster;

public class Main {
    public static void main(String[] args) {
        LoadMap.load();
        new Gui();
       GameMaster.setup();
        Clock.start();
        Clock.start_mouth();

    }
}
