
### Dev REST controller

Get complete schema:
```
GET http://localhost:8080/dev/schema
```

Get reduced schema grouped by table:
```
GET http://localhost:8080/dev/reducedSchema
```

### Graphql

GraphiQL in-browser tool for writing, validating, and testing GraphQL queries can be accessed at `localhost:8080/graphiql`.

Get characters, join with nemeses and secrets (tree structure):
```
http://localhost:8080/graphql
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
```

Get average weight of characters:
```
http://localhost:8080/graphql
```

