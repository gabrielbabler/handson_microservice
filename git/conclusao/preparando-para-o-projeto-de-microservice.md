| [Home](/handson_microservice) | [Instalação](/handson_microservice/instalacao) | [GIT](/handson_microservice/git) | [Docker](/handson_microservice/docker) | [Microservice](/handson_microservice/microservice)

# GIT / Conclusão / Preparando para o projeto de Microservice

Nesse momento vimos até então como o GIT funciona de uma maneira mais básica e depois vimos uma estratégia mais rebuscada de utilização dele conhecida como `Gitflow` na teoria.

Nessa etapa iremos configurar o projeto de microservice utilizando os conceitos vistos até então, dentre eles, `git`, `Gitflow`, e padrões de commits para termos um `CHANGELOG.md` gerado automaticamente.

> Para as etapas abaixo é esperado que você tenha uma conta no GitHub para que você possa criar um repositório e configurá-lo. Caso não tenha uma conta, [clique aqui para criá-la](https://github.com/join?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home), é rápidinho.

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

> Altere <SEU_USUARIO> e <NOME_DO_REPOSITORIO>

## 3. Crie a branch develop e envie para o GitHub

Com os comandos abaixo estamos criando a branch `develop` a partir da master (branch padrão que somos colocados) e enviando para o `GitHub` com o comando `git push origin develop`. A palavra `origin` faz referência `repositório remoto` na internet e `develop` a nossa branch que criamos localmente.

```
git checkout -b develop
git push origin develop
```

## 4. Atualize no repositório no GitHub a branch padrão para develop

Vá para a seção `Settings` no seu repositório e altere a branch padrão para `develop`:

![updatebranch](https://user-images.githubusercontent.com/18057391/92060532-6bda3400-ed6a-11ea-84e4-a95e15d3198b.png)

## 5. Configurando o projeto inicialmente

A partir da branch `develop`, iremos criar uma nova branch chamada `chore/configure-project-setup`, o qual iremos adicionar o template inicial e arquivos de configuração em geral.

```
git checkout -b chore/configure-project-setup
```