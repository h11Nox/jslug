package com.game.nox;

import java.awt.*;
import java.util.Iterator;

public interface GameObjectInterface
{
    public void render(Graphics g, Window window);
    public void add(GameObjectInterface unit);
    public Point getPoint();
    public void setPoint(Point p);
    public boolean remove(GameObjectInterface go);
    public Iterator<GameObjectInterface> createIterator();
}
