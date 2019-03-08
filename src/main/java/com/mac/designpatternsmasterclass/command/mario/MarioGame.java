package com.mac.designpatternsmasterclass.command.mario;

public class MarioGame {

    private String name;

    public MarioGame(String name) {
        this.name = name;
    }

    public void moveUp(){
        System.out.println(name + ", Move up");
    }
    public void moveDown(){
        System.out.println(name + ", Move down");
    }
    public void moveLeft(){
        System.out.println(name + ", Move to left");
    }
    public void moveRight(){
        System.out.println(name + ", Move to right");
    }
    public void btnAPressed(){
        System.out.println(name + ", Hit");
    }
    public void btnBPressed(){
        System.out.println(name + ", Jump");
    }

}
