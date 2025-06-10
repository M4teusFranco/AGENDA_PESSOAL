# Agenda de Contatos com Java Swing e JPA

### 📋 Descrição do Projeto

Aplicação desktop para gerenciamento de contatos pessoais, desenvolvida com Java Swing para interface gráfica e JPA (Java Persistence API) para persistência de dados. Implementa o padrão arquitetural MVC (Model-View-Controller) para separação de responsabilidades.

#### Componentes principais

- ContatoView.java: Interface gráfica (View) com formulário e tabela de contatos
- ContatoController.java: Controlador que gerencia a interação entre View e Model
- Contato.java: Entidade JPA que representa um contato (Model)
- ContatoModel.java: Camada de acesso a dados (DAO) com operações CRUD
- AgendaContatos.java: Classe principal que inicia a aplicação

#### Funcionalidades principais

- Cadastro, edição e exclusão de contatos
- Listagem completa de contatos 
- Banco de dados via JPA
- Interface intuitiva com Swing

### 🔧 Pré-requisitos

- Java JDK 8 ou superior
- Banco de dados relacional (ex: MySQL, PostgreSQL, SQLite)
- Framework JPA
- Driver JDBC  
- IDE Java (Eclipse, IntelliJ, etc.)

### 🚀 Instalação e execução

1. Clone o repositório:

```
git clone https://github.com/seu-usuario/AGENDA_PESSOAL
```

2. Importe o projeto no Eclipse:
- File → Import → Existing Projects into Workspace
- Selecione a pasta do projeto clonado

3. Configure a URL de conexão, usuário e senha em persistense.xml:

```
<property name="javax.persistence.jdbc.driver" value="com.mysql.cj.jdbc.Driver"/>
<property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/seu_banco"/>
<property name="javax.persistence.jdbc.user" value="root"/>
```

### 🛠️ Funcionalidades Implementadas

CRUD completo:
- Create: adicionarContato()
- Read: listarContatos()
- Update: atualizarContato()
- Delete: deletarContato()

Validações:
- Campos obrigatórios
- Seleção de item para edição/exclusão

Interface:

- Formulário para cadastro
- Tabela com scroll para exibição
- Botões de ação claramente identificados

### 📝 Exemplo de saída

#### Interface Principal

![image](https://github.com/user-attachments/assets/1fdaff8d-ed3f-474d-a44e-4632f46a80ab)
![image](https://github.com/user-attachments/assets/a359a08a-520a-4c80-bb79-e1fed62725b1)


#### Inserção de Contato

![image](https://github.com/user-attachments/assets/a9e2e330-8ee6-4b42-b35d-59fc50835090)
![image](https://github.com/user-attachments/assets/f93f7a7f-930b-498b-8f0a-6316d7c3a424)
![image](https://github.com/user-attachments/assets/5e9b3830-d9a5-4497-bf56-6cbf24d80f97)
![image](https://github.com/user-attachments/assets/c37100d4-93dd-4d4c-a514-977bfa411081)


#### Atualização de Contato

![image](https://github.com/user-attachments/assets/8667cecd-5d76-48c5-bcc8-c1da1b8a6d11)
![image](https://github.com/user-attachments/assets/8035aea8-3d76-4d3b-8eff-b8e67b052f0e)
![image](https://github.com/user-attachments/assets/6d3d23b3-4ed1-494b-bc3e-273231df43a9)
![image](https://github.com/user-attachments/assets/988e6687-056d-4a9c-afab-ed2ffe004b0d)


#### Remoção de Contato

![image](https://github.com/user-attachments/assets/ec8ed18f-81a5-4cc7-ba74-d4f08124578c)
![image](https://github.com/user-attachments/assets/aa9b8c93-3dbf-40ae-b17a-4f5790319d91)
![image](https://github.com/user-attachments/assets/3dc4c181-2f0e-4086-9129-f21a96c798ef)
![image](https://github.com/user-attachments/assets/84c17dd0-2f32-434d-bdf3-01b7804a0f72)


## ✒️ Autores

* **Mateus Franco Bezerra** - *Trabalho Inicial* - AGENDA_PESSOAL
