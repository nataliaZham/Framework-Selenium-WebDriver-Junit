## Framework-Selenium-WebDriver-Junit

This is a demo project which purpose is to demonstrate the usage of Selenium, Page Object pattern. Demo website: quandoo.de.

## Tests

Project has a test class BaseTest which contains the following tests:
* general test contains methods that initialize common settings.

Project has a test class HomePageTest which contains the following tests:
* a test that makes a click on the Berlin button and checks that the correct page has opened
* a test that makes a click on the Coln button and checks that the correct page has opened

Project has a test class RestaurantPageTest which contains the following tests:
* a test that makes a click on the photos button and makes sure there is text below the photos
* a test that makes a click on the menu button and makes sure there is text below the menu
* a test that makes a click on the reviews button and makes sure there is text below the reviews
* a test that makes a click on the reserveNow button and checks that the correct page has opened


## Prerequisites Software/Tools

1. Java Development Kit (Java 17)
2. Java Runtime Environment
3. Maven [ http://maven.apache.org/ ]
4. Git [ http://git-scm.com/downloads ]
5. JUnit Jupiter


## Installation and Test Run

Clone repository and perform the following command:

`mvn test`

## Contributors

Natalia Zhamsaranova zamsaranovanatala@gmail.com