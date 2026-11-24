package com.pankajmahato.designpatterns.abstractfactory;

import com.pankajmahato.designpatterns.abstractfactory.uifactory.MacFactory;
import com.pankajmahato.designpatterns.abstractfactory.uifactory.WindowsFactory;

public class Runner {

    public static void main(String[] args) {
        Application macApplication = new Application(new MacFactory());
        macApplication.click();

        Application windowsApplication = new Application(new WindowsFactory());
        windowsApplication.click();
    }
}
