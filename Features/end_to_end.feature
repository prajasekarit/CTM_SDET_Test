Feature: ENERGY QUOTE page Navigation Smoke Test

@Smoke
Scenario Outline: Validate The page navigation for Your supplier page

Given Initialize the <browser> browser
And Navigate to <url> Site
When Energy Quote page is launched
Then Enter the <valid> Post code
And Select the Mandatory fields in the Your Supplier Page and click Next
Then Verify the Page is navigate to the Your Energy details
Then Close Browsers


Examples:
|browser	|url	|valid	|
|chrome	|https://energy.comparethemarket.com/energy/v2/?AFFCLIE=TSTT	|PE2 6YS	|

@Smoke
Scenario Outline: Validate The page navigation for Your Energy page

Given Navigated to Your Energy page in <browser> and launch <url> with valid <postcode> address
When I clicked on the Next button
Then Verify the <error> message is populated in the bottem of the page
When Amount field is selected
Then Verify that bill text should displayed
When Economy Meter selected as Yes and kWH is selected
Then Verify Day time and Night time electricity usage menu should get displayed
When Economy Meter selected as "No" and kWH is selected
Then Verify only one reading box should get displayed
And verify the your Gas details
When I click Next immediately
Then Verify the <error> message is populated in the bottem of the page
When Amount field is selected in your gas page
Then Verify caltext should get displayed 
When KWH field is selected in your gas page
Then Verify caltext should not get displayed
When I click Next immediately
Then verify the Your details page is loaded 
Then Close Browser for Your Energy

Examples:
|browser	|url	|postcode	|error	|
|chrome	|https://energy.comparethemarket.com/energy/v2/?AFFCLIE=TSTT	|PE2 6YS	|Complete this section to continue 1 question remaining	|


@Smoke
Scenario Outline: Validate The page navigation for Your Details page

Given Navigated to Your Details page in <browser> and launch <url> with valid <postcode> address
When I clicked on the Goto Prices button
Then Verify the <error> message is populated in the bottem of the your Details page
Then I will select the Fixed Tarif
And select Monthly DirectDebit
When I clicked on the Goto Prices button
Then Verify the message is populated in the bottem of the page is different
And Verify the Contact Details Text
When I enter invalid email in email field and click on Go to Prices
Then verify Error is getting populated
When I provide correct email and selected other check boxes and click on go to Prices
Then Verify Your Results page is getting populated
Then Close Browser for Your Results

Examples:
|browser	|url	|postcode	|error	|
|chrome	|https://energy.comparethemarket.com/energy/v2/?AFFCLIE=TSTT	|PE2 6YS	|Complete this section to continue 4 questions remaining	|
|chrome-headless	|https://energy.comparethemarket.com/energy/v2/?AFFCLIE=TSTT	|PE2 6YS	|Complete this section to continue 4 questions remaining	|
