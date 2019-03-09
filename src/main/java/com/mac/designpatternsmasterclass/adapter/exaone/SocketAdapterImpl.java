package com.mac.designpatternsmasterclass.adapter.exaone;

public class SocketAdapterImpl implements SocketAdapter {

    private Socket socket;

    public SocketAdapterImpl(Socket socket) {
        this.socket = socket;
    }

    @Override
    public Volt get120Volts() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volts() {
        Volt volt = new Volt(socket.getVolt().getVolts() / 10);
        return volt;
    }

    @Override
    public Volt get3Volts() {
        Volt volt = new Volt(socket.getVolt().getVolts() / 40);
        return volt;
    }
}
