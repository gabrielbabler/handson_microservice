| [Home](/handson_microservice) | [Instalação](/handson_microservice/instalacao) | [GIT](/handson_microservice/git) | [Docker](/handson_microservice/docker) | [Microservice](/handson_microservice/microservice)

# GIT / Conclusão / Preparando para o projeto de Microservice

Nesse momento vimos até então como o GIT funciona de uma maneira mais básica e depois conhecemos uma estratégia mais rebuscada de utilização dele conhecida como `Gitflow`.

Nessa etapa iremos configurar o projeto de microservice utilizando os conceitos vistos até então, dentre eles, `git`, `Gitflow`, e padrões de commits para termos um `CHANGELOG.md` gerado automaticamente.

> Para as etapas abaixo é esperado que você tenha uma conta no GitHub para que você possa criar um repositório e configurá-lo. Caso não tenha uma conta, [clique aqui para criá-la](https://github.com/join?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home), é rapidinho.

## 1. Crie o repositório no GitHub

Selecione o botão de criar quando estiver logado na sua conta:

![new-repo](https://user-images.githubusercontent.com/18057391/92059895-cf636200-ed68-11ea-9aa2-eacfdb8d38ed.png)

Nas configurações de criação do repositório, dê um nome `(1)` e garanta que a opção `Add a README file` está ativada `(2)`. Com essa opção nosso repositório irá ser criado com um arquivo chamado `README.md` na raiz, o qual poderá ter as informações principais do projeto.

![settings](https://user-images.githubusercontent.com/18057391/92060017-194c4800-ed69-11ea-87f0-e414047a69c1.png)

Feito isso, clique em `Create repository`

## 2. Faça o clone do repositório criado 

Ao criar o repositório, você será redirecionado para a página dele. Nela, você poderá obter o `link único dele`, o qual iremos referenciar para baixar em nosso computador.

![clone](https://user-images.githubusercontent.com/18057391/92060216-8cee5500-ed69-11ea-8e0f-64d6e5ca36aa.png)

```
git clone https://github.com/<SEU_USUARIO>/<NOME_DO_REPOSITORIO>.git
```

> Altere SEU_USUARIO e NOME_DO_REPOSITORIO antes de executar o comando acima.

## 3. Crie a branch develop e envie para o GitHub

Com os comandos abaixo, criaremos a branch `develop` a partir da master (branch padrão que somos inseridos) e enviaremos para o `GitHub` com o comando `git push origin develop`. A palavra `origin` faz referência ao `repositório remoto` na internet e `develop` a nossa branch que criamos localmente.

```
git checkout -b develop
git push origin develop
```

## 4. Atualize no repositório no GitHub a branch padrão para develop

Vá para a seção `Settings` no seu repositório e altere a branch padrão para `develop`:

![updatebranch](https://user-images.githubusercontent.com/18057391/92060532-6bda3400-ed6a-11ea-84e4-a95e15d3198b.png)

## 5. Configurando o projeto inicialmente

A partir da branch `develop`, iremos criar uma nova branch chamada `chore/configure-project-setup`, o qual iremos adicionar o template inicial e arquivos de configuração em geral.

> Isso será necessário pois iremos criar a versão 0.1.0 do projeto em desenvolvimento contendo um ponto inicial. 

```
git checkout -b chore/configure-project-setup
```

Crie um arquivo com o nome `.versionrc` na raiz do projeto com o conteúdo abaixo:

```
{
  "types": [
    {"type": "feat", "section": "Features"},
    {"type": "fix", "section": "Bug Fixes"},
    {"type": "docs", "section": "Documentation"},
    {"type": "style", "section": "Styling"},
    {"type": "refactor", "section": "Refactors"},
    {"type": "perf", "section": "Performance"},
    {"type": "test", "section": "Tests"},
    {"type": "build", "section": "Build System"},
    {"type": "ci", "section": "CI"},
    {"type": "chore", "section": "Chore"},
    {"type": "revert", "section": "Reverts"}
  ]
}
```

Esse arquivo será utilizado no processo de `release` para gerar automaticamente o `CHANGELOG.md` com a ferramenta de linha de comando [standard-version](https://github.com/conventional-changelog/standard-version).

Em seguida devemos também obter os arquivos iniciais do projeto que iremos desenvolver:

[Faça o download desses arquivos (.zip)](/handson_microservice/microservice-setup.zip)

Após baixar o `.zip` acima, extraia e cole os arquivos no repositório seu.

Com o arquivo de **.versionrc** e projeto do microservice no repositório podemos `commitar`:

```
git add .
git commit -m "Add initial setup project"
```

Após isso iremos enviar a nova `branch` chamada `chore/configure-project-setup` para o GitHub:

```
git push origin chore/configure-project-setup
```

# 6. Criando a primeira Pull Request do nosso trabalho

Após trabalharmos na branch `chore/configure-project-setup` no ambiente local, iremos fazer uma solicitação para nossas alterações serem adicionadas na branch `develop`.

Para isso, no GitHub ao atualizarmos a pagina podemos verificar que uma nova opcao foi adicionada para **criar um Pull Request**:

> O GitHub automaticamente reconhece que uma branch foi enviada e sugere a criacao de um Pull Request

Clique em **Compare & Pull Request**:
![githubpr](https://user-images.githubusercontent.com/18057391/92297514-8cdf8800-ef16-11ea-9b8e-e0f600e02c5e.png)

Nessa etapa iremos propor a adicao de nossas alteracoes na linha principal de desenvolvimento, isto e, a branch `develop`.
![2](https://user-images.githubusercontent.com/18057391/92297560-e21b9980-ef16-11ea-94db-47db2d912ce8.PNG)

> Geralmente adicionamos o maximo possivel de contextualizacao para as pessoas que revisarem nossas alteracoes possam ter ideia sobre o que de fato queremos fazer e se nossa abordagem faz sentido para o projeto.

Em seguida clique em **Create pull request**.

Apos um processo de revisao sobre a Pull Request que eventualmente teria em um projeto com mais desenvolvedores, poderiamos enfim "mergear" nossas alteracoes na "develop". No nosso caso iremos considerar que nossa alteracao nao necessita de avaliacao (simularemos apenas o processo de Pull Request).

Nesse momento devemos nos atentar a forma como iremos fazer isso, pois queremos seguir um padrao de commit para nos ajudar na criacao da documentacao nos proximo processo.

![3](https://user-images.githubusercontent.com/18057391/92297596-4e969880-ef17-11ea-8f4d-7e7da2b2d0a7.PNG)

Para tanto, escolha a opcao "Squash and merge" ao inves da opcao padrao sempre que for `mergear` na `develop`, pois assim voce garante uma linha do tempo mais resumida. O GitHub automaticamente ira unir varios commits da sua branch de origem em apenas um commit caso tenha varios. No nosso exemplo fizemos apenas 1 commit, mas poderiamos ter feito varios testes com commits deixando essa branch mais "cheia".

Atente-se ao padrao que o **Conventional Commits** necessita, sempre o commit tendo um "grupo" e uma mensagem. No nosso caso poderiamos utilizar como commit a mensagem abaixo:

```
chore: Add initial setup project (#1)
```

![4](https://user-images.githubusercontent.com/18057391/92297634-d2e91b80-ef17-11ea-9f2b-c88a17c0e194.PNG)

Feito a criacao da mensagem do commit conforme o padrao, clique em "Confirm squash and merge". Essa acao ira integrar suas alteracoes na branch `develop`.

# 7. Criando a release 0.1.0

A partir do momento que temos a branch `develop` com o trabalho que queremos, no caso, o `setup inicial do projeto`, iremos criar uma branch de release simulando a criacao de uma versao inicial no desenvolvimento:

> Antes de criar a branch da develop, lembre-se de fazer git pull para que as alterações mais recentes sejam baixadas no seu computador, visto que realizamos o merge pelo GitHub.

```
git pull develop
git checkout develop
git checkout -b release/0.1.0
```

Vamos utilizar o `standard-version` para criar o `CHANGELOG.md`, para tanto será necessário instalar o Node.js:

[Siga as instruções de instalação do Node.js para seu sistema operacional](https://nodejs.org/en/download/)

Em seguida, podemos instalar a ferramenta de linha de comando:

```
npm i -g standard-version
```

## Criando o CHANGELOG.md

A ferramenta possui valores `default` muito consistentes. Além disso, podemos utilizar o seguinte comando para testar o arquivo de `CHANGELOG.md` que será gerado:

```
standard-version --dry-run --release-as X.Y.Z
```

Como queremos gerar a versão 0.1.0, devemos usar o comando como abaixo:

```
standard-version --dry-run --release-as 0.1.0
```

Lembra que criamos o arquivo `.versionrc` anteriormente? Esse gerador `standard-version` cria as secoes no `CHANGELOG.md` com base nas definicioes de `.versionrc`.

> dry-run evita que o arquivo seja de fato criado, apenas serve para nos mostrar como seria de fato a execução em si do programa.

Podemos executar a geração do `CHANGELOG.md` e consequentemente gerar uma `tag` no repositório:

```
standard-version --release-as 0.1.0
```

> Uma tag é simplesmente um nome que podemos associar para um commit, no caso a própria ferramenta standard-version criará para nós a tag v0.1.0 que podera ser utilizada para encontrar facilmente a versao lancada no GitHub.

Em seguida podemos verificar que um commit foi criado pela ferramenta atraves de `git log`, concluindo nosso processo de exemplo de release.

Podemos enviar nossas alterações para o repositório no GitHub e criar um Pull Request para a `master`, processo similar ao primeiro Pull Request do setup inicial:

```
git push --follow-tags origin release/0.1.0
```

Com as alteracoes no Github, selecionamos **Compare & pull request** para a branch de **release/0.1.0**:

![5](https://user-images.githubusercontent.com/18057391/92297727-9538c280-ef18-11ea-8c57-36d3ed8613e6.PNG)

Note que a branch alvo nao deve ser a develop no momento e sim a `master`. Iremos atualizar a develop apos o merge na `master` para que o proximo ciclo de desenvolvimento possa ser baseado na ultima versao criada.

![6](https://user-images.githubusercontent.com/18057391/92297763-eea0f180-ef18-11ea-8578-4cb4a2674f6a.PNG)


Devemos selecionar a opcao de `squash` e resumir o que esse Pull Request se propoe.
![7](https://user-images.githubusercontent.com/18057391/92297801-56efd300-ef19-11ea-977f-f905d08f4fb4.PNG)

Apos isso, clique em `Confirm squash and merge`.

Fizemos um processo de criar release, mas ate o momento essa alteracao nao esta na develop...Não podemos nos esquecer de atualizar a `develop` após fazer o merge da master pois criamos o `CHANGELOG.md`!

Ainda no GitHub, crie um Pull Request conforme a imagem abaixo:

![8](https://user-images.githubusercontent.com/18057391/92297863-e1383700-ef19-11ea-8354-1da666bf443f.PNG)

Nesse Pull Request iremos selecionar a branch alvo como "develop" e a origem como a release "0.1.0"

![9](https://user-images.githubusercontent.com/18057391/92297879-0c228b00-ef1a-11ea-802b-fffb9c2e4ef4.PNG)

Adicione um resumo da proposta do Pull Request conforme o exemplo abaixo e clique em "Create Pull Request":
![10](https://user-images.githubusercontent.com/18057391/92297885-2bb9b380-ef1a-11ea-864f-6f977052bb3e.PNG)

Apos isso, com o Pull Request criado, faca o merge com a opcao de "squash" como temos feito sempre:

![11](https://user-images.githubusercontent.com/18057391/92297910-66235080-ef1a-11ea-8566-02dd70410bd0.PNG)

Por fim, realizamos um ciclo de geracao de versao e no momento nossa branch develop esta atualizada para continuarmos o desenvolvimento :)

Nos proximos dias iremos continuar o desenvolvimento do projeto a partir da develop atualizada com a v0.1.0 :)