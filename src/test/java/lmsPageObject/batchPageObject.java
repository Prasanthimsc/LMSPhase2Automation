package lmsPageObject;

import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.junit.Assert;

public class batchPageObject {
	
	WebDriver driver;
	
	//constructor
	public batchPageObject(WebDriver driver)
	{
		this.driver=driver;
	}
	
        	/**** Locators ****/
	By batch_link=By.id("batchlink");
	By header_loc=By.xpath("//*[@id='divLogo']/header");  
	By footer_loc=By.xpath("//input[@id='footer']");
	By txt_search_loc=By.xpath("//input[@id='txtSearch']");
	By btn_topdelete_loc=By.cssSelector("input.delete_btn");
	By btn_anewbatch_loc=By.id("a_new_batch");
	By txt_paginationtext_loc=By.partialLinkText("showing");
	By btn_next_pagination_loc=By.id("pagination_next");
	By btn_prev_pagination_loc=By.id("pagination_prev");
	By btn_first_pagination_loc=By.id("pagiantion_first");
	By btn_last_pagination_loc=By.id("pagiantion_last");
	By rows_table_loc=By.xpath("//table[@id='batchresultTable']//tbody//tr");
	By chkbox_topchkbox_loc=By.xpath("//input[@type='checkbox' and @class='all-check-input']");
	By table_row_checkboxes_loc=By.xpath("//input[@type='checkbox' and @class='form-check-input']");    //list
	By link_batchnameascending_loc=By.xpath("//div[@role='row']/div[2]/div[1]/i[1]");
	By link_batchdescascending_loc=By.xpath("//div[@role='row']/div[3]/div[1]/i[1]");
	By link_batchstatusascending_loc=By.xpath("//div[@role='row']/div[4]/div[1]/i[1]");
	By link_batchclassesascending_loc=By.xpath("//div[@role='row']/div[5]/div[1]/i[1]");
	By link_batchprogramnameascending_loc=By.xpath("//div[@role='row']/div[6]/div[1]/i[1]");
	By link_batchnamedescending_loc=By.xpath("//div[@role='row']/div[2]/div[1]/i[1]");
	By link_batchdescdescending_loc=By.xpath("//div[@role='row']/div[3]/div[1]/i[1]");
	By link_batchstatusdescending_loc=By.xpath("//div[@role='row']/div[4]/div[1]/i[1]");
	By link_batchclassesdescending_loc=By.xpath("//div[@role='row']/div[5]/div[1]/i[1]");
	By link_batchprogramnamedescending_loc=By.xpath("//div[@role='row']/div[6]/div[1]/i[1]");  
	By btn_row_trash_icon_loc=By.xpath("//i[@class=\"oxd-icon bi-trash\"]");              //list
	By btn_row_edit_icon_loc=By.xpath("//i[@class=\"oxd-icon bi-pencil-fill\"]");         //list
	
	/**** Delete Locators****/
	
	By delete_box_msg_loc=By.xpath("//span[normalize-space()='Confirm Delete']/..");
	By btn_delete_yes_loc=By.xpath("//span[normalize-space()='Yes']/..");
	By btn_delete_no_loc=By.xpath("//span[normalize-space()='No']/..");
	By delete_yes_msg_loc=By.xpath("//span[normalize-space()='batch deleted']/..");
	By delete_no_msg_loc=By.xpath("//span[normalize-space()='batch not deleted']/..");
	By user_staff_delete_access_msg=By.xpath("//span[normalize-space()='only admin can access']");
	
	public void TopDeleteClick()
	{
		driver.findElement(btn_topdelete_loc).click();
	}
	
	
	public boolean deletebtnstatus() {
		
		Boolean status=driver.findElement(btn_topdelete_loc).isEnabled();
		return status;
	}
	
	
	
	public void ClickNewBatchLink()
	{
		driver.findElement(btn_anewbatch_loc).click();
	}
	
	public void ClickBatchLink()
	{
		driver.findElement(batch_link).click();
	}
	
	public void bacthcheckboxclick()
	{
		driver.findElement(table_row_checkboxes_loc).click();
	}
	
