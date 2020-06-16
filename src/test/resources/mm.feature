
@tag
Feature: Login into facebook application

  @tag2
  Scenario Outline: login in facebook
    Given user launches browser
    When user enter the username"<user>" and password"<pass>"
    And user hits the login button
    Then user navigates to homr page

    Examples: 
|user|pass|
|9700568045|saimanikanta|
|jdas@gmail.com|7737777787|
