package com.game.nox.graphic.scene;

import com.game.nox.Window;

import java.awt.*;

public class FightScene extends Scene
{
    public void render(Graphics g, Window window)
    {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, (int)window.getDimension().getWidth(), (int)window.getDimension().getHeight());
        super.render(g, window);
    }
}
