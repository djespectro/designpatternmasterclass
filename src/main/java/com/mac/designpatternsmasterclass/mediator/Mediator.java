package com.mac.designpatternsmasterclass.mediator;

public interface Mediator {

    void sendMessage(Aircraft aircraft, String message);

    void addAircraft(Aircraft aircraft);

}
