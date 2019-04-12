package org.umssdiplo.automationv01.core.managepage.dialogo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class RegistroDialogo extends BasePage {
    @FindBy(xpath = "//*[@id=\"mat-input-0\"]")
    private WebElement containerDialog;

    @FindBy(name = "marca")
    private WebElement projectNameField;

    public RegistroDialogo() {
        CommonEvents.waitWebElementVisible(containerDialog);
    }

    public void insertProjectName(String nameProject){
        CommonEvents.setInputField(containerDialog, nameProject);
    }
}
