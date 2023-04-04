# Spring Boot JOOQ example

### **What is JOOQ**

    jOOQ has gained popularity among Java developers, especially those who work with databases, due to its ease of use, type safety, and powerful query capabilities. Some of the advantages of using jOOQ include:
    
    Type safety: jOOQ uses Java's strong typing system to ensure that queries are type-safe and free of syntax errors.

    Familiar syntax: jOOQ uses a familiar syntax that is similar to SQL, making it easy for developers to learn and use.

    Code generation: jOOQ can generate Java classes and interfaces that represent database tables, columns, and records, making it easy to write code that interacts with the database.

    Query building: jOOQ provides a fluent API for building complex queries that can be easily customized and modified.
    
    Multiple database support: jOOQ supports multiple databases, including Oracle, MySQL, PostgreSQL, and SQL Server, among others.

- Java 1.8 & Spring Boot 2.7
- Run schema.sql script in my sql 
- mvn clean compile 
- jooq-codegen will generate dao for crud, pojos and table. But you must have schema and table are present in MySql

- Later will add this feature
  - Eager & Lazy loading example 


### Curl Endpoint:

- **GET /products - Retrieve all products:**

    curl -X GET http://localhost:8080/products


- **GET /products/{id} - Retrieve a specific product by ID:**

    curl -X GET http://localhost:8080/products/1


- **POST /products - Create a new product:**

    curl -X POST -H "Content-Type: application/json" -d '{"name":"New Product","price":9.99}' http://localhost:8080/products


- **PUT /products/{id} - Update an existing product by ID:**

    curl -X PUT -H "Content-Type: application/json" -d '{"name":"Updated Product","price":19.99}' http://localhost:8080/products/1



- **DELETE /products/{id} - Delete a specific product by ID::**

    curl -X DELETE http://localhost:8080/products/1

