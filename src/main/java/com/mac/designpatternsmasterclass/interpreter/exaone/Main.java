package com.mac.designpatternsmasterclass.interpreter.exaone;

public class Main {

    private InterpreterContext context;

    public Main(InterpreterContext context) {
        this.context = context;
    }

    private String interpret(String str) {
        Expression expression;

        int value = Integer.parseInt(str.substring(0, str.indexOf(" ")));
        if (str.toLowerCase().contains("hex")) {
            expression = new IntToHexExpression(value);
        } else if (str.toLowerCase().contains("binary")) {
            expression = new IntToHexExpression(value);
        } else {
            return str;
        }

        return expression.interpreter(context);

    }

    public static void main(String[] args) {
        String number = "13 in Binary";
        String hex = "255 in Hexa";

        Main interpreter = new Main(new InterpreterContext());
        System.out.println(number + " = " + interpreter.interpret(number));
        System.out.println(hex + " = " + interpreter.interpret(hex));

    }

}
