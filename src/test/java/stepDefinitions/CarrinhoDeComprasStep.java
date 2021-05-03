package stepDefinitions;

import com.codeborne.selenide.Condition;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObject.CarrinhoDeComprasPageObject;
import pageObject.ProdutoPageObject;

public class CarrinhoDeComprasStep {

    ProdutoPageObject produtoPageObject = new ProdutoPageObject();
    CarrinhoDeComprasPageObject carrinhoDeComprasPageObject = new CarrinhoDeComprasPageObject();

    @Quando("eu adiciono um produto no carrinho de compras")
    public void eu_adiciono_um_produto_no_carrinho_de_compras() {
        produtoPageObject.getBtnAddToCart().click();
    }

    @Quando("acesso o carrinho de compras")
    public void acesso_o_carrinho_de_compras() {
        produtoPageObject.getLinkCarrinho().click();
    }

    @Entao("eu visualizo o produto que foi adicionado ao carrinho de compras")
    public void eu_visualizo_o_produto_que_foi_adicionado_ao_carrinho_de_compras() {
        carrinhoDeComprasPageObject.getDivProduto().should(Condition.exist);
    }

    @Quando("eu acesso o carrinho de compras")
    public void eu_acesso_o_carrinho_de_compras() {
        produtoPageObject.getLinkCarrinho().click();
    }

    @Quando("removo um item")
    public void removo_um_item() {
        carrinhoDeComprasPageObject.getBtnRemoveProduto().click();
    }

    @Entao("o item deverar ser excluido do carrinho de compras")
    public void o_item_deverar_ser_excluido_do_carrinho_de_compras() {
        carrinhoDeComprasPageObject.getDivProduto().shouldNot(Condition.exist);
    }

}
