package org.umssdiplo.automationv01.core.managepage.Login;

        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.umssdiplo.automationv01.core.managepage.BasePage;
        import org.umssdiplo.automationv01.core.utils.CommonEvents;
        import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class Isocode extends BasePage {
    @FindBy(name = "email")
    private WebElement usernameInputField;

    @FindBy(name = "password")
    private WebElement passwordInputField;

    @FindBy(css = ".btn-primary.btn-block")
    private WebElement loginBtn;

    /*
     atraves del css o del name o del id se puede setear aca
    */
    @FindBy(id = "")
    private WebElement registrarAccidenteTab;

    public void setCredentials() {
        String username = PropertyAccessor.getInstance().getUser();
        String password = PropertyAccessor.getInstance().getPassword();
        System.out.println(username);
        System.out.println(password);
        CommonEvents.setInputField(usernameInputField, username);
        CommonEvents.setInputField(passwordInputField, password);
        CommonEvents.clickButton(loginBtn);
    }

    public RegistrarAccidente clickRegistrarAccidenteTab() {
        CommonEvents.clickButton(registrarAccidenteTab);
        return RegistrarAccidente();
    }
}
