package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import steps.Base_class;

public class Attendance_page extends Base_class {
	public WebDriver driver;
	By username=By.id("id_username");
	By password=By.id("id_password");
	By login=By.id("id_login");
	By attendance_icon=By.xpath("//div [@class=’Attendance’]");
	By program_name=By.id("//input//a[conatins text=program]");
	By userName=By.xpath(("//input//a[conatins text='firstname']"));
	By Present=By.xpath("\"//button[@class='present']\"");
	By absent=By.xpath("\"//button[@class='absent']\"");
	By edit=By.xpath("//table[1]//li[@class='edit button']");
	By delete=By.xpath("//table[1]//li[@class='delete button']");
	By header=By.xpath("/div//a//li[@style='table']");	
	By footer=By.xpath("tr[contains(@class='footer')");
	By save_button=By.xpath("//table[1]//li[@class='save']");
	By success_msg=By.xpath("//div//li//a[contains(text(),'success')]");
	By cancel=By.partialLinkText("nljhjsk");
	By close=By.xpath("//form[@id='answer_form']/div/div/div[1]");
	By error_msg=By.xpath("//div//span[contains(text(),'mandatory field cannot be empty')]");
	By delete_confirm=By.xpath("//table[1]//li[@class='delete button']");
	By yes=By.xpath("//menu[@id='yes']");
	By no=By.xpath("//menu[@id='no']");
	By not_deleted=By.xpath("//table[1]//li[@class='not deleted']");
	By checkbox=By.id("id_checkbox");
	
	
	 public Attendance_page()
	 {
			this.driver=driver;
	}
		public void usname()
		{
			driver.findElement(username).sendKeys();
		}
		public void paswd()
		{
			driver.findElement(password).sendKeys();
		}
		public void log_in()
		{
			driver.findElement(login).sendKeys();
		}
	 public void click_attendance()
	 {
		 driver.findElement(attendance_icon).click();
	 }
	 public void test_attendance()
	 {
		 boolean atten=driver.findElement(attendance_icon).isDisplayed();
		 if(atten)
		 {
			 System.out.println("attendance is displayed");
		 }
		 else
		 {
			 System.out.println("attendance is not diplayed");
	 }
	 }
	 public void header_validation()
	 {
		 driver.findElement(header).getText();
	 }
	 public void footer_validation()
	 {
		 driver.findElement(footer).getText();
	 }
	 public void click_edit()
	 {
		 driver.findElement(edit).click();
	 }
	 public void test_edit()
	 {
		boolean edit1= driver.findElement(edit).isDisplayed();
		 if(edit1)
		 {
			 System.out.println("edit is displayed");
		 }
		 else
		 {
			 System.out.println("editis not diplayed");
	 }
	 }
	 public void change_program_name()
	 {
		 driver.findElement(program_name).sendKeys();
	 }
	 public void savebtn()
	 {
		 driver.findElement(save_button).click();
	 }
	 public void successmsg()
	 {
		 driver.findElement(success_msg).getText();
	 }
	 public void change_username()
	 {
		 driver.findElement(userName).sendKeys();
	 }
	 public void click_cancel()
	 {
		 driver.findElement(cancel).click();
	 }
	 public void close_page()
	 {
		 driver.findElement(close).click();
	 }
	 public void present_details()
	 {
		driver.findElement(Present).getText();
		boolean prsnt=driver.findElement(Present).isDisplayed();
		if(prsnt)
		 {
			 System.out.println("present details is displayed");
		 }
		 else
		 {
			 System.out.println("present is not diplayed");
	 }
		
	 }
	 public void absent_details()
	 {
		 driver.findElement(absent).isEnabled();
		boolean absen= driver.findElement(absent).isDisplayed();
		 if(absen)
		 {
			 System.out.println("absent details is displayed");
		 }
		 else
		 {
			 System.out.println("absent is not diplayed");
	 }
		 
	 }
	 public void errormessage()
	 {
		 driver.findElement(error_msg).getText();
	 }
	 public void delete()
	 {
		 driver.findElement(delete).click();
	 }
	 public void del_confirm()
	 {
		 driver.findElement(delete_confirm).getText();
	 }
	 public void yes_btn()
	 {
		driver.findElement(yes).click(); 
	 }
	 public void n_btn()
	 {
		 driver.findElement(no).click();
	 }
	 public void notdeleted()
	 {
		 driver.findElement(not_deleted).getText();
	 }
	 
	 public void check_box()
	 {
		driver.findElement(checkbox).click();
		 boolean tst_chk_box=driver.findElement(checkbox).isDisplayed();
			if(tst_chk_box)
			{
				System.out.println("all are displayed");
			}
			else
			{
				System.out.println("all are not displayed");
			}
	 }
	 
	 
}
