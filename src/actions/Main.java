package actions;

import data.Map;
import draw.IL;
import game.GameMaster;
import gui.Gui;
import clocks.Clock;

public class Main {
    public static void main(String[] args) {
        IL.load();
        Map.load();
        GameMaster.setup();
        Clock.start();

        new Gui();

    }
}
