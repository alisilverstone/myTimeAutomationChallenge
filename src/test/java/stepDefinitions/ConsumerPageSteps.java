package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ConsumerPageElements;
import utils.CommonMethods;

public class ConsumerPageSteps extends CommonMethods{
	
	static String mensHaircutPrice="";
	static String staff="";
	static String service="";
	
	
	@Given("user searches for {string} in {string} on consumers page")
	public void user_searches_for_in_on_consumers_page(String businesName, String location) throws InterruptedException {
	    consumerPage.businessSearchBox.sendKeys(businesName);
	    waitForClickability(consumerPage.locationSearchBox);
	    consumerPage.locationSearchBox.clear();
	    consumerPage.locationSearchBox.sendKeys(location);
	    consumerPage.searchBox.click();
	
	}
	
	@Then("verify the number of the search results are {int} or more")
	public void verify_the_number_of_the_search_results_are_or_more(Integer int1) {
	    int resultSize= consumerPage.businessSearchResults.size();
	    Assert.assertTrue(resultSize>=int1);
	}
	
	@And("user clicks {string}")
	public void user_clicks(String Name) throws InterruptedException {
		
		for(int i=0;i<consumerPage.businessSearchResults.size();i++) {
			String business= consumerPage.businessSearchResults.get(i).getText();
		
			if(business.contains(Name)){
				// solving stale element exception by redefining the same webElement
				String xp="(//h2[@class='business-name']/a)"+"["+(i+1)+"]";
				WebElement b1= driver.findElement(By.xpath(xp));
				CommonMethods.scrollIntoView(b1);
				CommonMethods.scrollUp(200);
				CommonMethods.jsClick(b1);
			
			}
		}
	}
	
	@Then("user selects {string} in the services filter from the left panel")
	public void user_selects_in_the_services_filter_from_the_left_panel(String selectedService) throws InterruptedException {
				
		for(WebElement s:consumerPage.businessServicesList) {
			String service= s.getText();
			if(service.equalsIgnoreCase(selectedService)){
				CommonMethods.jsClick(s);
				break;
			}
		}
	}

	@Then("user selects second staff from the staff filter in the left side panel")
	public void user_selects_second_staff_from_the_staff_filter_in_the_left_side_panel() throws InterruptedException {
			WebElement secondStaffMember= consumerPage.staffMemberList.get(2);
			// staff member is being saved into a static variable before the selection
			staff=consumerPage.staffMemberList.get(2).getText();
			secondStaffMember.click();	
	}
	
	@Then("user clicks the “Book” button for the “Men's Haircut” service")
	public void user_clicks_the_Book_button_for_the_Men_s_Haircut_service() {
		//service is being stored in static variable first
		service=consumerPage.serviceBeforeSelection.getText();	
		
		//service price is being saved before the selection
		mensHaircutPrice= consumerPage.mensHaircutPrice.getText();
		consumerPage.bookMensHaircutButton.click();
	}

	@When("user presses {string} in the add-on modal opened")
	public void user_presses_in_the_add_on_modal_opened(String string) {
		consumerPage.mensHaircutSelectTimeButton.click();
	}

	@Then("Verify that the user is presented with a list of available time slots with at least {int} entries")
	public void verify_that_the_user_is_presented_with_a_list_of_available_time_slots_with_at_least_entries(Integer int1) throws InterruptedException {
		consumerPage.nextAvailableDateButton.click();
		int availableAppointment= consumerPage.listOfSelectAvailableTimeButtons.size();
	    Assert.assertTrue(availableAppointment>=2);
	    
	}

	@Then("verify in the right side panel :Service displayed is the one selected in the step before")
	public void verify_in_the_right_side_panel_Service_displayed_is_the_one_selected_in_the_step_before() {
		String selectedService=consumerPage.selectedServiceOnAptDetails.getText();
		   Assert.assertTrue(selectedService.equals(service));
	}

	@Then("verify in the right side panel :Service price is the same as the one displayed in the step before")
	public void verify_in_the_right_side_panel_Service_price_is_the_same_as_the_one_displayed_in_the_step_before() {
	  
		String servicePrice=consumerPage.servicePriceOnAptDetails.getText();
			Assert.assertTrue(servicePrice.equals(mensHaircutPrice));
	}

	@Then("verify in the right side panel :Staff selected is the staff chosen before")
	public void verify_in_the_right_side_panel_Staff_selected_is_the_staff_chosen_before() {
		 String selectedEmployee=consumerPage.selectedEmployeeOnAptDetails.getText();
		 	Assert.assertTrue(selectedEmployee.equals(staff));
	}

}
