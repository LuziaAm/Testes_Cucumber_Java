#language: pt
	
Funcionalidade: Aprender Cucumber
	Como um aluno
	Eu quero aprender a utilizar Cucumber
	Para que eu possa automatizar critérios de aceitação

Cenario: Deve executar a especificação
	Dado que criei o arquivo corretamente
	Quando executá-lo
	Então a especificação deve finalizar com sucesso
	
Cenario: Deve incrementar um contador
	Dado que o valor do contador é 15
	Quando eu incrementar em 3
	Então o valor do contador será 18
	
Cenario: Deve calcular atraso na entrega
	Dado que a entrega é dia 05/04/2021
	Quando a entrega atrasar em 2 dias
	Então a entrega será efetuada em 07/04/21