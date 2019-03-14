package com.mac.designpatternsmasterclass.factory.exathree.source;

public class Metric {

    private float value;
    private String device;

    public Metric(float value, String device) {
        this.value = value;
        this.device = device;
    }

    public float getValue() {
        return value;
    }

    public String getDevice() {
        return device;
    }

    @Override
    public String toString() {
        return "Metric{" +
                "value=" + value +
                ", device='" + device + '\'' +
                '}';
    }
}
