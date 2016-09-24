package com.game.nox;

import java.awt.*;
import java.util.Collections;
import java.util.Iterator;

abstract public class GameObject implements GameObjectInterface
{
    protected Point point = new Point(0, 0);

    abstract public void render(Graphics g, Window window);

    public void add(GameObjectInterface gameObject)
    {

    }

    public boolean remove(GameObjectInterface go)
    {
        return false;
    }

    public Point getPoint()
    {
        return point;
    }

    public void setPoint(Point p)
    {
        point = p;
    }

    public Iterator<GameObjectInterface> createIterator()
    {
        return Collections.emptyIterator();
    }
}