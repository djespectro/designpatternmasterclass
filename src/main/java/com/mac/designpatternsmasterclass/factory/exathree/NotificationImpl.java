package com.mac.designpatternsmasterclass.factory.exathree;

import com.mac.designpatternsmasterclass.factory.exathree.filter.DI;
import com.mac.designpatternsmasterclass.factory.exathree.filter.UF;
import com.mac.designpatternsmasterclass.factory.exathree.filter.UV;

public class NotificationImpl extends NotificationService {

    @Override
    protected NotificationType getNotificationType(String device, float value) {

        switch (device) {
            case "di":
                return new DI(device, value);
            case "uv":
             return new UV(device, value);
            case "uf":
                return new UF(device, value);
            default:
                throw new IllegalArgumentException();
        }

    }

}
