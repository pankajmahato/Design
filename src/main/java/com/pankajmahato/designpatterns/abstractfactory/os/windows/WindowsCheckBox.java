package com.pankajmahato.designpatterns.abstractfactory.os.windows;

import com.pankajmahato.designpatterns.abstractfactory.CheckBox;

public class WindowsCheckBox implements CheckBox {
    @Override
    public void click() {
        System.out.println("Clicked windows checkbox");
    }
}
