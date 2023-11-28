package com.java.ravishka.abstraction;

public abstract class GraphicObject {
    int x,y;

    void moveTo(int newX, int newY){
        System.out.println("Move to x: " + newX + " y: " + newY);
    }

    abstract void draw();
    abstract void resize();
}
