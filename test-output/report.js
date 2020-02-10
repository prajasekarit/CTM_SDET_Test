$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/end_to_end.feature");
formatter.feature({
  "name": "ENERGY QUOTE page Navigation Smoke Test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validate The page navigation for Your supplier page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "Initialize the \u003cbrowser\u003e browser",
  "keyword": "Given "
});
formatter.step({
  "name": "Navigate to \u003curl\u003e Site",
  "keyword": "And "
});
formatter.step({
  "name": "Energy Quote page is launched",
  "keyword": "When "
});
formatter.step({
  "name": "Enter the \u003cvalid\u003e Post code",
  "keyword": "Then "
});
formatter.step({
  "name": "Select the Mandatory fields in the Your Supplier Page and click Next",
  "keyword": "And "
});
formatter.step({
  "name": "Verify the Page is navigate to the Your Energy details",
  "keyword": "Then "
});
formatter.step({
  "name": "Close Browsers",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "browser",
        "url",
        "valid"
      ]
    },
    {
      "cells": [
        "chrome",
        "https://energy.comparethemarket.com/energy/v2/?AFFCLIE\u003dTSTT",
        "PE2 6YS"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate The page navigation for Your supplier page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Initialize the chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "SDsyourSupplier.initialize_the_browser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to https://energy.comparethemarket.com/energy/v2/?AFFCLIE\u003dTSTT Site",
  "keyword": "And "
});
formatter.match({
  "location": "SDsyourSupplier.navigate_to_site(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Energy Quote page is launched",
  "keyword": "When "
});
formatter.match({
  "location": "SDsyourSupplier.energy_quote_page_is_launched()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the PE2 6YS Post code",
  "keyword": "Then "
});
formatter.match({
  "location": "SDsyourSupplier.enter_the_post_code(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select the Mandatory fields in the Your Supplier Page and click Next",
  "keyword": "And "
});
formatter.match({
  "location": "SDsyourSupplier.select_the_mandatory_fields_in_the_your_supplier_page_and_click_next()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the Page is navigate to the Your Energy details",
  "keyword": "Then "
});
formatter.match({
  "location": "SDsyourSupplier.verify_the_page_is_navigate_to_the_your_energy_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close Browsers",
  "keyword": "Then "
});
formatter.match({
  "location": "SDsyourSupplier.close_browsers()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Validate The page navigation for Your Energy page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "Navigated to Your Energy page in \u003cbrowser\u003e and launch \u003curl\u003e with valid \u003cpostcode\u003e address",
  "keyword": "Given "
});
formatter.step({
  "name": "I clicked on the Next button",
  "keyword": "When "
});
formatter.step({
  "name": "Verify the \u003cerror\u003e message is populated in the bottem of the page",
  "keyword": "Then "
});
formatter.step({
  "name": "Amount field is selected",
  "keyword": "When "
});
formatter.step({
  "name": "Verify that bill text should displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "Economy Meter selected as Yes and kWH is selected",
  "keyword": "When "
});
formatter.step({
  "name": "Verify Day time and Night time electricity usage menu should get displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "Economy Meter selected as \"No\" and kWH is selected",
  "keyword": "When "
});
formatter.step({
  "name": "Verify only one reading box should get displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "verify the your Gas details",
  "keyword": "And "
});
formatter.step({
  "name": "I click Next immediately",
  "keyword": "When "
});
formatter.step({
  "name": "Verify the \u003cerror\u003e message is populated in the bottem of the page",
  "keyword": "Then "
});
formatter.step({
  "name": "Amount field is selected in your gas page",
  "keyword": "When "
});
formatter.step({
  "name": "Verify caltext should get displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "KWH field is selected in your gas page",
  "keyword": "When "
});
formatter.step({
  "name": "Verify caltext should not get displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "I click Next immediately",
  "keyword": "When "
});
formatter.step({
  "name": "verify the Your details page is loaded",
  "keyword": "Then "
});
formatter.step({
  "name": "Close Browser for Your Energy",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "browser",
        "url",
        "postcode",
        "error"
      ]
    },
    {
      "cells": [
        "chrome",
        "https://energy.comparethemarket.com/energy/v2/?AFFCLIE\u003dTSTT",
        "PE2 6YS",
        "Complete this section to continue 1 question remaining"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate The page navigation for Your Energy page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Navigated to Your Energy page in chrome and launch https://energy.comparethemarket.com/energy/v2/?AFFCLIE\u003dTSTT with valid PE2 6YS address",
  "keyword": "Given "
});
formatter.match({
  "location": "SDsyourEnergy.navigated_to_your_energy_page_in_and_launch_with_valid_address(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I clicked on the Next button",
  "keyword": "When "
});
formatter.match({
  "location": "SDsyourEnergy.i_clicked_on_the_next_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the Complete this section to continue 1 question remaining message is populated in the bottem of the page",
  "keyword": "Then "
});
formatter.match({
  "location": "SDsyourEnergy.verify_the_message_is_populated_in_the_bottem_of_the_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Amount field is selected",
  "keyword": "When "
});
formatter.match({
  "location": "SDsyourEnergy.amount_field_is_selected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that bill text should displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "SDsyourEnergy.verify_that_bill_text_should_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Economy Meter selected as Yes and kWH is selected",
  "keyword": "When "
});
formatter.match({
  "location": "SDsyourEnergy.economy_meter_selected_as_yes_and_kwh_is_selected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Day time and Night time electricity usage menu should get displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "SDsyourEnergy.verify_day_time_and_night_time_electricity_usage_menu_should_get_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Economy Meter selected as \"No\" and kWH is selected",
  "keyword": "When "
});
formatter.match({
  "location": "SDsyourEnergy.economy_meter_selected_as_something_and_kwh_is_selected(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify only one reading box should get displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "SDsyourEnergy.verify_only_one_reading_box_should_get_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the your Gas details",
  "keyword": "And "
});
formatter.match({
  "location": "SDsyourEnergy.verify_the_your_gas_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Next immediately",
  "keyword": "When "
});
formatter.match({
  "location": "SDsyourEnergy.i_click_next_immediately()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the Complete this section to continue 1 question remaining message is populated in the bottem of the page",
  "keyword": "Then "
});
formatter.match({
  "location": "SDsyourEnergy.verify_the_message_is_populated_in_the_bottem_of_the_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Amount field is selected in your gas page",
  "keyword": "When "
});
formatter.match({
  "location": "SDsyourEnergy.amount_field_is_selected_in_your_gas_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify caltext should get displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "SDsyourEnergy.verify_caltext_should_get_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "KWH field is selected in your gas page",
  "keyword": "When "
});
formatter.match({
  "location": "SDsyourEnergy.kwh_field_is_selected_in_your_gas_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify caltext should not get displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "SDsyourEnergy.verify_caltext_should_not_get_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Next immediately",
  "keyword": "When "
});
formatter.match({
  "location": "SDsyourEnergy.i_click_next_immediately()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the Your details page is loaded",
  "keyword": "Then "
});
formatter.match({
  "location": "SDsyourEnergy.verify_the_your_details_page_is_loaded()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close Browser for Your Energy",
  "keyword": "Then "
});
formatter.match({
  "location": "SDsyourEnergy.close_browser_for_your_energy()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Validate The page navigation for Your Details page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "Navigated to Your Details page in \u003cbrowser\u003e and launch \u003curl\u003e with valid \u003cpostcode\u003e address",
  "keyword": "Given "
});
formatter.step({
  "name": "I clicked on the Goto Prices button",
  "keyword": "When "
});
formatter.step({
  "name": "Verify the \u003cerror\u003e message is populated in the bottem of the your Details page",
  "keyword": "Then "
});
formatter.step({
  "name": "I will select the Fixed Tarif",
  "keyword": "Then "
});
formatter.step({
  "name": "select Monthly DirectDebit",
  "keyword": "And "
});
formatter.step({
  "name": "I clicked on the Goto Prices button",
  "keyword": "When "
});
formatter.step({
  "name": "Verify the message is populated in the bottem of the page is different",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify the Contact Details Text",
  "keyword": "And "
});
formatter.step({
  "name": "I enter invalid email in email field and click on Go to Prices",
  "keyword": "When "
});
formatter.step({
  "name": "verify Error is getting populated",
  "keyword": "Then "
});
formatter.step({
  "name": "I provide correct email and selected other check boxes and click on go to Prices",
  "keyword": "When "
});
formatter.step({
  "name": "Verify Your Results page is getting populated",
  "keyword": "Then "
});
formatter.step({
  "name": "Close Browser for Your Results",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "browser",
        "url",
        "postcode",
        "error"
      ]
    },
    {
      "cells": [
        "chrome",
        "https://energy.comparethemarket.com/energy/v2/?AFFCLIE\u003dTSTT",
        "PE2 6YS",
        "Complete this section to continue 4 questions remaining"
      ]
    },
    {
      "cells": [
        "chrome-headless",
        "https://energy.comparethemarket.com/energy/v2/?AFFCLIE\u003dTSTT",
        "PE2 6YS",
        "Complete this section to continue 4 questions remaining"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate The page navigation for Your Details page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Navigated to Your Details page in chrome and launch https://energy.comparethemarket.com/energy/v2/?AFFCLIE\u003dTSTT with valid PE2 6YS address",
  "keyword": "Given "
});
formatter.match({
  "location": "SDsyourDetails.navigated_to_your_details_page_in_and_launch_with_valid_address(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I clicked on the Goto Prices button",
  "keyword": "When "
});
formatter.match({
  "location": "SDsyourDetails.i_clicked_on_the_goto_prices_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the Complete this section to continue 4 questions remaining message is populated in the bottem of the your Details page",
  "keyword": "Then "
});
formatter.match({
  "location": "SDsyourDetails.verify_the_message_is_populated_in_the_bottem_of_the_your_details_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I will select the Fixed Tarif",
  "keyword": "Then "
});
formatter.match({
  "location": "SDsyourDetails.i_will_select_the_fixed_tarif()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select Monthly DirectDebit",
  "keyword": "And "
});
formatter.match({
  "location": "SDsyourDetails.select_monthly_directdebit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I clicked on the Goto Prices button",
  "keyword": "When "
});
formatter.match({
  "location": "SDsyourDetails.i_clicked_on_the_goto_prices_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the message is populated in the bottem of the page is different",
  "keyword": "Then "
});
formatter.match({
  "location": "SDsyourDetails.verify_the_message_is_populated_in_the_bottem_of_the_page_is_different()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the Contact Details Text",
  "keyword": "And "
});
formatter.match({
  "location": "SDsyourDetails.verify_the_contact_details_text()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter invalid email in email field and click on Go to Prices",
  "keyword": "When "
});
formatter.match({
  "location": "SDsyourDetails.i_enter_invalid_email_in_email_field_and_click_on_go_to_prices()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify Error is getting populated",
  "keyword": "Then "
});
formatter.match({
  "location": "SDsyourDetails.verify_error_is_getting_populated()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I provide correct email and selected other check boxes and click on go to Prices",
  "keyword": "When "
});
formatter.match({
  "location": "SDsyourDetails.i_provide_correct_email_and_selected_other_check_boxes_and_click_on_go_to_prices()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Your Results page is getting populated",
  "keyword": "Then "
});
formatter.match({
  "location": "SDsyourDetails.verify_your_results_page_is_getting_populated()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close Browser for Your Results",
  "keyword": "Then "
});
formatter.match({
  "location": "SDsyourDetails.close_browser_for_your_results()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate The page navigation for Your Details page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Navigated to Your Details page in chrome-headless and launch https://energy.comparethemarket.com/energy/v2/?AFFCLIE\u003dTSTT with valid PE2 6YS address",
  "keyword": "Given "
});
formatter.match({
  "location": "SDsyourDetails.navigated_to_your_details_page_in_and_launch_with_valid_address(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I clicked on the Goto Prices button",
  "keyword": "When "
});
formatter.match({
  "location": "SDsyourDetails.i_clicked_on_the_goto_prices_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the Complete this section to continue 4 questions remaining message is populated in the bottem of the your Details page",
  "keyword": "Then "
});
formatter.match({
  "location": "SDsyourDetails.verify_the_message_is_populated_in_the_bottem_of_the_your_details_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I will select the Fixed Tarif",
  "keyword": "Then "
});
formatter.match({
  "location": "SDsyourDetails.i_will_select_the_fixed_tarif()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select Monthly DirectDebit",
  "keyword": "And "
});
formatter.match({
  "location": "SDsyourDetails.select_monthly_directdebit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I clicked on the Goto Prices button",
  "keyword": "When "
});
formatter.match({
  "location": "SDsyourDetails.i_clicked_on_the_goto_prices_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the message is populated in the bottem of the page is different",
  "keyword": "Then "
});
formatter.match({
  "location": "SDsyourDetails.verify_the_message_is_populated_in_the_bottem_of_the_page_is_different()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the Contact Details Text",
  "keyword": "And "
});
formatter.match({
  "location": "SDsyourDetails.verify_the_contact_details_text()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter invalid email in email field and click on Go to Prices",
  "keyword": "When "
});
formatter.match({
  "location": "SDsyourDetails.i_enter_invalid_email_in_email_field_and_click_on_go_to_prices()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify Error is getting populated",
  "keyword": "Then "
});
formatter.match({
  "location": "SDsyourDetails.verify_error_is_getting_populated()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I provide correct email and selected other check boxes and click on go to Prices",
  "keyword": "When "
});
formatter.match({
  "location": "SDsyourDetails.i_provide_correct_email_and_selected_other_check_boxes_and_click_on_go_to_prices()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Your Results page is getting populated",
  "keyword": "Then "
});
formatter.match({
  "location": "SDsyourDetails.verify_your_results_page_is_getting_populated()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close Browser for Your Results",
  "keyword": "Then "
});
formatter.match({
  "location": "SDsyourDetails.close_browser_for_your_results()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:Features/your_supplier.feature");
formatter.feature({
  "name": "ENERGY QUOTE Your Supplier page Validation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validate The Energy quote page Header and Title",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Functional"
    }
  ]
});
formatter.step({
  "name": "Initialize the \u003cbrowser\u003e browser",
  "keyword": "Given "
});
formatter.step({
  "name": "Navigate to \u003curl\u003e Site",
  "keyword": "And "
});
formatter.step({
  "name": "Energy Quote page is launched",
  "keyword": "When "
});
formatter.step({
  "name": "Verify the Header and Page Title",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify the sub header is displayed",
  "keyword": "And "
});
formatter.step({
  "name": "Close Browsers",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "browser",
        "url"
      ]
    },
    {
      "cells": [
        "chrome",
        "https://energy.comparethemarket.com/energy/v2/?AFFCLIE\u003dTSTT"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate The Energy quote page Header and Title",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Functional"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Initialize the chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "SDsyourSupplier.initialize_the_browser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to https://energy.comparethemarket.com/energy/v2/?AFFCLIE\u003dTSTT Site",
  "keyword": "And "
});
formatter.match({
  "location": "SDsyourSupplier.navigate_to_site(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Energy Quote page is launched",
  "keyword": "When "
});
formatter.match({
  "location": "SDsyourSupplier.energy_quote_page_is_launched()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the Header and Page Title",
  "keyword": "Then "
});
formatter.match({
  "location": "SDsyourSupplier.verify_the_header_and_page_title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the sub header is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "SDsyourSupplier.verify_the_sub_header_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close Browsers",
  "keyword": "Then "
});
formatter.match({
  "location": "SDsyourSupplier.close_browsers()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Validate The Energy quote page Been here Before part",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Functional"
    }
  ]
});
formatter.step({
  "name": "Initialize the \u003cbrowser\u003e browser",
  "keyword": "Given "
});
formatter.step({
  "name": "Navigate to \u003curl\u003e Site",
  "keyword": "And "
});
formatter.step({
  "name": "Energy Quote page is launched",
  "keyword": "When "
});
formatter.step({
  "name": "Verify the been here before text",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify the previous energy quotes string is navigating to Sign in page",
  "keyword": "And "
});
formatter.step({
  "name": "Verify the How to get Started is clikable and expanding the display portion with details",
  "keyword": "And "
});
formatter.step({
  "name": "Close Browsers",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "browser",
        "url"
      ]
    },
    {
      "cells": [
        "chrome",
        "https://energy.comparethemarket.com/energy/v2/?AFFCLIE\u003dTSTT"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate The Energy quote page Been here Before part",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Functional"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Initialize the chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "SDsyourSupplier.initialize_the_browser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to https://energy.comparethemarket.com/energy/v2/?AFFCLIE\u003dTSTT Site",
  "keyword": "And "
});
formatter.match({
  "location": "SDsyourSupplier.navigate_to_site(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Energy Quote page is launched",
  "keyword": "When "
});
formatter.match({
  "location": "SDsyourSupplier.energy_quote_page_is_launched()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the been here before text",
  "keyword": "Then "
});
formatter.match({
  "location": "SDsyourSupplier.verify_the_been_here_before_text()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the previous energy quotes string is navigating to Sign in page",
  "keyword": "And "
});
formatter.match({
  "location": "SDsyourSupplier.verify_the_previous_energy_quotes_string_is_navigating_to_sign_in_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the How to get Started is clikable and expanding the display portion with details",
  "keyword": "And "
});
formatter.match({
  "location": "SDsyourSupplier.verify_the_how_to_get_started_is_clikable_and_expanding_the_display_portion_with_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close Browsers",
  "keyword": "Then "
});
formatter.match({
  "location": "SDsyourSupplier.close_browsers()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Validate The Energy quote page Been here Before part",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Functional"
    }
  ]
});
formatter.step({
  "name": "Initialize the \u003cbrowser\u003e browser",
  "keyword": "Given "
});
formatter.step({
  "name": "Navigate to \u003curl\u003e Site",
  "keyword": "And "
});
formatter.step({
  "name": "Energy Quote page is launched",
  "keyword": "When "
});
formatter.step({
  "name": "Verify the Your current supplier text",
  "keyword": "Then "
});
formatter.step({
  "name": "User clicks on the Find postcode button without any text",
  "keyword": "When "
});
formatter.step({
  "name": "Verify that Error message is not getting displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "User clicks on the Find postcode button with \u003cInv_postcode\u003e which is Invalid",
  "keyword": "When "
});
formatter.step({
  "name": "Verify the Error message populated",
  "keyword": "Then "
});
formatter.step({
  "name": "User clicks on the Find postcode button with \u003ccrct_postcode\u003e which is valid",
  "keyword": "When "
});
formatter.step({
  "name": "Verify that button is changed to the \u003cButton\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "Close Browsers",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "browser",
        "url",
        "Inv_postcode",
        "crct_postcode"
      ]
    },
    {
      "cells": [
        "chrome",
        "https://energy.comparethemarket.com/energy/v2/?AFFCLIE\u003dTSTT",
        "625523",
        "PE2 6YS"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate The Energy quote page Been here Before part",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Functional"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Initialize the chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "SDsyourSupplier.initialize_the_browser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to https://energy.comparethemarket.com/energy/v2/?AFFCLIE\u003dTSTT Site",
  "keyword": "And "
});
formatter.match({
  "location": "SDsyourSupplier.navigate_to_site(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Energy Quote page is launched",
  "keyword": "When "
});
formatter.match({
  "location": "SDsyourSupplier.energy_quote_page_is_launched()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the Your current supplier text",
  "keyword": "Then "
});
formatter.match({
  "location": "SDsyourSupplier.verify_the_your_current_supplier_text()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the Find postcode button without any text",
  "keyword": "When "
});
formatter.match({
  "location": "SDsyourSupplier.user_clicks_on_the_find_postcode_button_without_any_text()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that Error message is not getting displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "SDsyourSupplier.verify_that_error_message_is_not_getting_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the Find postcode button with 625523 which is Invalid",
  "keyword": "When "
});
formatter.match({
  "location": "SDsyourSupplier.user_clicks_on_the_find_postcode_button_with_which_is_invalid(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the Error message populated",
  "keyword": "Then "
});
formatter.match({
  "location": "SDsyourSupplier.verify_the_error_message_populated()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the Find postcode button with PE2 6YS which is valid",
  "keyword": "When "
});
formatter.match({
  "location": "SDsyourSupplier.user_clicks_on_the_find_postcode_button_with_which_is_valid(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that button is changed to the \u003cButton\u003e",
  "keyword": "Then "
});
formatter.match({
  "location": "SDsyourSupplier.verify_that_button_is_changed_to_the(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close Browsers",
  "keyword": "Then "
});
formatter.match({
  "location": "SDsyourSupplier.close_browsers()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Validate The Energy quote page Error Message",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Functionala"
    }
  ]
});
formatter.step({
  "name": "Initialize the \u003cbrowser\u003e browser",
  "keyword": "Given "
});
formatter.step({
  "name": "Navigate to \u003curl\u003e Site",
  "keyword": "And "
});
formatter.step({
  "name": "Energy Quote page is launched",
  "keyword": "When "
});
formatter.step({
  "name": "I clicked on the Next buton",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify the \u003cerror\u003e message is populated in the bottem of the your Supplier page",
  "keyword": "And "
});
formatter.step({
  "name": "Close Browsers",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "browser",
        "url",
        "error"
      ]
    },
    {
      "cells": [
        "chrome",
        "https://energy.comparethemarket.com/energy/v2/?AFFCLIE\u003dTSTT",
        "Complete postcode question to continue"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate The Energy quote page Error Message",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Functionala"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Initialize the chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "SDsyourSupplier.initialize_the_browser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to https://energy.comparethemarket.com/energy/v2/?AFFCLIE\u003dTSTT Site",
  "keyword": "And "
});
formatter.match({
  "location": "SDsyourSupplier.navigate_to_site(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Energy Quote page is launched",
  "keyword": "When "
});
formatter.match({
  "location": "SDsyourSupplier.energy_quote_page_is_launched()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I clicked on the Next buton",
  "keyword": "Then "
});
formatter.match({
  "location": "SDsyourSupplier.i_clicked_on_the_next_buton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the Complete postcode question to continue message is populated in the bottem of the your Supplier page",
  "keyword": "And "
});
formatter.match({
  "location": "SDsyourSupplier.verify_the_message_is_populated_in_the_bottem_of_the_your_supplier_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close Browsers",
  "keyword": "Then "
});
formatter.match({
  "location": "SDsyourSupplier.close_browsers()"
});
formatter.result({
  "status": "passed"
});
});