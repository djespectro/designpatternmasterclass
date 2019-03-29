package com.mac.designpatternsmasterclass.chainofresponsability;

public abstract class PurchasePower {

    protected static final int BASE = 1000;
    protected PurchasePower successor;

    abstract protected double getAllowed();
    abstract protected String getRole();

    public void processRequest(PurchaseRequest request){
        if(request.getAmount() <= this.getAllowed()){
            System.out.println(this.getRole() + " will approve $" + request.getAmount());
        } else if(successor != null){
            successor.processRequest(request);
        }
    }

    public void setSuccessor(PurchasePower successor){
        this.successor = successor;
    }

    public PurchasePower getSuccessor() {
        return successor;
    }
}
