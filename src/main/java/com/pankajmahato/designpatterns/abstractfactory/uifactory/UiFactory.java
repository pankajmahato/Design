package com.pankajmahato.designpatterns.abstractfactory.uifactory;

import com.pankajmahato.designpatterns.abstractfactory.Button;
import com.pankajmahato.designpatterns.abstractfactory.CheckBox;

public interface UiFactory {

    Button createButton();

    CheckBox createCheckBox();
}
