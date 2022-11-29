package pageobjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;



public class User_page {
	public WebDriver driver;
	By username=By.id("id_username");
	By password=By.id("id_password");
	By login=By.id("id_login");
	By user=By.xpath("//div//button[@class='btn']");
	By header=By.xpath("linkText(\"Download\")");
	By control=By.xpath("button[class='_2AkmmA _29YdH8']");
	By row=By.xpath("tr[contains(@class='row')");
	By right_next=By.xpath("/html/bo/div[1]/div[2]/div/span/div[3]");
	By disable=By.xpath("//a[@id='poststop' and @name='poststop']//following::table[1]//li[@class='prevnext']/a[contains(.,'Next')]");
	By right_previous=By.xpath("/html/div[1]/div[3]/div/span/div[3]");
	By next=By.xpath("/html/bo/div[1]/div[2]/a/div[3]");
	By first=By.xpath("/html/bo/div[1]/div[2]/a");
	By footer = By.xpath("tr[contains(@class='footer')");
	By add_user=By.id("id_adduser");
	By table_header=By.xpath("//header table");
	By sort=By.xpath("tr[contains(@class='sort')");
	By check=By.id("id_checkbox");
	By uncheck=By.id("id_checkbox");
	By delete_icon=By.id("id_delete");
	By check_row=By.xpath("/html/div[1]/div/span/div[3]");
	By no_button=By.xpath("//div//button[@class='no btn']");
	By yes_button=By.xpath("//div//button[@class='yes btn']");
	By close_icon=By.xpath("//form[@id='answer_form']/div/div/div[1]");
	By dialogue_box=By.xpath("//form[@id='answer_form']/div/div/div[1]/dialogue box");
	By edit_btn=By.xpath("//table[1]//li[@class='edit button']");
	By del_btn=By.xpath("//table[1]//li[@class='delete button']");
	By table_header1=By.xpath("/div//a//li[@style='table']");
	By text_search=By.id("id_search");
	By confirm_dialogue_box=By.xpath("//li[@class='delete button");
	By id_in_row=By.xpath("//html/div//a");
	By addnewuser=By.xpath("//a[@class='fhgjh']");
	By cancel_btn=By.partialLinkText("nljhjsk");
	By cancel_icon=By.xpath("//svg[@class=''svg-icon iconcancel'']");
	By user_details=By.id("id_user_details");
	By submit_button=By.xpath("//div//a//span[@contains text='submit']");
	By firstname=By.xpath("//input//a[conatins text='firstname']");
	By middlename=By.xpath("//input//a[conatins text=middlename]");
	By lastname=By.xpath("//input//a[conatins text=lastname]");
	By email=By.xpath("//input[@type='email']");
	By phoneno=By.xpath("//input//a[conatins text=phone]");
	By address=By.xpath("//input//a[conatins text=address]");
	By address2=By.xpath("//input//a[conatins text=address2]");
	By city=By.xpath("//input//a[conatins text=city]");
	By state=By.xpath("//input//a[conatins text=state]");
	By postalcode=By.xpath("//input//a[conatins text=postal_code]");
	By program=By.xpath("//input//a[conatins text=program]");
	By ugprogram=By.xpath("//input//a[conatins text=ug_program");
	By pgprogram=By.xpath("//input//a[conatins text=ug_program]");
	By skill=By.xpath("//input//a[conatins text=skill]");
	By experience=By.xpath("//input//a[conatins text=experience]");
	By userrole=By.xpath("//input//a[conatins text=user_role]");
	By visastatus=By.xpath("//input//a[conatins text=visa_status]");
	By batch=By.xpath("//input//a[conatins text=batch]");
	By comments=By.xpath("//input//a[conatins text=comments]");
	By first_name=By.xpath("id_customer_firstname");
	By middle_name=By.xpath("id_customer_middlename");
	By last_name=By.xpath("id_customer_lastname");
	By email1=By.xpath("Id_email");
	By phone_no=By.xpath("id_phone");
	By address1=By.xpath("id_address");
	By city1=By.xpath("id_city");
	By state1=By.xpath("id_state");
	By postal_code=By.xpath("id_postal_code");
	By program1=By.xpath("id_program");
	By ug_program=By.xpath("id_ug_program");
	By pg_program=By.xpath("id_ug_program");
	By skill1=By.xpath("id_skill");
	By experience1=By.xpath("id_experience");
	By user_role=By.xpath("id_user_role");
	By visa_status=By.xpath("id_visa_status");
	By batch1=By.xpath("id_batch");
	By comments1=By.xpath("id_comments");
	By state_dropdown=By.xpath("//div[@class='nav-item dropdown']/a[contains(text(),'State_select')]");
	By role_dropdown=By.xpath("//div[@class='nav-item dropdown']/a[contains(text(),'role_select')]");
	By errormsg=By.xpath("//div//span[contains(text(),'mandatory field cannot be empty')]");
	By msg=By.xpath("//div//li//a[contains(text(),'New user created')]");
	By ug_dropdown=By.xpath("//div[@class='nav-item dropdown']/a[contains(text(),'ug_program')]");
	
	
	
	
	public User_page(WebDriver driver)
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
	public void click_on_user()
	{
		driver.findElement(user).click();
	}
	
