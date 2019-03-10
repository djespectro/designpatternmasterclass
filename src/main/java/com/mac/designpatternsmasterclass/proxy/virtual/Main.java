package com.mac.designpatternsmasterclass.proxy.virtual;

public class Main {

    public static void main(String[] args) {

        Image image1 = new ProxyImage("landscape.png");

        image1.displayImage();
        image1.displayImage();
        image1 = new ProxyImage("sky.png");
        image1.displayImage();
        image1.displayImage();

        System.out.println("-------------------------------------");

        Image image2 = new ProxyImage("Australia.png");
        image2.displayImage();
        image2.displayImage();
        image2.displayImage();


    }

}
