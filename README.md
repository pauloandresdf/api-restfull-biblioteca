# Documentação da API RESTful - Biblioteca

## 📌 Visão Geral

Esta API RESTful gerencia o empréstimo de livros em uma biblioteca, permitindo cadastrar usuários, livros e controlar os empréstimos.

## 🏗️ Estrutura do Projeto

```
api-restfull-main/
│── README.md
│── desafio-spring.pdf
│── script.attjava.sql
│── atividade-spring-dois/demo/
    │── pom.xml
    │── src/
        │── main/java/com/example/biblioteca/
            │── BibliotecaApplication.java
            │── controller/LivroController.java
            │── entity/Livro.java
            │── repository/LivroRepository.java
            │── service/LivroService.java
        │── main/resources/application.properties
        │── test/java/com/example/demo/DemoApplicationTests.java
    │── target/
```

## ⚙️ Configuração e Execução

### 📌 Requisitos

- Java 17+
- Maven
- Banco de dados PostgreSQL ou H2 (ajustar no `application.properties`)

### 🚀 Passos para Executar

1. Clone o repositório:
   ```sh
   git clone <URL_DO_REPOSITORIO>
   cd api-restfull-main/atividade-spring-dois/demo
   ```
2. Compile e execute o projeto:
   ```sh
   mvn spring-boot:run
   ```
3. Acesse a API em `http://localhost:8080`

## 🖥️ Endpoints da API

### 📌 Usuários (`/usuarios`)

- `POST /usuarios` → Cadastra um novo usuário
- `GET /usuarios` → Lista todos os usuários

### 📌 Livros (`/livros`)

- `POST /livros` → Cadastra um novo livro
- `GET /livros` → Lista todos os livros

### 📌 Empréstimos (`/emprestimos`)

- `POST /emprestimos` → Realiza um empréstimo
- `PUT /emprestimos/{id}` → Registra a devolução de um livro
- `GET /emprestimos` → Lista todos os empréstimos

## 📜 Regras de Negócio

1. Se um usuário tiver **3 livros não devolvidos**, não pode pegar mais até devolver pelo menos 1.
2. Um usuário não pode pegar o **mesmo livro** mais de uma vez sem devolvê-lo.
3. Ao devolver um livro, a API deve atualizar a flag `entregaRealizada` para `true`.
4. Se um usuário tentar devolver um livro que não pegou, a API deve avisar que o empréstimo não existe.

## 📂 Banco de Dados

### 📌 Tabelas

#### **Usuário**

| Campo | Tipo   |
| ----- | ------ |
| id    | Long   |
| nome  | String |
| cpf   | String |

#### **Livro**

| Campo         | Tipo   |
| ------------- | ------ |
| id            | Long   |
| titulo        | String |
| anoPublicacao | Long   |

#### **Empréstimo**

| Campo            | Tipo      |
| ---------------- | --------- |
| id               | Long      |
| idLivro          | Long      |
| idUsuario        | Long      |
| dataDeEntrega    | LocalDate |
| entregaRealizada | Boolean   |

## 🛠️ Melhorias Futuras

- Implementar testes unitários
- Adicionar Swagger para documentação da API
- Melhorar mensagens de erro e tratamento de exceções
- Criar camada de DTO para evitar expor diretamente as entidades

---

✍️ **Autor:** Paulo André  
📅 **Data:** Abril de 2024

