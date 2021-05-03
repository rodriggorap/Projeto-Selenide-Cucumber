package pageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class CarrinhoDeComprasPageObject {
    SelenideElement btnRemoveProduto = $(By.id("remove-sauce-labs-bolt-t-shirt"));
    SelenideElement btnContShopping = $(By.id("continue-shopping"));
    SelenideElement btnCheckout = $(By.id("checkout"));
    SelenideElement divProduto = $(byText("Sauce Labs Bolt T-Shirt"));

    public SelenideElement getDivProduto() {
        return divProduto;
    }

    public void setDivProduto(SelenideElement divProduto) {
        this.divProduto = divProduto;
    }

    public SelenideElement getBtnRemoveProduto() {
        return btnRemoveProduto;
    }

    public void setBtnRemoveProduto(SelenideElement btnRemoveProduto) {
        this.btnRemoveProduto = btnRemoveProduto;
    }

    public SelenideElement getBtnContShopping() {
        return btnContShopping;
    }

    public void setBtnContShopping(SelenideElement btnContShopping) {
        this.btnContShopping = btnContShopping;
    }

    public SelenideElement getBtnCheckout() {
        return btnCheckout;
    }

    public void setBtnCheckout(SelenideElement btnCheckout) {
        this.btnCheckout = btnCheckout;
    }
}
