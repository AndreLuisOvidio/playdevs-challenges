<<<<<<< HEAD
## 🎯 Desafio da Semana (06/12/2024)

### 📝 Criando uma API RESTful para Gerenciamento de Tarefas

Seja bem-vindo(a) ao desafio da semana na **Play Devs**! 🎉  
O foco desta vez é **Back-End**, e o objetivo é criar uma **API RESTful** que permita o gerenciamento de tarefas de forma simples e eficiente. Você terá a oportunidade de explorar conceitos de APIs e colocar suas habilidades em prática. 🚀

=======
# 📝 Task API
Uma API RESTful para gerenciamento de tarefas, desenvolvida com Node.js, Express e MongoDB. 🚀🔧
>>>>>>> a8b213c6606a3039938ccaefc83b15e6490f43c0
---
## **Recursos da API** 📋
- **Listar todas as tarefas**: `GET /api/tasks` 📜
- **Criar uma nova tarefa**: `POST /api/tasks` ➕
- **Atualizar uma tarefa existente**: `PUT /api/tasks/:id` 🔄
- **Excluir uma tarefa**: `DELETE /api/tasks/:id` ❌
---
## **Como Rodar o Projeto Localmente** 💻
### **Pré-requisitos** 🛠️
- Node.js (versão 16 ou superior) 🟢
- MongoDB configurado e em execução 🍃
### **Passo a Passo** 👣
1. Clone este repositório: 📦
   ```bash
   git clone <URL_DO_REPOSITORIO>
   cd task-api
   ```
2. Instale as dependências: 📦
   ```bash
   npm install
   ```
3. Crie um arquivo `.env` na raiz do projeto e configure as variáveis de ambiente. Exemplo: 🔐
   ```env
   MONGO_URI=mongodb+srv://<username>:<password>@<cluster>.mongodb.net/<database>?retryWrites=true&w=majority
   ```
   > Substitua `<username>`, `<password>`, `<cluster>` e `<database>` pelos valores do seu banco MongoDB. 🔑
4. Inicie o servidor: 🚀
   ```bash
   npm start
   ```
5. Acesse a API em: `http://localhost:3000` 🌐
---
## **Testando com o Postman** 🧪
### **1. Listar todas as tarefas** 📋
- **Método:** `GET` 🔍
- **URL:** `http://localhost:3000/api/tasks` 🌐
- **Resposta esperada:** 📥
  ```json
  [
    {
      "_id": "id_da_tarefa",
      "title": "Título da Tarefa",
      "description": "Descrição da Tarefa",
      "createdAt": "2024-12-13T00:00:00.000Z"
    }
  ]
  ```
### **2. Criar uma nova tarefa** ➕
- **Método:** `POST` 📤
- **URL:** `http://localhost:3000/api/tasks` 🌐
- **Corpo (JSON):** 📋
  ```json
  {
    "title": "Nova Tarefa",
    "description": "Descrição da nova tarefa"
  }
  ```
- **Resposta esperada:** 📥
  ```json
  {
    "_id": "id_da_tarefa",
    "title": "Nova Tarefa",
    "description": "Descrição da nova tarefa",
    "createdAt": "2024-12-13T00:00:00.000Z"
  }
  ```
### **3. Atualizar uma tarefa existente** 🔄
- **Método:** `PUT` ✏️
- **URL:** `http://localhost:3000/api/tasks/:id` 🌐
- **Corpo (JSON):** 📋
  ```json
  {
    "title": "Tarefa Atualizada",
    "description": "Descrição atualizada"
  }
  ```
- **Resposta esperada:** 📥
  ```json
  {
    "_id": "id_da_tarefa",
    "title": "Tarefa Atualizada",
    "description": "Descrição atualizada",
    "createdAt": "2024-12-13T00:00:00.000Z"
  }
  ```
### **4. Excluir uma tarefa** ❌
- **Método:** `DELETE` 🗑️
- **URL:** `http://localhost:3000/api/tasks/:id` 🌐
- **Resposta esperada:** 📥
  ```json
  {
    "message": "Tarefa deletada com sucesso"
  }
  ```
---
## **Configuração do Banco MongoDB** 🍃
Se você está começando com o MongoDB, siga este guia para configurá-lo: 📚
### **1. Criar uma Conta MongoDB Atlas** 🌐
- Acesse [MongoDB Atlas](https://www.mongodb.com/cloud/atlas) e crie uma conta gratuita. 📝
- Crie um novo cluster. 🏗️
### **2. Configurar Usuário e Banco de Dados** 🔐
- No cluster criado, vá até **Database Access** e configure um usuário com login e senha. 🔑
- Em **Databases**, crie um novo banco de dados. 💾
### **3. Obter a URL de Conexão** 🌍
- No cluster, clique em **Connect** > **Connect your application**. 🔗
- Copie a URL fornecida, que será algo como: 📋
  ```
  mongodb+srv://<username>:<password>@<cluster>.mongodb.net/<database>?retryWrites=true&w=majority
  ```
- Substitua `<username>`, `<password>`, `<cluster>` e `<database>` pelos valores do seu banco. 🔑
### **4. Testar a Conexão Localmente** 🧪
- No terminal, execute: 💻
  ```bash
  mongo "mongodb+srv://<username>:<password>@<cluster>.mongodb.net/<database>?retryWrites=true&w=majority"
  ```
- Se tudo estiver configurado corretamente, você verá a conexão estabelecida com sucesso. ✅
---
## **Contribuições** 🤝
Contribuições são bem-vindas! Abra uma **issue** ou envie um **pull request** com melhorias. 🚀
---
<<<<<<< HEAD

### 📬 **Entrega do Projeto**

- Submeta seu projeto dentro da pasta do desafio da semana no repositório.
- Inclua um arquivo `README.md` explicando como rodar e utilizar o editor de texto.

---

### 🌟 **Premiação**

O vencedor será reconhecido como **@Vencedor da Semana**, recebendo:
- 🧪 **20% de XP Boost**
- 🪙 **3000 DevCoins**
- 📢 **Destaque na comunidade com direito a @everyone**

---

🎉 **Boa sorte e divirta-se codando!** Estamos ansiosos para ver o que você vai criar. 🚀
=======
## **Licença** 📄
Este projeto está licenciado sob a Licença MIT. ⚖️
>>>>>>> a8b213c6606a3039938ccaefc83b15e6490f43c0
