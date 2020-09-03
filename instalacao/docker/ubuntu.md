| [Home](/handson_microservice) | [Instalação](/handson_microservice/instalacao) | [GIT](/handson_microservice/git) | [Docker](/handson_microservice/docker) | [Microservice](/handson_microservice/microservice)

  

# Instalação / Docker / Ubuntu

  

<h1  align="center">

<img  src="https://user-images.githubusercontent.com/18057391/90987285-2777b880-e560-11ea-988f-9e25d0d486d6.PNG"  alt="instalacao"  width="800px"  />

</h1>

  

## Comandos que serão utilizados para instalar o docker engine e o docker compose

- Para atualizar os pacotes do Sistema Operacional<br  />
`$ sudo apt update`  <br  />

### - Docker Engine
- Para instalar o docker-ce (Community Edition)<br  />
`$ sudo apt install docker-ce`<br  />

- Para validar se o docker foi instalado e qual a sua versão<br  />
`$ docker --version`<br  />

> **Nota:** O retorno esperado deverá ser algo próximo de:
Docker version 19.03.12, build 48a66213fe



### - Docker Compose
- Para baixar o e alocar o repositório do docker-compose dentro do diretório /usr/local/bin/<br  />
`$ sudo curl -L "https://github.com/docker/compose/releases/download/1.23.1/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose`<br  />

- Para aplicar permissão de execução no arquivo binário do compose<br  />
`$ sudo chmod +x /usr/local/bin/docker-compose`<br  />

- Para validar se o docker-compose foi instalado e qual a sua versão<br  />
`$ docker-compose --version`<br  />

> **Nota:** O retorno esperado deverá ser algo próximo de:
docker-compose version 1.23.1, build b02f1306

<br />
Mais informações a respeito dessas duas instalações,  acesse os links da documentação oficial:

https://docs.docker.com/engine/install/ubuntu/<br  />
https://docs.docker.com/compose/install/