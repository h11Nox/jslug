package com.game.nox.fight;

import com.game.nox.data.CardManager;
import com.game.nox.fight.player.Human;
import com.game.nox.fight.player.PlayerInterface;

public class Builder
{
    private Game game;

    public Builder()
    {
        game = new Game();
    }

    public void createHuman(int i)
    {
        switch (i) {
            case 1:
                game.setPlayer1(createPlayer());
                return;
            case 2:
                game.setPlayer2(createPlayer());
                return;
            default:
                throw new IllegalArgumentException("Invalid player number");
        }
    }

    public Game getGame()
    {
        return game;
    }

    private PlayerInterface createPlayer()
    {
        PlayerInterface player = new Human();
        player.setMaxHp(10);
        player.setHp(10);
        player.setMaxMp(1);
        player.setMp(1);
        player.addCards(CardManager.getInstance().getCards(3));
        return player;
    }
}
