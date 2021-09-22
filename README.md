# spring-boot-ssh-shell
This application is a simple Spring Boot CLI application which provides an SSH Shell in order to execute in-app commands/tasks. It is based on the [com.github.fonimus.ssh-shell-spring-boot-starter library](https://github.com/fonimus/ssh-shell-spring-boot).

## Technology Stack
The application is built using:
- Java 11
- Maven 3.6.3
- Spring Boot 2.5.4
- Lombok 1.18.20

## Manual Deployment
In order to manually deploy the application using CMD, follow these steps:
1. Package the application.
    ```
    mvn clean package
    ```
2. Run the application.
    ```
    java -jar target/spring-boot-ssh-shell.jar
    ```
    
## Docker Deployment
In order to deploy the application using Docker, follow these steps:
1. Package the application.
    ```
    mvn clean package
    ```
2. Build the Docker image.
    ```
    docker build -t imousmoutis/spring-boot-ssh-shell:1.0.0 .
    ```
3. Run the Docker container.
    ```
    docker run -p 2333:2333 -t imousmoutis/spring-boot-ssh-shell:1.0.0
    ```  

## Usage
In order to connect to the SSH Shell and run the tasks:
1. Open a new CMD window.
2. Connect to the SSH Shell (default port is 2333).
    ```
    ssh -p 2333 user@localhost
    ```
3. Authenticate using the same username/password value (i.e. for the username _user_ the password is _user_).
4. Run the command _help_ to view all the available commands.
5. Run a command. For example:
    ```
    get-user-age username
    ```
6. Exit the SSH Shell.
    ```
    exit
    ```
