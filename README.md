### Requirements

- Java 11 (jdk-11.0.11)
- Maven 3.8.1
- Google Chrome browser

### Install Java and Maven

- [Java SE Development Kit 11 Downloads](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Installing Apache Maven](https://maven.apache.org/install.html)
- [Download Google Chrome](https://www.google.com/intl/en/chrome/)

### Run the test suite

You can run the test suite by using Maven from the root project directory:

`mvn test`

### Test scenarios

**Web:** Verify via the UI that as a loan borrower - you are seeing loan offers, upon filling the required form fields with valid inputs.

`LoanOffersTest`
- `shouldShowLoanOffersWhenRequiredFieldsAreFilledWithValidInputs()`

**API:** Resume API for borrowers, that should provide a 200 (OK) response if a loan application exists and a 404 response if the
loan application doesn't exist.

`ResumeEndpointTest`
- `shouldProvideOkResponseIfLoanApplicationExists()`
- `shouldProvideNotFoundResponseIfLoanApplicationDoesNotExist()`
- `shouldProvideInternalServerErrorWhenThereIsNoPayload()`