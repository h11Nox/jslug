package com.game.nox.fight;

import com.game.nox.fight.player.PlayerInterface;

import java.util.ArrayList;
import java.util.List;

public class Game extends RenderableObject implements Renderable
{
    private List<PlayerInterface> players = new ArrayList<>();

    public PlayerInterface getPlayer1()
    {
        return players.get(0);
    }

    public Game setPlayer1(PlayerInterface p)
    {
        players.add(0, p);
        return this;
    }

    public PlayerInterface getPlayer2()
    {
        return players.get(1);
    }

    public Game setPlayer2(PlayerInterface p)
    {
        players.add(1, p);
        return this;
    }

    public List<PlayerInterface> getPlayers()
    {
        return players;
    }
}
