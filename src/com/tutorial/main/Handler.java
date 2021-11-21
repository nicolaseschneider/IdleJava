package com.tutorial.main;
import java.util.LinkedList;

import java.awt.Graphics;

public class Handler {

    LinkedList<GameObject> object = new LinkedList<GameObject>();
    public void tick(){
        for (int i = 0; i < object.size(); i++){
            GameObject current = object.get(i);
            current.tick();
        }
    }
    public void render(Graphics g){
        for (int i = 0; i < object.size(); i++){
            GameObject current = object.get(i);
            current.render(g);
        }
    }
    public void addObject(GameObject object) {
        this.object.add(object);
    }
    public void removeObject(GameObject object) {
        this.object.remove(object);
    }
}
