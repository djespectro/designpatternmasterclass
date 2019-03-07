package com.mac.designpatternsmasterclass.observer.exaone;

public class EmailTopicSubscriber implements Observer {

    private Subject subject;
    private String name;

    public EmailTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String) subject.getUpdate(this);
        if(msg == null){
            System.out.println(name + ", No new message for this subject!");
        } else{
            System.out.println(name + ", Retrieving new message: " + msg);
        }
    }

    @Override
    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
