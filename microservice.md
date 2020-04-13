| [Home](https://gabrielbabler.github.io/handson_microservice/) | [Instalação](https://gabrielbabler.github.io/handson_microservice/config) | [GIT](https://gabrielbabler.github.io/handson_microservice/git) | [Docker](https://gabrielbabler.github.io/handson_microservice/docker) | [Microservice](https://gabrielbabler.github.io/handson_microservice/microservice/)

# Microservice
![image](https://user-images.githubusercontent.com/20668748/79121059-ca2a5a00-7d6a-11ea-894b-4a5eaca061c8.png)


## O que é microsserviço?

Os microsserviços são uma arquitetura e uma abordagem para escrever programas de software. Com eles, as aplicações são desmembradas em componentes mínimos e independentes. 
Diferentemente da abordagem tradicional monolítica em que toda a aplicação é criada como um único bloco, os microsserviços são componentes separados que trabalham juntos para realizar as mesmas tarefas.
Cada um dos componentes ou processos é um microsserviço. 
Essa abordagem de desenvolvimento de software valoriza a granularidade, a leveza e a capacidade de compartilhar processos semelhantes entre várias aplicações. 
Trata-se de um componente indispensável para a otimização do desenvolvimento de aplicações para um modelo nativo em nuvem. [Fonte - RedHat](https://www.redhat.com/pt-br/topics/microservices).

## O que iremos desenvolver?

O objetivo é o desenvolvimento de um CRUD (Create, Read, Update and Delete) de Cervejas.

## TO-DO's:

Criação dos endpoint's:
 - GET /beers
 - GET /beers/{beerId}
 - POST /beers
 - PUT /beers/{beerId}
 - DELETE /beers/{beerId}
 
### Verbos HTTP
Utilizamos GET para fazer consultas;
Utilizamos POST para inserir novos dados;
Utilizamos PUT para atualizar dados já existentes;
Utilizamos DELETE para deleter um dado já existente.

## O que precisaremos?

- JDK 8;
- Eclipse/IntelliJ; (Obs.: O instrutor irá utilizar Eclipse)
- Lombok;
- MAVEN;
- DBeaver/MySQL Workbench; (Obs.: O instrutor irá utilizar DBeaver)
- POSTMAN.

## Instalação

### Windows:

[JDK 8] (https://www.oracle.com/java/technologies/javase-jdk8-downloads.html).
[Eclipse IDE] (https://www.eclipse.org/downloads/).
[IntelliJ IDE] (https://www.jetbrains.com/idea/download/#section=linux).
[Lombok -> Eclipse IDE] (https://projectlombok.org/setup/eclipse).
[Lombok -> IntelliJ IDE] (https://projectlombok.org/setup/intellij).
[MAVEN] (https://maven.apache.org/download.cgi).
[DBeaver] (https://dbeaver.io/download/).
[MySQL Workbench] (https://dev.mysql.com/downloads/workbench/).
[Postman] (https://www.postman.com/downloads/).

### Linux (Ubuntu):

Execute `sudo apt-get update` no seu terminal.

JDK 8: `sudo apt install openjdk-8-jdk`
[ref] (https://www.digitalocean.com/community/tutorials/how-to-install-java-with-apt-on-ubuntu-18-04)

Eclipse IDE: 
Baixar arquivo do site. [Link] (https://www.eclipse.org/downloads/).
Após download, executar: `tar xfz ~/Downloads/eclipse-inst-linux64.tar.gz`
[ref] (https://websiteforstudents.com/how-to-install-eclipse-oxygen-ide-on-ubuntu-167-04-17-10-18-04/).

IntelliJ IDE:
Execute: 
`sudo add-apt-repository ppa:mmk2410/intellij-idea-community`
`sudo apt update`
`sudo apt install intellij-idea-community`
[ref] (https://itsfoss.com/install-intellij-ubuntu-linux/)

Lombok -> Eclipse IDE:
[Link] (https://projectlombok.org/setup/eclipse).

Lombok -> IntelliJ IDE:
[Link] (https://projectlombok.org/setup/intellij).

MAVEN:
Execute: `sudo apt install maven`
[ref] (https://linuxize.com/post/how-to-install-apache-maven-on-ubuntu-18-04/).

DBeaver:
[Link] (https://dbeaver.io/download/). 
Faça o download da opção Debian, e após finalizado dar 2 cliques no arquivo que ele ir iniciar a instalação.

MySQL Workbench:
[Link] (https://dev.mysql.com/downloads/workbench/).
Faça o download da opção Debian, e após finalizado dar 2 cliques no arquivo que ele ir iniciar a instalação.

Postman:
[Link] (https://www.postman.com/downloads/).
Após download, executar: `tar xfz ~/Downloads/Postman-linux-x64-7.13.0.tar.gz`
