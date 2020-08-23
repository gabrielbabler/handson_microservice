| [Home](/handson_microservice) | [Instalação](/handson_microservice/instalacao) | [GIT](/handson_microservice/git) | [Docker](/handson_microservice/docker) | [Microservice](/handson_microservice/microservice)

# Instalação / Docker / Ubuntu

<h1 align="center">
  <img src="https://user-images.githubusercontent.com/18057391/90987285-2777b880-e560-11ea-988f-9e25d0d486d6.PNG" alt="instalacao" width="800px" />
</h1>

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