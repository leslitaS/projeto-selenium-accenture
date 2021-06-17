# language: pt
  # encoding: utf-8

@Vaga
Funcionalidade: Procurando uma vaga


  Cenário: Procurando uma vaga 
  Dado que eu estou no site da accenture
  E acessa a área de carreiras
	E clica em procure por vagas
	E digite no campo de busca "desenvolvedor"
	E clico no botão procurar
  Então devo encontrar vagas para programadores