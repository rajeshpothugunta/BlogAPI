# Blog App - Micro Version

### List of steps to create RESTful API in spring boot that talks to database
1. Create a spring boot project with dependencies for web, jpa, h2 database
2. Create a model class for the entity that you want to store in the database
3. configure the datasource and entity manager in application.properties or application.yml
4. Create a repository interface that extends JpaRepository
5. Create a service class that has the business logic
6. Create a controller class that has the REST endpoints
7. use the repository in the service class to perform CRUD operations
8. Run the application and test the endpoints using postman

Note: This is just a high level overview of the steps to create a RESTful API in spring boot. There are many other things that need to be taken care of like exception handling, logging, security, etc.

## Post
 - id
 - title
 - content
 - slug
 - dateCreated
 - dateUpdated
