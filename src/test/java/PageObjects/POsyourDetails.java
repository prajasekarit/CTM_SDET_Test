package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.testng.Assert;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import stepDefinitions.BaseClass;

public class POsyourDetails extends BaseClass {

	WebDriver ldriver;

	public POsyourDetails(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	@FindBy(xpath = "//button[@id='email-submit']")
	private WebElement XPATH_GOTO_PRC_LINK;

	@FindBy(xpath = "//span[@class='icon energy-gas-electricity fixed-rate-1']")
	private WebElement XPATH_FIX_TRF_LINK;

	@FindBy(xpath = "//body/div[@class='ng-scope']/div[@class='ng-scope']/main[@class='ng-scope']/section[@class='section content-right']/div[@class='section-content']/fieldset[@id='payment-type']/div[@id='payment-selection-question']/div[@class='answer']/div[@class='radio-buttons flex-column']/label[1]/span[1]")
	private WebElement XPATH_MONTH_DD_LINK;

	@FindBy(xpath = "//p[@class='ng-binding']")
	private WebElement XPATH_ERROR;

	@FindBy(xpath = "//h2[contains(text(),'Your contact details')]")
	private WebElement XPATH_CONTACT_DETAILS_TEXT;

	@FindBy(xpath = "//input[@id='Email']")
	private WebElement XPATH_EMAIL;

	@FindBy(xpath = "//span[@class='checkbox-text vertical']")
	private WebElement XPATH_CHECK_BOX;

	@FindBy(xpath = "//span[@class='checkbox-confirm']")
	private WebElement XPATH_CNFRM_CHECK_BOX;

	@FindBy(xpath = "//div[@class='error']")
	private WebElement XPATH_EMAIL_ERROR;

	@FindBy(xpath = "//h3[@class='tariffs-for-me-banner-heading']")
	private WebElement XPATH_SUMMARY;

	@FindBy(xpath = "//p[contains(text(),'Postcode:')]")
	private WebElement XPATH_POSTCODE;

	@Step
	public void goto_PricesLink() {

		Assert.assertTrue(XPATH_GOTO_PRC_LINK.getText().contains("Go to prices"));
		XPATH_GOTO_PRC_LINK.click();
	}

	@Step
	public void sel_MonthlyDD() {

		Assert.assertTrue(XPATH_MONTH_DD_LINK.isDisplayed());
		XPATH_MONTH_DD_LINK.click();

	}

	@Step
	public void sel_FIxedTarif() {

		Assert.assertTrue(XPATH_FIX_TRF_LINK.isDisplayed());
		XPATH_FIX_TRF_LINK.click();

	}

	@Step
	public void val_diff_error() {

		String diff_Error = XPATH_ERROR.getText();
		Assert.assertTrue(diff_Error.contains("Complete this section to continue 2 questions remaining"));
	}

	@Step
	public void val_con_Detail() {

		String con_Text = XPATH_CONTACT_DETAILS_TEXT.getText();
		Assert.assertTrue(con_Text.contains("Your contact details"));

	}

	@Step
	public void val_Email() {

		Assert.assertTrue(XPATH_EMAIL.isDisplayed());
		XPATH_EMAIL.sendKeys("sasasa");
		goto_PricesLink();

	}

	@Step
	public void val_Email_err() {

		String emailError = XPATH_EMAIL_ERROR.getText();
		Assert.assertTrue(emailError
				.contains("Your email doesn’t appear to be valid. please check you have entered it correctly."));
	}

	@Step
	public void val_Details() {

		XPATH_EMAIL.sendKeys("test@abc.com");
		Assert.assertTrue(XPATH_CHECK_BOX.isDisplayed());
		Assert.assertTrue(XPATH_CNFRM_CHECK_BOX.isDisplayed());
		XPATH_CHECK_BOX.click();
		XPATH_CNFRM_CHECK_BOX.click();
		goto_PricesLink();

	}

	@Step
	public void val_your_Results() {

		String crntUrl = ldriver.getCurrentUrl();
		Assert.assertTrue(crntUrl.contains("https://energy.comparethemarket.com/energy/v2"));

	}

	@Step
	public void closeBrowser() {

		ldriver.close();
	}

}
