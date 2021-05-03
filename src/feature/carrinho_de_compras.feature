#language: pt

  Funcionalidade: Carrinho de compras

    Como usuário gostaria de acessar o sistema e adicionar ou remover
    itens ao carrinho de compras

  Contexto:
    Dado que eu estou acessando a aplicação
    Quando eu digito o usuário "standard_user"
    E digito a senha "secret_sauce"
    E clicar em login
    Então eu devo acessar a pagina de produtos

  Cenario: Adicinar um item no carrinho de compras
    Quando eu adiciono um produto no carrinho de compras
    E acesso o carrinho de compras
    Entao eu visualizo o produto que foi adicionado ao carrinho de compras

  Cenario: Remover um item do carrinho de compras
    Quando eu acesso o carrinho de compras
    E removo um item
    Entao o item deverar ser excluido do carrinho de compras

