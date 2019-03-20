package com.mac.designpatternsmasterclass.memento.exatwo;

public class Originator {

    private User state;

    public Originator(User state) {
        this.state = state;
    }

    public User getState() {
        return state;
    }

    public void setState(User state) {
        this.state = state;
    }

    public Memento<User> createMemento() throws CloneNotSupportedException {
        return new Memento<>(state.clone());
    }

    public void setMemento(Memento<User> memento){
        state = memento.getState();
    }

}
