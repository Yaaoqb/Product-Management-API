# Product-Management-API
The Product Management API is a backend application developed using Java Spring Boot. It provides a RESTful API for managing product information such as name, quantity, and price. The API supports CRUD (Create, Read, Update, Delete) operations on product data, allowing client applications to interact with the product management system.

Key Features:

1. Create new products: Clients can send POST requests to create new products by providing the product details, including name, quantity, and price.

2. Retrieve product information: Clients can send GET requests to fetch information about all products or a specific product by its ID.

3. Update product information: Clients can send PUT requests to update the details of a product, including its name, quantity, and price.

4. Delete products: Clients can send DELETE requests to remove products from the system based on their ID.


Technologies Used:

1. Java Spring Boot: Backend framework for building RESTful APIs and managing the server-side logic.

2. MySQL: Relational database used for storing and retrieving product data.

3. Hibernate: Object-relational mapping (ORM) library for mapping Java objects to database tables.

4. Spring Data JPA: Simplifies database operations by providing CRUD functionality and query generation.

5. Maven: Build tool for managing dependencies and building the project.

6. GitHub: Version control system and online repository for code collaboration and project management.

The Product Management API serves as the foundation for any client application that wants to interact with the product management system. By integrating this API, frontend applications or other backend systems can perform the necessary operations to manage product data effectively.
