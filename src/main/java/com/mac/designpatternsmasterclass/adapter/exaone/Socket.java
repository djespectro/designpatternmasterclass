package com.mac.designpatternsmasterclass.adapter.exaone;

public class Socket {

    public Socket() {
    }

    public Volt getVolt(){
        return new Volt(120);
    }

}
