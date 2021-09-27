#Author: alisilverstone7@gmail.com
#Keywords Summary : Search Function 
Feature: Automation Challenge

  @Smoke
  Scenario: Search Function Test on Consumer Page
    Given user searches for "haircut" in "San Francisco" on consumers page
    Then verify the number of the search results are 3 or more
    And user clicks "Test - Sabre Cuts"
    Then user selects "All services" in the services filter from the left panel
    And user selects second staff from the staff filter in the left side panel
    Then user clicks the “Book” button for the “Men's Haircut” service
   	When user presses "Select Time" in the add-on modal opened
  	Then Verify that the user is presented with a list of available time slots with at least 2 entries
 		And verify in the right side panel :Service displayed is the one selected in the step before
		Then verify in the right side panel :Service price is the same as the one displayed in the step before
		And verify in the right side panel :Staff selected is the staff chosen before
