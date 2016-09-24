package com.game.nox.graphic.decorator;

import com.game.nox.*;
import com.game.nox.graphic.BoundableObject;

import java.awt.*;

public class BorderDecorator extends BoundableDecorator
{
    private Color color;

    public BorderDecorator(BoundableObject go, Color c)
    {
        gameObject = go;
        color = c;
    }

    public void render(Graphics g, com.game.nox.Window w)
    {
        g.setColor(color);
        g.drawRect((int)gameObject.getPoint().getX(), (int)gameObject.getPoint().getY(), (int)getDimension().getWidth(), (int)getDimension().getHeight());
        gameObject.render(g, w);
    }
}
