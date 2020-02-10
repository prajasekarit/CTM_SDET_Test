package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import PageObjects.POs_end_to_end;
import PageObjects.POs_your_Supplier;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@SuppressWarnings("unused")
public class SDsyourEnergy extends BaseClass {

	public WebDriver driver;
	// final static Logger
	// logger=LoggerFactory.getLogger(SDsyourSupplier.class);

	public void your_supp(String url, String postcode) throws Exception {
		driver.get(url);
		yrSupplier.validate_val_Input(postcode);
		end_2_end.other_fields();
		end_2_end.your_energy_validation();
	}

	@Test
	@Given("^Navigated to Your Energy page in (.+) and launch (.+) with valid (.+) address$")
	public void navigated_to_your_energy_page_in_and_launch_with_valid_address(String browser, String url,
			String postcode) throws Throwable {

		driver = initializeDriver(browser);
		end_2_end = new POs_end_to_end(driver);
		yrSupplier = new POs_your_Supplier(driver);
		your_supp(url, postcode);
		logger.info("*****************Validate Your Energy page***************");
		end_2_end.val_energy();

	}

	@Test
	@When("^I clicked on the Next button$")
	public void i_clicked_on_the_next_button() {

		logger.info("*****************Click on Next Button***************");
		end_2_end.click_next();
	}

	@Test
	@Then("^Verify the (.+) message is populated in the bottem of the page$")
	public void verify_the_message_is_populated_in_the_bottem_of_the_page(String error) throws Throwable {

		logger.info("*****************Validate Error message***************");
		end_2_end.validate_error(error);
	}

	@Test
	@When("^Amount field is selected$")
	public void amount_field_is_selected() throws Throwable {

		logger.info("*****************Select the Amount Field in Current Electricity Usage***************");
		end_2_end.sel_amount_field();

	}

	@Test
	@Then("^Verify that bill text should displayed$")
	public void verify_that_bill_text_should_displayed() throws Throwable {

		String strArg1 = "What is the date on your bill";
		logger.info("*****************Validate The Bill date fields get populated in Screen***************");
		end_2_end.val_date_on_bill(strArg1);

	}

	@Test
	@When("^Economy Meter selected as \"([^\"]*)\" and kWH is selected$")
	public void economy_meter_selected_as_something_and_kwh_is_selected(String strArg1) throws Throwable {

		logger.info("*****************Select the KWH in Current Electricity Usage***************");
		end_2_end.sel_economy_no();
	}

	@Test
	@Then("^Verify only one reading box should get displayed$")
	public void verify_only_one_reading_box_should_get_displayed() throws Throwable {

		logger.info("*****************Validate fields get populated in Screen***************");
		end_2_end.val_curr_elec_usg();

	}

	@Test
	@When("^Economy Meter selected as Yes and kWH is selected$")
	public void economy_meter_selected_as_yes_and_kwh_is_selected() throws Throwable {

		logger.info("*****************Select the KWH in Current Electricity Usage***************");
		end_2_end.sel_economy_yes();

	}

	@Test
	@Then("^Verify Day time and Night time electricity usage menu should get displayed$")
	public void verify_day_time_and_night_time_electricity_usage_menu_should_get_displayed() {

		logger.info("*****************Validate Current Electricity Usage fields displayed ***************");
		end_2_end.val_curr_elec_usg_yes();
	}

	@Test
	@And("^verify the your Gas details$")
	public void verify_the_your_gas_details() throws Throwable {

		logger.info("*****************Validate Your Gas page ***************");
		end_2_end.val_gas();
	}

	@Test
	@When("^I click Next immediately$")
	public void i_click_next_immediately() throws Throwable {

		logger.info("*****************Click on Next Button ***************");
		end_2_end.click_next();

	}

	@Test
	@When("^Amount field is selected in your gas page$")
	public void amount_field_is_selected_in_your_gas_page() throws Throwable {

		logger.info("*****************Select the Amount Field in Current Gas Usage***************");
		end_2_end.sel_amount_field_gas();
	}

	@Test
	@Then("^Verify caltext should get displayed$")
	public void verify_caltext_should_get_displayed() throws Throwable {

		String caltext = "What is the date on your bill";
		logger.info("*****Verify the Calendar is getting Displayed when Amount is Selected*********");
		end_2_end.val_cal_text(caltext);
	}

	@Test
	@When("^KWH field is selected in your gas page$")
	public void kwh_field_is_selected_in_your_gas_page() throws Throwable {

		logger.info("*****************Select the KWh Field in Current Gas Usage***************");
		end_2_end.sel_kwh_field_gas();

	}

	@Test
	@Then("^Verify caltext should not get displayed$")
	public void verify_caltext_should_not_get_displayed() throws Throwable {

		String caltext = "What is the date on your bill";
		logger.info("*****Verify the Calendar is not getting Displayed when Kwh is Selected*********");
		end_2_end.val_No_cal_text(caltext);

	}

	@Test
	@Then("^verify the Your details page is loaded$")
	public void verify_the_your_details_page_is_loaded() throws Throwable {

		logger.info("*****Validate Your Details Page*********");
		end_2_end.val_your_details();
	}

	@Test
	@Then("^Close Browser for Your Energy$")
	public void close_browser_for_your_energy() throws Throwable {

		logger.info("*****Close the Browser*********");
		end_2_end.closeBrowser();
	}

}
