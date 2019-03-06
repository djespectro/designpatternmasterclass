package com.mac.designpatternsmasterclass.singleton;

public class SingletonLazy {

    private static SingletonLazy uniqueInstance;

    private String name;

    private SingletonLazy() {
    }

    public static synchronized SingletonLazy getInstance() {
        if (uniqueInstance == null) uniqueInstance = new SingletonLazy();
        return uniqueInstance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