	public String BatchPageHeader()
	{
		try
		{
		return (driver.findElement(header_loc).getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
		
	}
	
	
	
	public String BatchPageFooter()
	{
		try
		{
		return (driver.findElement(footer_loc).getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
		
	}
	
	public String BatchPaginatorText()
	{
		try
		{
		return (driver.findElement(txt_paginationtext_loc).getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
		
	}
	
	
	public void BatchPaginatorNextClick()
	{
		driver.findElement(btn_next_pagination_loc).click();
	}
	
	public void BatchPaginatorPrevClick()
	{
		driver.findElement(btn_prev_pagination_loc).click();
	}
	
	public void BatchPaginatorLastClick()
	{
		driver.findElement(btn_last_pagination_loc).click();
	
	}
	
	public void BatchPaginatorFirstClick()
	{
		driver.findElement(btn_first_pagination_loc).click();
	
	}
	
	public String SearchTextLabel()
	{
		try
		{
		return (driver.findElement(txt_search_loc).getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
		
	}
	
	public void EnterSearchText(String searchtext)
	{
		driver.findElement(txt_search_loc).sendKeys(searchtext);
	}
	
	public void SearchEnter() 
	{
		driver.findElement(txt_search_loc).sendKeys(Keys.ENTER);
	}
	
	
	
	public void BatchNameAscendingOrderClick()
	{
		driver.findElement(link_batchnameascending_loc).click();
	}
	
	public void BatchDescriptionAscendingOrderClick()
	{
		driver.findElement(link_batchdescascending_loc).click();
	}
	
	public void BatchStatusAscendingOrderClick()
	{
		driver.findElement(link_batchstatusascending_loc).click();
	}
	
	public void BatchNoOfClassesAscendingOrderClick()
	{
		driver.findElement(link_batchclassesascending_loc).click();
	}
	
	public void BatchProgramNameAscendingOrderClick()
	{
		driver.findElement(link_batchprogramnameascending_loc).click();
	}
	
	public void BatchNameDescendingOrderClick()
	{
		driver.findElement(link_batchnameascending_loc).click();
	}
	
	public void BatchDescriptionDescendingOrderClick()
	{
		driver.findElement(link_batchdescdescending_loc).click();
	}
	
	public void BatchStatusDescendingOrderClick()
	{
		driver.findElement(link_batchstatusdescending_loc).click();
	}
	
	public void BatchNoOfClassesDescendingOrderClick()
	{
		driver.findElement(link_batchclassesdescending_loc).click();
	}
	
	public void BatchProgramNameDescendingOrderClick()
	{
		driver.findElement(link_batchprogramnamedescending_loc).click();
	}
	
	public int rowsintable()
	{
		int rows=driver.findElements(rows_table_loc).size();
		return(rows);
		
	}
	
	public void clickDelete()
	{
		driver.findElement(btn_row_trash_icon_loc).click();
	}
	
	public String DeleteBoxMessage()
	{
		try
		{
		return (driver.findElement(delete_box_msg_loc).getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
		
	}
	
	public void DeleteYesClick()
	{
		driver.findElement(btn_delete_yes_loc).click();
	}
	
	public String DeleteYesMessage()
	{
		try
		{
		return (driver.findElement(delete_yes_msg_loc).getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
		
	}
	
	public void DeleteNoClick()
	{
		driver.findElement(btn_delete_no_loc).click();
	}
	
	public String DeleteNoMessage()
	{
		try
		{
		return (driver.findElement(delete_no_msg_loc).getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
		
	}
	
	public String UserStaffDeleteAccessMessage()
	{
		try
		{
		return (driver.findElement(user_staff_delete_access_msg).getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
		
	}
	
	public void BatchEditClick()
	{
		driver.findElement(btn_row_edit_icon_loc);
	}
	
	public void BatchTopCheckBoxClick()
	{
		driver.findElement(chkbox_topchkbox_loc).click();
	
	}
	
	public List chkboxlist(WebElement path)
	{
		List checkbox=driver.findElements(table_row_checkboxes_loc);
		return checkbox;
	}

}
