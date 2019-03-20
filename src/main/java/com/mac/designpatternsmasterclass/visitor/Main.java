package com.mac.designpatternsmasterclass.visitor;

import com.mac.designpatternsmasterclass.visitor.clothes.*;

public class Main {

    public static void main(String[] args) {

        TaxVisitor taxVisitor = new TaxVisitor();

        Jacket jacket = new Jacket(50);
        Pants pants = new Pants(30);
        Shorts Short = new Shorts(40);
        TShirt tshirt = new TShirt(60);

        System.out.println(jacket.accept(taxVisitor));
        System.out.println(pants.accept(taxVisitor));
        System.out.println(Short.accept(taxVisitor));
        System.out.println(tshirt.accept(taxVisitor));

    }

}
