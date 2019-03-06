package com.mac.designpatternsmasterclass.singleton;

public class SingletonEager {

    private static SingletonEager uniqueInstance = new SingletonEager();

    private String name;

    private SingletonEager() {
    }

    public static SingletonEager getInstance(){
        return uniqueInstance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
