# Directory Organization

- `./app` contains a Spring Boot application that serves as the backend for the project
- `./ui` contains a React application that serves as the frontend for the project
- `./bin` contains scripts for running the application and tests
- `./dev` contains a code gen app for programmatic development tasks
- `./build-logic` contains build logic and conventions

# Setup

Before running the application, you must have the following installed:
- Java 21 (Amazon Corretto [preferred], OpenJDK, Temurin, etc.)

The data needs to be scraped and processed before the application can be run. To do this, run the following commands:

```bash
./bin/app import-data
./bin/app create-datasets
```

# Code generation

To generate code for the database and the api, run the following command:

```bash
./bin/dev gen-db
./gradlew app:build
./bin/dev gen-api
```

# App Server Running in Development

An IntelliJ run configuration is provided under `.run` that can be used to run the application in development. Alternatively, you can run the following command:

```bash
./bin/app run
``` 

# UI Server Running in Development

```bash
cd ui
npm install
npm run start
```

Note: when the UI is built, it is automatically included in the app server, though it will not hot-reload.

# Building the complete application

For a complete rebuild:
```bash
./bin/build
```

For a simple app rebuild (the app will be under `app/build/install`)
```bash
./gradlew installDist
```

# Building in a cleanroom with Docker

```bash
./bin/build cleanroom
```
