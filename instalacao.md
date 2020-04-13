| [Home](https://gabrielbabler.github.io/handson_microservice/) | [Instalação](https://gabrielbabler.github.io/handson_microservice/instalacao) | [GIT](https://gabrielbabler.github.io/handson_microservice/git) | [Docker](https://gabrielbabler.github.io/handson_microservice/docker) | [Microservice](https://gabrielbabler.github.io/handson_microservice/microservice)

# Instalação

## GIT

### Windows:

1. Faça o download do executável em: [https://git-scm.com/download/win](https://git-scm.com/download/win)
2. Execute o arquivo .exe seguindo o passo a passo (next, next, next, finish).

### Linux (Ubuntu):

Execute `sudo apt install git` no seu terminal

## Docker

### Windows:

Para utilizar o docker no no Windows, é necessário que o sistema operacional seja a versão Professional ou Enterprise.

Sendo assim basta baixar e instalar o docker Desktop, encontrado no link a seguir:

https://hub.docker.com/editions/community/docker-ce-desktop-windows/


Basta executar o instalador após baixá-lo e seguir com next, next finish. 
Nenhuma configuração adicional será necessária para o hands on que faremos

Informações adicionais sobre docker desktop podem ser encontradas nestes link:

https://docs.docker.com/docker-for-windows/

### Linux (Ubuntu):
Para o Linux, será necessário instalar o docker Engine e o docker-compose

Para instalar o docker-engine, utilize os seguintes comandos

(Essa instalação está sendo realizada por meio de um repositório)

`sudo apt-get update`

`sudo apt-get install \
    apt-transport-https \
    ca-certificates \
    curl \
    gnupg-agent \
    Software-properties-common`

`curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add -`

(esse curl deve retornar um “ok”)

Após isso é necessário verificar se possuímos uma chave para acessar o repositório, através do seguinte comando.

`sudo apt-key fingerprint 0EBFCD88`

O comando a seguir procura pelos 8 últimos dígitos dessa chave, e deve retornar algo semelhante a:

`pub   rsa4096 2017-02-22 [SCEA]
9DC8 5822 9FC7 DD38 854A  E2D8 8D81 803C 0EBF CD88
uid           [ desconhecida] Docker Release (CE deb) <docker@docker.com>
sub   rsa4096 2017-02-22 [S]`

Após realizado estes passos, basta obter a versão desejada do docker através do repositório configurado nos passos anteriores. Neste caso está sendo utilizado a última versão estável.

`sudo add-apt-repository \
   "deb [arch=amd64] https://download.docker.com/linux/ubuntu \
   (lsb_release -cs) \
   stable"`

Por fim, basta instalar o docker engine rodando os comandos a seguir:

`sudo apt-get update`

`sudo apt-get install docker-ce docker-ce-cli containerd.io`

Para validar se a instalação ocorreu de forma correta, rode o seguinte comando:

`sudo docker run hello-world`

Esse comando baixa uma imagem de teste e a instância em um container, 
apresentando uma mensagem de sucesso com algumas informações adicionais.

"Hello from Docker!
This message shows that your installation appears to be working correctly.
To generate this message, Docker took the following steps:
 1. The Docker client contacted the Docker daemon [...]
 [...] To try something more ambitious, you can run an Ubuntu container with:
docker run -it ubuntu bash"

É Necessário também, instalar o docker-compose que será utilizado para testar

as instruções contida no docker-compose que iremos utilizar durante o hands on.

Para tal, execute os comandos abaixo:


`sudo curl -L "https://github.com/docker/compose/releases/download/1.25.4/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose`

Atribua permissão de execução ao binário baixado

`sudo chmod +x /usr/local/bin/docker-compose`

Feito isso, verifique se tudo instalado corretamente e verifique a versão com o comando:

`docker-compose --version`

Retorno esperado, ou algo próximo disso:

docker-compose version 1.25.4, build 8d51620a

Mais informações a respeito dessas duas instalações, basta acessar os links:

https://docs.docker.com/engine/install/ubuntu/

https://docs.docker.com/compose/install/


## Microservice

### Windows:

- [JDK 8](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html).
- [Eclipse IDE](https://www.eclipse.org/downloads/).
- [IntelliJ IDE](https://www.jetbrains.com/idea/download/#section=linux).
- [Lombok -> Eclipse IDE](https://projectlombok.org/setup/eclipse).
- [Lombok -> IntelliJ IDE](https://projectlombok.org/setup/intellij).
- [MAVEN](https://maven.apache.org/download.cgi).
- [DBeaver](https://dbeaver.io/download/).
- [MySQL Workbench](https://dev.mysql.com/downloads/workbench/).
- [Postman](https://www.postman.com/downloads/).

### Linux (Ubuntu):

Execute: `sudo apt-get update` no seu terminal

#### JDK 8: 

Execute: `sudo apt install openjdk-8-jdk`

[referência](https://www.digitalocean.com/community/tutorials/how-to-install-java-with-apt-on-ubuntu-18-04)

#### Eclipse IDE: 

Baixar arquivo do site. [Link](https://www.eclipse.org/downloads/)

Após download, executar na pasta onde está o arquivo baixado: `tar xfz ~/Downloads/eclipse-inst-linux64.tar.gz`

[referência](https://websiteforstudents.com/how-to-install-eclipse-oxygen-ide-on-ubuntu-167-04-17-10-18-04/)

#### IntelliJ IDE:

Execute: 

`sudo add-apt-repository ppa:mmk2410/intellij-idea-community`

`sudo apt update`

`sudo apt install intellij-idea-community`

[referência](https://itsfoss.com/install-intellij-ubuntu-linux/)

#### Lombok -> Eclipse IDE:

[Link](https://projectlombok.org/setup/eclipse)

#### Lombok -> IntelliJ IDE:

[Link](https://projectlombok.org/setup/intellij)

#### MAVEN:

Execute: `sudo apt install maven`

[referência](https://linuxize.com/post/how-to-install-apache-maven-on-ubuntu-18-04/)

#### DBeaver:

[Link](https://dbeaver.io/download/).

Faça o download da opção Debian, e após finalizado dar 2 cliques no arquivo que ele ir iniciar a instalação

#### MySQL Workbench:

[Link](https://dev.mysql.com/downloads/workbench/).

Faça o download da opção Debian, e após finalizado dar 2 cliques no arquivo que ele ir iniciar a instalação

#### Postman:

[Link](https://www.postman.com/downloads/)

Após download, executar na pasta onde está o arquivo baixado: `tar xfz ~/Downloads/Postman-linux-x64-7.13.0.tar.gz`
