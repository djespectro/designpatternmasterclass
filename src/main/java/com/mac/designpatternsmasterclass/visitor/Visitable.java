package com.mac.designpatternsmasterclass.visitor;

public interface Visitable<T> {

    double accept(Visitor visitor);

}
