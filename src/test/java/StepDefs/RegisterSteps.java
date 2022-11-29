package Step_Definition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.internal.BaseClassFinder;

import com.crm.pages.BaseClass;

import Page_Object.Login_Page;
import Page_Object.RegisterPage;
import io.cucumber.java.en.*;

public class Register extends Base_Class{
	
	WebDriver driver = null;
	
	

@Given("Admin/staff/user log on to the LMS website")
public void admin_staff_user_log_on_to_the_lms_website() {
	
	rp = new RegisterPage(driver);
    lp = new Login_Page(driver);
}

@When("Admin/User/Staff lands on Registration page")
public void admin_user_staff_lands_on_registration_page() {
	
	rp.registerheader();
	
    
}

@Then("Admin/user/staff is able to view all the fields in the Registration Portal")
public void admin_user_staff_is_able_to_view_all_the_fields_in_the_registration_portal() {
	
	System.out.println("All feilds are displayed");
	
}

@When("^Admin/staff/user fill in the (.*) field with alphabet only$")
public void admin_staff_user_fill_in_the_first_name_field_with_alphabet_only(String Fname) {
	
	rp.enterFirstname(Fname);
	
}

@Then("Admin/staff/user should be able to see the First name")
public void admin_staff_user_should_be_able_to_see_the_first_name() {
	
    System.out.println("First Name is dispalyed");
	
}

@When("^Admin/staff/user fills in the (.*) field with alphabet only$")
public void admin_staff_user_fills_in_the_last_name_field_with_alphabet_only(String Lname) {
	rp.enterLastname(Lname);
	
    
}

@Then("Admin/staff/user should able view the Last Name")
public void admin_staff_user_should_able_view_the_last_name() {
	System.out.println("Last Name is dispalyed");
   
}

@When("^Admin/staff/user fills in the Address field with (.*) with Alphanumeric only$")
public void admin_staff_user_fills_in_the_address_field_with_house_number_with_alphanumeric_only(String Hnum) {
    rp.enterHousenumber(Hnum);

}

@Then("Admin/staff/user should be able to see the House number")
public void admin_staff_user_should_be_able_to_see_the_house_number() {
	
	System.out.println("House Number is dispalyed");
}

@When("^Admin/staff/user fills in the (.*) with alphabets only$")
public void admin_staff_user_fills_in_the_street_name_with_alphabets_only(String stname) {
	
	rp.enterStname(stname);
    
}

@Then("Admin/staff/user should able to see the Street name")
public void admin_staff_user_should_able_to_see_the_street_name() {
	
	System.out.println("Street Name is dispalyed");
	
}

@When("^Admin/staff/user fills in the (.*) in alphabet only$")
public void admin_staff_user_fills_in_the_city_in_alphabet_only(String city) {

	rp.entercity(city);

}

@Then("Admin/staff/user should able to see the City name")
public void admin_staff_user_should_able_to_see_the_city_name() {

	System.out.println("City Name is dispalyed");

}

@When("Admin/staff/user clicks on the dropdown from the (.*) field")
public void admin_staff_user_clicks_on_the_dropdown_from_the_state_field(String state) {
    
	rp.selectStatedropdown(state);

}

@Then("A dropdown with all states are displayed")
public void a_dropdown_with_all_states_are_displayed() {
    
	System.out.println("state dropdown is displayed");

}

@When("Admin/staff/user selects the appropriate option from the dropdown")
public void admin_staff_user_selects_the_appropriate_option_from_the_dropdown() {

	rp.clickstate();

}

@Then("Admin/staff/user is able to see the State name")
public void admin_staff_user_is_able_to_see_the_state_name() {

	System.out.println("State Name is dispalyed");

}

@When("^Admin/staff/user fills out the (.*) field with five digit numeric value$")
public void admin_staff_user_fills_out_the_zip_field_with_digit_numeric_value(String zip) {

	rp.enterZip(zip);

}

@Then("Admin/staff/user could able to move to the next field")
public void admin_staff_user_could_able_to_move_to_the_next_field() {
	
	System.out.println("Moved to the next feild");
	
   
}

@When("Admin/staff/user clicks the dropdown from the <Birth date>")
public void admin_staff_user_clicks_the_dropdown_from_the_birth_date() {
	
	rp.selectBirthday();

}

@Then("A dropdown calendar is displayed")
public void a_dropdown_calendar_is_displayed() {
	
	System.out.println("Calender of Birthday is displayed");
    
}

@When("Admin/staff/user clicks the correct <DOB> from the dropdown calender")
public void admin_staff_user_clicks_the_correct_dob_from_the_dropdown_calender() {
	
    rp.selectDateofBirth();

}

@Then("Admin/staff/user should able to see the <DOB> in the mentioned field")
public void admin_staff_user_should_able_to_see_the_dob_in_the_mentioned_field() {
	
	System.out.println("Birthday is displayed");
    

}

@When("^Admin/staff/user enters the respective (.*) with aphanumeric characters$")
public void admin_staff_user_enters_the_respective_username_with_aphanumeric_characters(String uname) {
	
    rp.enterUsername(uname);

}

@Then("^The exact (.*) name is displayed$")
public void the_exact_username_name_is_displayed(String uname) {

	System.out.println(uname);

}

@When("^Admin/staff/user enters the (.*) with ten digit numeric values$")
public void admin_staff_user_enters_the_phone_number_with_ten_digit_numeric_values(String ph) {
	
   rp.enterPhonenumber(ph);
   

}

@Then("The (.*) should be displayed")
public void the_phone_number_should_be_displayed(String ph) {
  
	System.out.println(ph);

}

@When("^Admin/staff/user enters the appropriate (.*) with appropriate sign$")
public void admin_staff_user_enters_the_appropriate_email_id_with_appropriate_sign(String email) {
    
	rp.enterEmail(email);

}

@Then("^The right (.*) is displayed$")
public void the_right_email_id_is_displayed(String email) {
    
	System.out.println(email);

}

@When("Admin/staff/user types in the (.*) which has eight characters, an Upper case,a numeric value,a special character")
public void admin_staff_user_types_in_the_password_which_has_characters_an_upper_case_a_numeric_value_a_special_character(String pswd) {
  
	rp.enterPassword(pswd);

}

@Then("The should automatically able to navigate to the {string} button")
public void the_should_automatically_able_to_navigate_to_the_button(String string) {
    
	System.out.println("Navigated to Signup button");

}

@When("Admin/staff/user clicks in the Sign up button")
public void admin_staff_user_clicks_in_the_sign_up_button() {
    
	rp.clicksignup();

}

@Then("Admin/staff/user able to succesfully able to enter the Login page")
public void admin_staff_user_able_to_succesfully_able_to_enter_the_login_page() {

	lp.headervalidation();
	lp.footervalidation();

}


@When("^Admin/staff/user enters numeric values in the (.*) field$")
public void admin_staff_user_enters_numeric_values_in_the_first_name_field(String uname) {
   
	rp.enterUsername(uname);

}

@Then("The Alert message appears as {string}")
public void the_alert_message_appears_as(String string) throws IOException {
    
	rp.Errortext(string);
	TakesScreenshot scrShot =((TakesScreenshot)driver);
	File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	File DestFile= new File("//JavaSelenium_akila//Screenshots");
	FileUtils.copyFile(SrcFile, DestFile);

}

@When("^Admin/staff/user skips the (.*) field$")
public void admin_staff_user_skips_the_address_field(String hnum) {
	
	rp.enterHousenumber(hnum);

}

@Then("The Error message appers as {string}")
public void the_error_message_appers_as(String string) throws IOException {

	rp.Errortext(string);
	TakesScreenshot scrShot =((TakesScreenshot)driver);
	File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	File DestFile= new File("//JavaSelenium_akila//Screenshots");
	FileUtils.copyFile(SrcFile, DestFile);
	

}

@When("^Admin/staff/user tries to enter the (.*) field without selecting the {string}$")
public void admin_staff_user_tries_to_enter_the_zip_field_without_selecting_the(String zip) {
   
	rp.enterZip(zip);

}

@Then("There is a Alert mentioinig to {string}")
public void there_is_a_alert_mentioinig_to(String string) throws IOException {

	rp.Errortext(string);
	TakesScreenshot scrShot =((TakesScreenshot)driver);
	File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	File DestFile= new File("//JavaSelenium_akila//Screenshots");
	FileUtils.copyFile(SrcFile, DestFile);

}

@When("^The name of the (.*) and the (.*) code is not matched$")
public void the_name_of_the_city_and_the_zip_code_is_not_matched(String city,String zip) {
	
	rp.entercity(city);
	rp.enterZip(zip);
 
}

@Then("The Alert message comes up as {string}")
public void the_alert_message_comes_up_as(String string) throws IOException {

	rp.Errortext(string);
	TakesScreenshot scrShot =((TakesScreenshot)driver);
	File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	File DestFile= new File("//JavaSelenium_akila//Screenshots");
	FileUtils.copyFile(SrcFile, DestFile);

}

@When("^Admin/staff/user enters the inappropriate values in the (.*) field$")
public void admin_staff_user_enters_the_inappropriate_values_in_the_zip_field(String zip) {

	rp.enterZip(zip);

}

@Then("There is Alert message {string}")
public void there_is_alert_message(String string) throws IOException {

	rp.Errortext(string);
	TakesScreenshot scrShot =((TakesScreenshot)driver);
	File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	File DestFile= new File("//JavaSelenium_akila//Screenshots");
	FileUtils.copyFile(SrcFile, DestFile);

}

@When("^Admin/staff/user enters a nine digit value in the (.*) field$")
public void admin_staff_user_enters_a_nine_digit_value_in_the_phone_number_field(String zip) {

	rp.enterZip(zip);

}

@Then("There is Error message appears as {string}")
public void there_is_error_message_appears_as(String string) throws IOException {
    
	rp.Errortext(string);
	TakesScreenshot scrShot =((TakesScreenshot)driver);
	File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	File DestFile= new File("//JavaSelenium_akila//Screenshots");
	FileUtils.copyFile(SrcFile, DestFile);

}

@When("^Admin/staff/user enters the inappropriate values in (.*) field$")
public void admin_staff_user_enters_the_inappropriate_values_in_email_field(String email) {
    
	rp.enterEmail(email);

}

@When("^Admin/staff/user entered the excisting (.*)$")
public void admin_staff_user_entered_the_excisting_email(String email) {
	
	rp.enterEmail(email);
  
}

@When("^Admin/staff/user enters the inappropiate values in the (.*) field$")
public void admin_staff_user_enters_the_inappropiate_values_in_the_password_field(String pswd) {
    
	rp.enterPassword(pswd);

}

@Then("The Error message comes up as {string}")
public void the_error_message_comes_up_as(String string) throws IOException {
	
	rp.Errortext(string);
	TakesScreenshot scrShot =((TakesScreenshot)driver);
	File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	File DestFile= new File("//JavaSelenium_akila//Screenshots");
	FileUtils.copyFile(SrcFile, DestFile);
}

@When("Admin/staff/user clicks the {string} button on the top")
public void admin_staff_user_clicks_the_button_on_the_top(String string) {
	
    rp.clicklogin();

}

@Then("Admin/staff/user is navigated to the {string} page")
public void admin_staff_user_is_navigated_to_the_page(String string) {
	
	lp.headervalidation();
   

}



}
