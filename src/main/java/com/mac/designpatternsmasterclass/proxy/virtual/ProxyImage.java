package com.mac.designpatternsmasterclass.proxy.virtual;

public class ProxyImage implements Image {

    private Image image;
    private final String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void displayImage() {
        if(image == null){
            image = new RealImage(fileName);
        }
        image.displayImage();
    }

}
