# Java Maven Project

A sample Java project using Maven for dependency management and build automation.

## Project Structure

```
java-maven-project/
├── pom.xml
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/
│   │   │       └── App.java
│   │   └── resources/
│   └── test/
│       ├── java/
│       │   └── com/example/
│       └── resources/
└── README.md
```

## Build and Run

### Compile the project
```bash
mvn clean compile
```

### Run the application
```bash
mvn exec:java -Dexec.mainClass="com.example.App"
```

### Run tests
```bash
mvn test
```

### Package as JAR
```bash
mvn clean package
```

The JAR file will be created in the `target/` directory.

## Requirements

- Java 17 or higher
- Maven 3.6 or higher
