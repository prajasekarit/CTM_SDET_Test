package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import Utilities.TestUtil;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import stepDefinitions.BaseClass;

@SuppressWarnings("unused")

public class POs_your_Supplier extends BaseClass {

	WebDriver ldriver;

	// final static Logger logger =
	// LoggerFactory.getLogger(POs_your_Supplier.class);

	public POs_your_Supplier(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	@FindBy(xpath = "//h1[@class='main-header-title']")
	private WebElement ENERGY_QUOTE_TEXT;

	@FindBy(xpath = "//span[@class='journey-navigation-item ng-binding ng-scope current']")
	private WebElement YOUR_SUPPLIER_TEXT;

	@FindBy(xpath = "//span[contains(text(),'Your energy')]")
	private WebElement YOUR_ENERGY_TEXT;

	@FindBy(xpath = "//span[contains(text(),'Your details')]")
	private WebElement YOUR_DETAILS_TEXT;

	@FindBy(xpath = "//span[contains(text(),'Your results')]")
	private WebElement YOUR_RESULT_TEXT;

	@FindBy(xpath = "//span[contains(text(),'Switch now')]")
	private WebElement SWITCH_NOW_TEXT;

	@FindBy(xpath = "//h2[contains(text(),'Been here before?')]")
	private WebElement BEEN_HERE_BEFORE_TEXT;

	@FindBy(xpath = "//p[@class='section-content-intro flex-cell']")
	private WebElement SAVE_YOURSELF_TEXT;

	@FindBy(xpath = "//a[@id='sign-in-prompt-link']")
	private WebElement PREV_QUOTES_LINK;

	@FindBy(xpath = "//h2[@class='main-heading sign-in']")
	private WebElement SIGN_IN_PAGE;

	@FindBy(xpath = "//div[@id='journey-introduction-panel']")
	private WebElement HOW_TO_GET_STARTED_EXPAND;

	@FindBy(xpath = "//h3[contains(text(),'Tell us a few details, it only takes a few minutes')]")
	private WebElement HOW_TO_GET_STARTED_TEXT;

	@FindBy(xpath = "//h2[contains(text(),'Your current supplier')]")
	private WebElement CURRENT_SUPPLIER_TEXT;

	@FindBy(xpath = "//button[@id='journey-introduction-button']")
	private WebElement BEEN_HERE_BUTTON;

	@FindBy(xpath = "//h3[contains(text(),'Tell us a few details, it only takes a few minutes')]")
	private WebElement BEEN_HERE_BUTTON_EXP1;

	@FindBy(xpath = "//h3[contains(text(),'See how much you could save')]")
	private WebElement BEEN_HERE_BUTTON_EXP2;

	@FindBy(xpath = "//p[contains(text(),'By providing your postcode we can check what tarif')]")
	private WebElement POST_CODE_HELP_TEXT_FIRST;

	@FindBy(xpath = "//button[contains(text(),'Can I still switch energy suppliers if I rent?')]")
	private WebElement POST_CODE_HELP_TEXT_ICON;

	@FindBy(xpath = "//p[@id='postcode-help']")
	private WebElement POST_CODE_HELP_TEXT;

	@FindBy(xpath = "//input[@id='your-postcode']")
	private WebElement POST_CODE_TEXT_BOX;

	@FindBy(xpath = "//button[@id='find-postcode']")
	private WebElement FIND_POST_CODE;

	@FindBy(xpath = "//div[@class='error ng-binding']")
	private WebElement POST_CODE_ERROR;

	@FindBy(xpath = "//button[@id='change-postcode']")
	private WebElement CHANGE_POSTCODE;

	@FindBy(xpath = "//div[@class='answer question-postcode']//span[@class='tick-area']")
	private WebElement POST_CODE_TICK_AREA;

	@FindBy(xpath = "//p[contains(text(),'Do you have your energy bill to hand?')]")
	private WebElement ENERGY_BILL_TEXT;

	@FindBy(xpath = "//span[contains(text(),'Yes, I have my bill')]")
	private WebElement HAVING_BILL_BUTTON;

	@FindBy(xpath = "//span[contains(text(),'t have my bill')]")
	private WebElement DONT_HAVING_BILL_BUTTON;

	@FindBy(xpath = "//div[@class='answer radio-buttons label-width-large']//span[@class='tick-area']")
	private WebElement ENERGY_BILL_TO_HAND_TICK_AREA;

	@FindBy(xpath = "//label[@class='question']")
	private WebElement POSTCODE_TEXT;

	@FindBy(xpath = "//span[contains(text(),'What would you like to compare?')]")
	private WebElement COMPARE_TEXT;

	@FindBy(xpath = "//span[contains(text(),'Gas & electricity')]")
	private WebElement GAS_and_ELECTRICITY_TEXT;

	@FindBy(xpath = "//label[@id='compare-both-label']//span[@class='radio-button-text']")
	private WebElement GAS_AND_ELECTRICITY_LINK;

	@FindBy(xpath = "//span[contains(text(),'Electricity')]")
	private WebElement ELECTRICITY_TEXT;

	@FindBy(xpath = "//label[@id='compare-electricity-label']//span[@class='radio-button-text']")
	private WebElement ELECTRICITY_LINK;

	@FindBy(xpath = "//label[@id='compare-gas-label']//span[@class='radio-button-text-outside'][contains(text(),'Gas')]")
	private WebElement GAS_TEXT;

	@FindBy(xpath = "//label[@id='compare-gas-label']//span[@class='radio-button-text']")
	private WebElement GAS_LINK;

	@FindBy(xpath = "//button[@id='goto-your-supplier-details']")
	private WebElement NEXT_PAGE_LINK;

	@FindBy(xpath = "//footer[@class='footer-section']")
	private WebElement FOOTER_TEXT;

	@FindBy(css = "#goto-your-supplier-details")
	private WebElement YR_SUP_NEXT_BUTTON;

	@FindBy(css = "#get-started-view-status")
	private WebElement YOUR_SUP_ERROR_MSG;

	@FindBy(xpath = "//input[@id='your-postcode']")
	private WebElement POST_CODE_TEXT_BOXA;

	@FindBy(xpath = "//button[@id='find-postcode']")
	private WebElement FIND_POST_CODEA;

	@FindBy(xpath = "//span[contains(text(),'Yes, I have my bill')]")
	private WebElement YES_I_HAV_BILL_BUTTON;

	@FindBy(xpath = "//span[contains(text(),'t have my bill')]")
	private WebElement DONT_HV_BILL_BUTTON;

	@FindBy(xpath = "//label[@id='compare-both-label']//span[@class='radio-button-text']")
	private WebElement GAS_AND_ELEC_BUTTON;

	@FindBy(xpath = "//p[contains(text(),'Is your gas and electricity from the same supplier')]")
	private WebElement SAM_SUPP_CNFRM;

	@FindBy(xpath = "//div[@class='answer radio-buttons radio-buttons-small']//span[@class='radio-button-text'][contains(text(),'Yes')]")
	private WebElement YES_BUTTON;

	@FindBy(xpath = "//select[@id='sel']")
	private WebElement SELECT_SUPPLIER;

	@FindBy(xpath = "//button[@id='goto-your-supplier-details']")
	private WebElement NEXT_YOUR_SUPP;

	public void closeBrowser() {

		logger.info("******** Closing the browser*********");
		ldriver.close();

	}

	@Step
	public void validate_URL() {

		String currentURL = ldriver.getCurrentUrl();

		logger.info("Current Url is: " + currentURL);

		Assert.assertEquals(currentURL, "https://energy.comparethemarket.com/energy/v2/");

	}

	@Step
	public void validate_Title() {

		String currentTitle = ldriver.getTitle();

		logger.info("Current Title is: " + currentTitle);

		Assert.assertEquals(currentTitle, "Energy - Compare Gas and Electricity Suppliers | Compare The Market");

	}

	@Step
	public void validate_Header() {

		TestUtil.waitTillElementDisplayWebElement(ldriver, ENERGY_QUOTE_TEXT);
		String currentHeader = ENERGY_QUOTE_TEXT.getText();
		logger.info("Current Header is: " + currentHeader);
		Assert.assertTrue(currentHeader.contains("Energy "));

	}

	@Step
	public void validate_Sub_Header() {

		String sub_header_SUPPLIER = YOUR_SUPPLIER_TEXT.getText();
		logger.info("Sub_Header Displayed for your_supplier: " + sub_header_SUPPLIER);

		Assert.assertTrue(sub_header_SUPPLIER.contains("Your supplier"));

		String sub_header_ENERGY = YOUR_ENERGY_TEXT.getText();
		logger.info("Sub_Header Displayed for your_energy: " + sub_header_ENERGY);

		Assert.assertTrue(sub_header_ENERGY.contains("Your energy"));

		String sub_header_DETAILS = YOUR_DETAILS_TEXT.getText();
		logger.info("Sub_Header Displayed for your_details: " + sub_header_DETAILS);

		Assert.assertTrue(sub_header_DETAILS.contains("Your details"));

		String sub_header_RESULT = YOUR_RESULT_TEXT.getText();
		logger.info("Sub_Header Displayed for your_result: " + sub_header_RESULT);

		Assert.assertTrue(sub_header_RESULT.contains("Your results"));

		String sub_header_SWITCH = SWITCH_NOW_TEXT.getText();
		logger.info("Sub_Header Displayed for switch now: " + sub_header_SWITCH);

		Assert.assertTrue(sub_header_SWITCH.contains("Switch now"));

	}

	@Step
	public void validate_Sub_text() {

		String been_here_text = BEEN_HERE_BEFORE_TEXT.getText();
		String been_here_text1 = SAVE_YOURSELF_TEXT.getText();
		logger.info(" Static Text Displayed: " + been_here_text);
		logger.info(" Static Text Displayed_1: " + been_here_text1);

		Assert.assertTrue(been_here_text.contains("Been here before?"));

		Assert.assertEquals(been_here_text1, "Save yourself some time by reviewing or editing a previous quote.");

	}

	@Step
	public void validate_prv_en_quotes() {

		String Link_text = PREV_QUOTES_LINK.getText();
		logger.info("Link Text is: " + Link_text);

		Assert.assertTrue(Link_text.contains("Previous energy quotes"));
		Assert.assertTrue(PREV_QUOTES_LINK.isEnabled());

		PREV_QUOTES_LINK.click();
		logger.info("Navigating to Sign in Bage:" + ldriver.getCurrentUrl());
		logger.info("New Page Title is: " + ldriver.getTitle());
		String newPage_title = ldriver.getTitle();
		Assert.assertEquals(newPage_title, "Sign in");
		ldriver.navigate().back();

	}

	@Step
	public void validate_howtostart_expandable() {

		TestUtil.waitTillElementDisplayWebElement(ldriver, BEEN_HERE_BUTTON);
		String been_here_btn_text = BEEN_HERE_BUTTON.getText();
		logger.info("Been_here_btn_text Displayed is: " + been_here_btn_text);

		Assert.assertTrue(BEEN_HERE_BUTTON.isDisplayed());
		Assert.assertTrue(been_here_btn_text.contains("How to get started?"));

		BEEN_HERE_BUTTON.click();
		logger.info("Been_here_is Clicked");
		Assert.assertTrue(BEEN_HERE_BUTTON_EXP1.isDisplayed());
		Assert.assertTrue(BEEN_HERE_BUTTON_EXP2.isDisplayed());

		BEEN_HERE_BUTTON.click();

	}

	@Step
	public void validate_crnt_Sup_text() {

		String crnt_sup_text = CURRENT_SUPPLIER_TEXT.getText();
		logger.info("Current Supplier Text is: " + crnt_sup_text);

		Assert.assertTrue(crnt_sup_text.contains("Your current supplier"));

		String pst_code_text = POSTCODE_TEXT.getText();
		logger.info("Post Code Text is: " + pst_code_text);

		Assert.assertTrue(pst_code_text.contains("What is your postcode?"));

	}

	@Step
	public void validate_without_Input() {

		logger.info("Check the Find PostCode Button");
		Assert.assertTrue(FIND_POST_CODE.isDisplayed());
	}

	@Step
	public void validate_err_not_displayed() {

		FIND_POST_CODE.click();
		Assert.assertFalse(POST_CODE_ERROR.isDisplayed());
		logger.info("Error message is not getting displayed");

	}

	@Step
	public void validate_Inv_Input(String invpostcode) {

		POST_CODE_TEXT_BOX.sendKeys(invpostcode);
		FIND_POST_CODE.click();

	}

	@Step
	public void validate_err_msg_displayed() {

		Assert.assertTrue(POST_CODE_ERROR.isDisplayed());
		String err_msg_text = POST_CODE_ERROR.getText();
		Assert.assertTrue(err_msg_text.contains(
				"Your postcode has not been recognised, please check you have entered it correctly and if you still need help call the switching support team on"));
		logger.info("Error message is getting displayed");

	}

	@Step
	public void validate_val_Input(String crctpostcode) {
		POST_CODE_TEXT_BOX.clear();
		POST_CODE_TEXT_BOX.sendKeys(crctpostcode);
		FIND_POST_CODE.click();

	}

	@Step
	public void validate_post_button_displayed() {

		TestUtil.waitTillElementDisplayWebElement(ldriver, CHANGE_POSTCODE);
		Assert.assertTrue(CHANGE_POSTCODE.isDisplayed());
		String pst_text = CHANGE_POSTCODE.getText();

		Assert.assertTrue(pst_text.contains("Change postcode"));
		Assert.assertFalse(FIND_POST_CODE.isDisplayed());
		logger.info("Button is changed to Change Postcode");

	}

	@Step
	public void validate_error(String error) {

		System.out.println(error);
		String err_msg = YOUR_SUP_ERROR_MSG.getText();
		logger.info("Error Message Displayed is" + err_msg);
		System.out.println("Error Message Displayed is" + err_msg);
		Assert.assertTrue(err_msg.contains(error));

	}

	@Step
	public void clickNext() {

		YR_SUP_NEXT_BUTTON.click();
		String button_text = YR_SUP_NEXT_BUTTON.getText();
		Assert.assertTrue(button_text.contains("Next"));

	}

}
