<h1 align="center"> Sistema de Microsserviços com Spring Boot e Spring Cloud 

![Banner Principal](/banner.png) </h1>

<h2 align="center"> 💻 Projeto </h2>

O sistema criado é uma aplicação de recuso humanos "hr" , onde os micro serviços fazem a autenticação e autorização segundo as roles dos usuários, cadastro de trabalhadores e aplicação da regra de negócio para pagamento do trabalhador.

O objetivo deste projeto é estruturar um sistema de microsserviços Java utilizando Spring Boot e Spring Cloud, um sistema composto por vários microsserviços que se comunicam entre si de forma transparente, escalável e com balanceamento de carga.

Os microsserviços são registrados em um "Discovery Server" (Eureka), permitindo que a comunicação entre eles seja feita pelo nome do microsserviço. Além disso, as requisições são roteadas e autorizadas por um API Gateway (Zuul).

### Principais conteúdos do projeto:

- Feign para requisições de API entre microsserviços.
- Ribbon para balanceamento de carga.
- Servidor Eureka para registro dos microsserviços.
- API Gateway Zuul para roteamento e autorização.
- Hystrix para tolerância a falhas.
- OAuth e JWT para autenticação e autorização.
- Servidor de configuração centralizada com dados em repositório Git.
- Geração de containers Docker para os microsserviços e bases de dados.


<h2 align="center"> 🚀 Tecnologias </h2>

Este projeto foi construído utilizando as seguintes tecnologias:

- Java e Spring Boot para desenvolvimento dos microsserviços.
- Spring Cloud para gestão e comunicação entre microsserviços.
- Docker para a geração de containers.
- Git e Github para controle de versão e hospedagem do código-fonte.