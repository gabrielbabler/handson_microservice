| [Home](/handson_microservice) | [Instalação](/handson_microservice/instalacao) | [GIT](/handson_microservice/git) | [Docker](/handson_microservice/docker) | [Microservice](/handson_microservice/microservice)

# GIT / Comandos git com exemplos / checkout

Com o git podemos criar ramificações baseada em uma outra anterior, isso nos possibilitará trabalhar em uma `linha do tempo` independente e quando estivermos satisfeitos com nosso trabalho podemos voltar nosso trabalho para a `branch` principal:

Para tanto, precisamos criar a branch em si, podemos utilizar para tanto o comando abaixo:

```
git checkout -b NOME_DA_BRANCH_NOVA
```

> O comando acima cria a branch nova e altera para ela automaticamente. Caso queira criar a branch sem alterar para ela utilize 'git branch NOME_DA_BRANCH_NOVA'. Para mudar de branch utilize 'git checkout BRANCH_DESEJADA'.

![checkoutb](https://user-images.githubusercontent.com/18057391/92069006-b5347e80-ed7e-11ea-894c-5031f4f93f5c.png)

Em seguida podemos trabalhar em alguns commits, como a imagem abaixo simboliza:

> O fluxo de trabalho resumidamente é a edição dos arquivos -> staging area -> commit (ciclicamente)

![working](https://user-images.githubusercontent.com/18057391/92069143-0e9cad80-ed7f-11ea-9c5a-8eac5786b191.png)

Na próxima seção será comentado sobre `merge`.

[Próxima seção: GIT / Comandos git com exemplos / merge](merge.md)