	public void test_header_validation() {
		driver.findElement(header).isDisplayed();
	    
	  }
	public void test_pagination_controls()
	{
		
		boolean pag_cntrl=driver.findElement(control).isDisplayed();
		if(pag_cntrl)
		{
			System.out.println("pagination control is displayed");
		}
		else
		{
			System.out.println("pagination control is not displayed");
		}
		
		
	}
	   
	public String getTitle()
	{
		return driver.getTitle();
		
	}
	public void rows_count_validation()
	{
		driver.findElement(row);
		
	}
	public void right_next_button()
	{
		driver.findElement(right_next).click();
	}
	public void test_right_next_page()
	{
		boolean nxt_page=driver.findElement(right_next).isDisplayed();
		if(nxt_page)
		{
			System.out.println("pagination control is displayed");
		}
		else
		{
			System.out.println("pagination control is not displayed");
		}
		
	}
	public void test_disable()
	{
		boolean tst_dsble=driver.findElement(disable).isDisplayed();
		if(tst_dsble)
		{
			System.out.println("disable is done");
		}
		else
		{
			System.out.println("disable of buton not done");
		}
		
		
	}
	public void right_previous_button()
	{
		driver.findElement(right_previous).click();

	}
	public void test_right_previous_page()
	{
		boolean tst_pre_page=driver.findElement(right_previous).isDisplayed();
		if(tst_pre_page)
		{
			System.out.println("right previous page is displayed");
		}
		else
		{
			System.out.println("right previous page is displayed");
		}
		
		
	}
	public void next_page()
	{
		driver.findElement(next).click();
	}
	public void test_nextpage()
	{
		boolean test_nxt=driver.findElement(next).isDisplayed();
		if(test_nxt)
		{
			System.out.println("next page is displayed");
		}
		else
		{
			System.out.println("next page  is not displayed");
		}
	}
	public void first_page()
	{
		driver.findElement(first).click();
	}
	public void test_previous_page()
	{
		boolean test_nxt=driver.findElement(next).isDisplayed();
		if(test_nxt)
		{
			System.out.println("previous page is displayed");
		}
		else
		{
			System.out.println("previous page  is not displayed");
		}
	}
	public void footer()
	{
		driver.findElement(footer).isDisplayed();
		System.out.println("WebElement for footer is"+ footer);
       
	}
	public void click_add_user()
	{
		driver.findElement(add_user).click();
	}
	public void table_header()
	{
		driver.findElement(table_header).isDisplayed();
	}
	public void sort_icon()
	{
		driver.findElement(sort).click();
	}
	public void test_sort()
	{
		boolean tst_sort=driver.findElement(sort).isDisplayed();
		if(tst_sort)
		{
			System.out.println("sorting is done");
		}
		else
		{
			System.out.println("sorting is not done");
		}
	}
	public void click_checkbox()
	{
		driver.findElement(check).click();
	}
	public void test_click_checkbox()
	{
		boolean tst_chk_box=driver.findElement(check).isDisplayed();
		if(tst_chk_box)
		{
			System.out.println("all are checked");
		}
		else
		{
			System.out.println("all are not checked");
		}
	}
	public void unclick_checkbox()
	{
		driver.findElement(uncheck).click();
	}
	public void test_unclick_checkbox()
	{
		boolean tst_unchk_box=driver.findElement(check).isDisplayed();
		if(tst_unchk_box)
		{
			System.out.println("all are unchecked");
		}
		else
		{
			System.out.println("all are not unchecked");
		}
	}
	public void test_delete_icon()
	{
		boolean test_del_icon=driver.findElement(delete_icon).isDisplayed();
		if(test_del_icon)
		{
			System.out.println("delete icon is prsnt ");
		}
		else
		{
			System.out.println("delete icon is not prsnt");
		}
		
	}
	public void check_row_checkbox()
	{
		driver.findElement(check_row).click();
	}
	public void enable_delete_icon()
	{
		driver.findElement(delete_icon).isEnabled();
		
	}
	public void headertable()
	{
	boolean head_table=driver.findElement(table_header1).isDisplayed();
	if(head_table) {
		System.out.println("Empty checkbox-icon"); 
		System.out.println( " ID with sort icon, Name with Sort icon");
		System.out.println("Email Address with sort icon");
		System.out.println("Contact Number with sort icon"); 
		System.out.println("Batch with sort icon, Skill with Sort icon, Edit/Delete as column names");
	}
	}
	public void click_delete_icon()
	{
		driver.findElement(delete_icon).click();
	}
	
	
	public void click_no_button()
	{
		driver.findElement(no_button).click();
		boolean no_btn=driver.findElement(no_button).isDisplayed();
		if(no_btn)
		{
			System.out.println("selected rows should not be deleted");
		}
		else
		{
			System.out.println("selected rows be deleted");
		}
		
	}
	public void click_dialogue_box()
	{
		driver.findElement(dialogue_box).click();
	}
	public void click_close_icon()
	{
	driver.findElement(close_icon).click();	
	}
	
