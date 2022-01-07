# Product-MS

Projeto de microserviço onde é possivel buscas, atualizar, inserir e deletar produtos de um catalogo, desenvolvido com spring web.

## Tecnologias

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Spring web](https://spring.io/projects/spring-ws)
- [H2 Database](https://www.h2database.com/html/quickstart.html)

## Funcionalidades

- Localização de produto.
- Localização personalizada de produtos
- Cadastro e alteração de produtos.
- Remoção de produtos.

### Para testar todos os recursos da aplicação, utilize a collection do Postman abaixo ou os endpoints no navegador:

- [Postman Collection](https://www.getpostman.com/collections/f355bee313300eee550e)

### EndPoint para teste
- POST /products (Cadastro de produto)
- PUT /products/{id} (ATulização no cadastro)
- GET /products/{id} (Busca de produtos por id)
- GET /products (Lista completa de produtos)
- GET /products/search?searching= (Filtro personalizado por: nome, descrição ou preço)
- DELETE /products/{id} (Deletar produto)

## Ambiente, recursos e requisitos necessários

- Java 11+
- Postman ou Insomnia
- Editor de código java

## Developer

| [<img src="https://avatars.githubusercontent.com/u/8467131?v=4" width="75px;"/>](https://github.com/rafaelrok) |
| :-: |
|[Rafael Vieira](https://github.com/rafaelrok)|
