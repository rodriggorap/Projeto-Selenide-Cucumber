package pageObject;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class CheckoutOverviewObject {

    private SelenideElement spanOverview = $(byText("Checkout: Overview"));
    private SelenideElement btnCancel = $(By.id("cancel"));
    private SelenideElement btnFinish = $(By.id("finish"));

    public SelenideElement getSpanOverview() {
        return spanOverview;
    }

    public void setSpanOverview(SelenideElement spanOverview) {
        this.spanOverview = spanOverview;
    }

    public SelenideElement getBtnCancel() {
        return btnCancel;
    }

    public void setBtnCancel(SelenideElement btnCancel) {
        this.btnCancel = btnCancel;
    }

    public SelenideElement getBtnFinish() {
        return btnFinish;
    }

    public void setBtnFinish(SelenideElement btnFinish) {
        this.btnFinish = btnFinish;
    }
}
