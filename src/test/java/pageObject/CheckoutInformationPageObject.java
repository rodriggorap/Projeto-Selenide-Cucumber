package pageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class CheckoutInformationPageObject {

    private SelenideElement inputFirtName = $(By.id("first-name"));
    private SelenideElement inputLastName = $(By.id("last-name"));
    private SelenideElement inputCodePostal = $(By.id("postal-code"));
    private SelenideElement btnCancel = $(By.id("cancel"));
    private SelenideElement inputContinue = $(By.id("continue"));

    public SelenideElement getInputFirtName() {
        return inputFirtName;
    }

    public void setInputFirtName(SelenideElement inputFirtName) {
        this.inputFirtName = inputFirtName;
    }

    public SelenideElement getInputLastName() {
        return inputLastName;
    }

    public void setInputLastName(SelenideElement inputLastName) {
        this.inputLastName = inputLastName;
    }

    public SelenideElement getInputCodePostal() {
        return inputCodePostal;
    }

    public void setInputCodePostal(SelenideElement inputCodePostal) {
        this.inputCodePostal = inputCodePostal;
    }

    public SelenideElement getBtnCancel() {
        return btnCancel;
    }

    public void setBtnCancel(SelenideElement btnCancel) {
        this.btnCancel = btnCancel;
    }

    public SelenideElement getInputContinue() {
        return inputContinue;
    }

    public void setInputContinue(SelenideElement inputContinue) {
        this.inputContinue = inputContinue;
    }
}
