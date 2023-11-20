# :notebook: Gestão de Avaliações
Para facilitar a jornada de uma pessoa estudante e auxiliar na gestão das atividades avaliativas, foi desenvolvido um programa em Java com uma interface intuitiva no terminal, que permite:
- Cadastrar atividades avaliativas para o período, seja exercícios ou projetos.
- Inserir as notas dos exercícios e projetos cadastrados para o período.
- Verificar se a soma dos pesos das atividades é igual a 100.
- Informar o resultado alcançado a partir da Média Aritmética Ponderada das notas e pesos.

## ⚙️ Instalação das dependências
Para instalar as dependências do projeto, execute o comando `mvn install`. Isso fará o download das dependências configuradas no `pom.xml`, além de baixar as dependências indiretas.

## :white_check_mark: Funcionalidades Implementadas
### (1) Cadastro de atividades avaliativas
Para cadastrar as atividades avaliativas para o período atual, você deve informar quantas atividades serão cadastradas e salvar essa informação. Em seguida, será solicitado o nome da atividade e seu respectivo peso. Certifique-se de que a soma de todos os pesos seja igual a 100.

### (2) Inserir as notas obtidas
Para inserir as notas obtidas em cada exercício ou projeto cadastrado para o período em questão, basta informar a nota correspondente.

### (3) Verificação da soma dos pesos
A soma dos pesos das atividades deve ser igual a 100. Caso contrário, será exibida a mensagem `"A soma dos pesos é diferente de 100!"`.

### (4) Informar o resultado alcançado
Após inserir todas as notas, o programa calculará automaticamente o percentual alcançado com base nas notas obtidas nas atividades avaliativas cadastradas. 

Se o percentual for igual ou superior a 85.0%, será exibida a mensagem `"Parabéns! Você alcançou [resultado]%! E temos o prazer de informar que você obteve aprovação!"`. 

Caso contrário, será exibida a mensagem `"Lamentamos informar que, com base na sua pontuação alcançada neste período, [resultado]%, você não atingiu a pontuação mínima necessária para sua aprovação."`.

## :mag: Testes
Para executar os testes, execute o comando `mvn test`.

## 🧹 Linter (Checkstyle)
O Checkstyle é usado para fazer a análise estática do código. Este projeto já vem com as dependências relacionadas ao linter configuradas no arquivo `pom.xml`. Caso deseje rodar o Checkstyle manualmente, basta executar o comando `mvn checkstyle:check`.

## :information_source: Considerações finais
Este projeto é apenas para fins educacionais. Qualquer dúvida ou sugestão, sinta-se à vontade para entrar em contato.
