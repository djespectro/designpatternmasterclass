package com.mac.designpatternsmasterclass.observer.exaone;

public class Main {

    public static void main(String[] args) {

        // (Broadcaster)
        EmailSubject emailSubject= new EmailSubject();

        // Create Observers
        Observer observerOne = new EmailTopicSubscriber("First Observer");
        Observer observerTwo = new EmailTopicSubscriber("Second Observer");
        Observer observerThree = new EmailTopicSubscriber("Third Observer");

        // Register them
        emailSubject.register(observerOne);
        emailSubject.register(observerTwo);
        emailSubject.register(observerThree);

        // Attach observers to subject
        observerOne.setSubject(emailSubject);
        observerTwo.setSubject(emailSubject);
        observerThree.setSubject(emailSubject);

        // Check for updates
        observerOne.update();
        observerTwo.update();
        observerThree.update();

        // Provider / Subject (Broadcaster)
        emailSubject.postMessage("Hello everyone!");

        // Check for updates
        observerOne.update();
        observerTwo.update();
        observerThree.update();

    }

}
