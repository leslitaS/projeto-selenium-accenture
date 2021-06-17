# language: pt
# enconding: utf-8
	
	@Site
	Funcionalidade: Acessar o site da accenture e aceitar os coockies do LGPD
		Cenário: Aceitar o cookie LGPD
			Dado que eu estou no site da accenture
			E abro as configurações de cookies
			E clico em Confirmar minhas escolhas
			Então deve fechar o modal

		Cenário: Configurações do cookie
			Dado que eu estou no site da accenture
			E abro as configurações de cookies
			E clico em Confirmar minhas escolhas
			E clico em configurações de cookie
			Então devo ver o item de "Sua privacidade"
			E devo ver "Cookies estritamente necessárias"
			E devo ver "Cookies Analíticos de Primeira Parte"
			E devo ver "Cookies de Desempenho e Cookies Funcionais"
			E devo ver "Cookies de Publicidade e Redes Sociais"