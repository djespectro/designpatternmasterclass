package com.mac.designpatternsmasterclass.mediator;

import java.util.ArrayList;
import java.util.List;

public class MediatorImpl implements Mediator{

    private List<Aircraft> aircraftList;

    public MediatorImpl() {
        this.aircraftList = aircraftList = new ArrayList<>();
    }

    // I'm in charge to send the message to all
    @Override
    public void sendMessage(Aircraft aircraft, String message) {
        aircraftList.forEach(a ->{
            if(!a.equals(aircraft)){
                a.receive(message);
            }
        });
    }

    @Override
    public void addAircraft(Aircraft aircraft) {
        aircraftList.add(aircraft);
    }

}
