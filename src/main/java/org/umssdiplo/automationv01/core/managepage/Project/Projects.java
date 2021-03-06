package org.umssdiplo.automationv01.core.managepage.Project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.dialogo.RegistroDialogo;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class Projects extends BasePage {

    @FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/span/a")
    private WebElement newProjectBtn;

    @FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/span/a")
    private WebElement containerMat;

    @FindBy(name = "marca")
    private WebElement projectNameInput;

    //@FindBy(xpath = "//*[@id=\"mat-input-2\"]")
    //private WebElement projectNameInput;

    public RegistroDialogo clickPlusIcon() {
        CommonEvents.clickButton(newProjectBtn);
        return new RegistroDialogo();

        //CommonEvents.waitWebElementVisible(containerMat);
        //CommonEvents.setInputField(projectNameInput, "nombre del proyecto");
    }
/*
    public void clickRegistrarMaquinariaTab() {
        CommonEvents.clickButton(newProjectBtn);

        String projectName = "Project name";

        //CommonEvents.setInputField(projectNameInput, projectName);
        CommonEvents.waitWebElementVisible(containerMat);
    }
    */
}
