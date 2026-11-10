# Aula 09 - Javadoc Automático

Projeto da disciplina de IQS (Aula 9 - Versionamento e Git Avançado).

## Objetivo
Configurar um workflow no GitHub Actions que gera a documentação Javadoc
automaticamente a cada push na branch `main`.

## Tecnologias
- Java 17
- Maven
- GitHub Actions

## Estrutura
- `src/main/java/br/com/faculdade/Calculadora.java` — classe de exemplo documentada com Javadoc
- `.github/workflows/javadoc.yml` — workflow que gera o Javadoc
- `pom.xml` — configuração do Maven

## Como ver o Javadoc
1. Acesse a aba **Actions** do repositório
2. Abra a execução mais recente do workflow **Gerar Javadoc**
3. Em **Artifacts**, baixe o arquivo **javadoc**
4. Descompacte e abra o `index.html`

## Padrão de commits
Este projeto segue o padrão [Conventional Commits](https://www.conventionalcommits.org/pt-br/).

## Autor
[Seu Nome]
