package com.mac.designpatternsmasterclass.proxy.protection;

public interface Bank {

    void withDrawMoney(String clientName) throws SecurityException;

}
