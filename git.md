| [Home](https://gabrielbabler.github.io/handson_microservice/) | [Instalação](https://gabrielbabler.github.io/handson_microservice/instalacao) | [GIT](https://gabrielbabler.github.io/handson_microservice/git) | [Docker](https://gabrielbabler.github.io/handson_microservice/docker) | [Microservice](https://gabrielbabler.github.io/handson_microservice/microservice)

# GIT
![image](https://user-images.githubusercontent.com/18057391/79079842-d7eacb80-7ce7-11ea-9040-95c98e89569f.png)

## Referência para estudos

O GIT possui uma documentação muito extensa e bem detalhada. Para acessá-la, [clique aqui](https://git-scm.com/docs).

Além disso, existe um livro muito bom para aprender GIT (inclusive é citado na documentação oficial), chamado [Pro Git](https://git-scm.com/book/en/v2). 
Nele, os autores começam explicando desde o básico do básico até os detalhes mais avançados dessa ferramenta. O melhor é que
esse livro é totalmente **gratuito**.

## O que é GIT?

Sistema que registra **as mudanças de um conjunto de arquivos ao longo do tempo**,
para que você possa recuperar versões específicas mais tarde. 

Você possa usá-lo com praticamente **qualquer tipo de arquivo** em um computador

## O que o GIT quer resolver?

### Versionamento

Com o uso do GIT evitamos o gerenciamento de versão do nosso projeto de forma 'manual', como no exemplo abaixo em que utilizamos
pastas com o nome da versão. 

![image](https://user-images.githubusercontent.com/18057391/79080072-55fba200-7ce9-11ea-90b2-72537eebfede.png)


Essa estratégia simples pode causar, por exemplo, perca de informações, visto que você pode editar
uma pasta pensando que estava em outra.

### Compartilhamento de código com vários desenvolvedores

Um outro objetivo do GIT é permitir que desenvolvedores possam compartilhar seus projetos e trabalharem juntos de uma maneira fácil.

![image](https://user-images.githubusercontent.com/18057391/79080174-e803aa80-7ce9-11ea-8e2e-c639f81fa2e5.png)

## Comandos utilizados no Workshop

Crie uma pasta chamada `tcc` e entre nessa pasta:
```
mkdir tcc
cd tcc
```

Inicialize um repositório GIT no diretório atual:
```
git init
```

Crie 3 arquivos em brancos:
```
touch arquivo1.txt arquivo2.txt arquivo3.txt
```

Adicione algum texto nos arquivos criados com seu editor favorito. Caso deseje editar na linha de comando o arquivo, utilize o comando `vim <nome_do_arquivo>` e aperta a tecla `I`. 

Após realizar as alterações desejadas, aperte a tecla `ESC` e depois `SHIFT + :"` e escreva `wq`.

Podemos visualizar a todo o momento como o GIT está enxergando os arquivos utilizando o comando abaixo:
```
git status
```

Vamos adicionar alguns arquivos na nossa `staging area`, para tanto, execute o comando abaixo:
```
git add arquivo1.txt arquivo2.txt
```

Observe que o GIT agora considera o `arquivo 1.txt` e `arquivo2.txt` alterações prontas para serem `commitadas`, portanto, estão na nossa `staging area`:
```
$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)

	new file:   arquivo1.txt
	new file:   arquivo2.txt

Untracked files:
  (use "git add <file>..." to include in what will be committed)

	arquivo3.txt

```

Para criar um `commit` de fato e registrar o estado atual dos arquivos que estão na `staging area`, devemos utilizar o comando abaixo:
```
git commit
```

Será aberto o editor padrão que o GIT foi configurado, muito provavelmente o `GNU nano 2.9.3`. Nele iremos dar um título para descrever as nossas alterações, e se desejarmos, uma breve descrição.
![image](https://user-images.githubusercontent.com/18057391/79182194-9db32400-7de4-11ea-811d-87e6af2a339d.png)

Para salvar a mensagem, execute `CTRL + O` e depois aperte `ENTER`. Pronto, agora você salvou o arquivo `.git/COMMIT_EDITMSG`, um arquivo temporário que o `GIT` utiliza para obter a descrição do commit no processo de criação.

Saia do `GNU nano 2.9.3` utilizando `CTRL + X`.

**Pronto, criamos nosso primeiro `commit` que por padrão faz parte da `branch master`. Podemos visualizar nossa linha do tempo através do comando abaixo**:
```
git log
```

> ![s](https://user-images.githubusercontent.com/18057391/79183133-fa174300-7de6-11ea-882f-4e98d21c75f9.png) Você contemplou o fluxo mais comum que ocorre no `GIT`. 80% do caso de uso dele é esse processo sendo repetido.
