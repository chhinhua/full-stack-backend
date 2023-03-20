### This repo is the backend part of the fullstack project, the frontend part is available here 
👉[full-stack-frontend](https://github.com/chhinhua/full-stack-frontend)


--------------------------------------------------------------------------


### Technologies used
- [Spring Boot](https://spring.io/projects/spring-boot) - Spring Boot framework is used to build the web application
- [Hibernate](https://hibernate.org/) - Hibernate framework is used to manage the database
- [MySQL](https://www.mysql.com/) - MySQL database management system is used to store data.


--------------------------------------------------------------------------


### Running the project
1. Clone the project from the repository
```bash
git clone https://github.com/chhinhua/full-stack-backend.git
```


2. Configure the MySQL database in the application.properties file located at src/main/resources/application.properties. Edit the username, password, port, and database name to match your setup.

- First step 👉 Create new empty database and name with your choice

- Second step 👇
```java
spring.datasource.url=jdbc:mysql://localhost:3306/<database name>?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false&allowPublicKeyRetrieval=true
spring.datasource.username=<your username>
spring.datasource.password=<your password>
```


3. Run the application using Maven
```
mvn spring-boot:run
```
