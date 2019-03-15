package com.mac.designpatternsmasterclass.prototype;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Person personBase = new Person("George", 50);
        System.out.println(personBase);
        System.out.println("- Memory location: " + System.identityHashCode(personBase));

        Person personOne = (Person) personBase.clone();
        System.out.println(personOne);
        System.out.println("- Memory location: " + System.identityHashCode(personOne));

        System.out.println("---");

        Human humanBase = new Human("Homo sapiens", 18);
        System.out.println(humanBase);
        System.out.println("- Memory location: " + System.identityHashCode(humanBase));

        Human humanOne = humanBase.clone();
        System.out.println(humanOne);
        System.out.println("- Memory location: " + System.identityHashCode(humanOne));


    }


}
