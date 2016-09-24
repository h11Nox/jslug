package com.game.nox.graphic.decorator;

import com.game.nox.graphic.BoundableObject;

import java.awt.*;

abstract public class BoundableDecorator extends Decorator implements BoundableObject
{
    protected BoundableObject gameObject;

    public Dimension getDimension()
    {
        return gameObject.getDimension();
    }

    public void setPoint(Point p)
    {
        gameObject.setPoint(p);
    }
}
