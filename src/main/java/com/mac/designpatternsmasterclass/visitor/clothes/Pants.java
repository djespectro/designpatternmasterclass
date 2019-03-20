package com.mac.designpatternsmasterclass.visitor.clothes;

import com.mac.designpatternsmasterclass.visitor.Visitable;
import com.mac.designpatternsmasterclass.visitor.Visitor;

public class Pants extends Clothe implements Visitable {

    public Pants(double price) {
        super(price);
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
