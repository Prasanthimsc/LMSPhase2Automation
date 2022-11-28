package lmsPageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class editBatchPageObject {
	
WebDriver driver;
	
	//constructor
	public editBatchPageObject(WebDriver driver)
	{
		this.driver=driver;
	}
	
        	/**** Locators ****/
	
	By txt_editname_loc=By.xpath("//input[@id='editname']");
	By txt_editdescription_loc=By.xpath("//input[@id='editname']");
	By dropdown_editProgramname_loc=By.xpath("//select[@id='program-name']");   // list
	By radio_active_loc=(By.xpath("//input[@id='active']"));
	By radio_inactive_loc=(By.xpath("//input[@id='inactive']"));
	By txt_noofclasses_loc=By.xpath("//input[@id='noofclasses']");
	By btn_batcheditcancel_loc=By.id("batcheditcancel");
	By btn_batcheditsave_loc=By.id("batcheditsave");
	By txt_editbatchheader_loc=By.xpath("//*[@id='divBatchedit']/header");
	By btn_editbathclose_loc=By.id("batcheditclose");
	By editMsgConfirmation_loc=By.xpath("//h1[normalize-space()='Batch is edited']");
	By edituserstaffaccessmessage_loc=By.xpath("//h1[normalize-space()='admin can only access']");
	
	
	public String editBatchPageHeader()
	{
		try
		{
		return (driver.findElement(txt_editbatchheader_loc).getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
		
	}
	
	public void editBatchName(String editname)
	{
		driver.findElement(txt_editname_loc).sendKeys(editname);
	}
	
	public void editBatchDescription(String editdescription)
	{
		driver.findElement(txt_editdescription_loc).sendKeys(editdescription);
	}
	
	public void editBatchProgramName(String programname)
	{
		Select programdropdown=new Select(driver.findElement(dropdown_editProgramname_loc));
		programdropdown.selectByVisibleText("programname");
	}
	
	public void editBatchActiveStatus()
	{
		driver.findElement(radio_active_loc).click();
	}
	
	public void editBatchInactiveStatus()
	{
		driver.findElement(radio_inactive_loc).click();
	}
	
	
	public void editBatchNoOfClasses(String noofclasses)
	{
		driver.findElement(txt_noofclasses_loc).sendKeys(noofclasses);
	}
	
	public void editBatchclickSave()
	{
		driver.findElement(btn_batcheditsave_loc).click();
	}
	
	public void editBatchclickCancel()
	{
		driver.findElement(btn_batcheditcancel_loc).click();
	}
	
	public void editBatchClickClose()
	{
		driver.findElement(btn_editbathclose_loc).click();
	}
	
	public String getEditBatchConfirmationMsg()
	{
		try
		{
		return (driver.findElement(editMsgConfirmation_loc).getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
	}
	
	public String editUserStaffAccessMessage()
	{
		try
		{
		return (driver.findElement(edituserstaffaccessmessage_loc).getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
	}

}
