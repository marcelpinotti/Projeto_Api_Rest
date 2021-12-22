#### SISTEMA DE CÁLCULO DA DISTÂNCIA ENTRE CIDADES BRASILEIRAS EM API REST COM SPRING BOOT - Projeto Digital Innovation One


## Resumo
Neste projeto, de API REST, foi desenvolvido um pequeno sistema que calcula a distância entre cidades brasileiras.


## Pré-Requisitos
Foram necessários os seguintes pré-requisitos para a execução do projeto desenvolvido durante a aula:

- Java 11.
- Maven.
- Spring Boot.
  - Spring Web.
  - Spring Data JPA.
  - PostgreSQL Driver.
- Intellj IDEA Community Edition.
- Controle de versão GIT instalado na máquina.

## Desenvolvimento
Foram desenvolvidos e abordados os seguintes tópicos durante a aula de implementação:

- Setup inicial de projeto com o Spring Boot Initialzr;
- Utilização de Docker para criação da imagem do PostgreSQL; 
- Mapeamento de entidades em bancos de dados;
- Relação de cada uma das operações acima com o padrão arquitetural REST, e a explicação de cada um dos conceitos REST envolvidos durante o desenvolvimento do projeto.
- Deploy - Heroku.
- Os dados de Geolocalização foram retirados do repositório de ***CHINNON SANTOS*** - [Perfil GitHub](https://github.com/chinnonsantos)
  - [Repositório](https://github.com/chinnonsantos/sql-paises-estados-cidades) - **Projeto : SQL COM TODOS OS PAÍSES (BACEN) + TODOS OS ESTADOS E CIDADES DO BRASIL (IBGE)**;

## Endpoints
Para acessar o banco de dados, é necessário acessar a URL do projeto mais os endpoints que estão na tabela abaixo:

URL do projeto: https://floating-savannah-62124.herokuapp.com

| Tipo | Descrição                                             | Caminho                                                      |
| ---- | ----------------------------------------------------- | ------------------------------------------------------------ |
| GET  | Retorna um país por id                                | **/countries/{id}**                                          |
| GET  | Retorna uma lista de países (Paginable).              | **/countries?page=**"NÚMERO DA PÁGINA (pgs.13)"              |
| GET  | Retorna uma lista de cidades brasileiras (Paginable). | **/cities?page=**"NÚMERO DA PÁGINA (pgs.280)"                |
| GET  | Retorna uma lista de estados brasileiros.             | **/states**                                                  |
| GET  | Retorna a distância entre as cidades em milhas        | **/distances/by-points?from=**"ID CIDADE DE ORIGEM"**&to=**"ID CIDADE DE DESTINO" |
| GET  | Retorna a distância entre as cidades em metros        | **distances/by-cube?from=**"ID CIDADE DE ORIGEM"**&to=**"ID CIDADE DE DESTINO" |

## Projeto Original.
- Professor André Luis Gomes
  - repositório https://github.com/andrelugomes/digital-innovation-one/tree/master/cities-api
