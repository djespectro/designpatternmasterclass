package com.mac.designpatternsmasterclass.interpreter.exaone;

public class IntToBinaryExpression implements Expression{

    private int i;

    public IntToBinaryExpression(int i) {
        this.i = i;
    }

    @Override
    public String interpreter(InterpreterContext context) {
        return context.getBinaryFormat(i);
    }

}
