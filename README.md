# Specmatic Coding Test

### How to run:

**Prerequisites**: Make sure you have go installed 

From a terminal, run the following command:

```bash
cd server
go mod tidy
go run main.go
```

Now launch command pallet and type "Run Contract Tests", this should launch the Specmatic plugin

### Prerequisites:

JDK 17+ OR [Specmatic VS Code Plugin](https://specmatic.in/#extension)

### Instructions:

### 1. Fork this repository on Github. Checkout your forked repo to your local machine.

#### Java/Kotlin Steps

From a terminal, run the following command:

```bash
mvn clean test
```

You should see 38 failing tests:

```bash
[ERROR] Tests run: 38, Failures: 38, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
```

#### VS Code Plugin Steps (Programming Lanugage Agnostic)

1. Install Specmatic VS Code Plugin
2. Launch command pallet and type "Run Contract Tests", this should launch the Specmatic plugin
3. In the Contract Test Settings screen, update the following:

* Update API specification file to ./products_api.yaml
* Select the checkbox for Generative tests
* Click on the "Save and Run" button

4. You should see 38 failing tests:

```bash
[ERROR] Tests run: 38, Failures: 38, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
```

![Specmatic VSCode Extension Screenshot](assets/specmatic-coding-test-vs-code-plugin.png)

## Objective of this Assignment

Your objective is to get all the tests to pass by following the rest of the instructions.

### 2. Introduction to Specmatic

- Watch the [Contract-Driven Development - Turn your API Specification into Executable Contracts](https://www.youtube.com/watch?v=7OvTanLjm20&list=PL9Z-JgiTsOYT66JOxf9c63AzhsK3Jay8P) video on Specmatic.
- This will really help you to understand how Specmatic works and is necessary background/context about the project.

### 3. Part 1 - Implement REST endpoints:

#### Java/Kotlin Steps

- This is a Kotlin based Spring Boot application.
- You are expected to implement the missing endpoints in the **Products** controller.

#### Note:

- You are **not** expected to use a database. Instead, use an in memory map to store and retrieve products.
- Feel free to leverage GPT or Github Copilot.
- Please do not alter the following files:
  - ContractTest.kt
  - products_api.yaml
  - specmatic.json

#### Other Programming Languages Steps

- Any your choise of programming language and Web API framework.
- You are expected to implement the missing endpoints.

### 4. Part 1 - Definition of Done

- All 38 tests are passing
- 100% API Coverage from 1 path is achieved
- Code changes are committed to your Github repo.

### 5. Part 2 - Added mandatory property 'cost' to the ProductDetails schema

- Update the products_api.yaml OpenAPI specification such that 'cost' is added as a new mandatory property to ProductDetails
- This will increase the test count to 50 and cause a few tests to fail
- Update your kotlin code to make all the tests pass again.

### 6. Part 2 - Definition of Done

- All 50 tests are passing
- 100% API Coverage is still maintained
- Code changes are committed to your Github repo.

### 7. Trigger the CI pipeline under Github Actions.

- Make sure all tests are passing on the pipeline as well.
- Email the following details to coding.test@specmatic.in:
  - Screenshot of passing CI pipeline
  - Screenshot of API Coverage report
  - Link to you github repo
