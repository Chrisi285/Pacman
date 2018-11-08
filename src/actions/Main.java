package actions;

import data.Map;
import game.GameMaster;
import gui.Gui;
import clocks.Clock;
import clocks.MoveClock;

public class Main {
    public static void main(String[] args) {
        Map.load();
        GameMaster.setup();
        Clock.start();
        MoveClock.start();

        new Gui();

    }
}
