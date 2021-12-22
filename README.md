# SISTEMA DE GERENCIAMENTO DE PESSOA EM API REST COM SPRING BOOT - Projeto Digital Innovation One

## Resumo
Neste projeto foi desenvolvido um pequeno sistema para o gerenciamento de pessoas através de uma API REST, criada com o Spring Boot.

## Desenvolvimento
Foram desenvolvidos e abordados os seguintes tópicos durante a implantação:

* Setup inicial de projeto com o Spring Boot Initialzr 
* Criação de modelo de dados para o mapeamento de entidades em bancos de dados
* Desenvolvimento de operações de gerenciamento de usuários (Cadastro, leitura, atualização e remoção de pessoas de um sistema) - CRUD.
* Relação de cada uma das operações acima com o padrão arquitetural REST, e a explicação de cada um dos conceitos REST envolvidos durante o desenvolvimento do projeto.
* Desenvolvimento de testes unitários para validação das funcionalidades
* Implantação do sistema na nuvem através do Heroku.

## Instruções passadas pelo professor:

​	- Para executar o projeto no terminal, digite o seguinte comando:
```shell script
mvn spring-boot:run 
```
​	- Após executar o comando acima, basta apenas abrir o seguinte endereço e visualizar a execução do projeto:
```
http://localhost:8080/pessoa
```
## Pré-Requisitos
Foram necessários os seguintes pré-requisitos para a execução do projeto desenvolvido durante a aula:

* Java 08 ou versões superiores.
* Maven.
* Intellj IDEA Community Edition.
* Controle de versão GIT.
* Conta no GitHub para o armazenamento do projeto na nuvem.
* Conta no Heroku para o deploy do projeto na nuvem

## Endpoints
Para acessar o banco de dados, é necessário acessar a URL do projeto mais os endpoints que estão na tabela abaixo:

URL do projeto: https://cadastroclientes-api.herokuapp.com/

| Tipo | Descrição                                             | Caminho                                                      |
| ---- | ----------------------------------------------------- | ------------------------------------------------------------ |
| POST | Cria uma pessoa.                                      | **/pessoa**                                                  |
| GET  | Retorna uma lista de pessoas.                         | **/pessoa**                                                  |
| PUT  | Atualiza uma pessoa pelo id.                          | **/pessoa/{id}**                                             |
| DEL  | Deleta uma pessoa pelo id.                            | **/pessoa/{id}**                                             |
| GET  | Retorna uma pessoa pelo id.                           | **/pessoa/{id}**                                             |

## Links
Abaixo, seguem links disponibilizados pelo professor sobre tópicos mencionados durante a aula:

* [SDKMan! para gerenciamento e instalação do Java e Maven](https://sdkman.io/)
* [Referência do Intellij IDEA Community, para download](https://www.jetbrains.com/idea/download)
* [Palheta de atalhos de comandos do Intellij](https://resources.jetbrains.com/storage/products/intellij-idea/docs/IntelliJIDEA_ReferenceCard.pdf)
* [Site oficial do Spring](https://spring.io/)
* [Site oficial do Spring Initialzr, para setup do projeto](https://start.spring.io/)
* [Site oficial do Heroku](https://www.heroku.com/)
* [Site oficial do GIT](https://git-scm.com/)
* [Site oficial do GitHub](http://github.com/)
* [Documentação oficial do Lombok](https://projectlombok.org/)
* [Documentação oficial do Map Struct](https://mapstruct.org/)
* [Referência para o padrão arquitetural REST](https://restfulapi.net/)

## Projeto Original
- Professor Rodrigo Peleiras
  - repositório https://github.com/rpeleias/personapi_digital_innovation_one
