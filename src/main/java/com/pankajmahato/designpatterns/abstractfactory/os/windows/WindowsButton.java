package com.pankajmahato.designpatterns.abstractfactory.os.windows;

import com.pankajmahato.designpatterns.abstractfactory.Button;

public class WindowsButton implements Button {
    @Override
    public void click() {
        System.out.println("Clicked windows button");
    }
}
