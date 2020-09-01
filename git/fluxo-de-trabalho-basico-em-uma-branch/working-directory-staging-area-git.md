| [Home](/handson_microservice) | [Instalação](/handson_microservice/instalacao) | [GIT](/handson_microservice/git) | [Docker](/handson_microservice/docker) | [Microservice](/handson_microservice/microservice)

# GIT / Fluxo de trabalho "básico" em uma branch / Working Directory -> Staging Area -> .git

A partir das definições de `repositório`, `branches` e `commits`, podemos ter um workflow para trabalhar de fato com `git`.

Como vimos anteriormente, nosso repositório possuirá as `branches`, que por sua vez terá os `commits`. 
Como iremos desenvolver nosso projeto ao longo do tempo, uma das tarefas mais comuns que temos é a criação de `commits`, representando os estados do projeto **ao longo do tempo**.

## O que é staging area? 

Antes de criar `commits`, precisamos escolher os arquivos que farão parte dele. O `git` através da `staging area` manterá os arquivos que escolhemos. Em um segundo momento, solicitaremos a criação do commit em si e o `git` utilizará o conteúdo da `staging area` para se basear.

> Staging area também pode ser referenciada como `index`, `staged files`, `cache`. São essencialmente sinônimos.

## Como criamos um commit?

Primeiramente precisamos ter arquivos no nosso repositório/projeto com algum conteúdo, representado pelo item `6` na imagem abaixo.

A partir desses arquivos, iremos “selecioná-los” para serem adicionados na `staging area`. Quando estivermos satisfeitos com o estado da `staging area`, iremos de fato pedir ao `git` que crie um commit.

![stagingarea1](https://user-images.githubusercontent.com/18057391/91795550-4fb48680-ebf4-11ea-8dc9-7376a03ea925.PNG)
Na imagem acima temos a simbolização de 3 arquivos no nosso projeto `(6)` e escolhemos que 2 para serem adicionados na `staging area` `(7)`.

Em seguida, pediremos ao git para de fato criar um commit com o estado dos arquivos na `staging area`:

![stagingarea2](https://user-images.githubusercontent.com/18057391/91795944-64dde500-ebf5-11ea-83f2-04b6c9c0a7e4.PNG)
Note que foi criado o commit `d` a partir do estado da `staging area` que definimos anteriormente. 

Após a criação do commit, a staging area é limpa e podemos repetir o processo de adicionar arquivos nela o quanto desejarmos.

Na próxima seção iremos ver na prática o uso dos conceitos explicados até agora.

[Próxima seção: Comandos git com exemplos / add](../comandos-git-com-exemplos/add.md)