@WIP

  Feature: Order product functionality test

    Scenario: Order Lenovo Legion
      Given Open Homepage
      And Write in search Lenovo Legion
      And Choose and open product
      When Remember the name and the price product
      And Put in the basket
      And Open the basket
      And Compare correctly choice product
      Then Proceed to checkout
      And Write email and log in for unregistered
      And Choose how to get order
      And Fill in all required fields for order
      And Check user data
      And Go to the payment
      And Check order details
      And Close page


