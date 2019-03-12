package com.mac.designpatternsmasterclass.builder;

public interface Person {

    String getFirstName();

    String getLastName();

    int getAge();

    String getEmail();

    class DefaultPerson implements Person {

        private String firstName;
        private String lastName;

        private int age;
        private String email;

        //Required parameters
        public DefaultPerson(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public DefaultPerson(Builder builder) {
            firstName = builder.getFirstName();
            lastName = builder.getLastName();
            age = builder.getAge();
            email = builder.getEmail();
        }

        @Override
        public String getFirstName() {
            return firstName;
        }

        @Override
        public String getLastName() {
            return lastName;
        }

        @Override
        public int getAge() {
            return age;
        }

        @Override
        public String getEmail() {
            return email;
        }

        @Override
        public String toString() {
            return "DefaultPerson{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", age=" + age +
                    ", email='" + email + '\'' +
                    '}';
        }
    }

    class Builder extends DefaultPerson {

        public Builder(String firstName, String lastName) {
            super(firstName, lastName);
        }

        public Builder age(int age) {
            this.age(age);
            return this;
        }

        public Builder email(String email) {
            this.email(email);
            return this;
        }

        public Person build() {
            return new DefaultPerson(this);
        }

    }

}
