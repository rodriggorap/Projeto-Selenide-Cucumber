package pageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class CheckoutCompletePageObject {
    private SelenideElement spanCheckComplete = $(byText("Checkout: Complete!"));

    public SelenideElement getSpanCheckComplete() {
        return spanCheckComplete;
    }

    public void setSpanCheckComplete(SelenideElement spanCheckComplete) {
        this.spanCheckComplete = spanCheckComplete;
    }
}
