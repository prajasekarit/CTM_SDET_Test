package stepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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
public class SDsyourSupplier extends BaseClass {

	public WebDriver driver;
	// final static Logger
	// logger=LoggerFactory.getLogger(SDsyourSupplier.class);

	@Test
	@Given("^Initialize the (.+) browser$")
	public void initialize_the_browser(String browser) throws Throwable {

		driver = initializeDriver(browser);
		logger.info("******** Launching browser*********");

	}

	@Test
	@Then("^Close Browsers$")
	public void close_browsers() throws Throwable {

		logger.info("******** Closing the browser*********");
		yrSupplier.closeBrowser();

	}

	@Test
	@And("^Navigate to (.+) Site$")
	public void navigate_to_site(String url) throws Throwable {

		logger.info("******** Launching the Website*********");
		driver.get(url);

	}

	@Test
	@When("^Energy Quote page is launched$")
	public void energy_quote_page_is_launched() throws Throwable {

		logger.info("******** Energy Quote Page is launched*********");
		yrSupplier = new POs_your_Supplier(driver);

	}

	@Test
	@Then("^Verify the Header and Page Title$")
	public void verify_the_header_and_page_title() throws Throwable {

		logger.info("******** Validate the Title *********");
		yrSupplier.validate_URL();

		logger.info("******** Validate the Title and Header *********");
		yrSupplier.validate_Title();
		yrSupplier.validate_Header();

	}

	@Test
	@And("^Verify the sub header is displayed$")
	public void verify_the_sub_header_is_displayed() throws Throwable {

		logger.info("******** Validate the Sub_Header *********");
		yrSupplier.validate_Sub_Header();

	}

	@Test
	@Then("^Verify the been here before text$")
	public void verify_the_been_here_before_text() throws Throwable {

		logger.info("******** Validate the Sub Text *********");
		yrSupplier.validate_Sub_text();
	}

	@Test
	@And("^Verify the previous energy quotes string is navigating to Sign in page$")
	public void verify_the_previous_energy_quotes_string_is_navigating_to_sign_in_page() throws Throwable {

		logger.info("******** Validate the Previous Energy Quotes *********");
		yrSupplier.validate_prv_en_quotes();
	}

	@Test
	@And("^Verify the How to get Started is clikable and expanding the display portion with details$")
	public void verify_the_how_to_get_started_is_clikable_and_expanding_the_display_portion_with_details()
			throws Throwable {

		logger.info("******** Validate the Sub_Header *********");
		yrSupplier.validate_howtostart_expandable();
	}

	@Test
	@When("^User clicks on the Find postcode button without any text$")
	public void user_clicks_on_the_find_postcode_button_without_any_text() throws Throwable {

		logger.info("******** Validate Post code without Any input *********");
		yrSupplier.validate_without_Input();

	}

	@Test
	@When("^User clicks on the Find postcode button with (.+) which is Invalid$")
	public void user_clicks_on_the_find_postcode_button_with_which_is_invalid(String invpostcode) throws Throwable {

		logger.info("******** Send the Invalid Post code *********");
		yrSupplier.validate_Inv_Input(invpostcode);

	}

	@Test
	@When("^User clicks on the Find postcode button with (.+) which is valid$")
	public void user_clicks_on_the_find_postcode_button_with_which_is_valid(String crctpostcode) throws Throwable {

		logger.info("******** Send the Invalid Post code *********");
		yrSupplier.validate_val_Input(crctpostcode);
	}

	@Test
	@Then("^Verify the Your current supplier text$")
	public void verify_the_your_current_supplier_text() {

		logger.info("******** Validate Current Supplier Text *********");
		yrSupplier.validate_crnt_Sup_text();

	}

	@Test
	@Then("^Verify that Error message is not getting displayed$")
	public void verify_that_error_message_is_not_getting_displayed() {

		logger.info("******** Validate Error message is not displayed in Post code Area *********");
		yrSupplier.validate_err_not_displayed();

	}

	@Test
	@Then("^Verify the Error message populated$")
	public void verify_the_error_message_populated() throws Throwable {

		logger.info("******** Validate Error message is displayed in Post code Area *********");
		yrSupplier.validate_err_msg_displayed();

	}

	@Test
	@Then("^Verify that button is changed to the (.+)$")
	public void verify_that_button_is_changed_to_the(String button) throws Throwable {

		logger.info(
				"******** Validate Error message is  not displayed in Post code Area and Button text is changed *********");
		yrSupplier.validate_post_button_displayed();

	}

	@Test
	@And("^Verify the (.+) message is populated in the bottem of the your Supplier page$")
	public void verify_the_message_is_populated_in_the_bottem_of_the_your_supplier_page(String error) throws Throwable {

		logger.info("******** Verify the Error message at Bottom of Page *********");
		yrSupplier.validate_error(error);

	}

	@Test
	@And("^I clicked on the Next buton$")
	public void i_clicked_on_the_next_buton() throws Throwable {

		logger.info("******** Click on Next Button*********");
		yrSupplier.clickNext();

	}

	@Test
	@Then("^Enter the (.+) Post code$")
	public void enter_the_post_code(String valid) throws Throwable {
		end_2_end = new POs_end_to_end(driver);
		logger.info("********Valid Post code passed to the Post code field*********");
		end_2_end.valid_post_code(valid);
	}

	@Test
	@And("^Select the Mandatory fields in the Your Supplier Page and click Next$")
	public void select_the_mandatory_fields_in_the_your_supplier_page_and_click_next() throws Exception {

		logger.info("********Select other values form Your Supplier Page*********");
		end_2_end.other_fields();

	}

	@Test
	@Then("^Verify the Page is navigate to the Your Energy details$")
	public void verify_the_page_is_navigate_to_the_your_energy_details() throws InterruptedException {

		logger.info("*****************Click on the Next page Link***************");
		end_2_end.your_energy_validation();
	}

}
