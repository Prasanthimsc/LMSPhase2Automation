package lmsPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class addBatchPageObject {
	
WebDriver driver;
	
	//constructor
	public addBatchPageObject(WebDriver driver)
	{
		this.driver=driver;
	}
	
        	/**** Locators ****/
	
	By txt_addbatchheader_loc=By.xpath("//*[@id='divBatchadd']/header");
	
	By txt_addname_loc=By.xpath("//input[@id='addname']");
	By txt_adddescription_loc=By.xpath("//input[@id='addname']");
	By dropdown_addProgramname_loc=By.xpath("//select[@id='program-name']");   // list
	By radio_active_loc=(By.xpath("//input[@id='active']"));
	By radio_inactive_loc=(By.xpath("//input[@id='inactive']"));
	By txt_noofclasses_loc=By.xpath("//input[@id='noofclasses']");
	By btn_batchaddcancel_loc=By.id("batchaddcancel");
	By btn_batchaddsave_loc=By.id("batchaddsave");
	
	By btn_addbathclose_loc=By.id("batchaddclose");
	By addMsgConfirmation_loc=By.xpath("//h1[normalize-space()='Batch is added']");
	By addErrorMessage_loc=By.linkText("Error Message");
	By adduserstaffaccessmessage_loc=By.id("accessmessage");
	
	
	public String addBatchPageHeader()
	{
		try
		{
		return (driver.findElement(txt_addbatchheader_loc).getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
		
	}
	
	public void ClickProgramDropDown()
	{
	driver.findElement(dropdown_addProgramname_loc).click();
    }
	
	public void addBatchName(String addname)
	{
		driver.findElement(txt_addname_loc).sendKeys(addname);
	}
	
	public void addBatchDescription(String adddescription)
	{
		driver.findElement(txt_adddescription_loc).sendKeys(adddescription);
	}
	
	public void addBatchProgramName(String programname)
	{
		Select programdropdown=new Select(driver.findElement(dropdown_addProgramname_loc));
		programdropdown.selectByVisibleText("programname");
	}
	
	public void addBatchActiveStatus()
	{
		driver.findElement(radio_active_loc).click();
	}
	
	public void addBatchInactiveStatus()
	{
		driver.findElement(radio_inactive_loc).click();
	}
	
	
	public void addBatchNoOfClasses(String noofclasses)
	{
		driver.findElement(txt_noofclasses_loc).sendKeys(noofclasses);
	}
	
	public void addBatchclickSave()
	{
		driver.findElement(btn_batchaddsave_loc).click();
	}
	
	public void addBatchclickCancel()
	{
		driver.findElement(btn_batchaddcancel_loc).click();
	}
	
	public void addBatchClickClose()
	{
		driver.findElement(btn_addbathclose_loc).click();
	}
	
	public String getaddBatchConfirmationMsg()
	{
		try
		{
		return (driver.findElement(addMsgConfirmation_loc).getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
	}
	
	public String addErrorMessage()
	{
		try
		{
		return (driver.findElement(addErrorMessage_loc).getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
	}
	
	public String userStaffAccessMessage()
	{
		try
		{
		return (driver.findElement(adduserstaffaccessmessage_loc).getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
	}
	
	
}
