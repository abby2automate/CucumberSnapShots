Feature: First Script and DocString

  @WithoutExtentReport
  Scenario: Scenario
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes

	@WithExtentReport
  Scenario: DocString
    Given Load Make my Trip Page
    And Check the Following Dock String
    """
    The leading player in online flight bookings in India, MakeMyTrip offers great offers, some of the lowest airfares, exclusive discounts and a seamless online booking experience. Flight, hotel and holiday bookings through the desktop or mobile site is a delightfully customer friendly experience, and with just a few clicks you can complete your booking. With features like Instant Discounts, Fare Calendar, MyRewards Program, MyWallet and many more, the overall booking experience with MakeMyTrip constantly adds value to its product and continues to offer the best to its customers.
    
    """





    
   
