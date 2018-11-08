package actions;

import game.Dir;
import game.GameMaster;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyCode()) {
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                GameMaster.p.setDir(Dir.LEFT);
                break;
            case KeyEvent.VK_RIGHT:
                    GameMaster.p.setDir(Dir.RIGHT);
                break;
            case KeyEvent.VK_UP:
                    GameMaster.p.setDir(Dir.UP);
                break;
            case KeyEvent.VK_DOWN:
                    GameMaster.p.setDir(Dir.DOWN);
                break;

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
