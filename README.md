API RESTful de Biblioteca
📑 Visão Geral
Esta API RESTful de biblioteca implementa um sistema para gerenciamento de acervo bibliográfico, permitindo o cadastro e gerenciamento de livros. O projeto segue uma arquitetura em camadas usando Spring Boot, com operações CRUD completas para a entidade Livro.
🔧 Tecnologias Utilizadas

Java 17
Spring Boot 3.2.4
Spring Data JPA
MySQL 8.0
Maven

🏗️ Estrutura do Projeto
Copiarbiblioteca-api/
├── src/
│   ├── main/
│   │   ├── java/com/example/biblioteca/
│   │   │   ├── BibliotecaApplication.java
│   │   │   ├── controller/
│   │   │   │   └── LivroController.java
│   │   │   ├── entity/
│   │   │   │   └── Livro.java
│   │   │   ├── repository/
│   │   │   │   └── LivroRepository.java
│   │   │   └── service/
│   │   │       └── LivroService.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/com/example/demo/
│           └── DemoApplicationTests.java
├── pom.xml
├── mvnw
├── mvnw.cmd
└── HELP.md
🗃️ Modelo de Dados
Entidade: Livro
CampoTipoDescriçãoidBIGINTIdentificador único (PK)tituloVARCHAR(100)Título do livroautor_principalVARCHAR(150)Nome do autor principalano_publicacaoINTAno de publicação do livroedicaoINTNúmero da ediçãodata_criacaoDATETIMEData de criação do registrodata_alteracaoDATETIMEData de alteração do registro
🔍 Arquitetura
O projeto segue uma arquitetura em camadas:

Camada de Apresentação (Controller): Gerencia as requisições HTTP e responsável por receber e responder às solicitações dos clientes.
Camada de Serviço (Service): Contém a lógica de negócios e coordena as operações.
Camada de Repositório (Repository): Responsável pela persistência dos dados e interação com o banco de dados.
Camada de Entidade (Entity): Define os objetos de domínio e suas relações.

🚀 Instalação e Configuração
Pré-requisitos

JDK 17 ou superior
Maven 3.6+
MySQL 8.0+

Passos para Configuração

Clone o repositório:
bashCopiargit clone <URL_DO_REPOSITORIO>
cd biblioteca-api

Configure o banco de dados:

Crie um banco de dados MySQL
Execute o script SQL fornecido:
bashCopiarmysql -u root -p < script.attjava.sql

Edite o arquivo src/main/resources/application.properties com suas credenciais de banco de dados:
propertiesCopiarspring.datasource.url=jdbc:mysql://localhost:3306/attjava_name
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha



Compile e execute o projeto:
bashCopiar./mvnw spring-boot:run
ou no Windows:
bashCopiarmvnw.cmd spring-boot:run
