package com.mac.designpatternsmasterclass.bridge.exatwo;

// Abstract class using Bridge implementer interface
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();

}
