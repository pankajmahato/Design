package com.pankajmahato.designpatterns.abstractfactory.os.mac;

import com.pankajmahato.designpatterns.abstractfactory.Button;

public class MacButton implements Button {
    @Override
    public void click() {
        System.out.println("Clicked mac button");
    }
}
