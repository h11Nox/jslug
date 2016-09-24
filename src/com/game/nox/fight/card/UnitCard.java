package com.game.nox.fight.card;

import org.json.simple.JSONObject;

public class UnitCard extends Card
{
    protected int hp = 0;
    protected int attack = 0;

    public UnitCard(JSONObject obj)
    {
        hp = ((Long)obj.get("hp")).intValue();
        attack = ((Long)obj.get("attack")).intValue();
    }

    public int getHp()
    {
        return hp;
    }

    public int getAttack()
    {
        return attack;
    }
}
