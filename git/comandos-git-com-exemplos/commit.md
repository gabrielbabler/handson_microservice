| [Home](/handson_microservice) | [Instalação](/handson_microservice/instalacao) | [GIT](/handson_microservice/git) | [Docker](/handson_microservice/docker) | [Microservice](/handson_microservice/microservice)

# GIT / Comandos git com exemplos / commit

Com o arquivo `no-meio-do-caminho.md` na `staging area`, iremos de fato`commitar`, "salvar no git".

Executando novamente `git status` teremos um retorno parecido com abaixo:

```
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   no-meio-do-caminho.md
```

Note que o `git` já nos deu a dica: `changes to be commited`, ou em português claro, `alterações para serem commitadas`.

Execute `git commit -m "Adicionado Poema No Meio Do Caminho"` para criarmos o commit `de fato` com o conteúdo da `staging area`. Nós damos uma mensagem para o commit que melhor descreva o conteúdo que "fotografamos".

O retorno do comando será parecido com algo abaixo:

```
[master (root-commit) 144179f] Adicionado Poema No Meio Do Caminho
 1 file changed, 13 insertions(+)
 create mode 100644 no-meio-do-caminho.md
```

> A flag -m recebe como parâmetro uma mensagem do commit representando as alterações que elas representam, isto é, o que está na staging area até então. Caso essa flag não seja passada, o git irá abrir um editor para escrever a mensagem e aguardar que você salve e saia.


O primeiro `commit` do nosso repositório está feito. Na próxima seção iremos aprender a visualizar a linha do tempo `branch` no terminal em que estamos até o momento: `master`. 

[Próxima seção:  GIT / Comandos git com exemplos / log](log.md)