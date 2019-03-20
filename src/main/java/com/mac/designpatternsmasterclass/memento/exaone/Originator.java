package com.mac.designpatternsmasterclass.memento.exaone;

public class Originator {

    private String state;

    public Originator(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Momento createMomento(){
        return new Momento(state);
    }

    public void setMomento(Momento momento){
        state = momento.getState();
    }

}
