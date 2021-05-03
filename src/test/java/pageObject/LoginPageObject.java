package pageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class LoginPageObject {
    private SelenideElement inputUserName = $(By.id("user-name"));
    private SelenideElement inputPassword = $(By.id("password"));
    private SelenideElement inputLoginBtn = $(By.id("login-button"));
    private SelenideElement divErroMsn = $(By.className("error-message-container"));

    public SelenideElement getDivErroMsn() {
        return divErroMsn;
    }

    public void setDivErroMsn(SelenideElement divErroMsn) {
        this.divErroMsn = divErroMsn;
    }

    public SelenideElement getInputUserName() {
        return inputUserName;
    }

    public void setInputUserName(SelenideElement inputUserName) {
        this.inputUserName = inputUserName;
    }

    public SelenideElement getInputPassword() {
        return inputPassword;
    }

    public void setInputPassword(SelenideElement inputPassword) {
        this.inputPassword = inputPassword;
    }

    public SelenideElement getInputLoginBtn() {
        return inputLoginBtn;
    }

    public void setInputLoginBtn(SelenideElement inputLoginBtn) {
        this.inputLoginBtn = inputLoginBtn;
    }
}

