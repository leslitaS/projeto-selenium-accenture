# language: pt
# encoding: utf-8
@Test
Funcionalidade: Accesar o site da Accenture e mostrar a Lista de Serviços

  Cenário: Listar Serviços da Accenture
    Dado que eu estou no site da accenture
    Quando clico no <menu> serviços
    Então deve mostrar os "serviços" abaixo
