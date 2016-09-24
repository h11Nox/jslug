package com.game.nox.graphic;

import com.game.nox.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

abstract public class ParentObject extends GameObject
{
    protected LinkedList<GameObjectInterface> list = new LinkedList<GameObjectInterface>();

    public synchronized void add(GameObjectInterface gameObject)
    {
        list.add(gameObject);
    }

    public void render(Graphics g, com.game.nox.Window window)
    {
        Iterator<GameObjectInterface> iterator = createIterator();
        while (iterator.hasNext()) {
            GameObjectInterface gameObject = iterator.next();
            gameObject.render(g, window);
        }
    }

    public synchronized boolean remove(GameObjectInterface gameObject)
    {
        return list.remove(gameObject);
    }

    public Iterator<GameObjectInterface> createIterator()
    {
        return list.listIterator();
    }
}
