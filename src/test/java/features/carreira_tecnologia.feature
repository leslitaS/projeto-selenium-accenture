#language: pt
# encoding: utf-8

@Tec
Funcionalidade: Acessar a lista de carreiras da accenture

  Cenário: Acessar o item de vagas de tecnologia
    Dado que eu estou no site da accenture
    E clico no menu carreiras
    E clico no item do menu vagas em tecnologia
    Então devo ver o titulo "Carreiras em tecnologia"
