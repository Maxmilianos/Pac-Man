package the.max.pacman.menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MenuSelect {

    private JFrame frame;

    public MenuSelect() {
        initialize();
        frame.setVisible(true);
    }

    private void initialize() {
        frame = new JFrame();
        frame.setTitle("Pac-Man");
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int width = 600, height = 608;
        frame.setBounds((int) (dimension.getWidth() / 2) - width / 2, (int) (dimension.getHeight() / 2) - height / 2, width, height);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JButton button = new JButton("Začít hru");
        button.setFont(new Font("Dialog", Font.BOLD, 18));
        button.setBounds(215, 428, 120, 35);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new MenuPlay();
                    frame.dispose();
                } catch (NumberFormatException ex) {

                }
            }
        });
        frame.getContentPane().add(button);
    }
}
