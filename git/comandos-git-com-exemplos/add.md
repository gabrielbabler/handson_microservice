| [Home](/handson_microservice) | [Instalação](/handson_microservice/instalacao) | [GIT](/handson_microservice/git) | [Docker](/handson_microservice/docker) | [Microservice](/handson_microservice/microservice)

# GIT / Comandos git com exemplos / add

Com nosso repositório criado, iremos adicionar conteúdos de exemplo, para tanto iremos utilizar poemas, pois nosso foco não será no momento no código e sim no `workflow básico` do git :)

Crie um arquivo chamado `no-meio-do-caminho.md` no seu repositório com o conteúdo abaixo com seu editor favorito e salve-o:

```
# Poema No Meio do Caminho (1928), de Carlos Drummond de Andrade

No meio do caminho tinha uma pedra
tinha uma pedra no meio do caminho
tinha uma pedra
no meio do caminho tinha uma pedra.

Nunca me esquecerei desse acontecimento
na vida de minhas retinas tão fatigadas.
Nunca me esquecerei que no meio do caminho
tinha uma pedra
tinha uma pedra no meio do caminho
no meio do caminho tinha uma pedra.
```

Até esse momento o git não `salvou` nada desse arquivo, o nosso `salvar` apenas fez o registro no nosso disco do computador. O git somente salvará quando criarmos os `commits`.

Para entendermos o que está acontecendo, podemos utilizar o comando  `git status` para verificar como o git está "enxergando" os arquivos da nossa pasta `workshop-git`. O retorno será parecido com algo abaixo:

```
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        no-meio-do-caminho.md

nothing added to commit but untracked files present (use "git add" to track)
```

Podemos verificar que o git sabe que existe o arquivo `no-meio-do-caminho.md`, mas ele está `untracked`. Esse é o estado inicial de todos arquivos para o git e para prosseguirmos precisamos adicionar ele na `staging area`:

```
git add no-meio-do-caminho.md
```

> Com uma inteface gráfica para usar git (GitHub Deskop no Windows ou o gitg no Ubuntu), o procedimento de adicionar arquivos para a `staging area` pode ser muito mais fácil para alguns, pois podemos selecionar os arquivos com o mouse ao invés de escrever os nomes deles. Aliás, lembre-se que a interface gráfica é um facilitador e nem sempre todos os comandos de git são possíveis através dela e eventualmente será necessário utilizar a linha de comando para algo mais complexo.


Após adicionar o arquivo `no-meio-do-caminho-md` na `staging area`, podemos continuar adicionando outros novos arquivos ou decidir `commitar`. 

Por ora vamos trabalhar apenas com o arquivo `no-meio-do-caminho.md`, que atualmente está na `staging area`. Na próxima seção iremos pegar o conteúdo da `staging area` e de fato transformar em um commit com o comando `git commit`.

[Próxima seção: Comandos git com exemplos / commit](../comandos-git-com-exemplos/commit.md)