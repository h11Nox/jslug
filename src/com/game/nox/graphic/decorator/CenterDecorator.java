package com.game.nox.graphic.decorator;

import com.game.nox.Window;
import com.game.nox.graphic.BoundableObject;
import com.game.nox.graphic.Position;
import com.game.nox.graphic.unit.Popup;

import java.awt.*;

public class CenterDecorator extends Decorator
{
    protected BoundableObject gameObject;

    public CenterDecorator(BoundableObject go)
    {
        gameObject = go;
    }

    public void render(Graphics g, Window w)
    {
        gameObject.getPoint().setLocation(
            (int)Math.ceil((w.getDimension().getWidth() - gameObject.getDimension().getWidth()) / 2),
            (int)Math.ceil((w.getDimension().getHeight() - gameObject.getDimension().getHeight()) / 2)
        );
        gameObject.render(g, w);
    }
}
