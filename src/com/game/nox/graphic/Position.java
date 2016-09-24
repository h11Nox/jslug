package com.game.nox.graphic;

public class Position
{
    private Integer x;
    private Integer y;

    public Position()
    {
        x = 0;
        y = 0;
    }

    public Position(int _x, int _y)
    {
        x = _x;
        y = _y;
    }

    public Integer getX()
    {
        return x;
    }

    public Position setX(int _x)
    {
        x = _x;
        return this;
    }

    public Integer getY()
    {
        return y;
    }

    public Position setY(int _y)
    {
        y = _y;
        return this;
    }
}
