package com.mac.designpatternsmasterclass.visitor;

import com.mac.designpatternsmasterclass.visitor.clothes.Jacket;
import com.mac.designpatternsmasterclass.visitor.clothes.Pants;
import com.mac.designpatternsmasterclass.visitor.clothes.Shorts;
import com.mac.designpatternsmasterclass.visitor.clothes.TShirt;

public interface Visitor {

    double visit(Jacket jacket);

    double visit(Pants pants);

    double visit(Shorts shorts);

    double visit(TShirt tShirt);

}
