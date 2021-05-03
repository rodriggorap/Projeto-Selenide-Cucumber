package pageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class ProdutoPageObject {

    private SelenideElement spanProduct = $(byText("Products"));
    private SelenideElement btnAddToCart = $(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
    private SelenideElement linkCarrinho = $(By.className("shopping_cart_link"));

    public SelenideElement getLinkCarrinho() {
        return linkCarrinho;
    }

    public void setLinkCarrinho(SelenideElement linkCarrinho) {
        this.linkCarrinho = linkCarrinho;
    }

    public SelenideElement getBtnAddToCart() {
        return btnAddToCart;
    }

    public void setBtnAddToCart(SelenideElement btnAddToCart) {
        this.btnAddToCart = btnAddToCart;
    }

    public SelenideElement getSpanProduct() {
        return spanProduct;
    }

    public void setSpanProduct(SelenideElement spanProduct) {
        this.spanProduct = spanProduct;
    }
}
