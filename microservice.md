| [Home](https://gabrielbabler.github.io/handson_microservice/) | [Instalação](https://gabrielbabler.github.io/handson_microservice/instalacao) | [GIT](https://gabrielbabler.github.io/handson_microservice/git) | [Docker](https://gabrielbabler.github.io/handson_microservice/docker) | [Microservice](https://gabrielbabler.github.io/handson_microservice/microservice)

# Microservice
![image](https://user-images.githubusercontent.com/20668748/79121059-ca2a5a00-7d6a-11ea-894b-4a5eaca061c8.png)


## O que é microsserviço?

Os microsserviços são uma arquitetura e uma abordagem para escrever programas de software. Com eles, as aplicações são desmembradas em componentes mínimos e independentes. 

Diferentemente da abordagem tradicional monolítica em que toda a aplicação é criada como um único bloco, os microsserviços são componentes separados que trabalham juntos para realizar as mesmas tarefas.

Cada um dos componentes ou processos é um microsserviço. 

Essa abordagem de desenvolvimento de software valoriza a granularidade, a leveza e a capacidade de compartilhar processos semelhantes entre várias aplicações. 

Trata-se de um componente indispensável para a otimização do desenvolvimento de aplicações para um modelo nativo em nuvem. 

[Fonte - RedHat](https://www.redhat.com/pt-br/topics/microservices).

## O que iremos desenvolver?

O objetivo é o desenvolvimento de um C.R.U.D. (Create, Read, Update and Delete) de Cervejas.

## TO-DO's:

Criação dos recursos:
 - GET /beers
 - GET /beers/{beerId}
 - POST /beers
 - PUT /beers/{beerId}
 - DELETE /beers/{beerId}
 
### Verbos HTTP
Utilizamos GET para fazer consultas;
Utilizamos POST para inserir novos dados;
Utilizamos PUT para atualizar dados já existentes;
Utilizamos PATCH para atualizar parcialmente um dado já existente;
Utilizamos DELETE para deleter um dado já existente.

## O que precisaremos?

- JDK 8;
- Eclipse/IntelliJ; (Recomendo o uso do **IntelliJ** - Instrutor irá utilizar IntelliJ)
- Lombok;
- MAVEN;
- DBeaver/MySQL Workbench; (Obs.: O instrutor irá utilizar **DBeaver**)
- POSTMAN.

## Para detalhes de instalação, [clique aqui](https://gabrielbabler.github.io/handson_microservice/instalacao)

## Documentação

