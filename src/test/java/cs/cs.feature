Feature: Register

  Scenario Outline: success
    Given i enter into url
    When enters "<UserName>" , "<FirstName>" , "<LastName>" , "<password>" , "<confirmPassword>" , "<gender>" , "<emailAddress>" , "<mobileNumber>" , "<dob>" , "<address>"  ,  "<answer>"
    Then Login page appears

    Examples: 
      | UserName    | FirstName | LastName | password | confirmPassword | gender | emailAddress  | mobileNumber | dob        | address   | answer    |
      | qweffgrtyui | sruthi    | vrtui    | sruthii  | sruthii         | female | sru@gmail.com |   9652844459 | 01/01/1678 | hyderabad | ambajipet |

  