# Exercício 05: Gerenciamento de Categorias

## Enunciado
 Desenvolva uma API REST com Spring Boot para gerenciar categorias. O objetivo é praticar mapeamento JPA básico e operações CRUD.

## Entidade: Categoria
| Atributo  | Tipo   | Descrição                                         |
| :---      | :---   | :---                                              |
| id        | Long   | Identificador único (chave primária, auto-gerado) |
| nome      | String | Nome da categoria                                 |
| descricao | String | Descrição da categoria                            |

## Requisitos
1. Crie uma entidade JPA chamada Categoria com os atributos especificados
2. Configure o nome da entidade JPA como Categoria
3. Configure o nome da tabela no banco como tb_categoria
4. Pelo menos dois atributos devem ter o nome do campo diferente do nome da coluna no banco, utilizando @Column(name="...")
5. Implemente um repositório Spring Data JPA para a entidade
6. Implemente um serviço para realizar as operações de CRUD
7. Crie um controlador REST que exponha os seguintes endpoints

## Endpoints RESTful
* POST /categorias — criar nova categoria
* GET /categorias — listar todas as categorias
* GET /categorias/{id} — buscar categoria por ID
* DELETE /categorias/{id} — deletar categoria por ID

## Observações
* Não é necessário implementar validação de dados
* Utilize as convenções Java para nomes de métodos, atributos e classes
* Seu código deve estar organizado em pacotes seguindo boas práticas
