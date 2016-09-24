package com.game.nox.fight;

import com.game.nox.GameObjectInterface;

public abstract class RenderableObject implements Renderable
{
    private GameObjectInterface gameObject;

    public void setElement(GameObjectInterface go)
    {
        gameObject = go;
    }

    public GameObjectInterface getElement()
    {
        return gameObject;
    }
}
