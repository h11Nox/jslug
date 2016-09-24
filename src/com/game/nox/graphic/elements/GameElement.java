package com.game.nox.graphic.elements;

import com.game.nox.fight.Game;
import com.game.nox.graphic.ParentObject;

public class GameElement extends ParentObject
{
    private Game game;

    public GameElement(Game g)
    {
        game = g;
    }
}
