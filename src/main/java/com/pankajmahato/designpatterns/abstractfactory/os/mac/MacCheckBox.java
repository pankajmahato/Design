package com.pankajmahato.designpatterns.abstractfactory.os.mac;

import com.pankajmahato.designpatterns.abstractfactory.CheckBox;

public class MacCheckBox implements CheckBox {
    @Override
    public void click() {
        System.out.println("Clicked mac checkbox");
    }
}
