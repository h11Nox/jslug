package com.game.nox;

import com.game.nox.graphic.Dimension;

public class Factory {

    public Game createGame(Window window)
    {
        return new Game(window);
    }

    public Window createWindow(Dimension dm, String title)
    {
        return new Window(dm, title);
    }
}
