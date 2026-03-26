# 📚 Implementação do Padrão Bridge em Java

Este projeto tem como objetivo demonstrar a aplicação do padrão de projeto **Bridge**, conforme proposto em aula, utilizando a linguagem Java.

---

## 🧠 Sobre o Padrão Bridge

O padrão **Bridge** é um padrão estrutural que permite separar a abstração da implementação, possibilitando que ambas possam evoluir de forma independente.

---

## 🏗️ Estrutura do Projeto

O sistema foi dividido em duas hierarquias principais:

### 🔹 Abstração

* `Publicacao` (classe abstrata)
* `Livro`
* `Revista`

### 🔹 Implementação

* `Implementador` (interface)
* `PublicacaoImplBD`
* `PublicacaoImplXML`

---

## ⚙️ Funcionalidade

Cada método das classes foi implementado com um `System.out.println()` apenas para indicar sua execução, conforme solicitado na atividade.

---

## ▶️ Como Executar

No terminal, dentro da pasta do projeto:

```bash
javac *.java
java Main
```

---

## 🧪 Exemplo de Saída

```text
=== Teste com BD ===
Publicacao.obterDados() chamado
PublicacaoImplBD.getDados() chamado para: Livro
Livro.getTitulo() chamado
Livro.getAutor() chamado

=== Teste com XML ===
Publicacao.obterDados() chamado
PublicacaoImplXML.getDados() chamado para: Revista
Revista.getTitulo() chamado
Revista.getAutor() chamado
```

---

## 👨‍💻 Autor

Keviny Ryan Menezes Dantas

---

## 📌 Observação

Este projeto foi desenvolvido com fins acadêmicos para a disciplina de Padrões de Projeto.
