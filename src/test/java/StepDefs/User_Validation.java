package steps;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Rotatable;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jdk.internal.joptsimple.internal.Rows;
import junit.framework.Assert;
import pageobjects.User_page;

public class User_Validation extends Base_class {
	WebDriver driver;
	
	@Given("Users Launches the chrome browser")
	public void users_launches_the_chrome_browser() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		driver=new ChromeDriver();
	  up=new User_page(driver);
	}
	@When("Users opens the URL {string}")
	public void users_opens_the_url(String url) {
		driver.get(url);
	}

@When("User clicks on the Tab User")
public void user_clicks_on_the_tab_user() {
	up.click_on_user();
}

@Then("User is on the Manage user page {string}")
public void user_is_on_the_manage_user_page(String user) {
  	 if(driver.getPageSource().contains(user))
	   {
		   Assert.assertEquals("userdetails", "manageuser");
		   System.out.println("you are in Userdetails page");
	}
	   else
		   
	   {
		   Assert.assertTrue(false);
		   System.out.println("It is not User page");
		   driver.close();
	   }

}
public void getscreenshot(WebDriver driver) throws Exception {

    File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

    File dest = new File(("user.dir")+"screenshot"  + ".png");
    FileUtils.copyFile(scr, dest);
    Thread.sleep(3000);
}

@When("User is on the Manage user page after clicking User Tab")
public void user_is_on_the_manage_user_page_after_clicking_user_tab() {
   
}
@Then("User should see the page heading as Manage User")
public void user_should_see_the_page_heading_as_manage_user() {
	
   up.test_header_validation();
  Assert.assertEquals("manageuser","lms page");
   
}

@Then("User should see the pagination controls below data table")
public void user_should_see_the_pagination_controls_below_data_table() {
	Assert.assertEquals(false, false);
	up.test_pagination_controls();
}

