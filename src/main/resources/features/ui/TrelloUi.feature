#language: pt
#encoding: UTF-8

@ui
Funcionalidade: Trello UI

	@ui
	Esquema do Cenario: Criando, comentando e deletando um card
		Dado que eu esteja logado no trello
		E acesse o board
		Quando crio um card com o nome "<nomeCard>"
		E comento "<Comentario>"
		Entao o card deve estar na lista
		Quando excluo o card
		Entao o card nao existe mais

			Exemplos:
				|nomeCard|Comentario|
				|Novo card| Comentario teste|

      
