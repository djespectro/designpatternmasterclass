package com.mac.designpatternsmasterclass.memento.exathree;

public class Originator {

    private User state;

    private CareTaker careTaker = new CareTaker();

    public Originator(User state) {
        this.state = state;
    }

    public User getState() {
        return state;
    }

    public void setState(User state) {
        this.state = state;
    }

    public void saveState() throws CloneNotSupportedException {
        Memento<User> userMemento = new Memento<>(state.clone());
        careTaker.addMemento(userMemento);
    }

    public void undo(){
        careTaker.getMemento().ifPresent(memento -> {
            state = (User) memento.getState();
        });
    }

}