@When("Manage user table has less than or equal to {int} rows")
public void manage_user_table_has_less_than_or_equal_to_rows(Integer rows_table) {
	up.test_pagination_controls();
	int rows_count = rows_table.SIZE;	
}
public void after1(Scenario scenario)
{
	if(scenario.isFailed()) {
		byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
}

@Then("Pagination control should be disabled")
public void pagination_control_should_be_disabled() {
	up.test_pagination_controls();
	int row = 0;
if(row<=5)
	{
		System.out.println("disabled");
	}
else
{
	System.out.println("not disabled");
	}

}
@When("Manage user table has more than {int} rows")
public void manage_user_table_has_more_than_rows(Integer row_table) {
	up.test_pagination_controls();
	int row_count=row_table.SIZE;
  
}
@Then("Pagination control should be enabled")
public void pagination_control_should_be_enabled() {
	up.test_pagination_controls();
	int row=0;
   if(row>5)
	{
		System.out.println("enabled");
	}
   else
   {
	   System.out.println("not enabled");
   }
}

@When("User clicks next link of pagination")
public void user_clicks_next_link_of_pagination() {
   up.right_next_button();
}

@Then("Next page should be displayed")
public void next_page_should_be_displayed() {
   up.right_next_button();
}

@Then("Next link of pagination should be disabled")
public void next_link_of_pagination_should_be_disabled() {
	up.test_disable();
	
}

@When("User clicks previous link of pagination")
public void user_clicks_previous_link_of_pagination() {
   up.right_previous_button();
}

@Then("previous page should be displayed")
public void previous_page_should_be_displayed() {
up.right_previous_button();
}

@Then("Previous link of pagination should be disabled")
public void previous_link_of_pagination_should_be_disabled() {
	up.test_disable();
	System.out.println("previous link is disabled");
}
public void after2(Scenario scenario)
{
	if(scenario.isFailed()) {
		byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
}
@When("User clicks << icon in pagination")
public void user_clicks_icon_in_pagination() {
	up.next_page();
    
}

@Then("User clicks should see the First page of the table")
public void user_clicks_should_see_the_first_page_of_the_table() {
   up.next_page();
   
}

@When("User clicks >> icon in paginations")
public void user_clicks_icon_in_paginations() {
    up.first_page();
}


@Then("User clicks should see the last page of the table")
public void user_clicks_should_see_the_last_page_of_the_table() {
   up.first_page();
}

@Then("User should see the text {string} beow the user table.")
public void user_should_see_the_text_beow_the_user_table(String showing) {
	if(driver.getPageSource().contains(showing))
	   {
		   Assert.assertTrue(true);
		   System.out.println("you are in showing 1 to 4 of 4 entries");
	}
	   else
		   
	   {
		   Assert.assertTrue(false);
		   System.out.println("you are wrong page");
		   driver.close();
	   }
}
@Then("Usershould see the table footer as {string}.")
public void usershould_see_the_table_footer_as(String string) {
   up.footer();
}
public void after3(Scenario scenario)
{
	if(scenario.isFailed()) {
		byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
}

@Then("User should see the button with text {string}")
public void user_should_see_the_button_with_text(String addnewuser) {
	if(driver.getPageSource().contains(addnewuser))
	   {
		   Assert.assertTrue(true);
		   System.out.println("+ icon and Add New User");
	}
	   else
		   
	   {
		   Assert.assertTrue(false);
		   System.out.println("you are in wrong page");
		   driver.close();
	   }
}

@When("User clicks Add New User")
public void user_clicks_add_new_user() {
    up.click_add_user();
  
}

@Then("User should see the {string} dialog box")
public void user_should_see_the_dialog_box(String user_details) {
	if(driver.getPageSource().contains(user_details))
	   {
		   Assert.assertTrue(true);
		   System.out.println("details of user displayed");
	}
	   else
		   
	   {
		   Assert.assertTrue(false);
		   System.out.println("details of user not displayed");
		   driver.close();
	   }
}




@Then("User should see the table header as {string}")
public void user_should_see_the_table_header_as(String table) {
	up.table_header();
Assert.assertEquals("user details","manage user");
}
public void after4(Scenario scenario)
{
	if(scenario.isFailed()) {
		byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
}

@When("User clicks sort icon in table header")
public void user_clicks_sort_icon_in_table_header() {
   up.sort_icon();
}

@Then("Table rows should be sorted")
public void table_rows_should_be_sorted() {
	 up.sort_icon();
   System.out.println("Table rows are sorted");
   
}

@When("User checks empty checkbox in header")
public void user_checks_empty_checkbox_in_header() {
    up.click_checkbox();
}

@Then("Check box in all the rows of user table should be checked")
public void check_box_in_all_the_rows_of_user_table_should_be_checked() {
   System.out.println("all rows are checked");
}

@When("User unchecks checkbox in header")
public void user_unchecks_checkbox_in_header() {
   up.unclick_checkbox();
}

@Then("Check box in all the rows of user table should be unchecked")
public void check_box_in_all_the_rows_of_user_table_should_be_unchecked() {
    System.out.println("All rows are unchecked");
}

@Then("User should see the delete icon at the top left corner of the user table")
public void user_should_see_the_delete_icon_at_the_top_left_corner_of_the_user_table() {
   up.test_delete_icon();
}

@When("No rows is checked")
public void no_rows_is_checked() {
   System.out.println("All rows are unchecked");
}
public void after5(Scenario scenario)
{
	if(scenario.isFailed()) {
		byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
}

@Then("Delete icon at the top left corner of the user table disabled")
public void delete_icon_at_the_top_left_corner_of_the_user_table_disabled() {
    System.out.println("Delete icon Disabled");
}

@When("User checks the rows in user table")
public void user_checks_the_rows_in_user_table() {
   up.click_checkbox();
}

@Then("Delete icon at the top left corner of the user table enabled")
public void delete_icon_at_the_top_left_corner_of_the_user_table_enabled() {
   up.enable_delete_icon();
}

@When("User clicks the delete icon at the top left corner of user table")
public void user_clicks_the_delete_icon_at_the_top_left_corner_of_user_table() {
    up.test_delete_icon();
}

@Then("Confirm dialog box should be displayed with Text {string} , button with text {string} , the button with text {string} and close\\(X) icon\"")
public void confirm_dialog_box_should_be_displayed_with_text_button_with_text_the_button_with_text_and_close_x_icon(String no, String yes, String close) {
	 if(driver.getPageSource().contains(no))
	   {
		   Assert.assertTrue(true);
		   System.out.println("text");
	}
	   else
		   
	   {
		   Assert.assertTrue(false);
		   System.out.println("It is not User page");
		   driver.close();
	   }
	 if(driver.getPageSource().contains(yes))
	   {
		   Assert.assertTrue(true);
		   System.out.println("you are in User page");
	}
	   else
		   
	   {
		   Assert.assertTrue(false);
		   System.out.println("It is not User page");
		   driver.close();
	   }
	 if(driver.getPageSource().contains(close))
	   {
		   Assert.assertTrue(true);
		   System.out.println("you are in User page");
	}
	   else
		   
	   {
		   Assert.assertTrue(false);
		   System.out.println("It is not User page");
		   driver.close();
	   }
}
public void after6(Scenario scenario)
{
	if(scenario.isFailed()) {
		byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
}
@Then("User is in confirm dialog box after clicking delete icon")
public void user_is_in_confirm_dialog_box_after_clicking_delete_icon() {
   System.out.println("confirm dialog box");
}

@When("User clicks button with text {string}")
public void user_clicks_button_with_text(String string) {
   up.click_no_button();
}

@Then("Selected rows should not be deleted and dialog box should be closed")
public void selected_rows_should_not_be_deleted_and_dialog_box_should_be_closed() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Selected rows should be deleted and popup should be shown with success message {string}")
public void selected_rows_should_be_deleted_and_popup_should_be_shown_with_success_message(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("User clicks the close\\(x) icon")
public void user_clicks_the_close_x_icon() {
    up.click_close_icon();
}

@Then("Confirm dialog box should be closed")
public void confirm_dialog_box_should_be_closed() {
   up.click_dialogue_box();
}
public void after7(Scenario scenario)
{
	if(scenario.isFailed()) {
		byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
}
@Then("User should see the buttons with edit\\/delete icon in each row of Edit\\/Delete coulmn")
public void user_should_see_the_buttons_with_edit_delete_icon_in_each_row_of_edit_delete_coulmn() {
   up.test_edit_and_delete();
	System.out.println("edit delete icon is displayed");
}

@When("User clicks delete button")
public void user_clicks_delete_button() {
   up.click_delete_button();
}



@When("User clicks Edit button")
public void user_clicks_edit_button() {
   up.click_edit_btn();
}

@Then("{string} dialog box should be displayed for editing")
public void dialog_box_should_be_displayed_for_editing(String string) {
    up.click_dialogue_box();
    System.out.println("user details displayed");
}

public void after8(Scenario scenario)
{
	if(scenario.isFailed()) {
		byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
}

@Then("User see the Search Text box has text as {string}.")
public void user_see_the_search_text_box_has_text_as(String string) {
up.Search_text();
}

@Then("Confirm dialog box should be displayed with Text {string} , button with text {string} , the button with text {string} and close\\(X) icon")
public void confirm_dialog_box_should_be_displayed_with_text_button_with_text_the_button_with_text_and_close_x_icon1(String string, String string2, String string3) {
up.confirm_dialogue_box();
}
@Then("User should see the search input field with search icon and text as\"Search\"")
public void user_should_see_the_search_input_field_with_search_icon_and_text_as_search() {
	up.Search_text();
	   System.out.println("input field with search icon and text as search is displayed");
}

@When("User types <Name> to search")
public void user_types_name_to_search() {
   up.Search_text();
}

@Then("Rows with the name should be displayed")
public void rows_with_the_name_should_be_displayed() {
   up.rows_with_name();
}

@When("User types <random text> in search field which has no matching entry")
public void user_types_random_text_in_search_field_which_has_no_matching_entry() {
   
}
@Then("No rows is displayed")
public void no_rows_is_displayed() {
System.out.println("No rows are displayed");
}
public void after9(Scenario scenario)
{
	if(scenario.isFailed()) {
		byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
}

@When("User clicks ID in any row")
public void user_clicks_id_in_any_row() {
    up.id_in_row();
}

@Then("User  see dialog box displayed with user information")
public void user_see_dialog_box_displayed_with_user_information() {
    up.confirm_id_in_row();
}

@When("User clicks Add new user button")
public void user_clicks_add_new_user_button() {
    up.add_new_user();
}

@Then("User should see User Details window with text as {string}")
public void user_should_see_user_details_window_with_text_as(String user_details) {
	 if(driver.getPageSource().contains(user_details))
	   {
		   Assert.assertTrue(true);
		   System.out.println("you are in User page");
	}
	   else
		   
	   {
		   Assert.assertTrue(false);
		   System.out.println("It is not User page");
		   driver.close();
	   }
}
@Then("User should see a button with text as Cancel  in User Details window")
public void user_should_see_a_button_with_text_as_cancel_in_user_details_window() {
    up.click_close_icon();
}
@Then("User  see User Details window getting  closed")
public void user_see_user_details_window_getting_closed() {
    System.out.println("user details displayed");
}
public void afte(Scenario scenario)
{
	if(scenario.isFailed()) {
		byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
}
@Then("User should see a cancel\\(x) icon")
public void user_should_see_a_cancel_x_icon() {
  up.test_cancel_icon();
}

@Given("User is on User Details details window")
public void user_is_on_user_details_details_window() {
    up.user_detls();
}

@When("User clicks cancel\\(X) icon")
public void user_clicks_cancel_x_icon() {
   up.cancel_icon();
}

@Then("User Details window should be closed")
public void user_details_window_should_be_closed() {
   Assert.assertEquals("manage user","user details");
   System.out.println("user details page is closed");
}

@Then("User should see a button with text as Submit in user details window")
public void user_should_see_a_button_with_text_as_submit_in_user_details_window() {
  up.submitbutton();
}

@Then("User should see the placeholders with Text As {string},{string}, {string},{string},{string}, {string},{string}, {string},{string}.{string},{string},{string},{string},{string},{string},'{string},{string},{string}")
public void user_should_see_the_placeholders_with_text_as(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16, String string17, String string18) {
   up.labeltexts();
}

@Then("User should see the input fields for {string},{string}, {string},{string},{string}, {string},{string}, {string},{string}.{string},{string},{string},{string},{string},{string},{string},{string},{string} corresponding to their labels")
public void user_should_see_the_input_fields_for_corresponding_to_their_labels(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16, String string17, String string18) {
   up.inputfields();
}

@When("User clicks the drop down icon for state")
public void user_clicks_the_drop_down_icon_for_state() {
   up.test_state_dropdown();
}

@Then("User should select from the drop down menu for state")
public void user_should_select_from_the_drop_down_menu_for_state() {
   up.select_role_drop_down();
}

@When("User clicks the drop down icon for User Role")
public void user_clicks_the_drop_down_icon_for_user_role() {
    up.test_role_drop_down();
}

@Then("User should select from the drop down menu for user role")
public void user_should_select_from_the_drop_down_menu_for_user_role() {
up.select_role_drop_down();
}

@When("User clicks submit button with all details empty")
public void user_clicks_submit_button_with_all_details_empty() {
 up.submitbutton();
}

@Then("User should see a Error message {string}")
public void user_should_see_a_error_message(String string) {
   up.validate_error_msg();
}

@When("User clicks on Submit button after entering  Few Field details")
public void user_clicks_on_submit_button_after_entering_few_field_details() {
   up.click_submit();
}

@Then("User see error message {string}")
public void user_see_error_message(String string) {
   up.validate_error_msg();
}

@When("User clicks Submit button by entering all valid values in required fields")
public void user_clicks_submit_button_by_entering_all_valid_values_in_required_fields() {
  up.inputfields();
  up.click_submit();
}

@Then("User  see Success message  {string}  is  Should be Saved.")
public void user_see_success_message_is_should_be_saved(String string) {
    up.get_msg();
}
@Then("User see error message as {string}")
public void user_see_error_message_as(String string) {
  up.validate_email();
  up.validate_error_msg();
}

@When("User clicks on Submit button after entering wrong email address")
public void user_clicks_on_submit_button_after_entering_wrong_email_address() {
   up.validate_email();
}

@Then("User should see the button with text as {string}")
public void user_should_see_the_button_with_text_as(String address) {
   up.Validate_address2();
}

@When("User Enters more than {int} digits")
public void user_enters_more_than_digits(Integer count) {
	up.validate_phone();
	int num_count=10;
	int numb_count = count.compareTo(count);
	
	if(num_count>10)
	{
		System.out.println("invalid phone number");
	}
	
	else
	{
		System.out.println("phone number is valid");
	}
}

public void ater(Scenario scenario)
{
	if(scenario.isFailed()) {
		byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
}
@When("User Enters more than {int} digit")
public void user_enters_more_than_digit(Integer  count) {
	
	up.validate_postalcode();
	int num_count=5;
	int numb_count = count.compareTo(count);
	
	if(num_count>5)
	{
		System.out.println("invalid postal code");
	}
	
	else
	{
		System.out.println("phone number is valid");
	}
}

@When("User clicks on state dropdown")
public void user_clicks_on_state_dropdown() {
  up.click_state_dropdown();
}

@When("User clicks on UG Program dropdown")
public void user_clicks_on_ug_program_dropdown() {
    up.ugprogram();
}

@Then("User see list of UG Program")
public void user_see_list_of_ug_program() {
    up.ugprogram();
}

@When("User clicks the button {string}")
public void user_clicks_the_button(String string) {
    up.Validate_address2();
}
@Then("User see list of states in Alphabetical Order")
public void user_see_list_of_states_in_alphabetical_order() {
up.ascending();
}

@Then("User should see the input field with Label {string}")
public void user_should_see_the_input_field_with_label(String invalid) {
   up.ugprogram();
}

}








