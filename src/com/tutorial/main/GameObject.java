package com.tutorial.main;

import java.awt.Graphics;

public abstract class GameObject {

    protected int x, y;
    protected GameID id;
    // protected int velX, velY;

    public GameObject(int x, int y, GameID id){
        this.x = x;
        this.y = y;
        this.id = id;
    }

    public abstract void tick();
    public abstract void render(Graphics g);

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setGameID(GameID id) {
        this.id = id;
    }
    public GameID getGameID() {
        return id;
    }



}
