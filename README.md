# SISTEMA DE GERENCIAMENTO DE PESSOAS VACINADAS E GRUPOS PRIORITÁRIOS EM API REST COM SPRING BOOT

# Resumo
Neste projeto foi desenvolvido um pequeno sistema para o gerenciamento de pessoas vacinadas e seus grupos de prioridades através de uma API REST, criada com o Spring Boot.

# Desenvolvimento
Foram desenvolvidos os seguintes tópicos durante a implantação:

* Setup inicial de projeto com o Spring Boot Initialzr 
* Criação de modelo de dados para o mapeamento de entidades em bancos de dados
* Desenvolvimento de operações de gerenciamento de usuários (Cadastro, leitura, atualização e remoção de pessoas de um sistema) - CRUD.

# Pré-Requisitos
Foram necessários os seguintes pré-requisitos para a execução do projeto desenvolvido:

* Java 08  ou versões superiores.
* Maven.
* Intellj IDEA Community Edition.
* Controle de versão GIT.
* Lombok Framework.
* Mapstruct Framework.
* Banco de Dados PostgreSQL.
* Plataforma para desenvolvimento de Api Postman.
* Conta no GitHub para o armazenamento do projeto na nuvem.

## Endpoints
Para acessar o banco de dados, é necessário usar os endpoints que estão nas tabelas abaixo:

***Entity Person***
| Tipo | Descrição                                             | Caminho                                                      |
| ---- | ----------------------------------------------------- | ------------------------------------------------------------ |
| GET  | Retorna uma lista de pessoas                          | **/persons**                                                 |
| PUT  | Atualiza uma pessoa pelo id.                          | **/persons/{id}**                                            |
| POST | Cadastra uma pessoa.                                  | **/persons**                                                 |
| DEL  | Deleta uma pessoa pelo id.                            | **/persons/{id}**                                            |

***Entity PriorityPerson***
| Tipo | Descrição                                             | Caminho                                                      |
| ---- | ----------------------------------------------------- | ------------------------------------------------------------ |
| GET  | Retorna uma lista com os grupos prioritários          | **/prioritygroups**                                          |
| PUT  | Atualiza um grupo prioritário pelo id.                | **/prioritygroups/{id}**                                     |
| POST | Cadastra uma grupo prioritário.                       | **/prioritygroups**                                          |
| DEL  | Deleta um grupo prioritário pelo id.                  | **/prioritygroups/{id}**                                     |

# Links
Abaixo, seguem links das documentações das tecnologias utilizadas no projeto:

* [Site oficial do Spring](https://spring.io/)
* [Site oficial do Spring Initialzr, para setup do projeto](https://start.spring.io/)
* [Site oficial do GIT](https://git-scm.com/)
* [Site oficial do GitHub](http://github.com/)
* [Documentação oficial do Lombok](https://projectlombok.org/)
* [Documentação oficial do Map Struct](https://mapstruct.org/)
* [Documentação oficial do Postman](https://learning.postman.com/docs/getting-started/introduction/)
* [Documentação oficial do PostgreSQL](https://www.postgresql.org/docs/)
* [Referência para o padrão arquitetural REST](https://restfulapi.net/)

# Projeto Original
- Professora Larissa Falcão
  - repositório https://github.com/larissafalcao/fullstackweek
