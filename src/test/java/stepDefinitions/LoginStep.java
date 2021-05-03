package stepDefinitions;

import com.codeborne.selenide.Condition;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pageObject.LoginPageObject;
import pageObject.ProdutoPageObject;
import suporte.Web;

public class LoginStep {

    LoginPageObject loginPageObject = new LoginPageObject();
    ProdutoPageObject produtoPageObject = new ProdutoPageObject();
    Web web = new Web();


    @Dado("que eu estou acessando a aplicação")
    public void que_eu_estou_acessando_a_aplicação() {
        web.abrirNavegador("chrome", "https://www.saucedemo.com/");
    }

    @Quando("eu digito o usuário {string}")
    public void eu_digito_o_usuário(String usuario) {
        loginPageObject.getInputUserName().setValue(usuario);
    }

    @Quando("digito a senha {string}")
    public void digito_a_senha(String senha) {
        loginPageObject.getInputPassword().setValue(senha);
    }

    @Quando("clicar em login")
    public void clicar_em_login() {
        loginPageObject.getInputLoginBtn().click();
    }

    @Então("eu devo acessar a pagina de produtos")
    public void eu_devo_acessar_a_pagina_de_produtos() {
        produtoPageObject.getSpanProduct().should(Condition.appear);
    }

    @Então("eu não devo logar no sistema")
    public void eu_não_devo_logar_no_sistema() {
        loginPageObject.getDivErroMsn().should(Condition.exist);
    }


}
