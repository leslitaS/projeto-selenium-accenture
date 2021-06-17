# language: pt
# encoding: utf-8


  Funcionalidade: Acessar o site da accenture a mostrar a lista de serviços

    Cenário: Clicar no serviço cloud
      Dado que eu estou no site da accenture
      Quando clico no <menu> serviços
      E clico no item do menu cloud
      Então devo encontrar o título "Serviços de Cloud"

      Exemplos:
        | menus      |
        | "Serviços" |
