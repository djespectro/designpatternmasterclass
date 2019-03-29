package com.mac.designpatternsmasterclass.chainofresponsability;

public class Main {

    public static void main(String[] args) {

        ManagerPurchasePower managerPurchasePower = new ManagerPurchasePower();
        DirectorPurchasePower directorPurchasePower = new DirectorPurchasePower();
        CEOPurchasePower ceoPurchasePower = new CEOPurchasePower();

        managerPurchasePower.setSuccessor(directorPurchasePower);
        directorPurchasePower.setSuccessor(ceoPurchasePower);

        managerPurchasePower.processRequest(new PurchaseRequest(100, "Buy Things"));
        managerPurchasePower.processRequest(new PurchaseRequest(1001, "Buy Things"));
        managerPurchasePower.processRequest(new PurchaseRequest(10001, "Buy Things"));
        managerPurchasePower.processRequest(new PurchaseRequest(100001, "Buy Things"));

    }


}
