package the.max.pacman;

import the.max.pacman.menu.MenuSelect;

import java.awt.*;

public class PacMan {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MenuSelect();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
