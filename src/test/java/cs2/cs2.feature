Feature: login

  Scenario Outline: login
    Given i enter into url
    When enters "<UserName>" , "<password>"
    Then click on Login

    Examples: 
      | UserName | password    |
      | Lalitha  | Password123 |
