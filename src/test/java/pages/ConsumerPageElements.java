package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.PageInitializer;

public class ConsumerPageElements extends PageInitializer{
	
	/**
	 * --------------- Consumer Page Elements ---------------
	 * 
	 */
	
	/** Consumer Page Business Search box */
	@FindBy(xpath="//div[@class='search-bar-item business-search']/input[1]")
	public WebElement businessSearchBox;
	
	/** Consumer Page Location Search box */
	@FindBy(xpath="//div[@class='search-bar-item location-search']/input")
	public WebElement locationSearchBox;
	
	/** Consumer Page Location Search box */
	@FindBy(xpath="//button[@class='flat-blue-btn btn-search']")
	public WebElement searchBox;
	
	/** Consumer Page Business Search Results */
	@FindBy(xpath="//h2[@class='business-name']/a")
	public List <WebElement> businessSearchResults;

	/** Selected Business Page */
	@FindBy(xpath="//span[@class='option-text themed-component themed-component--color']")
	public List <WebElement> businessServicesList;
	
	/** Staff member list on the left panel*/
	@FindBy(xpath="//section[@class='staff-member']/fieldset/label/span")
	public List <WebElement> staffMemberList;
	
	/** Second Staff member from list on the left panel*/
	@FindBy(xpath="//label[@class='text-16' and @for='id-1632692638253-2']/span")
	public WebElement secondStaffMemberFromList;
	
	/** Book Men's Haircut Button */
	@FindBy(xpath="//button[@class='my-button nice-checkbox__button capitalize text-21 themed-component themed-component--background' and @aria-label=\"Book Service Men's Haircut\"]")
	public WebElement bookMensHaircutButton;
	
	/** Men's Haircut Price */
	@FindBy(xpath="(//span[@class='normal-price'])[3]")
	public WebElement mensHaircutPrice;
	
	/** Chosen Service Before The Selection */
	@FindBy(xpath="(//span[@class='variation-title-content'])[3]")
	public WebElement serviceBeforeSelection;
	
	/** Men's Haircut Select Time Button */
	@FindBy(xpath="//button[@class='my-button text-18 select-time-button themed-component themed-component--background' and @title='Select Time']")
	public WebElement mensHaircutSelectTimeButton;
	
	/** Next Available Date Button */
	@FindBy(xpath="	//button[contains(text(),'Go to the next available date')]")
	public WebElement nextAvailableDateButton;
	
	/** List of Available Time Select Buttons */
	@FindBy(xpath="//button[contains(text(),'select')]")
	public List <WebElement> listOfSelectAvailableTimeButtons;
	
	/** Appointment Details Price on the right Panel */
	@FindBy(xpath="//div[@class='col-right']/span")
	public WebElement servicePriceOnAptDetails;
	
	/** Appointment Details Previously Selected Employee on the right Panel */
	@FindBy(xpath="//div[@class='Select employee-selector text-3 has-value is-clearable Select--single']/div/span/div/span")
	public WebElement selectedEmployeeOnAptDetails;
	
	/** Appointment Details Previously Selected Service on the right Panel */
	@FindBy(xpath="//span[@class='variation-name break-word text-3']")
	public WebElement selectedServiceOnAptDetails;
	
	
	public ConsumerPageElements() {
		PageFactory.initElements(driver, this);
	}

}
