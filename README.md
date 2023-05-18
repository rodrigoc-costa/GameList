# GameList
[![Licença](https://img.shields.io/github/license/Rodsducarmo/GameList)](https://github.com/Rodsducarmo/GameList/blob/main/LICENSE)

## About the Project
GameList is a backend application developed in Java with the Spring Boot framework. The goal of this project is to demonstrate the implementation of a web application with some of the most common concepts and needs in backend development.

### Data Modeling

Below are the data modeling diagrams for the project:

- Domain Model:

![Domain Model](https://github.com/Rodsducarmo/GameList/blob/main/Domain.png)


- Object Model:

![Object Model](https://github.com/Rodsducarmo/GameList/blob/main/Object.png)


- Relational Model:

![Relational Model](https://github.com/Rodsducarmo/GameList/blob/main/Relational.png)


### Features

- Web systems and resources
- Client/server, HTTP, JSON
- REST pattern for web APIs
- Spring REST project structure
- Entities and ORM
- Database seeding
- Layered architecture: Controller, Service, Repository
- DTO pattern for data transfer
- N-N relationships with association class and embedded ID
- SQL queries with Spring Data JPA and Projections

### Project Profiles

The project has different profiles to adapt to different environments:

- Development and testing profile:
  - `test`
  - H2 database

- Staging profile:
  - `dev`
  - Homologation PostgreSQL database

- Production profile:
  - `prod`
  - Production PostgreSQL database
  - The project is deployed in the cloud at the following address: [https://gamelists.up.railway.app](https://gamelists.up.railway.app)
  - You can retrieve the API data by making a GET request to the following endpoint: `/games`
  - You can retrieve the game lists by making a GET request to the following endpoint: `/lists`

### Environment Configuration

- You can use Docker Compose to easily configure the local environment.
- Local homologation process is supported to test the application before deployment.
- It is recommended to set up a CI/CD (Continuous Integration/Continuous Deployment) process to automate the application deployment.

### CORS Configuration

The application has CORS (Cross-Origin Resource Sharing) configurations to allow access from different origins, ensuring proper security and interoperability.

### How to Run the Project

1. Clone the repository to your local environment.
2. Configure the environment as needed (Docker, project profiles, database).
3. Run the project using your preferred IDE or through the command line with the `mvn spring-boot:run` command.
4. Access the API at `http://localhost:8080` or the address provided by your configuration.

Feel free to explore and contribute to this project. If you have any questions or suggestions, please feel free to get in touch.

# Author

Rodrigo Carmo da Costa

https://www.linkedin.com/in/rodrigoc-costa/


