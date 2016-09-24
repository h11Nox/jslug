package com.game.nox;

import com.game.nox.fight.Builder;
import com.game.nox.fight.Renderer;
import com.game.nox.graphic.decorator.CenterDecorator;
import com.game.nox.graphic.scene.FightScene;
import com.game.nox.graphic.scene.Scene;
import com.game.nox.graphic.unit.Popup;
import com.game.nox.graphic.unit.Text;

import java.awt.*;

public class Fight
{
    private Scene scene;
    private Builder builder;
    private Window window;

    public Fight(Window w)
    {
        window = w;
        builder = new Builder();
        scene = new FightScene();
        w.setScene(scene);
        init();
    }

    private void init()
    {
        GameObjectInterface p = new CenterDecorator(
                new Popup(new Dimension(100, 50), new Text("Loading fight"), Color.red)
        );
        scene.add(p);
        build();
        (new Renderer(scene, window)).prepare(builder.getGame());
        scene.add(builder.getGame().getElement());
        scene.remove(p);
    }

    private void build()
    {
        builder.createHuman(1);
        builder.createHuman(2);
    }
}
