Feature: add to cart

  @tag1
  Scenario: select product
    Given homepage
    And when user click on all category
    When popup appear select Electronics and click on Headphone
    Then click on add to cart
