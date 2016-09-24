package com.game.nox;

import java.awt.*;
import java.awt.image.BufferStrategy;

public class Game extends Canvas implements Runnable {

    protected Thread thread;
    protected boolean running;
    protected Window window;

    public Game(Window newWindow)
    {
        window = newWindow;
    }

    public synchronized void start()
    {
        window.addGame(this);
        window.start();
        new Fight(window);

        thread = new Thread(this);
        thread.start();
        running = true;
    }

    public synchronized void stop()
    {
        try {
            thread.join();
            running = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void tick()
    {

    }

    protected void render()
    {
        BufferStrategy bs = this.getBufferStrategy();
        if (bs == null) {
            this.createBufferStrategy(3);
            return;
        }
        Graphics g = bs.getDrawGraphics();
        window.getScene().render(g, window);
        g.dispose();
        bs.show();
    }

    public void run()
    {
        long lastTime = System.nanoTime();
        double amountOfTicks = 2;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int frames = 0;
        while (running) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while (delta >=1) {
                tick();
                delta--;
                render();
            }
            /*if (running) {
                render();
            }*/
            frames++;
            if (System.currentTimeMillis() - timer > 1000) {
                timer += 1000;
                System.out.println("FPS: "+ frames);
                frames = 0;
            }
        }
        stop();
    }
}
