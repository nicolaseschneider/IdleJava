package com.tutorial.main;

import java.awt.Canvas;
import java.awt.Dimension;
import java.io.Serial;
import javax.swing.JFrame;

public class Window extends Canvas {

    @Serial
    private static final long serialVersionUID = -552287688775572810L;
    // needs uid?
    public Window(int width, int height, String title, Game game) {
        JFrame frame = new JFrame(title);
        frame.setPreferredSize(new Dimension(width, height));
        frame.setMaximumSize(new Dimension(width, height));
        frame.setMinimumSize(new Dimension(width, height));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.add(game);
        frame.setVisible(true);
        game.start();

    }
}
