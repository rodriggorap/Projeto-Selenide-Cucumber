#language: pt

Funcionalidade: Logar no Sistema

  Como usuário
  Gostaria de acessar o sistema utilizando meu login de usuário e senha

  Cenario: Fazer login com sucesso
    Dado que eu estou acessando a aplicação
    Quando eu digito o usuário "standard_user"
    E digito a senha "secret_sauce"
    E clicar em login
    Então eu devo acessar a pagina de produtos

  Cenario: Não permitir logar no sistema
    Dado que eu estou acessando a aplicação
    Quando eu digito o usuário "teste"
    E digito a senha "teste"
    E clicar em login
    Então eu não devo logar no sistema


