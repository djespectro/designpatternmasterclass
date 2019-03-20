package com.mac.designpatternsmasterclass.memento.exathree;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CareTaker {

    private List<Memento> mementoList = new ArrayList<>();

    public void addMemento(Memento memento){
        mementoList.add(memento);
    }

    public Optional<Memento> getMemento(){
        Memento memento = null;

        if(mementoList.size()>0){
            memento = mementoList.get(mementoList.size()-1);
            mementoList.remove(memento);
        }

        return Optional.ofNullable(memento);
    }

}
