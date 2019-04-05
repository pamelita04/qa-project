package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.Login.Isocode;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionPHPtravel {
    private Login login;
    private Isocode isocode;

    @Given("^'PHP travel' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        login = LoadPage.loginPage();
    }

    @And("^set my credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        login.setCredentials();
    }

    @Given("^'Catalog' page is loaded$")
    public void catalogPageIsLoaded() {
        login = LoadPage.loginPage();
    }

    @And("^click 'Registrar Item' button in 'footer-right' page$")
    public void clickRegistrarItemButtonInFooterRightPage() {
        login.clickButtonAdd();
    }

//    @And("^click 'Registrar Accidente' tab in 'header' page$")
//    public void clickRegistrarAccidenteTabInHeaderPage() {
//        isocode.clickRegistrarAccidenteTab();
//    }
}
