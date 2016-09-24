package com.game.nox;

import com.game.nox.graphic.Dimension;
import com.game.nox.graphic.scene.Scene;

import javax.swing.*;
import java.awt.*;

public class Window extends Canvas
{
    protected JFrame frame;
    protected Dimension dimension;
    protected Scene scene;

    public Window(Dimension dm, String title)
    {
        dimension = dm;
        frame = new JFrame(title);
        frame.setPreferredSize(dm);
        frame.setMinimumSize(dm);
        frame.setMaximumSize(dm);
        frame.setResizable(false);
        // frame.setUndecorated(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
    }

    public void addGame(Game game)
    {
        frame.add(game);
    }

    public void setScene(Scene sc)
    {
        scene = sc;
    }

    public Scene getScene()
    {
        return scene;
    }

    public void start()
    {
        frame.setVisible(true);
    }

    public Dimension getDimension()
    {
        return dimension;
    }
}
