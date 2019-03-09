package com.mac.designpatternsmasterclass.adapter.exaone;

public class Main {

    public static void main(String[] args) {

        Socket socket = new Socket();
        SocketAdapter adapter = new SocketAdapterImpl(socket);

        Volt volt = socket.getVolt();
        System.out.println("Socket: " + volt.getVolts());

        volt = adapter.get120Volts();
        System.out.println("Adapter one: " + volt.getVolts());

        volt = adapter.get12Volts();
        System.out.println("Adapter two: " + volt.getVolts());

        volt = adapter.get3Volts();
        System.out.println("Adapter three: " + volt.getVolts());

    }

}
