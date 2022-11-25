Feature: Searches in Amazon Page

  Scenario: User can do a search from the amazon home page
    Given user in amazon Home Page
    When user clicks Hamburger icon
    Then user views side menu bar
    When user clicks on "TV,Appliances,Electronics" under "Shop By Category"
    Then user views "TV, Audio & Cameras"
    When user clicks on item "Televisions"
    Then user views Product Category Page
    When user clicks on "Samsung" under category "Brands"
    Then user views Results page
    When user clicks on second item
    Then user views Product Details page
    And user validates "About this item" section displayed