$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/searchFunction.feature");
formatter.feature({
  "name": "Automation Challenge",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search Function Test on Consumer Page",
  "description": "",
  "keyword": "Scenario",
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
  "name": "user searches for \"haircut\" in \"San Francisco\" on consumers page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.ConsumerPageSteps.user_searches_for_in_on_consumers_page(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the number of the search results are 3 or more",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConsumerPageSteps.verify_the_number_of_the_search_results_are_or_more(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks \"Test - Sabre Cuts\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ConsumerPageSteps.user_clicks(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects \"All services\" in the services filter from the left panel",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConsumerPageSteps.user_selects_in_the_services_filter_from_the_left_panel(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects second staff from the staff filter in the left side panel",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ConsumerPageSteps.user_selects_second_staff_from_the_staff_filter_in_the_left_side_panel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks the “Book” button for the “Men\u0027s Haircut” service",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConsumerPageSteps.user_clicks_the_Book_button_for_the_Men_s_Haircut_service()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user presses \"Select Time\" in the add-on modal opened",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.ConsumerPageSteps.user_presses_in_the_add_on_modal_opened(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that the user is presented with a list of available time slots with at least 2 entries",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConsumerPageSteps.verify_that_the_user_is_presented_with_a_list_of_available_time_slots_with_at_least_entries(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify in the right side panel :Service displayed is the one selected in the step before",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ConsumerPageSteps.verify_in_the_right_side_panel_Service_displayed_is_the_one_selected_in_the_step_before()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify in the right side panel :Service price is the same as the one displayed in the step before",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ConsumerPageSteps.verify_in_the_right_side_panel_Service_price_is_the_same_as_the_one_displayed_in_the_step_before()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify in the right side panel :Staff selected is the staff chosen before",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ConsumerPageSteps.verify_in_the_right_side_panel_Staff_selected_is_the_staff_chosen_before()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Search Function Test on Consumer Page");
formatter.after({
  "status": "passed"
});
});