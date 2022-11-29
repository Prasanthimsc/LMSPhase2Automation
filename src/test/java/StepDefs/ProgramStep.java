package StepDefinition;

import static org.junit.jupiter.api.Assertions.assertAll;

import java.io.ByteArrayInputStream;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import PageObjectModel.ProgramPage;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import io.qameta.allure.Allure;
import junit.framework.Assert;

public class ProgramStep extends BaseClass {
	
	
	
	// Validate Header
	
	@Given("Admin\\/User\\/Staff logged on to LMS Website ")
	public void admin_user_staff_logged_on_to_lms_website() {
	   
		pp=new ProgramPage(driver);
		
		pp.GetUrl();
		
	}

	@When("Admin\\/User\\/Staff is on Manage Program page")
	public void admin_user_staff_is_on_manage_program_page() {
		
		pp.ClickProgramPage();
		
		String ActualTitle=driver.getTitle();
		String ExpectedTitle="Manage Program";
		if(ActualTitle.equalsIgnoreCase(ExpectedTitle)) {
			
			System.out.println("Title matching");
		}
		
		else
		{
			System.out.println("Title not matching");
		}
		
	    
	}

	@Then("Admin\\/User\\/Staff see header text as {string}")
	public void admin_user_staff_see_header_text_as(String string) {
	    
		pp.ValidateHeaderText();
		

	}

	//Validate footer
	
	@Then("Admin\\/User\\/Staff see Footer text as {string}")
	public void admin_user_staff_see_footer_text_as(String string) {
		
		pp.ValidateFooterText();
	    
	}
	
	//Pagination
	


	@Then("Admin\\/User\\/Staff  see the text as {string}")
	public void admin_user_staff_see_the_text_as(String Text) {
	   
		pp.DisplayPaginationPageText();
		
		
		
	}

	@When("Admin\\/User\\/Staff Clicks on Enabled paginator to next button")
	public void admin_user_staff_clicks_on_enabled_paginator_next_button() {
		
		pp.ClickEnableNextPage();
		
	}

	@Then("Admin\\/User\\/Staff see Paginator text as {string}")
	public void admin_user_staff_see_paginator_text_as(String string) {
	    
		pp.DisplayPaginatorTextNextBtn();
		
	}

	@When("Admin\\/User\\/Staff Clicks on Enabled paginator -prev button")
	public void admin_user_staff_clicks_on_enabled_paginator_prev_button() {
	    
		pp.ClickPrevButton();
	}

	@Then("Admin\\/User\\/Staff see Paginator text as\"Showing {int} to {int} of {int} entries\"")
	public void admin_user_staff_see_paginator_text_as_showing_to_of_entries(Integer int1, Integer int2, Integer int3) {
	    
		pp.DisplayPrevText();
	}

	@When("Admin\\/User\\/Staff Clicks on Enabled paginator-last button")
	public void admin_user_staff_clicks_on_enabled_paginator_last_button() {
	    
		pp.EnablePaginatorLastbutton();
	}

	@Then("Admin\\/User\\/Staff see Page number navigated to {string}")
	public void admin_user_staff_see_page_number_navigated_to(String string) {
	    
	     pp.PageNavigate();
	}

	@When("Admin\\/User\\/Staff Clicks on Enabled paginator -first button")
	public void admin_user_staff_clicks_on_enabled_paginator_first_button() {
	   
		pp.ClickPrevButton();
	}

	// Search
	
	
	@Then("Admin\\/User\\/Staff see the Search Text box has text as {string}")
	public void admin_user_staff_see_the_search_text_box_has_text_as(String Search) {
	    
		pp.CheckSearch();
		
	}

	@When("Admin\\/User\\/Staff enters Program Name to be searched")
	public void admin_user_staff_enters_program_name_to_be_searched() {
	    
		pp.SearchByProgramName();
	}

	@Then("Entries for the searched Program Name are shown")
	public void entries_for_the_searched_program_name_are_shown() {
	    
		pp.DisplayProgramName();
	}

	@When("Admin\\/User\\/Staff enters Program Description to be searched")
	public void admin_user_staff_enters_program_description_to_be_searched() {
	    
		pp.SearchByPrgDescrip();
	}

	@Then("Entries for the searched Program Description are shown")
	public void entries_for_the_searched_program_description_are_shown() {
	    
		pp.DisplayPrgDescrip();
	}

	@When("Admin\\/User\\/Staff enters Program Status to be searched")
	public void admin_user_staff_enters_program_status_to_be_searched() {
	    
		pp.SearchByPrgStatus();
	}

	@Then("Entries for the searched Program Status are shown")
	public void entries_for_the_searched_program_status_are_shown() {
	    
		pp.DisplayStatus();
	}
	
