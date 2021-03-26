$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/cucumber/Muke.feature");
formatter.feature({
  "line": 1,
  "name": "Login functionality for Adactin Applications",
  "description": "",
  "id": "login-functionality-for-adactin-applications",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User enters username and password",
  "description": "",
  "id": "login-functionality-for-adactin-applications;user-enters-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enter \"gokuleswar\" as username",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enter \"gokuleswar1995\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user verify valid username and valid password",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_launch_the_application()"
});
formatter.result({
  "duration": 6882874720,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "gokuleswar",
      "offset": 12
    }
  ],
  "location": "LoginStepDefinition.user_enter_as_username(String)"
});
formatter.result({
  "duration": 190072481,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "gokuleswar1995",
      "offset": 12
    }
  ],
  "location": "LoginStepDefinition.user_enter_as_password(String)"
});
formatter.result({
  "duration": 118244089,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_verify_valid_username_and_valid_password()"
});
formatter.result({
  "duration": 998775032,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "User enter information about search hotel",
  "description": "",
  "id": "login-functionality-for-adactin-applications;user-enter-information-about-search-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "User select options \"value\" and select \"Adelaide\" as location details from dropdown bo",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "user select options \"value\" and select \"Hotel Hervey\" as hotel name",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user select options \"value\" and select \"Super Deluxe\" as room type",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user select options \"value\" and select \"1\"  as no.of room",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user enter check in date as \"10/03/2021\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user enter check out date as \"12/03/2021\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User select options \"value\" and select \"1\" as choice",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user select options \"value\" and select \"0\" as choice as enter.",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user click search button to verify",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "value",
      "offset": 21
    },
    {
      "val": "Adelaide",
      "offset": 40
    }
  ],
  "location": "LoginHotelSearch.user_select_options_and_select_as_location_details_from_dropdown_bo(String,String)"
});
formatter.result({
  "duration": 184805218,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "value",
      "offset": 21
    },
    {
      "val": "Hotel Hervey",
      "offset": 40
    }
  ],
  "location": "LoginHotelSearch.user_select_options_and_select_as_hotel_name(String,String)"
});
formatter.result({
  "duration": 162401131,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "value",
      "offset": 21
    },
    {
      "val": "Super Deluxe",
      "offset": 40
    }
  ],
  "location": "LoginHotelSearch.user_select_options_and_select_as_room_type(String,String)"
});
formatter.result({
  "duration": 149946481,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "value",
      "offset": 21
    },
    {
      "val": "1",
      "offset": 40
    }
  ],
  "location": "LoginHotelSearch.user_select_options_and_select_as_no_of_room(String,String)"
});
formatter.result({
  "duration": 99002708,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10/03/2021",
      "offset": 29
    }
  ],
  "location": "LoginHotelSearch.user_enter_check_in_date_as(String)"
});
formatter.result({
  "duration": 113446463,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12/03/2021",
      "offset": 30
    }
  ],
  "location": "LoginHotelSearch.user_enter_check_out_date_as(String)"
});
formatter.result({
  "duration": 100928216,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "value",
      "offset": 21
    },
    {
      "val": "1",
      "offset": 40
    }
  ],
  "location": "LoginHotelSearch.user_select_options_and_select_as_choice(String,String)"
});
formatter.result({
  "duration": 106752193,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "value",
      "offset": 21
    },
    {
      "val": "0",
      "offset": 40
    }
  ],
  "location": "LoginHotelSearch.user_select_options_and_select_as_choice_as_enter(String,String)"
});
formatter.result({
  "duration": 96662844,
  "status": "passed"
});
formatter.match({
  "location": "LoginHotelSearch.user_click_search_button_to_verify()"
});
formatter.result({
  "duration": 640867340,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Select hotel \u0026 Book hotel",
  "description": "",
  "id": "login-functionality-for-adactin-applications;select-hotel-\u0026-book-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "User click radio button",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "user click continue button",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "user enter \"Karthi\" as name",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "User enter \"V\" as last name",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "user enter \"40/2 Senai Vinayagar kovil street, Kadayanallur\" as address",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "user enter \"1267987654329037\" as Credit card No.",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "user select options \"value\" and select \"MAST\" as answer",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "user select options \"value\" and select \"12\" as no.",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "user select options \"value\" and select \"2022\" as year",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "user enter \"184\" as CVV No.",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "user click BOOK click button",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "user click logo  button",
  "keyword": "Then "
});
formatter.match({
  "location": "PaymentDef.user_click_radio_button()"
});
formatter.result({
  "duration": 94209974,
  "status": "passed"
});
formatter.match({
  "location": "PaymentDef.user_click_continue_button()"
});
formatter.result({
  "duration": 632686866,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Karthi",
      "offset": 12
    }
  ],
  "location": "PaymentDef.user_enter_as_name(String)"
});
formatter.result({
  "duration": 121899913,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "V",
      "offset": 12
    }
  ],
  "location": "PaymentDef.user_enter_as_last_name(String)"
});
formatter.result({
  "duration": 101579347,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "40/2 Senai Vinayagar kovil street, Kadayanallur",
      "offset": 12
    }
  ],
  "location": "PaymentDef.user_enter_as_address(String)"
});
formatter.result({
  "duration": 157306070,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1267987654329037",
      "offset": 12
    }
  ],
  "location": "PaymentDef.user_enter_as_Credit_card_No(String)"
});
formatter.result({
  "duration": 147300865,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "value",
      "offset": 21
    },
    {
      "val": "MAST",
      "offset": 40
    }
  ],
  "location": "PaymentDef.user_select_options_and_select_as_answer(String,String)"
});
formatter.result({
  "duration": 172458192,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "value",
      "offset": 21
    },
    {
      "val": "12",
      "offset": 40
    }
  ],
  "location": "PaymentDef.user_select_options_and_select_as_no(String,String)"
});
formatter.result({
  "duration": 147620804,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "value",
      "offset": 21
    },
    {
      "val": "2022",
      "offset": 40
    }
  ],
  "location": "PaymentDef.user_select_options_and_select_as_year(String,String)"
});
formatter.result({
  "duration": 163616804,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "184",
      "offset": 12
    }
  ],
  "location": "PaymentDef.user_enter_as_CVV_No(String)"
});
formatter.result({
  "duration": 117573879,
  "status": "passed"
});
formatter.match({
  "location": "PaymentDef.user_click_BOOK_click_button()"
});
formatter.result({
  "duration": 95411460,
  "status": "passed"
});
formatter.match({
  "location": "PaymentDef.user_click_logo_button()"
});
formatter.result({
  "duration": 437879867,
  "status": "passed"
});
});