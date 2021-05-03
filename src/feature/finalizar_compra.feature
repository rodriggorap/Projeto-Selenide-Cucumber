#language: pt

  Funcionalidade: Finalizar compra

  Como usuário gostaria de acessar a
  aplicação e finalizar a compra de produto

  Contexto:
    Dado que eu estou acessando a aplicação
    Quando eu digito o usuário "standard_user"
    E digito a senha "secret_sauce"
    E clicar em login
    Então eu devo acessar a pagina de produtos

  Cenario: Finalizar a compra de um produto
    Dado que eu tenha um produto no carrinho de compra
    Quando acesso o carrinho de compras
    E inicio a compra de um produto
    Entao eu devo finalizar um compra com sucesso

  Cenario: Cancelar uma compra que ainda não foi finalizada
    Dado que eu tenha um produto no carrinho de compra
    Quando acesso o carrinho de compras
    E inicio a compra de um produto
    Entao eu posso cancelar uma compra que ainda não foi finalizada