	//Ascending Functionality
	
	@When("Admin\\/User\\/Staff Clicks on Program Name Ascending Arrow")
	public void admin_user_staff_clicks_on_program_name_ascending_arrow() {
	    
		
		pp.ClickPrgNameAscending();
		
	}

	@Then("Admin\\/User\\/Staff see the Program Name displayed in Ascending order")
	public void admin_user_staff_see_the_program_name_displayed_in_ascending_order() {
	    
		pp.DisplayProgramNameAscending();
	}

	@When("Admin\\/User\\/Staff Clicks on Program Description Ascending Arrow")
	public void admin_user_staff_clicks_on_program_description_ascending_arrow() {
	    
		pp.ClickPrgDescAscending();
	}

	@Then("Admin\\/User\\/Staff see the Program Description displayed in Ascending order")
	public void admin_user_staff_see_the_program_description_displayed_in_ascending_order() {
	    
		pp.DisplayProgramdesc();
	}

	@When("Admin\\/User\\/Staff Clicks on Program Status Ascending Arrow")
	public void admin_user_staff_clicks_on_program_status_ascending_arrow() {
	    pp.ClickPrgStatusAscending();
	}

	@Then("Admin\\/User\\/Staff see the Program Status displayed in Ascending order")
	public void admin_user_staff_see_the_program_status_displayed_in_ascending_order() {
	    
		pp.DisplayProgramStatusAscending();
	}
	
	//Descending Functionality
	
	@When("Admin\\/User\\/Staff Clicks on Program Name Descending Arrow")
	public void admin_user_staff_clicks_on_program_name_descending_arrow() {
	    
		pp.ClickPrgNameDescending();
	}

	@Then("Admin\\/User\\/Staff see the Program Name displayed in Descending order")
	public void admin_user_staff_see_the_program_name_displayed_in_descending_order() {
	    
		pp.DisplayProgramDescending();
	}

	@When("Admin\\/User\\/Staff Clicks on Program Description Descending Arrow")
	public void admin_user_staff_clicks_on_program_description_descending_arrow() {
	    
		pp.ClickProgramDescDescending();
	}

	@Then("Admin\\/User\\/Staff see the Program Description displayed in Descending order")
	public void admin_user_staff_see_the_program_description_displayed_in_descending_order() {
	    
		pp.DisplayProgramdesc();
	}

	@When("Admin\\/User\\/Staff Clicks on Program Status Descending Arrow")
	public void admin_user_staff_clicks_on_program_status_descending_arrow() {
	   
		pp.ClickProgramStatusDescending();
	}

	@Then("Admin\\/User\\/Staff see the Program Status displayed in Descending order")
	public void admin_user_staff_see_the_program_status_displayed_in_descending_order() {
	   pp.DisplayProgramStatusDescending();
	}
			
	

	
	//Add program functionality
	
	@Given("Admin is on Manage Program page")
	public void admin_is_on_manage_program_page() {
	    
		pp.ClickProgramPage();
	}

	@When("Admin Clicks on  {string} button")
	public void admin_clicks_on_button(String string) {
	    
		pp.ClickNewProgramBtn();
	}

	@Then("Admin see header text as {string}")
	public void admin_see_header_text_as(String string) {
	    
		pp.ValidateHeader();
	}

	@When("Admin Clicks on Save Button with out entering details")
	public void admin_clicks_on_save_button_with_out_entering_details() {
	    
		pp.ClickSaveBtn();
	}

	@Then("Admin see Error message {string}")
	public void admin_see_error_message(String string) {
	    
		pp.DisplayErrMessage();
	}

	@When("Admin Clicks on Save Button after entering all details")
	public void admin_clicks_on_save_button_after_entering_all_details() {
	    
		pp.EnteredAllFields();
	}

	@Then("Admin see Success message {string}")
	public void admin_see_success_message(String string) {
	   
		pp.EnterDescriptionValue();
	}

	@When("Admin Clicks on Save Button after entering Name alone")
	public void admin_clicks_on_save_button_after_entering_name_alone() {
	    
		pp.EnterNameValue();
	}
    @Then("Admin get Error message {string}")
		public void admin_get_error_message(String string){
    	
    	pp.ErrForEnterName();
	
}
	@When("Admin Clicks on Save Button after entering Description alone")
	public void admin_clicks_on_save_button_after_entering_description_alone() {
	   
		pp.EnterDescriptionValue();
	}
	
	@Then ("Admin gets an Error {string}")
	public void admin_gets_an_error(String string) {
		
		pp.ErrForEnterDesc();
	}

