
# 🧁 Cardápio Online - Backend

Aplicação backend criada a fim de aprofundar meus estudos na linguagem de programação Java e no framework Spring Boot.


## Referência para o projeto

A primeira versão desta aplicação, tem como base o conteúdo disponibilizado no seguinte endereço: [YouTube](https://www.youtube.com/watch?v=lUVureR5GqI&list=TLPQMTkwMzIwMjTqymXq1vNTnw&index=1)
## Licença

[MIT](https://choosealicense.com/licenses/mit/)


## Conhecimentos e Ferramentas

- Java API RestFul
- Spring Boot
- Postgres


## Referência da API

#### Get All

```http
  GET /food
```

#### Create

```http
  POST /food
```
#### Body
| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `title`      | `string` | **Required**. Nome do item a ser cadastrado |
| `price`      | `number` | **Required**. Valor do item a ser cadastrado |
| `image`      | `string` | **Required**. Link da imagem do item a ser cadastrado |




## Próximas Features

- Aplicar Clean Architecture refatorando o código
- Adicionar Mappers e refatorar mapeamento atual
- Modificar Identificadores para suportarem UUID
- Validar campos vindos no ``POST /food``
- Adicionar endpoint para update
- Adicionar endpoint para delete


## Versões

🏁 A versão v1 já está pronta! 🏁

![v1](https://img.shields.io/badge/version%3A-v1-green) Projeto criado de acordo com o que foi apresentado durante a aula.

