# Invent BT Java Technical Test

## Getting Started

For this example there is only a backend, so you do not need to worry about making it work with a frontend.

### Backend

Java 11 - with Spring Boot 2.7.11

> To start the backend ensure you are in the `/backend/java` and run `mvn spring-boot:run` the service will start on [http://localhost:8080](http://localhost:8080)

## Task

### Scenario: Shopping cart

Allow one hour to complete as much as possible.
Please work as you would normally do

> Advice: We would rather you did it properly and completed less than completed it all with poor quality or attention to details. We are looking for your best work.
>
> Things to consider: code quality, unit tests, extensibility, maintainability, etc.

- You are building a checkout system for a shop which only sells apples and oranges.

- Apples cost 60p and oranges cost 25p.

#### Backend Requirements

- Build a checkout system which takes a list of items scanned at the till and outputs the total cost. See /total endpoint
- For example: [ Apple, Apple, Orange, Apple ] => £2.05
- Make reasonable assumptions about the inputs to your solution; for example, many candidates take a list of strings as input

> Think about edge cases and how you would handle them e.g. empty list, null, invalid items, etc.
