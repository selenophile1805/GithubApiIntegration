# GitHub API Integration

## Description
An API that connects to the GitHub API to display user activity, repository details, and allows issue creation.

## Features
- **GET /github** → Show GitHub profile data (followers, following, repositories).
- **GET /github/{repo-name}** → Show data about a specific repository.
- **POST /github/{repo-name}/issues** → Create an issue in a repository with title and body, returning the issue URL.

## Project Structure
```
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.chetan.GithubApiIntegration
│   │   │       ├── config (GitHub API configuration)
│   │   │       ├── controller (REST endpoints)
│   │   │       ├── dto (Data Transfer Objects)
│   │   │       ├── exception (Error handling)
│   │   │       └── service (Business logic and API communication)
│   │   └── resources
│   │       └── application.properties
│   └── test (Unit and integration tests)
├── .gitignore
├── HELP.md
├── mvnw / mvnw.cmd (Maven wrappers)
├── pom.xml (Project dependencies and build configuration)
└── README.md
```

## Tech Stack
- **Spring Boot** (MVC pattern)
- **Java** (Backend development)
- **RestTemplate** (GitHub API communication)
- **Maven** (Build tool)

## Deployment
- **Platform:** [Railway](https://railway.app)

## How to Run Locally
1. Clone the repository:
```bash
git clone https://github.com/selenophile1805/GithubApiIntegration.git
```
2. Navigate to the project directory:
```bash
cd GithubApiIntegration
```
3. Set the environment variable for the GitHub token:
```bash
export GITHUB_TOKEN=your_personal_access_token
```
4. Build and run the application:
```bash
./mvnw spring-boot:run
```
5. Test the API using Postman or a browser:
- `http://localhost:8080/github`
- `http://localhost:8080/github/{repo-name}`
- `POST http://localhost:8080/github/{repo-name}/issues`

## Testing
- API tested with **Postman**.
- JSON responses are pretty-printed for readability.

## Author
- **Chetan**

## License
This project is licensed under the MIT License.

## Description 
Spring Boot API integrating with GitHub, showing user activity, repository details, and creating issues — deployed on Railway.

---

Would you like me to add more sections or refine anything? Let me know! 🚀

