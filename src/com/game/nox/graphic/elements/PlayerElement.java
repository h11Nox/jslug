package com.game.nox.graphic.elements;

import com.game.nox.*;
import com.game.nox.Window;
import com.game.nox.fight.player.PlayerInterface;
import com.game.nox.graphic.BoundableObject;
import com.game.nox.graphic.ParentObject;

import java.awt.*;

public class PlayerElement extends ParentObject implements BoundableObject
{
    private PlayerInterface player;
    private static int indent = 5;
    private static int width = 10;

    public PlayerElement(PlayerInterface p)
    {
        player = p;
    }

    public void render(Graphics g, Window w)
    {
        renderPhoto(g, w);
        renderHp(g, w);
        renderMp(g , w);
        super.render(g, w);
    }

    private void renderPhoto(Graphics g, Window w)
    {
        g.setColor(Color.GRAY);
        g.drawRect(
                (int)getPoint().getX(),
                (int)getPoint().getY(),
                (int)getDimension().getWidth(),
                (int)getDimension().getHeight()
        );
    }

    private void renderHp(Graphics g, Window w)
    {
        g.setColor(Color.RED);
        int x = (int)(getPoint().getX() + getDimension().getWidth()) + indent;
        g.drawRect(
                x,
                (int)getPoint().getY(),
                width,
                (int)getDimension().getHeight()
        );
        int diff = (int)Math.ceil((((float)player.getMaxHp() - (float)player.getHp()) / (float)player.getMaxHp()) * getDimension().getHeight());
        g.fillRect(
                x,
                (int)getPoint().getY() + diff,
                width,
                (int)getDimension().getHeight() - diff
        );
    }

    private void renderMp(Graphics g, Window w)
    {
        g.setColor(Color.BLUE);
        int x = (int)(getPoint().getX() + getDimension().getWidth()) + indent;
        g.drawRect(
                x + width + indent,
                (int)getPoint().getY(),
                width,
                (int)getDimension().getHeight()
        );
        int diff = (int)Math.ceil((((float)player.getMaxMp() - (float)player.getMp()) / (float)player.getMaxMp()) * getDimension().getHeight());
        g.fillRect(
                x + width + indent,
                (int)getPoint().getY() + diff,
                width,
                (int)getDimension().getHeight() - diff
        );
    }

    public Dimension getDimension()
    {
        return new Dimension(100, 100);
    }
}
