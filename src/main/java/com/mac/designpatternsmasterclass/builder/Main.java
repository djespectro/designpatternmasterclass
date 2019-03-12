package com.mac.designpatternsmasterclass.builder;

public class Main {

    public static void main(String[] args) {
        User user = new User.UserBuilder("Barack","Obama")
                .age(55)
                .email("barack@obama.net")
                .build();

        System.out.println(user);

        Person person = new Person.Builder("Andre Manuel", "Lpez Obrador")
                .age(56)
                .email("andres@amlo.gob")
                .build();

        System.out.println(person);

    }

}
