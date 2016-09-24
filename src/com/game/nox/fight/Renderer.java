package com.game.nox.fight;

import com.game.nox.GameObject;
import com.game.nox.GameObjectInterface;
import com.game.nox.Window;
import com.game.nox.fight.card.CardInterface;
import com.game.nox.fight.player.PlayerInterface;
import com.game.nox.graphic.BoundableObject;
import com.game.nox.graphic.elements.CardElement;
import com.game.nox.graphic.elements.GameElement;
import com.game.nox.graphic.elements.PlayerElement;

import java.awt.*;
import java.util.Iterator;
import java.util.List;

public class Renderer
{
    private GameObject parent;
    private Window window;

    public Renderer(GameObject g, Window w)
    {
        parent = g;
        window = w;
    }

    public void prepare(Game g)
    {
        GameElement ge = new GameElement(g);
        g.setElement(ge);
        parent.add(ge);

        Iterator<PlayerInterface> iterator = g.getPlayers().iterator();
        int i = 0;
        while (iterator.hasNext()) {
            PlayerInterface player = iterator.next();
            addPlayer(ge, player, i);
            addCards(player, player.getCards());
            i++;
        }
    }

    private void addPlayer(GameObjectInterface go, PlayerInterface player, int i)
    {
        BoundableObject pe = new PlayerElement(player);
        player.setElement(pe);
        if (i == 0) {
            pe.setPoint(
                new Point(
                    (int)Math.ceil((window.getDimension().getWidth() - pe.getDimension().getWidth()) / 2),
                    0
                )
            );
        } else {
            pe.setPoint(
                    new Point(
                            (int)Math.ceil((window.getDimension().getWidth() - pe.getDimension().getWidth()) / 2),
                            (int)window.getDimension().getHeight() - (int)pe.getDimension().getHeight() - 1
                    )
            );
        }
        go.add(pe);
    }

    public static void addCards(PlayerInterface p, List<CardInterface> cards)
    {
        Iterator<CardInterface> iterator = cards.iterator();
        while (iterator.hasNext()) {
            CardInterface card = iterator.next();
            CardElement ce = new CardElement(card);
            card.setElement(ce);
            p.getElement().add(ce);
        }
    }
}
