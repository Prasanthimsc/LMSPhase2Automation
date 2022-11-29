package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageobjects.Attendance_page;
;

public class Attendance_steps extends Base_class {
	WebDriver driver;
	@Given("Users Launch the chrome browser")
	public void users_launch_the_chrome_browser() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		driver=new ChromeDriver();
	  ap=new Attendance_page();
	}
@Then("Users enter valid {string} and valid {string}")
public void users_enter_valid_and_valid(String uname, String pswd) {
   ap.usname();
   ap.paswd();
}

@Then("Users clicks on login")
public void users_clicks_on_login() {
    
}

@Then("Users are on Homepage")
public void users_are_on_homepage() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
public void after(Scenario scenario)
{
	if(scenario.isFailed()) {
		byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
}
@When("Users click on Attendance")
public void users_click_on_attendance() {
    ap.click_attendance();
}

@Then("Users are on {string}")
public void users_are_on(String attend) {
	if(driver.getPageSource().contains(attend))
	   {
		   Assert.assertEquals("Attendance page", "manageuser");
		   System.out.println("you are in manage attendance page");
	}
	   else
		   
	   {
		   Assert.assertTrue(false);
		   System.out.println("you are not in manage attendance page");
		   driver.close();
	   }

}
@SuppressWarnings("deprecation")
@Then("Admin\\/User\\/Staff see header text as {string}")
public void admin_user_staff_see_header_text_as(String attendance) {
   ap.header_validation();
   Assert.assertEquals("manage attendance","lms page");
   
}

@SuppressWarnings("deprecation")
@Then("Admin\\/User\\/Staff see Footer text as {string}")
public void admin_user_staff_see_footer_text_as(String footer) {
   ap.footer_validation();
   Assert.assertEquals("intotal there are t entries","lms page");
   
}

@Then("User should see the text {string} beow the Attendance table.")
public void user_should_see_the_text_beow_the_attendance_table(String showing) {
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




@Then("Pagination control shoud  disable")
public void pagination_control_shoud_disable() {
	
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
public void after1(Scenario scenario)
{
	if(scenario.isFailed()) {
		byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
}

@When("User\\/Staff Clicks on EditButton")
public void user_staff_clicks_on_edit_button() {
   ap.click_edit();
}

@Then("Admin see header text as {string}")
public void admin_see_header_text_as(String string) {
    ap.header_validation();
}

@When("User\\/Staff clicks on Save button after changing Program Name")
public void user_staff_clicks_on_save_button_after_changing_program_name() {
   ap.change_program_name();
   ap.savebtn();
}

@Then("User\\/Staff see the success message {string}")
public void user_staff_see_the_success_message(String string) {
    ap.successmsg();
}

@When("User\\/Staff clicks on Save button after changing User name")
public void user_staff_clicks_on_save_button_after_changing_user_name() {
    ap.change_username();
}

@When("User\\/Staff clicks on Save button after disabling Present details")
public void user_staff_clicks_on_save_button_after_disabling_present_details() {
    
}

@When("User\\/Staff clicks on Save button after enabling Absent details")
public void user_staff_clicks_on_save_button_after_enabling_absent_details() {

}

@When("User\\/Staff clicks on Cancel button after entering details")
public void user_staff_clicks_on_cancel_button_after_entering_details() {
ap.click_cancel();
}

@Then("User\\/Staff see a Attendance Details window getting closed")
public void user_staff_see_a_attendance_details_window_getting_closed() {
ap.close_page();
}

@Then("Admin see Error Message {string}")
public void admin_see_error_message(String string) {
    ap.errormessage();
}
public void after3(Scenario scenario)
{
	if(scenario.isFailed()) {
		byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
}
@When("User\\/Staff Clicks on Delete Button")
public void user_staff_clicks_on_delete_button() {
ap.del_confirm();
}

@When("User\\/Staff  Clicks on {string}  button")
public void user_staff_clicks_on_button(String string) {
    ap.yes_btn();
}

@Then("User\\/Staff  see Success message \"\"Program Deleted Succesfully\"\"")
public void user_staff_see_success_message_program_deleted_succesfully() {
ap.successmsg();
}

@When("User\\/Staff  Clicks on No button")
public void user_staff_clicks_on_no_button() {
    ap.n_btn();
}

@Then("User\\/Staff can see Program Name not deleted")
public void user_staff_can_see_program_name_not_deleted() {
	ap.notdeleted();
	 Assert.assertEquals("not deleted","lms page");
}

@Given("Admin is on Manage Attendance page")
public void admin_is_on_manage_attendance_page() {
   ap.test_attendance();
}
public void after4(Scenario scenario)
{
	if(scenario.isFailed()) {
		byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
}
@When("Admin Clicks on Delete Button")
public void admin_clicks_on_delete_button() {
   ap.delete();
}

@Then("Admin see Error Message Admin Has View Only Permission")
public void admin_see_error_message_admin_has_view_only_permission() {
  ap.errormessage();
	 Assert.assertEquals("admin has view only permission","lms page");
}

@When("Admin\\/User\\/Staff Clicks on Checkbox")
public void admin_user_staff_clicks_on_checkbox() {
 ap.check_box();
}

@Then("Admin\\/User\\/Staff  see list of Users in that Program")
public void admin_user_staff_see_list_of_users_in_that_program() {
ap.check_box();
}

@When("Admin\\/User\\/Staff  Clicks on Present")
public void admin_user_staff_clicks_on_present() {
ap.present_details();
}

@Then("Admin\\/User\\/Staff  see the list of  {string} who are Present")
public void admin_user_staff_see_the_list_of_who_are_present(String string) {
ap.present_details();
}
public void after5(Scenario scenario)
{
	if(scenario.isFailed()) {
		byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
}

@When("Admin\\/User\\/Staff  Clicks on Absent")
public void admin_user_staff_clicks_on_absent() {
ap.absent_details();
}
public void after7(Scenario scenario)
{
	if(scenario.isFailed()) {
		byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
}

@Then("Admin\\/User\\/Staff  see the list of  {string} who are Absent")
public void admin_user_staff_see_the_list_of_who_are_absent(String string) {
   ap.absent_details();
}


}
