package com.mac.designpatternsmasterclass.prototype;

public class Human implements Prototype<Human> {

    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Human clone() throws CloneNotSupportedException {
        return (Human) super.clone();
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
