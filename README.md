# GameList
[![Licença](https://img.shields.io/github/license/Rodsducarmo/GameList)](https://github.com/Rodsducarmo/GameList/blob/main/LICENSE)

# Sobre o projeto
GameList é uma aplicação backend desenvolvida em Java com o framework Spring Boot. O objetivo deste projeto é demonstrar a implementação de uma aplicação web com alguns dos conceitos e necessidades mais comuns do desenvolvimento backend.

## Modelagem de Dados

Abaixo estão os diagramas de modelagem de dados do projeto:

- Modelo de Domínio:

![Modelo de Domínio](https://github.com/Rodsducarmo/GameList/blob/main/Domain.png)


- Modelo de Objetos:

![Modelo de Objetos](https://github.com/Rodsducarmo/GameList/blob/main/Object.png)


- Modelo Relacional:

![Modelo Relacional](https://github.com/Rodsducarmo/GameList/blob/main/Relational.png)


Você pode encontrar as imagens completas dos diagramas na pasta [imgs](https://github.com/Rodsducarmo/imgs) deste repositório.

## Funcionalidades

- Sistemas web e recursos
- Cliente/servidor, HTTP, JSON
- Padrão REST para API web
- Estruturação de projeto Spring Rest
- Entidades e ORM
- Database seeding
- Padrão de camadas: Controller, Service, Repository
- Padrão DTO para transferência de dados
- Relacionamentos N-N com classe de associação e embedded id
- Consultas SQL no Spring Data JPA com Projections

## Perfis de projeto

O projeto conta com diferentes perfis para se adaptar a diferentes ambientes:

- Perfil de desenvolvimento e testes:
  - `test`
  - Banco de dados H2

- Perfil de homologação / staging:
  - `dev`
  - Banco de dados Postgres de homologação

- Perfil de produção:
  - `prod`
  - Banco de dados Postgres de produção
  - O projeto está disponibilizado na nuvem no seguinte endereço: [https://gamelists.up.railway.app](https://gamelists.up.railway.app)
  - Você pode obter os dados da API fazendo uma requisição GET para o seguinte endpoint: `/games`
  - Você pode obter as listas de jogos fazendo uma requisição GET para o seguinte endpoint: `/lists`

## Configuração do ambiente

- É possível utilizar o Docker Compose para configurar o ambiente local facilmente.
- O processo de homologação local é suportado para testar a aplicação antes de fazer o deploy.
- Recomenda-se a configuração de um processo de CI/CD (Integração Contínua/Implantação Contínua) para automatizar o deploy do aplicativo.

## Configuração do CORS

A aplicação possui configurações CORS para permitir o acesso a partir de diferentes origens, garantindo a segurança e a interoperabilidade adequadas.

## Como executar o projeto

1. Clone o repositório para o seu ambiente local.
2. Configure o ambiente conforme necessário (Docker, perfis de projeto, banco de dados).
3. Execute o projeto utilizando a IDE de sua preferência ou através da linha de comando com o comando `mvn spring-boot:run`.
4. Acesse a API em `http://localhost:8080` ou no endereço fornecido pela sua configuração.

Fique à vontade para explorar e contribuir com este projeto. Se tiver alguma dúvida ou sugestão, sinta-se à vontade para entrar em contato.

# Autor

Rodrigo Carmo da Costa

https://www.linkedin.com/in/rodrigoc-costa/


