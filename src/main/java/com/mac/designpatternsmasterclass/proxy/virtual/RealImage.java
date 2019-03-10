package com.mac.designpatternsmasterclass.proxy.virtual;

public class RealImage implements Image {

    private final String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadingImageFromDisk();
    }

    @Override
    public void displayImage() {
        System.out.println("Displaying " + fileName);
    }

    private void loadingImageFromDisk(){
        System.out.println("- Loading image " + fileName + " from Disk!");
    }


}
