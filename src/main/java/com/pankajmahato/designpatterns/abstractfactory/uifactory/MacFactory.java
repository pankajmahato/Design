package com.pankajmahato.designpatterns.abstractfactory.uifactory;

import com.pankajmahato.designpatterns.abstractfactory.Button;
import com.pankajmahato.designpatterns.abstractfactory.CheckBox;
import com.pankajmahato.designpatterns.abstractfactory.os.mac.MacButton;
import com.pankajmahato.designpatterns.abstractfactory.os.mac.MacCheckBox;

public class MacFactory implements UiFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
