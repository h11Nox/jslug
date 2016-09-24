package com.game.nox.fight.player;

import com.game.nox.fight.Renderable;
import com.game.nox.fight.card.CardInterface;

import java.util.List;

public interface PlayerInterface extends Renderable
{
    public PlayerInterface addCard(CardInterface c);
    public PlayerInterface addCards(List<CardInterface> c);
    public List<CardInterface> getCards();
    public int getMaxHp();
    public void setMaxHp(int hp);
    public int getHp();
    public void setHp(int hp);
    public int getMaxMp();
    public void setMaxMp(int hp);
    public int getMp();
    public void setMp(int hp);
}
