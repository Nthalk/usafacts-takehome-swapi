# Directory Organization

`./app` contains a Spring Boot application that serves as the backend for the project
`./ui` contains a React application that serves as the frontend for the project
`./bin` contains scripts for running the application and tests
`./build-logic` contains build logic and conventions

# Setup

Before running the application, you must have the following installed:
- Amazon Corretto 21

To scrape data and populate the database, run `./bin/app run --init`

# Running

To run the application: `./bin/app`
To run the integration tests: `./bin/test it` (requires the application to be running)
To run tests in app: `./bin/test app`
To run tests in ui: `./bin/test ui`
