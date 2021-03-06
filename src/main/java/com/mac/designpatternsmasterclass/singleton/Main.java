package com.mac.designpatternsmasterclass.singleton;

public class Main {

    public static void main(String[] args) {

        Singleton singletonOne = Singleton.getInstance();
        singletonOne.setName("Singleton");

        Singleton singletonTwo = Singleton.getInstance();

        System.out.println("singletonOne: " + singletonOne.getName());
        System.out.println("singletonTwo: " + singletonTwo.getName());

        SingletonLazy singletonLazyOne = SingletonLazy.getInstance();
        singletonLazyOne.setName("lazy");

        SingletonLazy singletonLazyTwo = SingletonLazy.getInstance();

        System.out.println("singletonLazyOne: " + singletonLazyOne.getName());
        System.out.println("singletonLazyTwo: " + singletonLazyTwo.getName());

        SingletonEager singletonEagerOne = SingletonEager.getInstance();
        singletonEagerOne.setName("Eager");

        SingletonEager singletonEagerTwo = SingletonEager.getInstance();

        System.out.println("singletonEagerOne: " + singletonEagerOne.getName());
        System.out.println("singletonEagerTwo: " + singletonEagerTwo.getName());

    }

}
