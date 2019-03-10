package com.mac.designpatternsmasterclass.proxy.protection;

import java.util.ArrayList;
import java.util.List;

public class ProxyBank implements Bank{

    private Bank bank = new RealBank();
    private List<String> bannedClients = new ArrayList<>();

    public ProxyBank() {
        bannedClients.add("fox");
        bannedClients.add("kim");
        bannedClients.add("maduro");
    }

    @Override
    public void withDrawMoney(String clientName) throws SecurityException {
        if(bannedClients.contains(clientName)){
            throw new SecurityException("User not allowed!");
        }

        bank.withDrawMoney(clientName);

    }

}
