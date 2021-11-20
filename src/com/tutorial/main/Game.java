package com.tutorial.main;

import java.awt.*;
import java.io.Serial;

public class Game extends Canvas implements Runnable{

    @Serial
    private static final long serialVersionUID = -552233688775572810L;

    public static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9;

    private Thread thread;
    private boolean running = false;

    public Game() {
        new Window(WIDTH, HEIGHT, "TEST123", this);
    }

    public synchronized void start() {
        thread = new Thread(this);
        thread.start();
        running = true;
    }
    public void run() {

    }
    public static void main (String args[]) {
        new Game();
    }
    public synchronized void stop() {
        try{
            thread.join();
            running = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
