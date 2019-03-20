package com.mac.designpatternsmasterclass.memento.exathree;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Originator originator;
        User user;

        user = new User("Andres Manuel", "Lopez", "andres@amlo.hotmail.com");
        originator = new Originator(user);
        originator.saveState();

        user.setEmail("manuel@amlo.gob.mx");
        originator.setState(user);
        originator.saveState();

        user.setEmail("lopez@amlo.gob.mx");
        originator.setState(user);
        originator.saveState();

        user.setEmail("obrador@amlo.gob.mx");
        originator.setState(user);
        originator.saveState();

        System.out.println("Current state: " + originator.getState());

        originator.undo();
        System.out.println("Previews state: " + originator.getState());


        originator.undo();
        System.out.println("Previews state: " + originator.getState());

        originator.undo();
        System.out.println("Previews state: " + originator.getState());

        originator.undo();
        System.out.println("Previews state: " + originator.getState());

    }

}
