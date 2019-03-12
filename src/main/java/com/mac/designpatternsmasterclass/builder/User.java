package com.mac.designpatternsmasterclass.builder;

public class User {

    private String firstName;
    private String lastName;
    private int age;
    private String email;

    private User() {
    }

    private User(UserBuilder userBuilder) {
        firstName = userBuilder.firstName;
        lastName = userBuilder.lastName;
        age = userBuilder.age;
        email = userBuilder.email;
    }

    public static class UserBuilder{

        private String firstName;
        private String lastName;
        private int age;
        private String email;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age(int age){
            this.age = age;
            return this;
        }

        public UserBuilder email(String email){
            this.email = email;
            return this;
        }

        public User build(){
            return new User(this);
        }

    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