	public void click_yes_button()
	{
		driver.findElement(no_button).click();
		boolean no_btn=driver.findElement(no_button).isDisplayed();
		if(no_btn)
		{
			System.out.println("selected rows should be deleted");
		}
		else
		{
			System.out.println("selected rows not be deleted");
		}
		
	}
	
	public void test_edit_and_delete ()
	{
		driver.findElement(edit_btn).isEnabled();
		driver.findElement(del_btn).isEnabled();
	}
	public void click_edit_btn()
	{
		driver.findElement(edit_btn).click();
	}
	public void click_delete_button()
	{
		driver.findElement(del_btn).click();
	}
	
	
	
	public void Search_text()
	{
		driver.findElement(text_search).sendKeys("search");
		boolean search_text=driver.findElement(text_search).isDisplayed();
		if(search_text)
		{
			System.out.println("User should see the search input field with search icon and text as\"Search\"");
		}
	}
	public void enter_name()
	{
		driver.findElement(text_search).click();
		driver.findElement(text_search).sendKeys("gayathri");
	}
	public void rows_with_name()
	{
		driver.findElement(row).isDisplayed();
	}
	//confirm("Confirm Amount. Click OK if $" + amount + " is the correct amount.")
public void confirm_dialogue_box()
{
	
	driver.findElement(confirm_dialogue_box).isDisplayed();
	
	}
	
	
	public void id_in_row()
	{
		driver.findElement(id_in_row).click();
	}
	public void confirm_id_in_row()
	{
		driver.findElement(id_in_row).isDisplayed();
	}
	
	public void add_new_user()
	{
		driver.findElement(addnewuser).click();
	}
	public void test_cancel_button()
	{
		driver.findElement(cancel_btn).isDisplayed();
	}
	public void click_cancel_button()
	{
		driver.findElement(cancel_btn).click();
		boolean cancelbtn=driver.findElement(cancel_btn).isDisplayed();
		if(cancelbtn)
		{
		System.out.println("userdetails page closed");	
		}
		else
		{
			System.out.println("user page is not closed");
			
		}
		
		
	}
	public void test_cancel_icon()
	{
		boolean test_cancel_icon=driver.findElement(cancel_icon).isDisplayed();
		if(test_cancel_icon)
		{
			System.out.println("user details page is closed");
		}
		else
		{
			System.out.println("user control page is not closed");
		}
		
		
	}
	public void cancel_icon()
	{
		driver.findElement(cancel_icon).click();
	}
	public void user_detls() {
		driver.findElement(user_details).click();
		
	}
	public void submitbutton()
	{
		boolean sbmt_btn=driver.findElement(submit_button).isDisplayed();
		if(sbmt_btn)
		{
			System.out.println("submit button text is displayed");
		}
		else
		{
			System.out.println("submit button text is not displayed");
		}
		
	}
	public void labeltexts()
	{
		driver.findElement(address1).isDisplayed();
		driver.findElement(batch1).isDisplayed();
		driver.findElement(city1).isDisplayed();
		driver.findElement(comments1).isDisplayed();
		driver.findElement(email1).isDisplayed();
		driver.findElement(experience1).isDisplayed();
		driver.findElement(first_name).isDisplayed();
		driver.findElement(last_name).isDisplayed();
		driver.findElement(middle_name).isDisplayed();
		driver.findElement(pg_program).isDisplayed();
		driver.findElement(phone_no).isDisplayed();
		driver.findElement(postal_code).isDisplayed();
		driver.findElement(program1).isDisplayed();
		driver.findElement(skill1).isDisplayed();
		driver.findElement(state1).isDisplayed();
		driver.findElement(ug_program).isDisplayed();
		driver.findElement(user_role).isDisplayed();
		driver.findElement(visa_status).isDisplayed();
	}
	public void inputfields()
	{
		driver.findElement(address).isDisplayed();
		driver.findElement(batch).isDisplayed();
		driver.findElement(city).isDisplayed();
		driver.findElement(comments).isDisplayed();
		driver.findElement(email).isDisplayed();
		driver.findElement(experience).isDisplayed();
		driver.findElement(firstname).isDisplayed();
		driver.findElement(lastname).isDisplayed();
		driver.findElement(middlename).isDisplayed();
		driver.findElement(pgprogram).isDisplayed();
		driver.findElement(phoneno).isDisplayed();
		driver.findElement(postalcode).isDisplayed();
		driver.findElement(program).isDisplayed();
		driver.findElement(skill).isDisplayed();
		driver.findElement(state).isDisplayed();
		driver.findElement(ugprogram).isDisplayed();
		driver.findElement(userrole).isDisplayed();
		driver.findElement(visastatus).isDisplayed();
		
		driver.findElement(address).sendKeys();
		driver.findElement(batch).sendKeys();
		driver.findElement(city).sendKeys();
		driver.findElement(comments).sendKeys();
		driver.findElement(email).sendKeys();
		driver.findElement(experience).sendKeys();
		driver.findElement(firstname).sendKeys();
		driver.findElement(lastname).sendKeys();
		driver.findElement(middlename).sendKeys();
		driver.findElement(pgprogram).sendKeys();
		driver.findElement(phoneno).sendKeys();
		driver.findElement(postalcode).sendKeys();
		driver.findElement(program).sendKeys();
		driver.findElement(skill).sendKeys();
		driver.findElement(state).sendKeys();
		driver.findElement(ugprogram).sendKeys();
		driver.findElement(userrole).sendKeys();
		driver.findElement(visastatus).sendKeys();
	}
	public void test_state_dropdown()
	{
		driver.findElement(state_dropdown).isDisplayed();
	}
	public void click_state_dropdown()
	{
		driver.findElement(state_dropdown).click();;
	}
	
