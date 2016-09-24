package com.game.nox.graphic.unit;

import com.game.nox.*;
import com.game.nox.Window;

import java.awt.*;

public class Text extends GameObject
{
    protected String text;
    protected Color color = Color.black;

    public Text(String t)
    {
        text = t;
    }

    public Text(String t, Color c)
    {
        text = t;
        color = c;
    }

    public void setColor(Color c)
    {
        color = c;
    }

    public void render(Graphics g, Window window)
    {
        g.setColor(color);
        g.drawString(text, (int)point.getX(), (int)point.getY());
    }
}