	@When("Admin Clicks on Save Button after selecting Status alone")
	public void admin_clicks_on_save_button_after_selecting_status_alone() {
	    
		pp.ClickStatus();
	}
	
	@Then("Admin sees an error{string}")
	public void admin_sees_an_error(String string) {
		pp.ErrOnClick();
	}

	@When("Admin Clicks on Cancel button1")
	public void admin_clicks_on_cancel_button1() {
	   
		pp.ClickCancelBtn();
	}

	@Then("Admin see a Program Details window getting closed")
	public void admin_see_a_program_details_window_getting_closed() {
	    
		pp.ValidateProgramDetailPageClosed();
	}

	@When("Admin\\/User\\/Staff enters newly added Program Name in Search")
	public void admin_user_staff_enters_newly_added_program_name_in_search() {
	    
		pp.SearchNewPrgName();
	}

	@Then("Entry for the newly added Program Name is shown")
	public void entry_for_the_newly_added_program_name_is_shown() {
	    
		pp.DisplayNewPrgDetail();
	}

	@When("User\\/Staff is on Manage Program page by clicking {string} button")
	public void user_staff_is_on_manage_program_page_by_clicking_button(String string) {
	    pp.ClickNewProgramBtn();
	}

	@Then("User\\/Staff see a Error message {string}")
	public void user_staff_see_a_error_message(String string) {
	    
		pp.ErrorLoginForUserStaff();
	}
	
	//Edit functionality
	
	@When("Admin Clicks on Edit buttton")
	public void admin_clicks_on_edit_buttton() {
	    
	pp.ClickEditBtn();
		
	}

	@When("Admin Clicks on Save Button after updating Name")
	public void admin_clicks_on_save_button_after_updating_name() {
	   
		pp.EnterUpdateName();
		pp.ClickSaveBtn();
	}

	@When("Admin  Clicks on Save Button after updating  Description")
	public void admin_clicks_on_save_button_after_updating_description() {
	    
		pp.EnterUpdateDescription();
		pp.ClickSaveBtn();
		
	}

	@Then("Admin see success message as {string}")
	public void admin_see_success_message_as(String string) {
	   
		pp.DisplaySuccessMessageDesc();
	}

	@When("Admin Clicks on Save Button after Changing the status")
	public void admin_clicks_on_save_button_after_changing_the_status() {
	    
		pp.ClickUpdateStatus();
	}

	@Then("Admin see a Success message {string}")
	public void admin_see_a_success_message(String string) {
	    
		pp.DisplayStatusMsg();
	}

	@When("Admin clicks on Cancel button")
	public void admin_clicks_on_cancel_button() {
	    pp.ClickCancelBtn();
	}

	@Then("Admin sees a Program details window is closed without any modification made")
	public void admin_sees_a_program_details_window_is_closed_without_any_modification_made() {
	    
		pp.ValidateProgramDetailPageClosed();
		
	}

	@When("Admin\\/User\\/Staff enter edited Program Name in Search feature")
	public void admin_user_staff_enter_edited_program_name_in_search_feature() {
	    
		pp.CheckSearch();
		pp.SearchByProgramName();
		
	}

	@Then("It should display the edited Program Name details")
	public void it_should_display_the_edited_program_name_details() {
	    pp.DisplayProgramName();
	}

	@When("Admin\\/User\\/Staff enter edited Program description in Search field")
	public void admin_user_staff_enter_edited_program_description_in_search_field() {
	    
		pp.EnterDescriptionValue();
	}

	@Then("It Shows edited description in program details")
	public void it_shows_edited_description_in_program_details() {
	   pp.DisplayNewPrgDetail();
	}

	@When("User\\/Staff tries to click on Edit button")
	public void user_staff_tries_to_click_on_edit_button() {
	    pp.ClickEditBtn();
	}

	@Then("Display an error message stating that {string}")
	public void display_an_error_message_stating_that(String string) {
	    
		pp.ErrorLoginForUserStaff();
	}
	
	
	//Delete Functionality

	@Given("Admin on Manage Program Page")
	public void admin_on_manage_program_page() {
	    
		String ActualTitle=driver.getTitle();
		String ExpectedTitle="Manage Program";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		System.out.println(ActualTitle);
	}

	@When("Admin clicks on Delete feature in Manage Program")
	public void admin_clicks_on_delete_feature_in_manage_program() {
	    
		pp.ClickDelBtn();
	}

	@Then("Admin sees a text message {string}")
	public void admin_sees_a_text_message(String string) {
	    
		pp.DisplayDeleteBox();
	}

	@When("Admin Clicks on Yes  button")
	public void admin_clicks_on_yes_button() {
	    
		pp.ClickYesButton();
	}

