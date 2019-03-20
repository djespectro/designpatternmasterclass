package com.mac.designpatternsmasterclass.memento.exatwo;

import java.util.Optional;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Originator originator;
        Optional<Memento> memento;
        CareTaker careTaker = new CareTaker();
        User user;

        user = new User("Andres Manuel", "Lopez", "andres@amlo.hotmail.com");
        originator = new Originator(user);
        memento = Optional.of(originator.createMemento());
        memento.ifPresent(m -> careTaker.addMemento(m));

        user.setEmail("manuel@amlo.gob.mx");
        originator.setState(user);
        memento = Optional.of(originator.createMemento());
        memento.ifPresent(m -> careTaker.addMemento(m));

        user.setEmail("lopez@amlo.gob.mx");
        originator.setState(user);
        memento = Optional.of(originator.createMemento());
        memento.ifPresent(m -> careTaker.addMemento(m));

        user.setEmail("obrador@amlo.gob.mx");
        originator.setState(user);

        System.out.println("Current state: " + originator.getState());

        memento = careTaker.getMemento();
        memento.ifPresent(m -> {
            originator.setMemento(m);
            System.out.println("Previews state: " + originator.getState());
        });


        memento = careTaker.getMemento();
        memento.ifPresent(m -> {
            originator.setMemento(m);
            System.out.println("Previews state: " + originator.getState());
        });

        memento = careTaker.getMemento();
        memento.ifPresent(m -> {
            originator.setMemento(m);
            System.out.println("Previews state: " + originator.getState());
        });


        memento = careTaker.getMemento();
        memento.ifPresent(m -> {
            originator.setMemento(m);
            System.out.println("Previews state: " + originator.getState());
        });

    }

}
