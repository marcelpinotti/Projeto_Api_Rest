# Testes unitários para validar uma API REST de gerenciamento de estoques de cervejas - Projeto Digital Innovation One 

## Resumo
Neste projeto aprendi a testar, unitariamente, uma API REST para o gerenciamento de estoques de cerveja. Foi desenvolvido testes unitários para validar o  sistema de gerenciamento de estoques de cerveja. Foram apresentados os principais conceitos e vantagens de criar testes unitários com JUnit e Mockito. Também  foi mostrado como desenvolver funcionalidades da nossa API através da prática do TDD.

## Desenvolvimento
No projeto (aula)  foram abordados os seguintes tópicos:

- Baixar um projeto através do Git para desenvolver nossos testes unitários.
- Apresentação conceitual sobre testes: a pirâmide dos tipos de testes, e também a importância de cada tipo de teste durante o ciclo de desenvolvimento.
- Foco nos testes unitários: mostrar o porque é importante o desenvolvimento destes tipos de testes como parte do ciclo de desenvolvimento de software.
- Principais frameworks para testes unitários em Java: JUnit, Mockito e Hamcrest.
- Desenvolvimento de testes unitários para validação de funcionalidades básicas: criação, listagem, consulta por nome e exclusão de cervejas.
- TDD: apresentação e exemplo prático em 2 funcionalidades importantes: incremento e decremento do número de cervejas no estoque.

## Instruções passadas pelo professor:

​	- Para executar o projeto no terminal digite o seguinte comando:
```shell script
mvn spring-boot:run 
```
​	- Para executar a suíte de testes desenvolvida basta executar o seguinte comando:
```
mvn clean test
```
​	- Após executar o comando acima, basta apenas abrir o seguinte endereço e visualizar a execução do projeto:
```
http://localhost:8080/beers
```

# Pré-Requisitos
Foram necessários os seguintes pré-requisitos para a execução do projeto:

- Java 11.
- Maven.
- Spring Boot 2.5.2.
- Intellj IDEA Community Edition.
- Controle de versão GIT instalado na máquina.
- Mapstruct 1.4.2. Final.
- Lombock 1.18.20.

# Links
Abaixo, seguem links sobre tópicos mencionados durante a aula:

- [SDKMan! para gerenciamento e instalação do Java e Maven](https://sdkman.io/)
- [Referência do Intellij IDEA Community, para download](https://www.jetbrains.com/idea/download)
- [Palheta de atalhos de comandos do Intellij](https://resources.jetbrains.com/storage/products/intellij-idea/docs/IntelliJIDEA_ReferenceCard.pdf)
- [Site oficial do Spring](https://spring.io/)
- [Site oficial JUnit 5](https://junit.org/junit5/docs/current/user-guide/)
- [Site oficial Mockito](https://site.mockito.org/)
- [Site oficial Hamcrest](http://hamcrest.org/JavaHamcrest/)
- [Referências - testes em geral com o Spring Boot](https://www.baeldung.com/spring-boot-testing)
- [Referência para o padrão arquitetural REST](https://restfulapi.net/)
- [Referência pirâmide de testes - Martin Fowler](https://martinfowler.com/articles/practical-test-pyramid.html#TheImportanceOftestAutomation)

## Projeto Original

- Professor Rodrigo Peleiras
  - repositório https://github.com/rpeleias/beer_api_digital_innovation_one
