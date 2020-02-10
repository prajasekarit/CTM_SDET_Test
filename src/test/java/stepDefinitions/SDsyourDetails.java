package stepDefinitions;

import java.io.IOException;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import PageObjects.POs_end_to_end;
import PageObjects.POs_your_Supplier;
import PageObjects.POsyourDetails;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SDsyourDetails extends BaseClass{

	public WebDriver driver;
	
	//final static Logger logger=LoggerFactory.getLogger(SDsyourSupplier.class);
	
	
	 public void your_supp(String url, String postcode) throws Exception
	 {
		 String caltext="What is the date on your bill";
		 driver.get(url);
		 yrSupplier.validate_val_Input(postcode);
		 end_2_end.other_fields();
		 end_2_end.your_energy_validation();
		 end_2_end.sel_amount_field();
		 end_2_end.sel_economy_no();
		 end_2_end.val_curr_elec_usg();
		 end_2_end.val_gas();
		 end_2_end.sel_amount_field_gas();
		 end_2_end.sel_kwh_field_gas();
		 end_2_end.val_No_cal_text(caltext);
		 end_2_end.click_next();
		 end_2_end.val_your_details();
	 }
	    @Test
	 	@Given("^Navigated to Your Details page in (.+) and launch (.+) with valid (.+) address$")
	    public void navigated_to_your_details_page_in_and_launch_with_valid_address(String browser, String url, String postcode) throws Throwable {
	        
		    driver=initializeDriver(browser);
	        end_2_end= new POs_end_to_end(driver);
		    yrSupplier= new POs_your_Supplier(driver);
		    yrDetails=new POsyourDetails(driver);
	        your_supp(url,postcode);
	    	logger.info("*****************Validate Your Details page***************");
	    	end_2_end.val_your_details();	    	
	    
		 
	    }
	 	
	     @Test
	 	 @When("^I clicked on the Goto Prices button$")
	     public void i_clicked_on_the_goto_prices_button() throws Throwable {
	      
	 		logger.info("*****************Click On Go Prices Link***************");
	 		yrDetails.goto_PricesLink();
	 		
	     }
	     
	     @Test
	 	 @Then("^I will select the Fixed Tarif$")
	     public void i_will_select_the_fixed_tarif() throws Throwable {
	         
	 		logger.info("*****************Select the Fixed Tarif***************");
	 		yrDetails.sel_FIxedTarif();
	 		
	     }

	     @Test
	     @And("^select Monthly DirectDebit$")
	     public void select_monthly_directdebit() throws Throwable {
	    	 
	    	 logger.info("*****************Select the Monthly Direct Debit***************");
	    	 yrDetails.sel_MonthlyDD();
	    	  
	     }
	     
	     @Test
	     @Then("^Verify the message is populated in the bottem of the page is different$")
	     public void verify_the_message_is_populated_in_the_bottem_of_the_page_is_different() throws Throwable {
	         
	    	 logger.info("***************** Check The Different Error message ***************");
	    	 yrDetails.val_diff_error();
	    	 
	     }

	     @Test
	     @And("^Verify the Contact Details Text$")
	     public void verify_the_contact_details_text() throws Throwable {
	    	
	    	 logger.info("***************** Check The Contact Details Text ***************");
	    	 yrDetails.val_con_Detail();
	     }

	     @Test
	     @When("^I enter invalid email in email field and click on Go to Prices$")
	     public void i_enter_invalid_email_in_email_field_and_click_on_go_to_prices() throws Throwable {
	         
	    	 logger.info("***************** Check The Email Field ***************");
	    	 yrDetails.val_Email();
	     }

	     @Test
	     @Then("^verify Error is getting populated$")
	     public void verify_error_is_getting_populated() throws Throwable {
	         
	    	 logger.info("***************** Check The Email Field for Error***************");
	    	 yrDetails.val_Email_err();
	    	 
	     }
	     
	     @Test
	     @When("^I provide correct email and selected other check boxes and click on go to Prices$")
	     public void i_provide_correct_email_and_selected_other_check_boxes_and_click_on_go_to_prices() throws Throwable {
	        
	    	 logger.info("*****************Provide other Information***************");
	    	 yrDetails.val_Details();
	     }
	 
	     @Test
	     @Then("^Verify Your Results page is getting populated$")
	     public void verify_your_results_page_is_getting_populated() throws Throwable {
	         
	    	 logger.info("*****************Provide other Information***************");
	    	 yrDetails.val_your_Results();
	    	 
	     }

	     @Test
	     @Then("^Verify the (.+) message is populated in the bottem of the your Details page$")
	     public void verify_the_message_is_populated_in_the_bottem_of_the_your_details_page(String error) throws Throwable {
	         
	     	logger.info("*****************Validate Error message***************");
	     	end_2_end.validate_error(error);
	     }
	     
	     @Test
	     @Then("^Close Browser for Your Results$")
	     public void close_browser_for_your_results() throws Throwable {
	    	 yrDetails.closeBrowser();
	    	 
	     }
}
