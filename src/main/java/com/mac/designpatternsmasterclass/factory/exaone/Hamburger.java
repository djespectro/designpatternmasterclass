package com.mac.designpatternsmasterclass.factory.exaone;

public class Hamburger {

    protected String name;
    protected String sauce;
    protected String buns;

    public void prepare() {
        System.out.println("Preparing... " + name);
        System.out.println("Adding...... " + sauce);
        System.out.println("Adding...... " + buns);
    }

    public void cook() {
        System.out.println("Cooking.....");
    }

    public void box() {
        System.out.println("Boxing......");
    }

    public String getName() {
        return name;
    }
}