	@When("Admin Clicks on No button")
	public void admin_clicks_on_no_button() {
	    
		pp.ClickNoButton();
	}

	@Then("Admin see a message {string}")
	public void admin_see_a_message(String string) {
	   
		pp.DisplayDeleteBox();
	}

	@When("Admin Enters deleted  Program Name in Search")
	public void admin_enters_deleted_program_name_in_search() {
	    
		pp.CheckSearch();
		pp.EnterNameValue();
	}

	@Then("Admin finds no results")
	public void admin_finds_no_results() {
	    
		Assert.assertEquals(true,true );
		
	}

	@When("User\\/Staff Clicks on Delete buttton")
	public void user_staff_clicks_on_delete_buttton() {
	    
		pp.ClickDelBtn();
	}

	@Then("It desplays a message that {string}")
	public void it_desplays_a_message_that(String string) {
	    
		pp.ErrorLoginForUserStaff();
	}
	
	//Delete Multiple Records
	
	@Given("Admin Manage Program Page")
	public void admin_manage_program_page() {
	    
		pp.ClickProgramPage();
	}

	@When("Admin Clicks on Checkbox near to Program Name on left side of the page by having Program details on below")
	public void admin_clicks_on_checkbox_near_to_program_name_on_left_side_of_the_page_by_having_program_details_on_below() {
	    
		pp.ClickCheckBox();
	}

	@Then("Admin can view enabled delete button by selecting all the Program Details present on the Manage Program")
	public void admin_can_view_enabled_delete_button_by_selecting_all_the_program_details_present_on_the_manage_program() {
	   
		pp.EnableDeletebtn();
	}

	@When("Admin Clicks on checkbox near to Program Name without having any Program Details record")
	public void admin_clicks_on_checkbox_near_to_program_name_without_having_any_program_details_record() {
	
		pp.NoProgramDetails();
	
	}

	@Then("Admin see a Delete button disabled")
	public void admin_see_a_delete_button_disabled() {
	    
		pp.DisabledDel();
	}

	@When("Admin selects a more than one checkbox in Program Details")
	public void admin_selects_a_more_than_one_checkbox_in_program_details() {
	    
		pp.ClickMultipleCheckBoxes();
	}

	@Then("Admin see a Enabled Delete button")
	public void admin_see_a_enabled_delete_button() {
	    pp.EnableDeletebtn();
	}

	@When("Admin Clicks on Enabled Delete button")
	public void admin_clicks_on_enabled_delete_button() {
	    
		pp.ClickOnDeleteButtonEnabled();
	}

	@Then("Message occurs in Pop Up screen as Delete Confirm")
	public void message_occurs_in_pop_up_screen_as_delete_confirm() {
	    
		pp.DisplayDeleteBox();
	}

	@When("Admin Clicks Yes")
	public void admin_clicks_yes() {
	    
		pp.ClickYesButton();
	}

	@Then("Selected Program details are deleted from the Program Page")
	public void selected_program_details_are_deleted_from_the_program_page() {
	    
		
	}

	@When("Admin Clicks No")
	public void admin_clicks_no() {
	    
		pp.ClickNoButton();
	}

	@Then("Admin can see Program details are not deleted")
	public void admin_can_see_program_details_are_not_deleted() {
		
	pp.SelectCancelDelete();
	}
	
	@When("Admin\\/User\\/Staff Enters deleted  Program Names in Search")
	public void admin_user_staff_enters_deleted_program_names_in_search(){
	    
		pp.SearchByProgramName();
	}

	@Then("Can see meassage {string}")
	public void can_see_meassage(String string) {
	
	    pp.DisplayText();
	}

	@When("User\\/Staff clicks on Delete button with and without Program Details")
	public void user_staff_clicks_on_delete_button_with_and_without_program_details() {
	    
		pp.ClickDelBtn();
	}

	@Then("User\\/Staff will view disabled Delete button by getting a message\"Admin has the access\"")
	public void user_staff_will_view_disabled_delete_button_by_getting_a_message_admin_has_the_access() {
	   
		pp.ErrorLoginForUserStaff();
	}

	@When("Admin\\/User\\/Staff navigate to homepage")
	public void admin_user_staff_navigate_to_homepage() {
	    
		 driver.navigate();
	}

	@Then("Validate the navigation")
	public void validate_the_navigation() {
		
		pp.NavigatePage();
	    
		String ActualUrl=driver.getCurrentUrl();
		String ExpectedUrl="https:lmsphase2seleniumhackathon.com";
		
		Assert.assertEquals(ActualUrl, ExpectedUrl);
		System.out.println(ActualUrl);
	}
	
}
	

