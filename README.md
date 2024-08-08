# Sistema de Gerenciamento de Inventário

Este projeto é uma API para gerenciar produtos em um inventário, construída usando Spring Boot. A API permite criar, listar, buscar e excluir produtos.

## Índice

- [Visão Geral da API](#visão-geral-da-api)
- [Configuração do Projeto](#configuração-do-projeto)
- [Endpoints da API](#endpoints-da-api)
  - [Adicionar um Novo Produto](#adicionar-um-novo-produto)
  - [Listar Todos os Produtos](#listar-todos-os-produtos)
  - [Buscar um Produto pelo ID](#buscar-um-produto-pelo-id)
  - [Remover um Produto pelo ID](#remover-um-produto-pelo-id)
- [Usando o Postman](#usando-o-postman)
- [Exemplos de Solicitações e Respostas](#exemplos-de-solicitações-e-respostas)

## Visão Geral da API

A API oferece os seguintes endpoints:

- **POST** `/api/products` - Adiciona um novo produto.
- **GET** `/api/products` - Lista todos os produtos.
- **GET** `/api/products/{id}` - Busca um produto pelo ID.
- **DELETE** `/api/products/{id}` - Remove um produto pelo ID.

## Configuração do Projeto

### 1. Clonando o Repositório

Clone o repositório para sua máquina local:

```bash
git clone https://github.com/Luizgi/InventoryManagementSystem.git
cd InventoryManagementSystem
```

### 2. Configurando o Ambiente
Certifique-se de ter o Java JDK 17 ou superior instalado. Além disso, 
você irá precisar do Maven para gerenciar as dependências do projeto.

### 3. Compilando e Executando o Projeto
Compile e execute o projeto com o Maven:

```bash
./mvnw spring-boot:run
```
O servidor Spring Boot será iniciado em 'http://localhost:8080'.

## Endpoints da API

# API de Produtos

## Adicionar um Novo Produto

- **Método**: POST
- **URL**: `/api/products`
- **Descrição**: Adiciona um novo produto ao inventário.

### Cabeçalhos

- `Content-Type: application/json`

### Corpo da Solicitação

```json
{
  "name": "Phone",
  "description": "You can make calls",
  "price": 1300,
  "quantity": 2
}
```

Resposta de Sucesso
Código: 201 Created

Corpo
json
```
{
  "id": 1,
  "name": "Phone",
  "description": "You can make calls",
  "price": 1300,
  "quantity": 2
}
```

## Listar Todos os Produtos

- **Método:** GET
- **URL:** /api/products
- **Descrição:** Lista todos os produtos no inventário.

### Resposta de Sucesso

- **Código:** 200 OK

- **Corpo**
```json
[
  {
    "id": 1,
    "name": "Phone",
    "description": "You can make calls",
    "price": 1300,
    "quantity": 2
  }
]
```

## Buscar um Produto pelo ID

- **Método:** GET
- **URL:** /api/products/{id}
- **Descrição:** Busca um produto específico pelo ID.

### Parâmetros de URL

- **id** - ID do produto a ser buscado.

### Resposta de Sucesso

- **Código:** 200 OK

- **Corpo**
```json
{
  "id": 1,
  "name": "Phone",
  "description": "You can make calls",
  "price": 1300,
  "quantity": 2
}
```

### Resposta de Falha

- **Código:** 404 Not Found

- **Corpo**
```json
{
  "timestamp": "2024-08-08T18:22:59.931+00:00"
}
```

