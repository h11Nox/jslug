package com.game.nox;

import com.game.nox.graphic.Dimension;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Window window = factory.createWindow(new Dimension(800, 600), "My game");
        Game game = factory.createGame(window);
        game.start();
    }
}
