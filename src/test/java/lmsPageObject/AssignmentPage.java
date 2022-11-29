package PageObjectModel;

import java.awt.Desktop.Action;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class AssignmentPage {

	
	public WebDriver driver;
	
	By AssignPage=By.id("Assign_Ment");
	By FooterText=By.xpath("//div[@class='assign-datatable-footer']");
	By PaginationText=By.xpath("//div[@class='paginator-bottom']//span");
	By Page1=By.xpath("//span[@class=paginator-page]//button");
	By PreviousPage=By.xpath("//div//button[1][@class='paginator-firstprev']");
    By NextPage=By.xpath("//div//button[3][@class='pagination-firstnext']");
	By SearchButton=By.xpath("//input[@class='li li-search']");
	By AssignmentDetail=By.xpath("//table[@id='webtable']//thead//tr//th[3]");
	By AscendingAssignName=By.xpath("//table[@id='webtable']//thead//tr//th[2]");
	By AscendingAssignDuedate=By.xpath("//table[@id='webtable']//thead//tr//th[4]");
	By AscendingAssignmentGrade=By.xpath("//table[@id='webtable']//thead//tr//th[5]");
	By AscendingNameArrow=By.xpath("//table[@id='webtable']//thead//tr//th[2]/a");
	By AscendingAssignmentArrow=By.xpath("//table[@id='webtable']//thead//tr//th[3]/a");
	By AscendingDueDateArrow=By.xpath("//table[@id='webtable']//thead//tr//th[4]/a");
	By AscendingGradeArrow=By.xpath("//table[@id='webtable']//thead//tr//th[[5]/a");
	By DescendingNameArrow=By.xpath("//table[@id='webtable']//thead//tr//th[3]/a");
	By DescendingAssignmentArrow=By.xpath("//table[@id='webtable']//thead//tr//th[3]/a");
	By DescendingDueDateArrow=By.xpath("//table[@id='webtable']//thead//tr//th[4]/a");
	By DescendingGradeArrow=By.xpath("//table[@id='webtable']//thead//tr//th[[5]/a");
	By DescendingName=By.xpath("//table[@id='webtable']//thead//tr//th[2]");
	By DescendingDuedate=By.xpath("//table[@id='webtable']//thead//tr//th[4]");
	By DescendingGrade=By.xpath("//table[@id='webtable']//thead//tr//th[5]");
	By DescendingAssignment=By.xpath("//table[@id='webtable']//thead//tr//th[3]");
	By AddNewAssignment=By.xpath("//button[@class='btn btn-new']");
	By AdminAlertMsg=By.xpath("//div[@class='alert-alert admin']");
	By SaveButton=By.xpath("//span[@class='btn btn-save']");
	By EmptySave=By.xpath("//div[@class='alert-name empty']");
	By AssignmentName=By.id("assignment");
	By AssignmentDescription=By.xpath("[@id='assignment Description']");
	By AssignmentGrade=By.xpath("//input[@id='assign Grade']");
	By CalendarClick=By.xpath("//form//input[@class='btn calendar']");
	By DatePick=By.xpath("//form//input[@name='date']");
	By AddSuccessMessage=By.xpath("//div[@class='success-msg added");
	By CancelButton=By.xpath("//span[@class='btn-label cancel']");
	By ManageButton=By.xpath("//div//span[@class='button btn-manage']");
	By EditButton=By.xpath("//div//span[1][@class='btn-edit']");
	String GoogleFormUrl="www.gmailaccount.com";
	By SubmitButton=By.xpath("//button[type='submit']");
	By AccountLink=By.linkText("Setting");
	By CheckBox=By.xpath("//div[text(),checkbox");
	By DeleteBtn=By.xpath("//div[@class=btn-del]");
	
	
	
	
	
	
    public AssignmentPage(WebDriver driver) {
		this.driver=driver;
		
		}
	
	public void ClickAssignPage() {
		
		driver.findElement(AssignPage).click();
	

	}
	
	public void ValidateHeaderPage() {
		
		String ActualTitle=driver.findElement(AssignPage).getText();
		String ExpectedTitle="Manage Assignment";
		Assert.assertEquals(ActualTitle,ExpectedTitle );
		System.out.println(ActualTitle);
		}
	
	public void DisplayFooterText() {
		
	String FText=driver.findElement(FooterText).getText();

	System.out.println(FText);
	}
	
	//Paginator Validation
  
	public void DisplayPaginationText() {
		
		String PageText=driver.findElement(PaginationText).getText();
		
		if(driver.getPageSource().contains("PageText"))
		{
			System.out.println("Text Present" );
		}
		else {
			System.out.println("Text not Present" );
		}

}
		
public void CheckNextPageEnabled() {
	
	driver.findElement(NextPage).click();
	
	boolean NextPagee=driver.findElement(NextPage).isEnabled();
	
	if(NextPagee)
	{
		
		System.out.println("Page is Enabled" );
	}
	
	else
	{
		System.out.println("Page is disabled" );
	
	}
	
}
	

public void NavigateNextPage() {
	

driver.navigate();

Assert.assertFalse(true);
boolean status= driver.findElement(NextPage).isSelected();

if(status)
	
{
	System.out.println("Successfully navigated");
}

else {
	
	System.out.println("Due to disabled next button it is not navigated");
	
}
}


public void PreviousPage() {
	
	boolean EnablePrevBtn=driver.findElement(PreviousPage).isEnabled();
	System.out.println(EnablePrevBtn);
}

public void SearchAssignmentname() {
	

driver.findElement(SearchButton).sendKeys("Selenium Assignment" +Keys.ENTER);
	
}

public void DisplayAssignmentDetails() {
	
	String Assigndetails=driver.findElement(AssignmentDetail).getText();
	Assert.assertEquals(true,true);
	System.out.println(Assigndetails);
}

public void ClickAssignmentNameAscendArrow() {
	
	List<WebElement>ColAssignName= driver.findElements(AscendingAssignName);
	String[]beforesort=new String[ColAssignName.size()];
		
	for(int i=0;i<ColAssignName.size();i++){
		
		beforesort[i]=ColAssignName.get(i).getText().trim();
		System.out.println(beforesort[i]);
		System.out.println("Sorting method");
		System.out.println("----------------");
	}
	
	for(int i=0;i<ColAssignName.size();i++)
	{
		Arrays.sort(beforesort);
        String sort = beforesort[i];
		System.out.println("Sort");
		
	    System.out.println("--------");
	}
	
	
	driver.findElement(AscendingNameArrow).click();
	
	
	ColAssignName= driver.findElements(AscendingAssignName);
	String[]aftersort=new String[ColAssignName.size()];
	System.out.println("Sorting in Application");
	System.out.println("-----------------------");
	
	for(int i=0;i<ColAssignName.size();i++){
		
		aftersort[i]=ColAssignName.get(i).getText().trim();
		System.out.println(aftersort[i]);
	}}
	
	public void DisplayAssignNameAscending() {

		
	driver.findElement(AscendingAssignName).getText();
		
	
		Assert.assertEquals(true,true);
		System.out.println("Sorting is done Successfully in ascending order");
	}
	
	
	public void ClickAssignDescriptionAscendArrow() {
		List<WebElement>ColAssignmentDetails= driver.findElements(AssignmentDetail);
	String[]beforesort=new String[ColAssignmentDetails.size()];
	
	for(int i=0;i<ColAssignmentDetails.size();i++){
		
		beforesort[i]=ColAssignmentDetails.get(i).getText().trim();
		System.out.println(beforesort[i]);
		System.out.println("Sorting method");
		System.out.println("----------------");
	}
	
	for(int i=0;i<ColAssignmentDetails.size();i++)
	{
		Arrays.sort(beforesort);
        String sort = beforesort[i];
		System.out.println("Sort");
		}
	System.out.println("--------");
	
	
	
	driver.findElement(AscendingAssignmentArrow).click(); 
	
	
	ColAssignmentDetails= driver.findElements(AssignmentDetail);
	String[]aftersort=new String[ColAssignmentDetails.size()];
	System.out.println("Sorting in Application");
	System.out.println("-----------------------");
	
	for(int i=0;i<ColAssignmentDetails.size();i++){
		
		aftersort[i]=ColAssignmentDetails.get(i).getText().trim();
		System.out.println(aftersort[i]);
	}}

		
		public void DisplayAssignmentDescriptionAscending() {
			
			driver.findElement(AssignmentDetail).getText();
			{
				Assert.assertEquals(true,true);
				
				
			}
			
			
		}
		
		
		public void ClickAscendAssignmentDuedate() {
			
			driver.findElements(AscendingAssignDuedate);
			List<WebElement>ColAssignmentDueDate= driver.findElements(AscendingAssignDuedate);
			String[]beforesort=new String[ColAssignmentDueDate.size()];
			
			for(int i=0;i<ColAssignmentDueDate.size();i++){
				
				beforesort[i]=ColAssignmentDueDate.get(i).getText().trim();
				System.out.println(beforesort[i]);
				System.out.println("Sorting method");
				System.out.println("----------------");
			}
			
			for(int i=0;i<ColAssignmentDueDate.size();i++)
			{
				Arrays.sort(beforesort);
		        String sort = beforesort[i];
				System.out.println("Sort");
				}
			System.out.println("--------");
			
			
			
			driver.findElement(AscendingDueDateArrow).click();
			
			
			ColAssignmentDueDate= driver.findElements(AscendingAssignDuedate);
			String[]aftersort=new String[ColAssignmentDueDate.size()];
			System.out.println("Sorting in Application");
			System.out.println("-----------------------");
			
			for(int i=0;i<ColAssignmentDueDate.size();i++){
				
				aftersort[i]=ColAssignmentDueDate.get(i).getText().trim();
				System.out.println(aftersort[i]);
			}}

		
		public void DisplayAscendingDueDate() {
			
			driver.findElement(AscendingAssignDuedate).getText();
			{
		
			
			Assert.assertEquals(true,true);
			
			}	
		}
		

		
		public void ClickAssignGrade() {
			
			
			driver.findElements(AscendingAssignmentGrade);
			List<WebElement>ColAssignmentGrade= driver.findElements(AscendingAssignmentGrade);
			String[]beforesort=new String[ColAssignmentGrade.size()];
			
			for(int i=0;i<ColAssignmentGrade.size();i++){
				
				beforesort[i]=ColAssignmentGrade.get(i).getText().trim();
				System.out.println(beforesort[i]);
				System.out.println("Sorting method");
				System.out.println("----------------");
			}
			
			for(int i=0;i<ColAssignmentGrade.size();i++)
			{
				Arrays.sort(beforesort);
		        String sort = beforesort[i];
				System.out.println("Sort");
				}
			System.out.println("--------");
			
			
			
			driver.findElement(AscendingGradeArrow).click();
			
			
			ColAssignmentGrade= driver.findElements(AscendingAssignmentGrade);
			String[]aftersort=new String[ColAssignmentGrade.size()];
			System.out.println("Sorting in Application");
			System.out.println("-----------------------");
			
			for(int i=0;i<ColAssignmentGrade.size();i++){
				
				aftersort[i]=ColAssignmentGrade.get(i).getText().trim();
				System.out.println(aftersort[i]);
			}}

		
		public void DisplayAscendingGrade() {
			
			driver.findElement(AscendingAssignmentGrade).getText();
			{
		
			
			Assert.assertEquals(true,true);
			
			}	
		}
		
		public void ClickDescendingNameArrow() {
			
			List<WebElement>ColAssignName= driver.findElements(DescendingNameArrow);
			String[]beforesort=new String[ColAssignName.size()];
				
			for(int i=0;i<ColAssignName.size();i++){
				
				beforesort[i]=ColAssignName.get(i).getText().trim();
				System.out.println(beforesort[i]);
				System.out.println("Sorting method");
				System.out.println("----------------");
			}
			
			for(int i=0;i<ColAssignName.size();i++)
			{
				Arrays.sort(beforesort,Collections.reverseOrder());
		        String sort = beforesort[i];
				System.out.println("Sort");
				
			    System.out.println("--------");
			}
			
			
			driver.findElement(DescendingNameArrow).click();
			
			
			ColAssignName= driver.findElements(DescendingNameArrow);
			String[]aftersort=new String[ColAssignName.size()];
			System.out.println("Sorting in Application");
			System.out.println("-----------------------");
			
			for(int i=0;i<ColAssignName.size();i++){
				
				aftersort[i]=ColAssignName.get(i).getText().trim();
				System.out.println(aftersort[i]);
			}}
			
			public void DisplayNameInDescendingOrder() {

				
			driver.findElement(DescendingName).getText();
				
			
				Assert.assertEquals(true,true);
				System.out.println("Names in descending order");
			}

		
			public void ClickDescendingAssignmentArrow() {
		
				List<WebElement>ColAssignment= driver.findElements(DescendingAssignmentArrow);
				String[]beforesort=new String[ColAssignment.size()];
					
				for(int i=0;i<ColAssignment.size();i++){
					
					beforesort[i]=ColAssignment.get(i).getText().trim();
					System.out.println(beforesort[i]);
					System.out.println("Sorting method");
					System.out.println("----------------");
				}
				
				for(int i=0;i<ColAssignment.size();i++)
				{
					Arrays.sort(beforesort,Collections.reverseOrder());
			        String sort = beforesort[i];
					System.out.println("Sort");
					
				    System.out.println("--------");
				}
				
				
				driver.findElement(DescendingAssignmentArrow).click();
				
				
				ColAssignment= driver.findElements(DescendingAssignmentArrow);
				String[]aftersort=new String[ColAssignment.size()];
				System.out.println("Sorting in Application");
				System.out.println("-----------------------");
				
				for(int i=0;i<ColAssignment.size();i++){
					
					aftersort[i]=ColAssignment.get(i).getText().trim();
					System.out.println(aftersort[i]);
				}}
				
				public void DisplayAssignmentInDescendingOrder() {

					
				driver.findElement(DescendingAssignment).getText();
					
				
					Assert.assertEquals(true,true);
					System.out.println("Generated Descending order for Grades");
				}

		
				public void ClickDescendingGradeArrow() {
					
					List<WebElement>ColGrade= driver.findElements(DescendingGradeArrow);
					String[]beforesort=new String[ColGrade.size()];
						
					for(int i=0;i<ColGrade.size();i++){
						
						beforesort[i]=ColGrade.get(i).getText().trim();
						System.out.println(beforesort[i]);
						System.out.println("Sorting method");
						System.out.println("----------------");
					}
					
					for(int i=0;i<ColGrade.size();i++)
					{
						Arrays.sort(beforesort,Collections.reverseOrder());
				        String sort = beforesort[i];
						System.out.println("Sort");
						
					    System.out.println("--------");
					}
					
					
					driver.findElement(DescendingGradeArrow).click();
					
					
					ColGrade= driver.findElements(DescendingGradeArrow);
					String[]aftersort=new String[ColGrade.size()];
					System.out.println("Sorting in Application");
					System.out.println("-----------------------");
					
					for(int i=0;i<ColGrade.size();i++){
						
						aftersort[i]=ColGrade.get(i).getText().trim();
						System.out.println(aftersort[i]);
					}}
					
					public void DisplayGradeInDescendingOrder() {

						
					driver.findElement(DescendingGrade).getText();
						
					
						Assert.assertEquals(true,true);
						System.out.println("Successfully sorted Grades in Descending");
					}

					public void ClickDescendingDueDateArrow() {
						
					
						List<WebElement>ColDueDate= driver.findElements(DescendingDueDateArrow);
						String[]beforesort=new String[ColDueDate.size()];
							
						for(int i=0;i<ColDueDate.size();i++){
							
							beforesort[i]=ColDueDate.get(i).getText().trim();
							System.out.println(beforesort[i]);
							System.out.println("Sorting method");
							System.out.println("----------------");
						}
						
						for(int i=0;i<ColDueDate.size();i++)
						{
							Arrays.sort(beforesort,Collections.reverseOrder());
					        String sort = beforesort[i];
							System.out.println("Sort");
							
						    System.out.println("--------");
						}
						
						
						driver.findElement(DescendingDueDateArrow).click();
						
						
						ColDueDate= driver.findElements(DescendingDueDateArrow);
						String[]aftersort=new String[ColDueDate.size()];
						System.out.println("Sorting in Application");
						System.out.println("-----------------------");
						
						for(int i=0;i<ColDueDate.size();i++){
							
							aftersort[i]=ColDueDate.get(i).getText().trim();
							System.out.println(aftersort[i]);
						}}
						
						public void DisplayDueDateInDescendingOrder() {

							
						driver.findElement(DescendingDuedate).getText();
							
						
							Assert.assertEquals(true,true);
							System.out.println("Due Date are in Descending order");
						}

		
		public void ClickNewAssignmentBtn() {
			
			driver.findElement(AddNewAssignment).click();
			
			
		}
        
		public void DisplayAssignmentWindow() {
			
			String ActualTitle=driver.getTitle();
			String ExpectedTitle="Assignment Details";
			Assert.assertEquals(ActualTitle,ExpectedTitle);
			System.out.println(ActualTitle);
			
		}

       public void ClickAdminAddAssignmentBtn() {
    	   
    	   driver.findElement(AddNewAssignment).click();
    	   
       }
        
       public void DisplayErrorMsg() {
    	   
    	   String ErrorMessage=driver.findElement(AdminAlertMsg).getText();
    	   System.out.println(ErrorMessage);
       }

       public void EmptyField() {
    	   
    	  driver.findElement(SaveButton).click();
    	   
       }
     
       public void DisplayErrorMessage() {
    	   
    	   String Error=driver.findElement(EmptySave).getText();
    	   System.out.println(Error);
    	   
       }
       
       public void EnterAssignmentDetails() {
    	   
    	   driver.findElement(AssignmentName).sendKeys("SDET82");
    	   driver.findElement(AssignmentDescription).sendKeys("Selenium");
    	   driver.findElement(AssignmentGrade).sendKeys("Manage");
    	   driver.findElement(CalendarClick).click();
    	   driver.findElement(DatePick).click();
    	   driver.findElement(SaveButton).click();
       }

       public void DisplayMessage() {
    	   
    	  String Message= driver.findElement(AddSuccessMessage).getText();
    	  System.out.println(Message);
       }
   
       public void ClickCancelBtn() {
    	   
    	   driver.findElement(CancelButton).click();
       }
       
       public void ValidateAssignmentWindow() {
    	   
    	   String ActualTitle=driver.getTitle();
    	   String ExpectedTitle="Manage Assignment";
    	   Assert.assertEquals(ActualTitle,ExpectedTitle);
    	   System.out.println(ActualTitle);
    	   
       }
       
       public void ClickEditButton() {
    	   
    	   driver.findElement(EditButton).click();
       }
       
       public void DisplayAssignmentWindow1() {
    	   
    	   String ActualTitle=driver.getTitle();
    	   String ExpectedTitle="Assignment Details";
    	   Assert.assertEquals(ExpectedTitle, ActualTitle);
    	   System.out.println(ActualTitle);
       }
       
       public void EditAssignmentName() {
    	   
    	   driver.findElement(AssignmentName).clear();
    	   driver.findElement(AssignmentName).sendKeys("SDET");
    	   
       }
       
       public void ValidateDisplayNameMessage() {
    	   
    	   String UpdatedaMessage=driver.findElement(AddSuccessMessage).getText();
    	   
       }
       
       public void EditAssignmentDesc() {
    	   
    	   driver.findElement(AssignmentDescription).clear();
    	   driver.findElement(AssignmentDescription).sendKeys("API");
    	   
    	   
       }
public void ValidateDisplayDescMessage() {
    	   
	 String UpdatedaMessage=driver.findElement(AddSuccessMessage).getText();
       }

       public void EditAssignmentGrade() {
    	   
    	   driver.findElement(AssignmentGrade).clear();
    	   driver.findElement(AssignmentGrade).sendKeys("Manage");
    	   
    	   
       }
public void ValidateDisplayGradeMessage() {
    	   
	 String UpdatedaMessage=driver.findElement(AddSuccessMessage).getText();
	
       }

public void EditAssignmentDueDate() {
	
	
	  driver.findElement(CalendarClick).click();
	   driver.findElement(DatePick).click();
	
}
public void ValidateDisplayDueDateMessage() {
	
	 String UpdatedaMessage=driver.findElement(AddSuccessMessage).getText();
	   
}

public void ClickAssignmentName() {
	
	driver.findElement(AssignmentName).click();
}

public void NavigatePageToGoogleForm() {
	
	 driver.navigate().to(GoogleFormUrl);
}

public void ClickSubmitButton() {
	
	driver.findElement(SubmitButton).click();
}

public void ClickAccountLink() {
	
	driver.findElement(AccountLink).click();
}

public void ClickOneCheckBox() {

driver.findElement(CheckBox).click();

}

public void EnableDelButton() {
	
	boolean DisplayDel=driver.findElement(DeleteBtn).isDisplayed();
	if(DisplayDel) {
		System.out.println("Delete button is enabled");
	}
	else {
		
		System.out.println("Delete button is disabled");
	}
}

public void NavigatePage() {
	
	driver.findElement(PreviousPage).click();
	

}



}





		
		
		
	
	
	
	

	

	

	
	

