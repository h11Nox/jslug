package com.game.nox.graphic.elements;

import com.game.nox.*;
import com.game.nox.Window;
import com.game.nox.fight.card.CardInterface;
import com.game.nox.graphic.BoundableObject;

import java.awt.*;

public class CardElement extends GameObject implements BoundableObject
{
    private CardInterface card;

    public CardElement(CardInterface c)
    {
        card = c;
    }

    public void render(Graphics g, Window w)
    {
        //
    }

    public Dimension getDimension()
    {
        return new Dimension(1, 1);
    }
}
