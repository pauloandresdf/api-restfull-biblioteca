# API RESTful de Biblioteca

## 📑 Visão Geral

Este projeto implementa uma API RESTful para gestão de biblioteca, permitindo o cadastro e gerenciamento de livros, usuários e empréstimos. A API facilita o controle de operações comuns de biblioteca, como cadastro de livros, empréstimos e devoluções, seguindo regras de negócio específicas.

## 🔧 Tecnologias Utilizadas

- Java 17
- Spring Boot 3.2.4
- Spring Data JPA
- MySQL
- Maven

## 🏗️ Estrutura do Projeto

```
api-restfull-main/
│── README.md
│── desafio-spring.pdf
│── script.attjava.sql
│── atividade-spring-dois/demo/
    │── pom.xml
    │── src/
        │── main/
            │── java/com/example/biblioteca/
                │── BibliotecaApplication.java
                │── controller/
                    │── LivroController.java
                │── entity/
                    │── Livro.java
                │── repository/
                    │── LivroRepository.java
                │── service/
                    │── LivroService.java
            │── resources/
                │── application.properties
        │── test/
            │── java/com/example/demo/
                │── DemoApplicationTests.java
```

## 📋 Estrutura do Banco de Dados

### Tabela Livro

| Campo           | Tipo         | Descrição                     |
|-----------------|--------------|-------------------------------|
| id              | BIGINT       | Identificador único (PK)      |
| titulo          | VARCHAR(100) | Título do livro               |
| autor_principal | VARCHAR(150) | Nome do autor principal       |
| ano_publicacao  | INT          | Ano de publicação do livro    |
| edicao          | INT          | Número da edição              |
| data_criacao    | DATETIME     | Data de criação do registro   |
| data_alteracao  | DATETIME     | Data de alteração do registro |

## 🚀 Instalação e Configuração

### Pré-requisitos

- JDK 17 ou superior
- Maven
- MySQL

### Passos para Execução

1. Clone o repositório:
   ```bash
   git clone <URL_DO_REPOSITORIO>
   cd api-restfull-main/atividade-spring-dois/demo
   ```

2. Configure o banco de dados:
   - Edite o arquivo `src/main/resources/application.properties` para configurar o acesso ao banco de dados conforme sua instalação do MySQL

3. Execute o script SQL para criar o banco de dados:
   ```bash
   mysql -u root -p < ../../script.attjava.sql
   ```

4. Compile e execute o projeto:
   ```bash
   mvn spring-boot:run
   ```

5. A API estará disponível em: `http://localhost:8080/biblioteca`

## 📚 Endpoints da API

### Livros

| Método | Endpoint             | Descrição                          |
|--------|----------------------|------------------------------------|
| POST   | /biblioteca/livro    | Cadastra um novo livro             |
| GET    | /biblioteca/livros   | Lista todos os livros cadastrados  |
| GET    | /biblioteca/livro/{id} | Busca um livro pelo ID            |
| PUT    | /biblioteca/livro/{id} | Atualiza as informações de um livro |
| DELETE | /biblioteca/livro/{id} | Remove um livro do sistema        |

### Estrutura do JSON para Livros

```json
{
  "titulo": "Nome do Livro",
  "autorPrincipal": "Nome do Autor",
  "anoPublicacao": 2023,
  "edicao": 1,
  "dataCriacao": "2024-03-12T10:00:00"
}
```

## 📝 Regras de Negócio Planejadas

De acordo com o README original, o sistema pretende implementar as seguintes regras:

1. Um usuário não pode ter mais de 3 livros emprestados simultaneamente
2. Um usuário não pode pegar emprestado o mesmo livro que já está em sua posse
3. Ao devolver um livro, o sistema deve atualizar o status do empréstimo
4. Sistema deve validar empréstimos existentes durante a devolução

## 🔄 Estado Atual de Implementação

Atualmente, apenas o módulo de gerenciamento de livros está implementado. As funcionalidades de usuários e empréstimos estão planejadas para futuras atualizações.

## 🛠️ Próximas Melhorias

- Implementar entidades e endpoints para Usuários
- Implementar entidades e endpoints para Empréstimos
- Adicionar camada de DTOs para melhor encapsulamento
- Implementar testes unitários
- Documentar a API com Swagger
- Melhorar mensagens de erro e tratamento de exceções

## 📄 Licença

Este projeto está sob licença Apache 2.0, conforme especificado nos arquivos de script do Maven.

## 👨‍💻 Autor

Paulo André - Abril de 2024
