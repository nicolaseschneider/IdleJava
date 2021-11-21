package com.tutorial.main;
import java.awt.Graphics;
import java.awt.Color;

public class Bank extends GameObject{

    public Bank(int x, int y, GameID id) {
        super(x, y, id);
    }

    public void tick() {

    }
    public void render(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(x, y, 64, 64);
    }
}
