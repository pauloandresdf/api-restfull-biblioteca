# Sistema de Gerenciamento de Biblioteca com Spring Boot

Este projeto é uma aplicação de API RESTful construída com Spring Boot para gerenciar um sistema de biblioteca. Ele permite operações básicas para gerenciar livros em uma base de dados de biblioteca.

## Estrutura do Projeto

O projeto segue uma arquitetura padrão Spring Boot com os seguintes componentes:

- **Camada de Controller**: Trata requisições HTTP e define endpoints
- **Camada de Service**: Contém lógica de negócios e interage com repositórios
- **Camada de Repository**: Faz interface com o banco de dados
- **Camada de Entity**: Define modelos de dados

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3.2.4
- Spring Data JPA
- Banco de dados MySQL
- Maven (Ferramenta de build)

## Configuração do Banco de Dados

A aplicação está configurada para se conectar a um banco de dados MySQL com as seguintes propriedades:
- URL: `jdbc:mysql://localhost:3306/test`
- Nome de usuário: `root`
- Senha está configurada no application.properties
- Hibernate está configurado para atualizar o esquema automaticamente
- Consultas SQL são mostradas na saída do console (show-sql=true)

## Endpoints da API

Os seguintes endpoints estão disponíveis para gerenciar livros:

| Método HTTP | Endpoint | Descrição |
|-------------|----------|-------------|
| POST | `/biblioteca/livro` | Criar um novo livro |
| GET | `/biblioteca/livros` | Recuperar todos os livros |
| GET | `/biblioteca/livro/{id}` | Recuperar um livro por ID |
| PUT | `/biblioteca/livro/{id}` | Atualizar um livro por ID |
| DELETE | `/biblioteca/livro/{id}` | Excluir um livro por ID |

## Modelo de Dados

A entidade `Livro` possui os seguintes atributos:

| Campo | Tipo | Descrição |
|-------|------|-------------|
| id | Long | Chave primária, gerada automaticamente |
| titulo | String | Título do livro (máx 100 caracteres) |
| autorPrincipal | String | Autor principal (máx 150 caracteres) |
| anoPublicacao | Integer | Ano de publicação |
| edicao | Integer | Número da edição |
| dataCriacao | LocalDateTime | Data de criação do registro |
| dataAlteracao | LocalDateTime | Data da última alteração |

## Esquema do Banco de Dados

O esquema do banco de dados está definido no arquivo `script.attjava.sql`:

```sql
CREATE TABLE livro ( 
  id BIGINT PRIMARY KEY AUTO_INCREMENT, 
  titulo VARCHAR(100) NOT NULL,
  autor_principal VARCHAR(150) NOT NULL,
  ano_publicacao INT NOT NULL,
  edicao INT NOT NULL,
  data_criacao DATETIME NOT NULL,
  data_alteracao DATETIME,
  INDEX idx_livro_id (id)
);
```

## Como Executar

1. Certifique-se de ter o Java 17 instalado
2. Verifique se o MySQL está rodando em localhost:3306
3. Crie um banco de dados conforme especificado no script SQL
4. Clone o repositório
5. Navegue até o diretório do projeto
6. Execute a aplicação usando o Maven wrapper:
   ```
   ./mvnw spring-boot:run
   ```
   ou no Windows:
   ```
   mvnw.cmd spring-boot:run
   ```

## Dependências do Projeto

- Spring Boot Starter Data JPA
- Spring Boot Starter Web
- MySQL Connector Java 8.0.31
- Microsoft SQL Server JDBC Driver
- Spring Boot Starter Test (para testes)

## Estrutura de Pacotes

- `com.example.biblioteca`: Pacote principal da aplicação
  - `.controller`: Controladores REST
  - `.entity`: Entidades JPA
  - `.repository`: Repositórios de dados
  - `.service`: Serviços de lógica de negócios

## Notas Adicionais

O diretório de testes contém uma classe básica de teste `DemoApplicationTests` que inclui um teste de carregamento de contexto para garantir que a aplicação inicie corretamente.
