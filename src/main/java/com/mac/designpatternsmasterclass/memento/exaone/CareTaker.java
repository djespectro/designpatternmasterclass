package com.mac.designpatternsmasterclass.memento.exaone;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private List<Momento> momentoList = new ArrayList<>();

    public void addMomento(Momento momento){
        momentoList.add(momento);
    }

    public Momento getMomento(int index){
        return momentoList.get(index);
    }

}
