package stepDefinitions;

import com.codeborne.selenide.Condition;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObject.*;

public class FinalizarCompra {

    ProdutoPageObject produtoPageObject = new ProdutoPageObject();
    CarrinhoDeComprasPageObject carrinhoDeComprasPageObject = new CarrinhoDeComprasPageObject();
    CheckoutInformationPageObject checkoutInformationPageObject = new CheckoutInformationPageObject();
    CheckoutOverviewObject checkoutOverviewObject = new CheckoutOverviewObject();
    CheckoutCompletePageObject checkoutCompletePageObject = new CheckoutCompletePageObject();

    @Dado("que eu tenha um produto no carrinho de compra")
    public void que_eu_tenha_um_produto_no_carrinho_de_compra() {
        produtoPageObject.getBtnAddToCart().click();
    }

    @Quando("inicio a compra de um produto")
    public void inicio_a_compra_de_um_produto() {
        carrinhoDeComprasPageObject.getBtnCheckout().click();
        checkoutInformationPageObject.getInputFirtName().setValue("Rodrigo");
        checkoutInformationPageObject.getInputLastName().setValue("Amaro");
        checkoutInformationPageObject.getInputCodePostal().setValue("4256584755");
        checkoutInformationPageObject.getInputContinue().click();
    }

    @Entao("eu devo finalizar um compra com sucesso")
    public void eu_devo_finalizar_um_compra_com_sucesso() {
        checkoutOverviewObject.getBtnFinish().click();
        checkoutCompletePageObject.getSpanCheckComplete().should(Condition.appear);
    }

    @Entao("eu posso cancelar uma compra que ainda não foi finalizada")
    public void eu_posso_cancelar_uma_compra_que_ainda_não_foi_finalizada() {
        checkoutOverviewObject.getBtnCancel().click();
    }
}
