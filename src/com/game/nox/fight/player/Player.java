package com.game.nox.fight.player;

import com.game.nox.fight.Renderable;
import com.game.nox.fight.RenderableObject;
import com.game.nox.fight.card.CardInterface;

import java.util.ArrayList;
import java.util.List;

abstract public class Player extends RenderableObject implements PlayerInterface
{
    private List<CardInterface> cards = new ArrayList<>();
    private int maxHp = 0;
    private int maxMp = 0;
    private int hp = 0;
    private int mp = 0;

    public PlayerInterface addCard(CardInterface card)
    {
        cards.add(card);
        return this;
    }

    public PlayerInterface addCards(List<CardInterface> c)
    {
        cards.addAll(c);
        return this;
    }

    public PlayerInterface removeCard(CardInterface card)
    {
        cards.remove(card);
        return this;
    }

    public List<CardInterface> getCards()
    {
        return cards;
    }

    @Override
    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    @Override
    public int getMaxMp() {
        return maxMp;
    }

    public void setMaxMp(int maxMp) {
        this.maxMp = maxMp;
    }

    @Override
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }
}
