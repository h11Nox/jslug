package com.game.nox.graphic.unit;

import com.game.nox.*;
import com.game.nox.Window;
import com.game.nox.graphic.BoundableObject;
import com.game.nox.graphic.ParentObject;

import java.awt.*;

public class Popup extends ParentObject implements BoundableObject
{
    private Dimension dimension;
    private Color color = Color.black;

    public Popup(Dimension d, Text text, Color c)
    {
        dimension = d;
        color = c;
        text.setColor(color);
        text.setPoint(point);
        add(text);
    }

    public void render(Graphics g, Window window)
    {
        g.setColor(color);
        g.drawRect((int)point.getX(), (int)point.getY(), (int)dimension.getWidth(), (int)dimension.getHeight());
        super.render(g, window);
    }

    public Dimension getDimension()
    {
        return dimension;
    }
}
