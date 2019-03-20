package com.mac.designpatternsmasterclass.visitor;

import com.mac.designpatternsmasterclass.visitor.clothes.*;

public class TaxVisitor implements Visitor{

    @Override
    public double visit(Jacket jacket) {
        System.out.print("Jacket - Final price: ");
        return (jacket.getPrice() * .10) + jacket.getPrice();
    }

    @Override
    public double visit(Pants pants) {
        System.out.print("Pants - Final price: ");
        return (pants.getPrice() * .10) + pants.getPrice();
    }

    @Override
    public double visit(Shorts shorts) {
        System.out.print("Shorts - Final price: ");
        return (shorts.getPrice() * .10) + shorts.getPrice();
    }

    @Override
    public double visit(TShirt tShirt) {
        System.out.print("TShirt - Final price: ");
        return (tShirt.getPrice() * .10) + tShirt.getPrice();
    }

}
