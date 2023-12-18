# Project Name - Backend

## Backend Setup:

1. Ensure you have Java and Spring Boot installed.
2. Clone the repository and navigate to the backend directory.
3. Run the Spring Boot application.

## Performing Tests:

- **For unit tests:** Run `BackendUnitTest.java`.
- **For integration tests:** Run `BackendIntegrationTest.java`.
- **For end-to-end tests:** Run `BackendEndToEndTest.java`.

## API Usage:

1. Send a POST request to `/doMath` with a JSON payload containing `operand1`, `operand2`, and `operation`.
    - Example payload: `{ "operand1": 5, "operand2": 4, "operation": "*" }`.
2. Receive a JSON response with `calcResponse`.
    - Example response: `{ "calcResponse": 20 }`.

This information provides guidance on setting up the backend, running different tests, and utilizing the API for your Spring Boot application. Adjust file names and endpoints as per your project structure and requirements.
