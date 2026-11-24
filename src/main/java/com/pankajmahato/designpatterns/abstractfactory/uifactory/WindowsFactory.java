package com.pankajmahato.designpatterns.abstractfactory.uifactory;

import com.pankajmahato.designpatterns.abstractfactory.Button;
import com.pankajmahato.designpatterns.abstractfactory.CheckBox;
import com.pankajmahato.designpatterns.abstractfactory.os.windows.WindowsButton;
import com.pankajmahato.designpatterns.abstractfactory.os.windows.WindowsCheckBox;

public class WindowsFactory implements UiFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