	public void select_state_dropdown()
	{
		Select programdropdown=new Select(driver.findElement(state_dropdown));
		programdropdown.selectByVisibleText("programname");
		
	}
	public void test_role_drop_down()
	{
		driver.findElement(role_dropdown).isDisplayed();
		
	}
	public void select_role_drop_down()
	{
		driver.findElement(role_dropdown).click();

		Select programdropdown=new Select(driver.findElement(role_dropdown));
		programdropdown.selectByVisibleText("programname");
			
	}
	public void click_submit()
	{
		driver.findElement(submit_button).click();
	}
	public void validate_error_msg()
	{
		driver.findElement(errormsg).getText();
	}
	public void enter_few_fields()
	{
		driver.findElement(city).sendKeys();
		driver.findElement(batch).sendKeys(null);
	}
	public void get_msg()
	{
		driver.findElement(msg).getText();
	}
	public void email_id()
	{
		driver.findElement(email).sendKeys();
		driver.findElement(submit_button).click();
	}
	public void validate_email()
	{
		
		List<WebElement> allMessages = driver.findElements(email);
	      if(allMessages.isEmpty()) {
	    	  System.out.println("invalid email");
	      }else {
	    	  System.out.println("valid email");
	      }
	      
	}
	public void Validate_address2()
	{
		driver.findElement(address2).click();
		driver.findElement(address2).getText();
		Assert.assertEquals("+ Add C/O, Apt, Suite, Unit", "phone");
	}
	public void validate_phone()
	{
		driver.findElement(phoneno).click();
		driver.findElement(phoneno).sendKeys();
	}
	public void validate_postalcode()
	{
		driver.findElement(postalcode).click();
		driver.findElement(postalcode).sendKeys();
		
	}
	public void ugprogram()
	{
		driver.findElement(ug_dropdown).click();
		driver.findElement(ug_dropdown).isDisplayed();
	}
	@SuppressWarnings("unchecked")
	public void ascending()
	{
	List<WebElement> tdList = driver.findElements(By.xpath("//resulttable[@id='myTable']/tbody/tr/td[2]"));
	List actuallist=new ArrayList();
	for(WebElement ele:tdList)		
	{
		String data=ele.getText();
		actuallist.add(data);
	}
	
	List temp=new ArrayList();
	temp.addAll(actuallist);
	
	// Ascending Order
	Collections.sort(temp);
			
	if(actuallist.equals(temp))
	{
		System.out.println("Ascending order Functionality is working");
		Assert.assertTrue(true);
		
	}
	else
	{
		System.out.println("Ascending order Functionality is not working");
		
		Assert.assertTrue(false);
	}
	
}
}

