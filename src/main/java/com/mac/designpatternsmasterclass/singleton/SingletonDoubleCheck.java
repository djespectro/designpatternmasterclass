package com.mac.designpatternsmasterclass.singleton;

public class SingletonDoubleCheck {

    private volatile static SingletonDoubleCheck uniqueInstance;
    private String name;

    private SingletonDoubleCheck() {
    }

    // Double check locking
    public static SingletonDoubleCheck getInstance(){
        if(uniqueInstance == null){
            synchronized(SingletonDoubleCheck.class){
                if(uniqueInstance == null){
                    uniqueInstance = new SingletonDoubleCheck();
                }
            }
        }
        return uniqueInstance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
