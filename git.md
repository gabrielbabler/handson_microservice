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

## Configurando git pela primeira vez

```
git config --global user.name "change-me"
git config --global user.email "change-me"
```

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

## Trabalhando com mais pessoas (Github)

Crie uma [conta no Github](http://github.com/) caso ainda no tão tenha uma, é super intuitivo.
![image](https://user-images.githubusercontent.com/18057391/79184885-cbe83200-7deb-11ea-869f-b7c9611e7a75.png)

Forke o repositório [contribuindo-com-git](https://github.com/bartier/contribuindo-com-git)
![image](https://user-images.githubusercontent.com/18057391/79184983-11a4fa80-7dec-11ea-81c9-c15f9fc3a2b0.png)

Será criado um repositório idêntico ao original na sua conta. Agora você deve obter uma **cópia local** desse repositório remoto, para tanto, utilize o comando abaixo:
```
git clone https://github.com/<SEU_USUARIO_NO_GITHUB>/contribuindo-com-git.git
```

Uma pasta chamada `contribuindo-com-git` será criada no diretório em que você executou o comando acima. Acesse a pasta e crie uma nova branch chamada `proposta-de-alteracao`:
```
cd contribuindo-com-git
git checkout -b proposta-de-alteracao

# A flag -b do comando acima automaticamente move você para a branch criada
```

O próximo passo agora é realizarmos as alterações que queremos e `commitar` quanta vezes acharmos necessário. 

Para fins de simplificação, crie um `arquivo novo` com o nome que desejar (por exemplo, seu prório SEU_NOME.txt) e adicione algum conteúdo (uma citação, poema, etc) e crie um commit `referente a essa criação de arquivo`.

```
# Cria o arquivo SEU_NOME.txt com o conteúdo abaixo
echo "Altere esse conteúdo para algo que desejar" > SEU_NOME.txt

# Adiciona SEU_NOME.txt na staging area
git add SEU_NOME.txt

# Reúne as alterações da staging area e com base nela cria um commit
# Ao invés de entrarmos no editor, estamos 'pulando esse passo' e dando uma mensagem descritiva do commit pela flag -m
git commit -m "Adiciona o arquivo SEU_NOME.txt"
```

> ![s](https://user-images.githubusercontent.com/18057391/79183133-fa174300-7de6-11ea-882f-4e98d21c75f9.png) Como o objetivo é mais `entender o processo em si de contribuição`, não estamos levando em consideração o **valor do conteúdo que estamos criando**. Em um repositório de um projeto de código fonte isso seria diferente, já que **teríamos que implementar coisas que façam sentido e permitam o projeto ser executado**.

Após entendermos que nossa trabalho está pronto, iremos propor ao `mantenedor do projeto original` a nossa alteração que está na branch `proposta-de-alteracao` com o commit criado anteriormente.

Para tanto, envie suas alterações locais para o seu repositório remoto:

```
# A origin é a referência para seu projeto remoto no Github
# proposta-de-alteracao é a referência da sua branch local

git push origin proposta-de-alteracao
```

Após o comando acima ser executado, voc deverá ir ao seu repositório `forkado` pela página na Web.

Podemos verificar que existe a opção de criarmos um `Pull Request` pela própria interface do GitHub. O próprio GitHub sugere que você crie um PR (Pull Request):
![image](https://user-images.githubusercontent.com/18057391/79187069-b4ac4300-7df1-11ea-8b1a-1206791af542.png)
Clique em `Compare & pull request` para iniciar a escrita da sua proposta de alteração (Pull Request).

Ao clicar será exibido uma página como a seguir pedindo para que seja dado um título e uma descrição do seu Pull Request.

Nesse passo é importante convencer quem irá revisar a Pull Request do porque ela deve ser aceita. A imagem abaixo exemplifica um preenchimento de um Pull Request. 
![image](https://user-images.githubusercontent.com/18057391/79187448-a27ed480-7df2-11ea-88de-708cc873a005.png)

![image](https://user-images.githubusercontent.com/18057391/79187647-3b155480-7df3-11ea-89eb-7c36832d04fb.png)
A leitura do componente destacado acima é da direita para a esquerda:

Está sendo criado uma proposta de incorporar as alteraçes na branch `proposta-de-alteracao` para a branch `master`. No seu caso, ao invés de `master`, deverá aparecer algo como abaixo, indicando que a proposta será enviada ao projeto original que você gerou a cópia.
![image](https://user-images.githubusercontent.com/18057391/79187801-a95a1700-7df3-11ea-970e-f4f83d33775a.png)
