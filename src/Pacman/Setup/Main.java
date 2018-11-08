package Pacman.Setup;

import Pacman.Draw.Gui;
import Pacman.GameMechanics.Clock;
import Pacman.GameMechanics.MoveClock;

public class Main {
    public static void main(String[] args) {
        Map.load();
        GameMaster.setup();
        Clock.start();
        Clock.start_mouth();
        MoveClock.start();
        new Gui();

    }
}
