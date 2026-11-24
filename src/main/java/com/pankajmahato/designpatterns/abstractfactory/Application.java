package com.pankajmahato.designpatterns.abstractfactory;

import com.pankajmahato.designpatterns.abstractfactory.uifactory.UiFactory;

public class Application {

    private Button button;
    private CheckBox checkBox;

    public Application(UiFactory uiFactory) {
        this.button = uiFactory.createButton();
        this.checkBox = uiFactory.createCheckBox();
    }

    public void click() {
        button.click();
        checkBox.click();
    }
}
