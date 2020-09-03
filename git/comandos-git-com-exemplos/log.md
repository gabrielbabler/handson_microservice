| [Home](/handson_microservice) | [Instalação](/handson_microservice/instalacao) | [GIT](/handson_microservice/git) | [Docker](/handson_microservice/docker) | [Microservice](/handson_microservice/microservice)

# GIT / Comandos git com exemplos / log

Para visualizarmos a linha do tempo, é mais interessante termos mais um commit. Para tanto, iremos realizar uma pequena alteração no arquivo `no-meio-do-caminho.md` da forma que desejar. 

Altere o poema (qualquer linha que quiser) e realize o processo de adicionar na `staging area` novamente e `comite`:


```
git add .
```

> O "." ponto se refere ao diretório atual que estamos, isto é, `workshop-git` e no comando `git add` isso significa para adicionar todos os arquivos desse diretório na `staging area`. Como só possuímos o arquivo `no-meio-do-caminho` até o momento, somente ele será adicionado.

Por fim, realize o `commit`:

```
git commit -m "Altera poema"
```

Para visualizarmos a linha do tempo dos commits, podemos executar o comando abaixo:

```
git log
```

Um retorno parecido será exibido no seu terminal, como o exemplo abaixo. Note que o commit mais recente irá ser exibido primeiro:

```
commit 00412c7c17cfeb055346a49e812e64aa42bbce9c (HEAD -> master)
Author: Você <seunome@seuemail.com>
Date:   Wed Sep 2 21:31:50 2020 -0300

    Altera poema

commit 144179f346630ee339dfaf07749833d887da0eda
Author: Você <seunome@seuemail.com>
Date:   Wed Sep 2 21:24:32 2020 -0300

    Adicionado Poema No Meio Do Caminho
```

Você pode utilizar a flag `--stat` para mostrar os arquivos alterados em cada commit se desejar:

```
git log --stat
```

O retorno nesse caso será o conteúdo abaixo:

```
commit 00412c7c17cfeb055346a49e812e64aa42bbce9c (HEAD -> master)
Author: Você <seunome@seuemail.com>
Date:   Wed Sep 2 21:31:50 2020 -0300

    Altera poema

 no-meio-do-caminho.md | 2 +-
 1 file changed, 1 insertion(+), 1 deletion(-)

commit 144179f346630ee339dfaf07749833d887da0eda
Author: Você <seunome@seuemail.com>
Date:   Wed Sep 2 21:24:32 2020 -0300

    Adicionado Poema No Meio Do Caminho

 no-meio-do-caminho.md | 13 +++++++++++++
 1 file changed, 13 insertions(+)
 ```

 Note que agora apareceu `no-meio-do-caminho.md` e a quantidade de linhas que foram adicionadas, simbolizado pelo mais "`+`" ou removidas, simbolizado pelo menos "`-`"

[Próxima seção: GIT / Comandos git com exemplos / checkout](checkout.md)