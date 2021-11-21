package com.tutorial.main;

import java.awt.Color;

import java.awt.Graphics;

public class PlayerView extends GameObject{
    public PlayerView(int x, int y, GameID id) {
        super(x,y,id);
    }
    public void tick() {
//        x += velX;
//        y += velY;
    }
    public void render(Graphics g){
        g.setColor(Color.red);
        g.fillRect(x,y, 20, 20);
    }
}
