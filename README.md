Spring app using JPA, GraphQL and PostgreSQL driver that provides a GraphQL API for a thid-party DB.


![image](https://github.com/user-attachments/assets/a17ed145-00dc-4abf-b2b8-64108ef4031a)

How to run:
- `git clone https://github.com/BLCK-demo-projects/graphql-postgres-api`
- set up JDK (17 and higher)
- sync Gradle
- prepare DB credentials in external file `db-credentials.yml` (path specified in application.yml):
```yaml
db:
    username: xyz
    password: 123
```
- `./gradlew bootRun`
- app runs on port 8080

---

### Schema

A character can have one or more nemeses -> one to many. Nemesis can have one or more secrets -> one to many.
```
type CharacterDTO {
    id: ID
    name: String
    gender: String
    ability: String
    minimal_distance: Float
    weight: Float
    born: String
    in_space_since: String
    beer_consumption: Float
    knows_the_answer: Boolean
}

type NemesisDTO {
    id: ID
    character_id: ID
    is_alive: Boolean
    years: Int
}

type SecretDTO {
    id: ID
    nemesis_id: ID
    secret_code: String
}
```

### Dev REST controller

Get complete schema:
```
GET http://localhost:8080/dev/schema
```

Get reduced schema grouped by table:
```
GET http://localhost:8080/dev/reducedSchema
```

### Graphql controller

GraphiQL in-browser tool for writing, validating, and testing GraphQL queries can be accessed at `localhost:8080/graphiql`.

Get characters, join with nemeses and secrets (tree structure) [incomplete serialisation]:
```
http://localhost:8080/graphql
{
  charactersAndTheirJoins
}
```

Get count of characters:
```
http://localhost:8080/graphql
{
  countCharacters
}
```

Get average age of characters and nemeses (till today):
```
http://localhost:8080/graphql
{
  averageAges
}
```

Get average weight of characters:
```
http://localhost:8080/graphql
{
  averageCharWeight
}
```

### Sources
- https://docs.spring.io/spring-boot/reference/features/external-config.html#features.external-config
- https://www.baeldung.com/spring-boot-disable-hibernate-entity-validation
- https://stackoverflow.com/questions/2276644/list-all-tables-in-postgresql-information-schema
- Functional Programming in Java, Second Edition - Venkat Subramaniam
- https://github.com/JetBrains/js-graphql-intellij-plugin?tab=readme-ov-file#basic-configuration
- https://spring.io/guides/gs/graphql-server
- SQL Cookbook 2nd Edition - Anthony Molinaro
