package PageObjectModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class ProgramPage {
	
	public WebDriver driver;
	
	String url="https:lmsphase2seleniumhackathon.com";
	By ProgramPage=By.linkText("Program");
	By HeadText=By.xpath("//div[contains(text(),'Manage Program')]");
	By FootText=By.className("foot_text");
	By CurrentPg=By.xpath("//div[@class=pagination-bottom-currentpage']/span");
	By PrevPage=By.xpath("//div[@class='pagination-bottom']//button[1]");
	By NextPage=By.xpath("//div[@class='pagination-bottom']//button[2]");
	By PrevTxtPagination=By.xpath("//div[@class='pagination-bottom-text-prev']/span");
    By Pages=By.xpath("//div[@id='dtmanageprogram_paginate']//a");
	By NxtTxtPagination=By.xpath("//div[@class='pagination-bottom-text-nxt']/span");
	By Search=By.xpath("//input[@class='search']");
	By PrgName=By.xpath("//table//thead//tbody/tr[1]");
	By PrgDescrip=By.xpath("//table//thead//tbody/tr[3]");
	By PrgStatus=By.xpath("//table//thead//tbody/tr[4]");
	By CountRow=By.xpath("//table[@id='webtable']//tbody//div//div[1]");
	By PrgNameAscendingClick=By.xpath("//table//thead//tr//th[2]/i");
	By PrgDescAscendingClick=By.xpath("//table//thead//tr//th[3]/i");
	By PrgStatusAscendingClick=By.xpath("//table//thead//tr//th[4]/i");
	By PrgNameAscending=By.xpath("//table//thead//tr//th[2]");
	By PrgDescAscending=By.xpath("//table//thead//tr//th[3]");
	By PrgStatusAscending=By.xpath("//table//thead//tr//th[4]");
	By PrgNameDescendingClick=By.xpath("//table//thead//tr//th[2]");
	By PrgDescDescendingClick=By.xpath("//table//thead//tr//th[3]");
	By PrgStatusDescendingClick=By.xpath("//table//thead//tr//th[4]");
	By NewProgramBtn=By.xpath("//span[@class='btn btn-newprg");
	By SaveBtn=By.xpath("//span[@class='button-save']");
	By ErrorMessage=By.xpath("//*[@class='invalid entry']");
	By EnterPrgName=By.id("programName");
	By EnterPrgDescription=By.id("programDescription");
	By ClickActiveStatus=By.xpath("//div//div//div[1]/p[@name='Active']");
	By ClickInactiveStatus=By.xpath("//div//div//div[2]/p[@name='Inactive']");
	By ErrMessage=By.xpath("//*[@class=alert alert-enter");
	By CancelBtn=By.xpath("//button/span[@class='btn-cancel']");
	By SearchPrgDetail=By.xpath("//table//thead//tr[2]");
	By LoginErrMsg=By.xpath("//span[@class=alert alert-login");
	By EditBtn=By.xpath("//button[@id='edit program']");
	By UpdateMsg=By.xpath("//span[@class='msg-success']");
	By StatusUpdateMsg=By.xpath("//span[@class='status-msg']");
	By DeleteButton=By.xpath("//span[@class='btn btn-remove']");
	By DelMsg=By.xpath("//div[@class='del-dialogbox']");
	By ClickYes=By.xpath("//button[@name='btn-Yes']");
	By ClickNo=By.xpath("//button[@class='btn-No']");
	By CheckBox=By.xpath("//button[@class='checkbox']/tr[2]");
	By AllCheckBoxSelected=By.xpath("//div[@class='webtable']//thead//tr//div[1]");
	By NoProgramDetails=By.xpath("//div[@class='no-value']");
	By MultipleCheckBoxes=By.className("pr-element check 4");
	By DeleteMsg=By.xpath("//span[@class='text-display']");
	By DelProgram=By.xpath("//table//thead//tr[2]");
	
	
	
	
	//By SearchProgramName="";
	
	
	



public ProgramPage(WebDriver driver) {
	this.driver=driver;
	
	}

public void GetUrl() {
	
	driver.get(url);
}


public void ClickProgramPage() {
	
	driver.findElement(ProgramPage).click();
}

public void ValidateHeaderText () {
	
	if(driver.getPageSource().contains("HeadText"))
	{
		System.out.println("Text Present");
	}
	else {
		
	}
		System.out.println("Text not Present");
	}

	public void ValidateFooterText() {
		
		String DisplayText=driver.findElement(FootText).getText();
		
		if(driver.getPageSource().contains("DisplayText"))
		{
			System.out.println("Text Present");
		}
		else {
			System.out.println("Text not Present");
		}

}

public void DisplayPaginationPageText() {
	
String Text=driver.findElement(CurrentPg).getText();
System.out.println(Text);
}


public void ClickNextButton() {
	
	driver.findElement(NextPage).click();
}
	
	public void DisplayPaginatorTextNextBtn() {
		
		String PaginatorText=driver.findElement(NxtTxtPagination).getText();
		System.out.println(PaginatorText);
	}	
	
	public void ClickEnableNextPage() {
		
		boolean EnableNextPage=driver.findElement(NextPage).isEnabled();
		if(EnableNextPage) {
			System.out.println("Element is enabled");
			
		}
		else {
			
			System.out.println("Element is not enabled");
		}
		
	}
	
	public void DisplayEntries() {
		
	String Entries=	driver.findElement(NxtTxtPagination).getText();
	System.out.println(Entries);
	}
	
	public void ClickPrevButton() {
		
		driver.findElement(PrevPage).click();
	}
	
	public void DisplayPrevText() {
		
	String PrevEntries=driver.findElement(PrevTxtPagination).getText();
	System.out.println(PrevEntries);
	}
	
	public void EnablePaginatorLastbutton() {
		
		boolean LastBtn=driver.findElement(NextPage).isEnabled();
		System.out.println(LastBtn);
		
	}
	public void PageNavigate() {
		
		
		
	}
	
		public void CheckSearch() {
			
			boolean Searchelement=driver.findElement(Search).isDisplayed();
			if(Searchelement) {
				
				System.out.println("Element is displayed");
			}
			else {
				
				System.out.println("Element is not displayed");
			}
		}
		
    public void SearchByProgramName() {
    	
    	driver.findElement(Search).sendKeys("SDET"+Keys.ENTER);
    	 
    	
    }
		
		public void DisplayProgramName() {
			
			String PgName=driver.findElement(PrgName).getText();
			System.out.println(PgName);
			
		}
		
		public void SearchByPrgDescrip() {
			
			driver.findElement(Search).sendKeys("machinelanguage"+Keys.ENTER);
			
		}
		
		public void DisplayPrgDescrip() {
			
			String PrgDescription=driver.findElement(PrgDescrip).getText();
			Assert.assertEquals(PrgDescription,true,"machinelanguage");
			System.out.println(PrgDescription);
				
			}
		
		public void SearchByPrgStatus() {
			
			driver.findElement(PrgStatus).sendKeys("Active"+Keys.ENTER);
			
		}
		public void DisplayStatus() {
			
			String Status=driver.findElement(PrgStatus).getText();
			Assert.assertEquals(Status, true,"Active");
		}
		
		
		
	
public void DisplayNumberofRows() {
	
	List<WebElement> tablerow=driver.findElements(CountRow);
	System.out.println(tablerow.size());
}
	
//Ascending functionality

public void ClickPrgNameAscending() {
	
	List<WebElement>ColPrgName= driver.findElements(PrgNameAscending);
	String[]beforesort=new String[ColPrgName.size()];
		
	for(int i=0;i<ColPrgName.size();i++){
		
		beforesort[i]=ColPrgName.get(i).getText().trim();
		System.out.println(beforesort[i]);
		System.out.println("Sorting method");
		System.out.println("----------------");
	}
	
	for(int i=0;i<ColPrgName.size();i++)
	{
		Arrays.sort(beforesort);
        String sort = beforesort[i];
		System.out.println("Sort");
		
	    System.out.println("--------");
	}
	
	
	driver.findElement(PrgNameAscendingClick).click();
	
	
	ColPrgName= driver.findElements(PrgNameAscending);
	String[]aftersort=new String[ColPrgName.size()];
	System.out.println("Sorting in Application");
	System.out.println("-----------------------");
	
	for(int i=0;i<ColPrgName.size();i++){
		
		aftersort[i]=ColPrgName.get(i).getText().trim();
		System.out.println(aftersort[i]);
	}}
	
	public void DisplayProgramNameAscending() {

		
	driver.findElement(PrgNameAscending).getText();
		
	
		Assert.assertEquals(true,true);
		System.out.println("Program Name Sorting is done Successfully in ascending order");
	}

	public void ClickPrgDescAscending() {
		
		List<WebElement>ColPrgDesc= driver.findElements(PrgDescAscending);
		String[]beforesort=new String[ColPrgDesc.size()];
			
		for(int i=0;i<ColPrgDesc.size();i++){
			
			beforesort[i]=ColPrgDesc.get(i).getText().trim();
			System.out.println(beforesort[i]);
			System.out.println("Sorting method");
			System.out.println("----------------");
		}
		
		for(int i=0;i<ColPrgDesc.size();i++)
		{
			Arrays.sort(beforesort);
	        String sort = beforesort[i];
			System.out.println("Sort");
			
		    System.out.println("--------");
		}
		
		
		driver.findElement(PrgDescAscendingClick).click();
		
		
		ColPrgDesc= driver.findElements(PrgDescAscending);
		String[]aftersort=new String[ColPrgDesc.size()];
		System.out.println("Sorting in Application");
		System.out.println("-----------------------");
		
		for(int i=0;i<ColPrgDesc.size();i++){
			
			aftersort[i]=ColPrgDesc.get(i).getText().trim();
			System.out.println(aftersort[i]);
		}}
		
		public void DisplayProgramdescAscending1() {

			
		driver.findElement(PrgDescAscending).getText();
			
		
			Assert.assertEquals(true,true);
			System.out.println("Program Description Sorting is done Successfully in ascending order");
		}

		public void ClickPrgStatusAscending() {
			
			List<WebElement>ColPrgStatus= driver.findElements(PrgStatusAscending);
			String[]beforesort=new String[ColPrgStatus.size()];
				
			for(int i=0;i<ColPrgStatus.size();i++){
				
				beforesort[i]=ColPrgStatus.get(i).getText().trim();
				System.out.println(beforesort[i]);
				System.out.println("Sorting method");
				System.out.println("----------------");
			}
			
			for(int i=0;i<ColPrgStatus.size();i++)
			{
				Arrays.sort(beforesort,Collections.reverseOrder());
		        String sort = beforesort[i];
				System.out.println("Sort");
				
			    System.out.println("--------");
			}
			
			
			driver.findElement(PrgStatusAscendingClick).click();
			
			
			ColPrgStatus= driver.findElements(PrgStatusAscending);
			String[]aftersort=new String[ColPrgStatus.size()];
			System.out.println("Sorting in Application");
			System.out.println("-----------------------");
			
			for(int i=0;i<ColPrgStatus.size();i++){
				
				aftersort[i]=ColPrgStatus.get(i).getText().trim();
				System.out.println(aftersort[i]);
			}}
			
			public void DisplayProgramStatusAscending() {

				
			driver.findElement(PrgStatusAscending).getText();
				
			
				Assert.assertEquals(true,true);
				System.out.println("Program Status Sorting is done Successfully in ascending order");
			}

			
			
//Descending Functionality			
			
			
			public void ClickPrgNameDescending() {
				
				List<WebElement>ColPrgName= driver.findElements(PrgNameDescendingClick);
				String[]beforesort=new String[ColPrgName.size()];
					
				for(int i=0;i<ColPrgName.size();i++){
					
					beforesort[i]=ColPrgName.get(i).getText().trim();
					System.out.println(beforesort[i]);
					System.out.println("Sorting method");
					System.out.println("----------------");
				}
				
				for(int i=0;i<ColPrgName.size();i++)
				{
					Arrays.sort(beforesort,Collections.reverseOrder());
			        String sort = beforesort[i];
					System.out.println("Sort");
					
				    System.out.println("--------");
				}
				
				
				driver.findElement(PrgNameDescendingClick).click();
				
				
				ColPrgName= driver.findElements(PrgNameDescendingClick);
				String[]aftersort=new String[ColPrgName.size()];
				System.out.println("Sorting in Application");
				System.out.println("-----------------------");
				
				for(int i=0;i<ColPrgName.size();i++){
					
					aftersort[i]=ColPrgName.get(i).getText().trim();
					System.out.println(aftersort[i]);
				}}
				
				public void DisplayProgramDescending() {

					
				driver.findElement(PrgNameDescendingClick).getText();
					
				
					Assert.assertEquals(true,true);
					System.out.println("Program Description Sorting is done Successfully in descending order");
				}
				
				public void ClickProgramDescDescending() {

				List<WebElement>ColPrgDesc= driver.findElements(PrgDescDescendingClick);
				String[]beforesort=new String[ColPrgDesc.size()];
					
				for(int i=0;i<ColPrgDesc.size();i++){
					
					beforesort[i]=ColPrgDesc.get(i).getText().trim();
					System.out.println(beforesort[i]);
					System.out.println("Sorting method");
					System.out.println("----------------");
				}
				
				for(int i=0;i<ColPrgDesc.size();i++)
				{
					Arrays.sort(beforesort,Collections.reverseOrder());
			        String sort = beforesort[i];
					System.out.println("Sort");
					
				    System.out.println("--------");
				}
				
				
				driver.findElement(PrgDescDescendingClick).click();
				
				
				ColPrgDesc= driver.findElements(PrgDescDescendingClick);
				String[]aftersort=new String[ColPrgDesc.size()];
				System.out.println("Sorting in Application");
				System.out.println("-----------------------");
				
				for(int i=0;i<ColPrgDesc.size();i++){
					
					aftersort[i]=ColPrgDesc.get(i).getText().trim();
					System.out.println(aftersort[i]);
				}}
				
				public void DisplayProgramdesc() {

					
				driver.findElement(PrgDescDescendingClick).getText();
					
				
					Assert.assertEquals(true,true);
					System.out.println("Program Description Sorting is done Successfully in descending order");
				

}
				public void ClickProgramStatusDescending() {
				
				List<WebElement>ColPrgStatus= driver.findElements(PrgStatusDescendingClick);
				String[]beforesort=new String[ColPrgStatus.size()];
					
				for(int i=0;i<ColPrgStatus.size();i++){
					
					beforesort[i]=ColPrgStatus.get(i).getText().trim();
					System.out.println(beforesort[i]);
					System.out.println("Sorting method");
					System.out.println("----------------");
				}
				
				for(int i=0;i<ColPrgStatus.size();i++)
				{
					Arrays.sort(beforesort,Collections.reverseOrder());
			        String sort = beforesort[i];
					System.out.println("Sort");
					
				    System.out.println("--------");
				}
				
				
				driver.findElement(PrgNameDescendingClick).click();
				
				
				ColPrgStatus= driver.findElements(PrgStatusDescendingClick);
				String[]aftersort=new String[ColPrgStatus.size()];
				System.out.println("Sorting in Application");
				System.out.println("-----------------------");
				
				for(int i=0;i<ColPrgStatus.size();i++){
					
					aftersort[i]=ColPrgStatus.get(i).getText().trim();
					System.out.println(aftersort[i]);
				}}
				
				public void DisplayProgramStatusDescending() {

					
				driver.findElement(PrgStatusDescendingClick).getText();
					
				
					Assert.assertEquals(true,true);
					System.out.println("Program Status Sorting is done Successfully in descending order");
				}
		
				
			public void ClickNewProgramBtn() {
				
				driver.findElement(NewProgramBtn).click();
			}

           public void ValidateHeader() {
        	   
        	String ActualTitle=driver.getTitle();
       		String ExpectedTitle="Program Details";
       		Assert.assertEquals(ActualTitle,ExpectedTitle );
       		System.out.println(ActualTitle);
       		}
           
           public void ClickSaveBtn() {
        	   
        	   driver.findElement(SaveBtn);
        	   
        	   
           }

           public void DisplayErrMessage() {
           
           driver.findElement(ErrorMessage).getText();
           
}	
           
           public void EnteredAllFields() {
        	   
        	   driver.findElement(EnterPrgName).sendKeys("Sdet2022");
        	   driver.findElement(EnterPrgDescription).sendKeys("Python");
        	   driver.findElement(ClickActiveStatus).click();
        	   driver.findElement(SaveBtn).click();
           }
	    
           public void EnterDescriptionValue() {
        	   
        	   driver.findElement(EnterPrgDescription).sendKeys("Java");
           }
           
           public void ErrForEnterDesc() {
        	   
        	String Err=driver.findElement(ErrorMessage).getText();
        	System.out.println(Err);
           }
         
           public void EnterNameValue() {
        	   
        	   driver.findElement(EnterPrgName).sendKeys("Java2022");
           }
           
           public void ErrForEnterName() {
        	   
        	   String Error=driver.findElement(ErrMessage).getText();
        	   System.out.println(Error);
           }
           
           public void ClickStatus() {
        	   
        	   driver.findElement(ClickActiveStatus).click();
           }
           
           public void ErrOnClick() {
        	   
        String Erro=driver.findElement(ErrorMessage).getText();
        System.out.println(Erro);
           }
           
           public void ClickCancelBtn() {
        	   
        	   driver.findElement(CancelBtn).click();
           }
           
           public void ValidateProgramDetailPageClosed() {
        	   
        	   String ActualTitle=driver.getTitle();
        	   String ExpectedTitle="Manage Program";
        	   
        	   Assert.assertEquals(ExpectedTitle, ActualTitle);
        	   System.out.println(ActualTitle);
             }
           
           public void SearchNewPrgName() {
        	   
        	   driver.findElement(Search).sendKeys("SDET2022" +Keys.ENTER);
        	   
           }

           public void DisplayNewPrgDetail() {
        	   
        String DisplayPrgDetail=driver.findElement(SearchPrgDetail).getText();
        System.out.println(DisplayPrgDetail);
           }
      public void ErrorLoginForUserStaff() {
    	  
    String ErrorInLogin=driver.findElement(LoginErrMsg).getText();
    	  System.out.println(ErrorInLogin);
      }

public void ClickEditBtn() {
	
	driver.findElement(EditBtn).click();
}
      public void EnterUpdateName() {
    	  
    	  driver.findElement(EnterPrgName).clear();
    	  driver.findElement(EnterPrgName).sendKeys("SQL");
      }
      
      
      public void EnterUpdateDescription() {
    	  
    	  driver.findElement(EnterPrgDescription).clear();
    	  driver.findElement(EnterPrgName).sendKeys("Selenium");
      }

     public void DisplaySuccessMessageDesc() {
    	 
    String Message=driver.findElement(UpdateMsg).getText();
    System.out.println(Message);
    
     }
     
     public void ClickUpdateStatus() {
    	 
    	 driver.findElement(ClickActiveStatus).clear();
    	 driver.findElement(ClickInactiveStatus).click();
     }
     
    public void DisplayStatusMsg() {
    	
    String Msg=	driver.findElement(StatusUpdateMsg).getText();
    System.out.println(Msg);
    }

    public void ClickDelBtn() {
    	
    	driver.findElement(DeleteButton).click();
    }

    public void DisplayDeleteBox() {
    	driver.findElement(DelMsg).getText();
    }
    public void ClickYesButton() {
    	
    	driver.findElement(ClickYes).click();
    }

    public void ClickNoButton() {
    	
    	driver.findElement(ClickNo).click();
    }

    public void ClickCheckBox() {
    	
    	driver.findElement(CheckBox).click();
    }

public void EnableDeletebtn() {
	
	boolean EnableElement=driver.findElement(DeleteButton).isEnabled();
	if(EnableElement) {
		
		System.out.println("Element is Enabled");
	}
	else {
		
		System.out.println("Element is not Enabled");
	}
}


public void NoProgramDetails() {
	
	driver.findElement(NoProgramDetails).click();
}

public void DisabledDel() {
	boolean EnableDel=driver.findElement(NoProgramDetails).isEnabled();
	if(EnableDel) {
		System.out.println("Element is Enabled");
		
		}
	else
	{
		System.out.println("Element not Enabled");
	}}

public void ClickMultipleCheckBoxes() {
	
	List<WebElement> checkboxes=driver.findElements(MultipleCheckBoxes);
	
	for(int i=0;i<3;i++)
	{
		if (checkboxes.get(i).isEnabled())
		{
			System.out.println("Checkboxes are enabled");
			checkboxes.get(i).click();
		}
	}
}

public void SelectCancelDelete() {
	driver.findElement(DelProgram).getText();
}	

public void ClickOnDeleteButtonEnabled() {
		
		boolean EnableDelete=driver.findElement(DeleteButton).isEnabled();
		
		if(EnableDelete) {
			System.out.println("Element is Enabled");
			
			}
		else
		{
			System.out.println("Element not Enabled");
		}
	}
		public void NavigatePage() {
			
			driver.navigate().to(url);
		
		
	}

		public void DisplayText() {
			
String DisplayText=driver.findElement(DeleteMsg).getText();
			System.out.println(DisplayText);
		}

}





