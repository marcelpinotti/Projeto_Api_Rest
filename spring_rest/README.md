# INTERNET E SEUS RECURSOS

Cliente faz ----> Request (Requisição) através do protocolo HTTP;
Servidor Web ----> recebe a requisição e envia uma resposta (Response) através do protocolo HTTP;

HTTP -> Hypertext Transfer Protocol - Protocolo de Transferência de Hipertexto.
​	-	Protocolo de comunicação / Base para a comunicação de dados da Internet.

HTTP REQUEST. 

 - REQUISIÇÃO possui um modelo:

    - GET / hello HTTP/1.1
       - GET. método (HTTP Method)
       - hello. caminho (path)
       - HTTP/1.1 versão do protocolo (HTTP Version)
          - Hoje já existe a versão 2.0

HTTP RESPONSE.

- Resposta possui um modelo:

 - HTTP/1.1  200 OK  Hello, Wold!
   - HTTP/1.1 versão do protocolo (HTTP Version)
   - 200 OK  código que representa o status da resposta (HTTP status code)
   - Hello, Word! corpo da resposta (HTTP response boby)     

REST -> Representational  State Transfer - Transferência de Estado Representacional.

 -	Estilo de Arquitetura encima do HTTP.
 -	Não é um protocolo.
 -	Maneira mais convencional e simples de fazer integração de sistemas.
 -	Utiliza verbos, códigos, cabeçalhos e URIs.

Métodos do protocolo HTTP.

- Diretrizes que permitem a padronização das requests.
- Métodos são chamados Verbos;
  - GET - solicia a representação de um recurso específico;
  - POST - submeter um novo recurso;
  - PUT - substitui todas as atuais representações de seu recurso alvo;
  - DELETE - remove um recurso específico;
  - PATCH - realiza modificações parciais em um recurso;
  - TRACE / HEAD / OPTIONS / CONNECT.

Status Code.

- Status de erro, sucesso, tratamentos, etc.
- Mais usados:
  - 200 Ok
  - 201 Created
  - 204 No Content
  - 304 Not Modified
  - 400 Bad Request
  - 401 Unauthorized
  - 403 Forbidden
  - 404 Not Found
  - 500 Internet Server error
  - 503 Service Unavailable

Resources - Recursos.

- São representações dos modelos e/ou coleções de modelos que serão expostos aos clientes.
  - Exemplo: pessoas, carros, cidades, etc.
  - Podem vir em formato JSON ou XML.
  - Essa representação pode ser de um recurso específico através do identificador (id).
  - Ou pode ser a representação de uma coleção de recursos.

Payload.

- É o conteúdo das requisições e respostas;
- Chamado de corpo (body);
- É onde os recursos estão localizados e representados no protocolo.

Headers.

- Todas requisições e respostas são compostas de cabeçalhos;
- Permite inserir informações adicionais para as requests e reponses.
  - Escolha de formato, fazer autenticação, etc;
  - ex: GET "http://localhost:8080/v1/cities/1" -H "accept: application/json"

Práticas:

- Use substantivos e não verbos para representar os recursos;
- Não alterar o estado de um recurso usando Get;
- Use Plural;
- Use sub-resources para relacionamento entre recursos;
- Toda sub-resource é um recurso em portencial (Negócio);
- Paginação, filtros e ordenação;
- Não quebre o contrato da API. Use versões:
  - Versionamento via header , ou via path, ou via parâmetro;
- Escolha o HTTP Status Code corretamente;
- Entende o seu Domínio, como representá-lo e documente a API.

## Projeto Jedi - Modelo Rest

- O padrão Rest foi criado para que outras aplicações consigam fazer uma interação com o Jedi não via interface web browser, e sim por um client padrão http.
- Rest é uma espécie de convenção de comunicação usando protocolo http.
  - Spring Web utiliza a anotação @RestController;
  - Cada recurso no Rest representa um recurso a ser acessado (RestControllers chamamos de resources);
    - resource de Jedi vai possibilitar via rest operar o Jedis, recuperar, criar, deletar, etc;
