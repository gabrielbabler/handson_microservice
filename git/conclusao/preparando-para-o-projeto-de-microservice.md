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

[Faça o download desses arquivos (.zip)](/microservice-setup.zip)

Após baixar o `.zip` acima, extraia e cole os arquivos no repositório seu.

Com o arquivo de **.versionrc** e projeto do microservice no repositório podemos `commitar`:

```
git add .
git commit -m "Add initial setup project"
```

Após isso iremos enviar nova `branch` chamada `chore/configure-project-setup` para o GitHub:

```
git push origin chore/configure-project-setup
```

# 6. Criando a primeira Pull Request do nosso trabalho

Após trabalharmos na branch `chore/configure-project-setup` iremos fazer uma solicitação para nossas alterações serem adicionadas na branch `develop`.

# 7. Criando a release 0.1.0

A partir do momento que temos a branch `develop` com o trabalho que queremos, no caso, o `setup inicial do projeto`, iremos criar uma branch de release:

> Antes de criar a branch da develop, lembre-se de fazer git pull para que as alterações mais recentes sejam baixadas no seu computador.

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

> dry-run evita que o arquivo seja de fato criado, apenas serve para nos mostrar como seria de fato a execução em si do programa.

Podemos executar a geração do `CHANGELOG.md` e consequentemente gerar uma `tag` no repositório:

```
standard-version --release-as 0.1.0
```

> Uma tag é simplesmente um nome que podemos dar para um commit, no caso a própria ferramenta standard-version criará para nós a tag.

Em seguida podemos verificar que um commit foi criado pela ferramenta, concluindo nosso processo de exemplo de release.

Podemos enviar nossas alterações para o repositório no GitHub e criar um Pull Request para a `master`:

```
git push origin release/0.1.0
```

> Não podemos nos esquecer de atualizar a `develop` após fazer o merge da master pois criamos o `CHANGELOG.md` 