package common;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.StaleElementReferenceException;
import org.junit.Assert;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.filefilter.WildcardFileFilter;
import org.apache.commons.io.comparator.LastModifiedFileComparator;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.apache.commons.io.filefilter.WildcardFileFilter;
import org.apache.commons.io.comparator.LastModifiedFileComparator;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.openqa.selenium.support.ui.Select;


public class customUtil {
	public static WebDriver browser;
	static int Scenarioscount;
	private static JavascriptExecutor driver;

public void someMethod() {
    driver = (JavascriptExecutor) browser; // ✅ reusing class-level variable
}


    // ✅ Fix: static variables used in verifySelectedPercentageIncremental and resetPercentageTracking
    private static int totalSelectedControls = 0;
    private static int scrapperSelectionIndex = 0;

	public static void clearTextfield(String XPath) {
	    int Scenarioscount;

		try {
			//param=CommonUtil.GetData(param);
			browser=WebBrowser.getBrowser();
			
			WebElement CompanyName=browser.findElement(By.xpath(YMLUtil.getYMLObjectRepositoryData(XPath)));
			Actions act=new Actions(browser);
			act.moveToElement(CompanyName).doubleClick().build().perform();
			CompanyName.sendKeys(Keys.chord(Keys.CONTROL,"A"));
			CompanyName.sendKeys(Keys.chord(Keys.DELETE));
		}catch(Exception e) {
			System.out.println("error: "+e.getMessage());
		}
	}	 

	public static void disabledElement(String XPath) {
		
		try {
			browser=WebBrowser.getBrowser();
			WebElement Elements=browser.findElement(By.xpath(YMLUtil.getYMLObjectRepositoryData(XPath)));
			  if(Elements.isEnabled()) {
				  System.out.print("Web elements is enabled "+Elements.getText());
				  ExtentCucumberAdapter.addTestStepLog(Elements.getText()+"Web elements is enabled");
			  }
			  else {
				  System.out.print("Web elements is disabled "+Elements.getText()); 
				  ExtentCucumberAdapter.addTestStepLog(Elements.getText()+"Web elements is disabled");
			  }
		}catch(Exception e) {
			System.out.println("error: "+e.getMessage());
		}
		
	}
	
	//click the element if enabled
	public static void clickIfElementIsEnabled(String XPath) {
		
		try {
			browser=WebBrowser.getBrowser();
			WebElement Element=browser.findElement(By.xpath(YMLUtil.getYMLObjectRepositoryData(XPath)));
			  if(Element.isEnabled()) {
			      Element.click();
				  System.out.print("Web elements is enabled "+Element.getText());
				  ExtentCucumberAdapter.addTestStepLog(Element.getText()+"Web elements is enabled and Clicked");
			  }
			  else {
				  System.out.print("Web elements is disabled "+Element.getText()); 
				  ExtentCucumberAdapter.addTestStepLog(Element.getText()+"Web elements is disabled");
			  }
		}catch(Exception e) {
			System.out.println("error: "+e.getMessage());
		}
		
	}
	
	public static void clearAndEnterHomepage(String XPath,String param) {
    	 param =CommonUtil.getData(param);
    	 try {
    		 browser=WebBrowser.getBrowser();
    		 for (int i = 0; i < 5; i++) {
					((JavascriptExecutor) browser).executeScript("window.scrollTo(0, 800)");
			  }
			  ((JavascriptExecutor) browser).executeScript("window.scrollTo(0, 1500)");	
					
			  Thread.sleep(5000);	
			  WebElement homepage=browser.findElement(By.xpath(YMLUtil.getYMLObjectRepositoryData(XPath)));
			 // JavascriptExecutor js = (JavascriptExecutor) browser;
			  Actions act=new Actions(browser);
			  homepage.click();
				act.moveToElement(homepage).doubleClick().build().perform();
				homepage.sendKeys(Keys.chord(Keys.CONTROL,"A"));
				homepage.sendKeys(Keys.chord(Keys.DELETE));
				WebElement homepage1=browser.findElement(By.xpath(YMLUtil.getYMLObjectRepositoryData(XPath)));
				homepage1.sendKeys("param");    		 
            }
    	 catch(Exception e) {
 			System.out.println("error: "+e.getMessage());
    	 }
    }
    
    public static void searchText(String XPath) {

		try {
			//param=CommonUtil.GetData(param);
			browser=WebBrowser.getBrowser();
			
			WebElement CompanyName=browser.findElement(By.xpath(YMLUtil.getYMLObjectRepositoryData(XPath)));
			Actions act=new Actions(browser);
			act.moveToElement(CompanyName).doubleClick().build().perform();
			CompanyName.sendKeys(Keys.chord(Keys.CONTROL,"A"));
			CompanyName.sendKeys(Keys.chord(Keys.CONTROL,"F"));
			CompanyName.sendKeys(Keys.chord(Keys.DELETE));
		}catch(Exception e) {
			System.out.println("error: "+e.getMessage());
		}
	}
	
    //Signin to the application
    public static void loggingInToalgoQA(String XPath) {
    	 try {
    		 browser=WebBrowser.getBrowser();
    		 WebElement signInLink = browser.findElement(By.xpath(YMLUtil.getYMLObjectRepositoryData(XPath)));
    		 signInLink.click();
    		     		 
    	     WebElement signInToAlgoshack = browser.findElement(By.xpath(YMLUtil.getYMLObjectRepositoryData(XPath)));
    	     String actualContent = signInToAlgoshack.getText();
    	     String expectedContent = "Login to ";
    	     if (actualContent.equals(expectedContent)) {
    	    	 System.out.println("Content verification successful. Actual content: " + actualContent);
    	     } else 
    	     {
    	    	 System.out.println("Content verification failed. Actual content: " + actualContent);
    	     }   		 
    		 
    		 WebElement emailId = browser.findElement(By.xpath(YMLUtil.getYMLObjectRepositoryData(XPath)));
    		 emailId.sendKeys("gayatri@algoshack.com");
    		 WebElement password = browser.findElement(By.xpath(YMLUtil.getYMLObjectRepositoryData(XPath)));
    		 password.sendKeys("Gayatri@12345");
    		 WebElement signInBtn = browser.findElement(By.xpath(YMLUtil.getYMLObjectRepositoryData(XPath)));
    		 signInBtn.click();
			 
    		 WebElement signedinsuccessfully = browser.findElement(By.xpath(YMLUtil.getYMLObjectRepositoryData(XPath)));
    	     String actualContent1 = signInToAlgoshack.getText();
    	     String expectedContent1 = "User signed in successfully";
    	     if (actualContent1.equals(expectedContent1)) {
    	    	 System.out.println("Content verification successful. Actual content: " + actualContent1);
    	     } else 
    	     {
    	    	 System.out.println("Content verification failed. Actual content: " + actualContent1);
    	     } 
    		 
    	     WebElement signedinsuccessfullypopupclose = browser.findElement(By.xpath(YMLUtil.getYMLObjectRepositoryData(XPath)));
    	     signedinsuccessfullypopupclose.click();
    		    		 
            }
    	 catch(Exception e) {
 			System.out.println("error: "+e.getMessage());
    	 }
    }

    public static void contentVerificationIfVisible(String param, String XPath) {
    	try {
    	      browser=WebBrowser.getBrowser();
    		  param=CommonUtil.getData(param);
    		  WebElement passwordErrorMessage = browser.findElement(By.xpath(YMLUtil.getYMLObjectRepositoryData(XPath)));
     	      String actualContent = passwordErrorMessage.getText();
    		  if (actualContent.equals(param)) {
     	    	 ExtentCucumberAdapter.addTestStepLog("Content verification successful. Actual content: " + actualContent);
     	     } else 
     	     {
     	    	 ExtentCucumberAdapter.addTestStepLog("Content verification failed. Actual content: " + actualContent);
     	     }  
    	}
    	catch(Exception e){
    		System.out.println("error: "+e.getMessage());
    	}
    }
    
    
    public static void checkingCountofCheckBoxs(String Accesssetting,String XPath) {
         try {
             List<WebElement> AccessSetting=browser.findElements(By.xpath(YMLUtil.getYMLObjectRepositoryData(XPath)));
              System.out.println("total count of access setting enabledd"+AccessSetting.size());
              int Number=0;
              Accesssetting=CommonUtil.getData(Accesssetting);
             Number= Integer.parseInt(Accesssetting);
             
              //Test data in "12"
              int ActualCount=AccessSetting.size();
              if(ActualCount==Number)
              {
                  ExtentCucumberAdapter.addTestStepLog("total count of access setting enabledd"+AccessSetting.size());  
              }
              else {
                  ExtentCucumberAdapter.addTestStepLog("total count of access setting disbled"+Accesssetting);
              }
         }catch(Exception e) {
             System.out.println("error: "+e.getMessage());  
         }
    }

    //Select the button/Node and perform Delete from keyboard
    public static void deleteFromKeyboard(String XPath) {

		try {
			
			browser=WebBrowser.getBrowser();
			
			WebElement Node = browser.findElement(By.xpath(YMLUtil.getYMLObjectRepositoryData(XPath)));
			// Use Actions class to select the button and press "Delete"
			Actions actions=new Actions(browser);
			// Note: "\u0008" is the Unicode representation of the "Delete" key
	        actions.click(Node).sendKeys("\u0008").build().perform();
	        
		}
		catch(Exception e) {
			System.out.println("error: "+e.getMessage());
		}
	}
	
	//Switching to the previous tab in chrome Writen by Sakthi KL
    public static void switchToPreviousTab() {

		try {
			browser=WebBrowser.getBrowser();
			browser.close();
//			ArrayList<String> tabs = new ArrayList(browser.getWindowHandles());
//			browser.switchTo().window(tabs.get(0));
            ExtentCucumberAdapter.addTestStepLog("Switched to prevoius Tab");
            WebBrowserUtil.captureScreenshot();
		}
		catch(Exception e) {
			System.out.println("error: "+e.getMessage());
		}
	}
	
    //Select the button/Node and perform Delete from keyboard
    public static void pressenterFromKeyboard(String XPath) {

		try {
			
			browser=WebBrowser.getBrowser();
			
			WebElement Node = browser.findElement(By.xpath(YMLUtil.getYMLObjectRepositoryData(XPath)));
			// Use Actions class to select the button and press "Enetr"
			Actions actions=new Actions(browser);
			// Note: "\ue007" is the Unicode representation of the "Enter" key
	        actions.click(Node).sendKeys("\ue007").build().perform();
	        
		}
		catch(Exception e) {
			System.out.println("error: "+e.getMessage());
		}
	}
	
	
	public static void ClickOnceVisible(String XPath) {
    	browser = WebBrowser.getBrowser();
		WebElement displaysControlListPanel = null;
		WebElement FeatureLockIcon = null;
 
		try {
		    Thread.sleep(500);
			FeatureLockIcon = browser
					.findElement(By.xpath("//*[name()='svg'][@data-testid='LockOpenIcon']/parent::button"));
			if (FeatureLockIcon != null) {
				FeatureLockIcon.click();
				Thread.sleep(500);
				WebElement FeatureLockIconOK = browser.findElement(By.xpath(
						"//button[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium  css') and text()='ok']"));
				FeatureLockIconOK.click();
				displaysControlListPanel = browser
						.findElement(By.xpath("(//button[contains(@class,'MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium text-success css-')])[3]"));
				displaysControlListPanel.click();
				ExtentCucumberAdapter
						.addTestStepLog("1st unlocked the feature after that clicked on Displays contols list Panel");
 
			}
 
		} catch (Exception e) {
			try {
			    Thread.sleep(500);
				displaysControlListPanel = browser
						.findElement(By.xpath("(//button[contains(@class,'MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium text-success css-')])[3]"));
				if (displaysControlListPanel != null) {
					displaysControlListPanel.click();
					ExtentCucumberAdapter.addTestStepLog("Displays contols list Panel is clicked");
				}
 
			} catch (Exception e2) {
 
			}
		}
	}
	

    public void waitUntilElementVisible(String XPath) {
        int timeoutInSeconds = 200; // Adjust the timeout as needed
        WebDriver browser = null;
        try {
            browser = WebBrowser.getBrowser();
            WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(timeoutInSeconds));
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(YMLUtil.getYMLObjectRepositoryData(XPath))));
            
            // Click on the element once it becomes visible
            element.isDisplayed();
            
        } catch (TimeoutException e) {
            // Handle timeout exception
            System.out.println("Element with XPath '" + XPath + "' was not visible within " + timeoutInSeconds + " seconds");
        } catch (NoSuchElementException e) {
            // Handle element not found exception
            System.out.println("Element with XPath '" + XPath + "' not found");
        } catch (Exception e) {
            // Handle other exceptions
            e.printStackTrace();
        } finally {
            if (browser != null) {
                browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            }
        }
    }
    
    // Custom method to select a dropdown option by value attribute Writen by Sakthi KL
    // Xpath = //div[@id='demo-simple-select']:://li[text()='%s']
    public static void selectDropdownByValue(String param, String XPath) {
        browser = WebBrowser.getBrowser();
        try {
            param = CommonUtil.getData(param);
            String[] locators = YMLUtil.getYMLObjectRepositoryData(XPath).split("::");
    	    String dropdownXPath = locators[0];
    	    String listXPath = locators[1];
            WebElement dropdown = browser.findElement(By.xpath(YMLUtil.getYMLObjectRepositoryData(dropdownXPath)));
            dropdown.click();
            listXPath = String.format(listXPath,param);
            Thread.sleep(500);
            WebElement option = browser.findElement(By.xpath(listXPath));
            option.click();
            System.out.println(param);
            ExtentCucumberAdapter.addTestStepLog(param + " is selected");
        } catch (Exception e) {
            e.printStackTrace();
            ExtentCucumberAdapter.addTestStepLog("Failed to select dropdown value: " + param);
        }
    }
    

    //accept the alert message and verify the message Writen by Sakthi KL
    public static boolean verifyAlertMessagePopup(String param) {
        int timeoutInSeconds = 200;
        WebDriver browser = null;
        try {
        	browser=WebBrowser.getBrowser();
        	WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = browser.switchTo().alert();
            String alertText = alert.getText();
            param=CommonUtil.getData(param);
            System.out.println(alertText);
            // Verify if the alert text matches the expected message
            if (alertText.equals(param)) {
                System.out.println("Alert message is correct.");
                ExtentCucumberAdapter.addTestStepLog("Alert message is correct.");
            } else {
                ExtentCucumberAdapter.addTestStepLog("Alert message is incorrect. Expected: " + param);
                System.out.println("Alert message is incorrect. Expected: " + param);
            }
            // Accept the alert (click OK)
            alert.accept();
            System.out.println("Alert accepted (OK clicked).");
            ExtentCucumberAdapter.addTestStepLog("Alert accepted (OK clicked).");
        }
        catch(Exception e){
        	e.printStackTrace();
        }
        return true;
    }
    
    public static void ScrollHorizontally(){
        browser=WebBrowser.getBrowser();
        try{
        Actions actions = new Actions(browser);
        actions.scrollByAmount(5000,0).perform();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
        public void enteredOTPfiled() {
        	  try {
        		  WebElement OTP1=browser.findElement(By.xpath("//input[@id='otp-input-0']"));
        				  OTP1.sendKeys("1");
        				  WebElement OTP2=browser.findElement(By.xpath("//input[@id='otp-input-1']"));
        				  OTP2.sendKeys("4");
        				  WebElement OTP3=browser.findElement(By.xpath("//input[@id='otp-input-2']"));
        				  OTP3.sendKeys("3");
        				  WebElement OTP4=browser.findElement(By.xpath("//input[@id='otp-input-3']"));
        				  OTP4.sendKeys("2");
        				  WebElement OTP5=browser.findElement(By.xpath("//input[@id='otp-input-4']"));
        				  OTP5.sendKeys("5");
        				  WebElement OTP6=browser.findElement(By.xpath("//input[@id='otp-input-5']"));
        				  OTP6.sendKeys("7");
        	  }catch(Exception e)
              {
                  throw new CustomException(e.getMessage(), e);
                }
          }
        public static void tooltipMessage(String XPath , String param) {
            browser=WebBrowser.getBrowser();
//            String[] locators = YMLUtil.getYMLObjectRepositoryData(XPath).split("::");
//    	    String Autotestcase = locators[0];  // Checkbox XPath or CSS
//    	    String Verifyingerrormsg = locators[1];  // Pagination button XPath or CSS
//    	

    	try {
    		WebElement Autotest=browser.findElement(By.xpath("(//span[contains(.,'Auto Generate TestCases')])[2]"));
    		Actions actions = new Actions (browser);
    		actions.moveToElement(Autotest).perform();
    	 param=CommonUtil.getData(param);
		  WebElement toolTip = browser.findElement(By.xpath("//h4[contains(.,'No Access')]"));
	      String actualContent = toolTip.getText();
		  if (actualContent.equals(param)) {
	    	 ExtentCucumberAdapter.addTestStepLog("Content verification successful. Actual content: " + actualContent);	
		  }
    	}
		  catch(Exception e) {
				System.out.println("error: "+e.getMessage());
			}
		  
    	
    }
    
    public static void acceptAlert(String XPath) {
		//WebDriver browser=null;
		browser = WebBrowser.getBrowser();
		try {
		    // Switch to alert
		    Alert alert = browser.switchTo().alert();
		    
		    // Accept the alert
		    alert.accept();
		    
		    //alert.dismiss();
		    
		    ExtentCucumberAdapter.addTestStepLog("Alert accepted.");
		} catch (NoAlertPresentException e) {
			ExtentCucumberAdapter.addTestStepLog("No alert present.");
			
		}

		
	}
    //click and refresh the browswe Writen by Sakthi KL
    public static void clickOn(String XPath){
        try{
            browser = WebBrowser.getBrowser();
            WebElement element = browser.findElement(By.xpath(YMLUtil.getYMLObjectRepositoryData(XPath)));
            element.click();
            browser.navigate().refresh();
            Thread.sleep(3000);
        }
        catch(Exception e){
            System.out.println("error: "+e.getMessage());
        }
    }
    
    //click Writen by Sakthi KL
    public void click(String XPath){
        try{
            browser = WebBrowser.getBrowser();
            WebElement element = browser.findElement(By.xpath(YMLUtil.getYMLObjectRepositoryData(XPath)));
            element.click();
        }
        catch(Exception e){
            System.out.println("error: "+e.getMessage());
        }
    }
    
  public static boolean verifyAllProjects(){
      browser = WebBrowser.getBrowser();
      try{
          List<WebElement> projectElements = browser.findElements(By.xpath("//h5[@class='MuiTypography-root css-kss21i MuiTypography-h5']"));
          List<String> actualProjectNames = new ArrayList<>();
          for(WebElement element: projectElements)
          {
              actualProjectNames.add(element.getText());
          }
           
          WebElement searchproject= browser.findElement(By.xpath("//input[@id='searchproject']"));
          searchproject.clear();
          searchproject.sendKeys("NYKA");
          WebElement NYKA = browser.findElement(By.xpath("//h5[contains(.,'NYKA')]"));
          if(NYKA.isDisplayed())
          {
              System.out.print(NYKA +"is displayed");
          }
          
          searchproject.sendKeys(Keys.CONTROL + "a"); // Select All
          searchproject.sendKeys(Keys.DELETE);  
          Thread.sleep(5000);
          List<WebElement> projectElements1 = browser.findElements(By.xpath("//h5[@class='MuiTypography-root css-kss21i MuiTypography-h5']"));
          List<String> aftersearchingProjectNames = new ArrayList<>();
          for(WebElement element: projectElements1)
          {
              aftersearchingProjectNames.add(element.getText());
          }
          if(actualProjectNames.equals(aftersearchingProjectNames))
          {
              ExtentCucumberAdapter.addTestStepLog("Content verification successful. Actual content: " + aftersearchingProjectNames);	
            }
      }
      catch(Exception e) 
      {
		    System.out.println("error: "+e.getMessage());
		}
       
    return true; 
    }
    
    public static void currentDate(String XPath)
    {
       browser = WebBrowser.getBrowser();
       try
       {
        Date currentDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        //System.out.println("Current Date and Time: " + formatter.format(currentDate));
        String today =formatter.format(currentDate);
        WebElement todayDate=browser.findElement(By.xpath(YMLUtil.getYMLObjectRepositoryData(XPath)));
        todayDate.sendKeys(today);
        ExtentCucumberAdapter.addTestStepLog("Current date YYYY:MM:DD " + today);	

       }
       catch(Exception e)
       {
           System.out.println(e.getMessage());
       }
       
    }  
       
        // Custom method to select a dropdown option by value attribute
    public static void selectRowsDropdownByValue()
    {
    	browser=WebBrowser.getBrowser();
		Actions actions=new Actions(browser);
    	try {
    		WebElement Rows = browser.findElement(By.xpath("//div[@aria-haspopup='listbox'][1]"));
    		Rows.click();
    		//param=CommonUtil.GetData(param);
    		//System.out.println(param)
    		//S.selectByValue(param);
    		
    		WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(.,'20')]")));
            WebElement firstoption = browser.findElement(By.xpath("//li[contains(.,'20')]"));
            String value=firstoption.getText();
            System.out.println(value);
            int intvalue = Integer.parseInt(value);
            System.out.println(intvalue);
            firstoption.click();

            // Get the value attribute of the first option and convert to integer
            //String value = firstOption.getAttribute("value"); // Adjust if value is in the text
            //int intValue = Integer.parseInt(value);
            
    		ExtentCucumberAdapter.addTestStepLog(intvalue +" is selected");
    		
    		Thread.sleep(3000);
    		
    		
//    		List<WebElement> elements = browser.findElements(By.xpath("//h5[@class='MuiTypography-root css-kss21i MuiTypography-h5']"));
//    		int size = elements.size();
//    		System.out.println(size);
//		//int result = Integer.parseInt(param);
//    		int size1=size+3;
//    		if(intvalue == size1)
//    		{
//    			System.out.println("projects are displayed as per selection");
//    		    ExtentCucumberAdapter.addTestStepLog(size  +"project are dispalyed as per selection");
//    		}
    		
    		String selectedValue=Rows.getText();
    		int OriginalValue=Integer.parseInt(selectedValue);
    		if( OriginalValue== intvalue)
        		{
        			System.out.println("projects are displayed as per selection");
        		    ExtentCucumberAdapter.addTestStepLog(OriginalValue  +"project are dispalyed as per selection");
        		}
    		
		    } 
		catch (Exception e)
		{
			e.printStackTrace();
		}            
    }
    
    
    public static void TestcaseFiles()
    {
        browser = WebBrowser.getBrowser();
      try
      {
        WebElement Testcases= browser.findElement(By.xpath("//h5[contains(.,'Test Cases')]"));
        Testcases.click();
        WebElement TestcaseFolder=browser.findElement(By.xpath("(//i[@class='fa-regular fa-folder tree-folder'])[6]"));
        TestcaseFolder.click();
        WebElement updatedxlsx= browser.findElement(By.xpath("//h5[contains(.,'ZaraLatest_updated.xlsx')]"));
        String xlsx= updatedxlsx.getText();
        WebElement featurefile= browser.findElement(By.xpath("//h5[contains(.,'ZaraLatest.txt')]"));
        String featurefiletxt=featurefile.getText();
        if ((featurefiletxt.contains(".txt") && ( xlsx.contains(".xlsx")))) 
        {
            ExtentCucumberAdapter.addTestStepLog(featurefiletxt + " "+xlsx + "both files are displayed");

      }
      }
      catch(Exception e)
      {
			e.printStackTrace();
      }
        
    }
    
    
    
     public static void ScenatiosCount(String XPath)
    {
       browser = WebBrowser.getBrowser();
       try
       {
        
        WebElement Count=browser.findElement(By.xpath(YMLUtil.getYMLObjectRepositoryData(XPath)));
        //WebElement todayDate=browser.findElement(By.xpath(YMLUtil.getYMLObjectRepositoryData(XPath)));
        String textvalue = Count.getText();
        String[] parts = textvalue.split(" ");  // Split by space
        
        // The last part contains the number "44"
        String number = parts[2];
        Scenarioscount = Integer.parseInt(number);
        System.out.println(Scenarioscount);
        ExtentCucumberAdapter.addTestStepLog("total scenarios count "+Scenarioscount);	

       }
       catch(Exception e)
       {
           System.out.println(e.getMessage());
       }
       
    } 
    
    
     public static void EditScenariosCount(String XPath)
    {
      browser = WebBrowser.getBrowser();
      try
      {
        
        WebElement Count=browser.findElement(By.xpath(YMLUtil.getYMLObjectRepositoryData(XPath)));
        //WebElement todayDate=browser.findElement(By.xpath(YMLUtil.getYMLObjectRepositoryData(XPath)));
        String textvalue = Count.getText();
        String[] parts = textvalue.split(" ");  // Split by space
        
        // The last part contains the number "44"
        String number = parts[2];
        int currentScenarioscount = Integer.parseInt(number);
        System.out.println(currentScenarioscount);
        if(Scenarioscount == currentScenarioscount)
        {
            System.out.println("Scenarios count is verifed");
            ExtentCucumberAdapter.addTestStepLog("scenarios count is verified "+currentScenarioscount+" "+Scenarioscount);	
            
        }
    
      }
      catch(Exception e)
      {
         e.printStackTrace();
      }
       
    } 
    
     public static void UploadAFSettingFileAndUtilityFile()
    {
      browser = WebBrowser.getBrowser();
      try
      {
        
        // WebElement selectupload=browser.findElement(By.xpath("(//div[contains(.,'Upload File')])[4]"));
        // selectupload.click();
        // selectupload.sendKeys("C:\\Users\\DELL\\Downloads\\Utility (1)\\customUtil.java");       
        WebElement Configuration=browser.findElement(By.xpath("(//span[contains(.,'Configuration')]"));
        Configuration.click();
        WebElement uploadButton=browser.findElement(By.xpath("//*[name()='path'][contains(@d,'M19.35 10.04C18.67 6.59 15.64 4 12 4 9.11 4 6.6 5.64 5.35 8.04 2.34 8.36 0 10.91 0 14c0 3.31 2.69 6 6 6h13c2.76 0 5-2.24 5-5 0-2.64-2.05-4.78-4.65-4.96zM14 13v4h-4v-4H7l5-5 5 5h-3z')]"));
        uploadButton.click();
        WebElement selectradioButton=browser.findElement(By.xpath("(//input[@type='radio'])[2]"));
        selectradioButton.click();
        WebElement Upload=browser.findElement(By.xpath("//label[contains(.,'Upload')]"));
        Upload.click();
        Upload.sendKeys("C:\\Users\\DELL\\Downloads\\Utility (1)\\AFSettings.json");        WebElement ConfigurationuploadSuccessMesaage=browser.findElement(By.xpath("//h5[contains(.,'Configuration files uploaded successfully')]"));
        String Actualmessage=ConfigurationuploadSuccessMesaage.getText();
        String Originalmessage= "Configuration files uploaded successfully";
        if(Actualmessage.equals(Originalmessage)){
              System.out.println("Verification Succesful");
              ExtentCucumberAdapter.addTestStepLog(" verification successful "+Actualmessage);

        }
        WebElement CustomMethodFileNameDropdon=browser.findElement(By.xpath("(//*[name()='path'][contains(@d,'M16.59 8.59L12 13.17 7.41 8.59 6 10l6 6 6-6z')])[2]"));
        CustomMethodFileNameDropdon.click();
        WebElement PlusSymbol=browser.findElement(By.xpath("(//*[name()='path'][contains(@d,'M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm5 11h-4v4h-2v-4H7v-2h4V7h2v4h4v2z')])[1]"));
        PlusSymbol.click();
        WebElement enterfilename=browser.findElement(By.xpath("//input[@id='fileName']"));
        enterfilename.sendKeys("customUtil.java");
        WebElement tickmark=browser.findElement(By.xpath("//*[name()='svg'][@data-testid='CheckIcon']"));
        tickmark.click();
        CustomMethodFileNameDropdon.click();
        WebElement CustomMethodStartDropdown=browser.findElement(By.xpath("(//*[name()='path'][contains(@d,'M16.59 8.59L12 13.17 7.41 8.59 6 10l6 6 6-6z')])[3]"));
    
        CustomMethodStartDropdown.click();
        WebElement CustomMethodStartPlusSymbol=browser.findElement(By.xpath("(//*[name()='path'][contains(@d,'M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm5 11h-4v4h-2v-4H7v-2h4V7h2v4h4v2z')])[2]"));
    
        CustomMethodStartPlusSymbol.click();
    
        WebElement CustomMethod=browser.findElement(By.xpath("//input[@id='custom_action']"));
        CustomMethod.click(); 
        WebElement CustomMethodValue=browser.findElement(By.xpath("//p[contains(.,'customUtil.clearTextfield(String XPath)')]"));
        CustomMethodValue.click();
        WebElement CustomActionValue=browser.findElement(By.xpath("(//input[@class='jss234 '])[2]"));
        CustomActionValue.click();
        CustomActionValue.sendKeys("clearTextfield");
        tickmark.click();
        CustomMethodStartDropdown.click();
        WebElement Submit=browser.findElement(By.xpath("//span[contains(.,'Submit')]"));
        Submit.click();

    
       
      }
      catch(Exception e)
      {
         e.printStackTrace();
      }
       
    } 
    
    
   
 public static void checkingdropdownlightanddarkTheme(String XPath)
     {
       browser = WebBrowser.getBrowser();
       try
       {
        WebElement dropdown=browser.findElement(By.xpath(YMLUtil.getYMLObjectRepositoryData(XPath)));
         //WebElement todayDate=browser.findElement(By.xpath(YMLUtil.getYMLObjectRepositoryData(XPath)));
    	   dropdown.click();
    	   List<WebElement> options = browser.findElements(By.xpath("//li[@role='option']"));

            // Get all options from the dropdown
             List <String> actualValues=new ArrayList<>();
            
             for(WebElement option:options)
             {
                 actualValues.add(option.getText());
             }
            
     
            
             List<String> expectedOptionNames = new ArrayList<>();
             expectedOptionNames.add("Light");
             expectedOptionNames.add("Dark");
            if (actualValues.equals(expectedOptionNames)) 
             {
             ExtentCucumberAdapter.addTestStepLog("Both lists are exactly equal."+ actualValues);
             }
            
       }

       catch(Exception e)
       {
          e.printStackTrace();
       }
       
    }
    
    public static void entertextinCSEditor()
     {
       browser = WebBrowser.getBrowser();
       try
       {
           WebElement editor = browser.findElement(By.xpath("(//textarea[@class='ace_text-input'])[1]"));
           Actions actions = new Actions(browser);

           actions.moveToElement(editor).click().perform();

            // Use sendKeys to type text (you can chain it)
            actions.sendKeys("SaaS Testing").perform();
            WebBrowserUtil.captureScreenshot();
           
       }
      catch(Exception e)
       {
          e.printStackTrace();
       }
       
    }
    
    
   public static void checkingDarkAndWhiteThemesInEditor(String XPath)
     {
       browser = WebBrowser.getBrowser();
       try
       {
        WebElement dropdown=browser.findElement(By.xpath(YMLUtil.getYMLObjectRepositoryData(XPath)));
         //WebElement todayDate=browser.findElement(By.xpath(YMLUtil.getYMLObjectRepositoryData(XPath)));
    	   dropdown.click();
    	   List<WebElement> options = browser.findElements(By.xpath("//li[@role='option']"));

            // Get all options from the dropdown
             List <String> actualValues=new ArrayList<>();
            
             for(WebElement option:options)
             {
                 actualValues.add(option.getText());
             }
            
     
            
             List<String> expectedOptionNames = new ArrayList<>();
             expectedOptionNames.add("Light");
             expectedOptionNames.add("Dark");
            if (actualValues.equals(expectedOptionNames)) 
             {
             ExtentCucumberAdapter.addTestStepLog("Both lists are exactly equal."+ actualValues);
             }
             
             WebElement dark=browser.findElement(By.xpath("//li[@role='option'][1]"));
             dark.click();
             
             WebElement Editor = browser.findElement(By.xpath("//textarea[@class='ace_text-input']"));
             String backgroundColor = Editor.getCssValue("background-color");
             System.out.println(backgroundColor);
             ExtentCucumberAdapter.addTestStepLog("Editor DarkTheme in "+ backgroundColor + "colour" );
             
             if(backgroundColor.equals("rgba(0, 0, 0, 0)"))
             {
            	 System.out.println("Dark Theme in displaying"+backgroundColor);
             }
             Thread.sleep(5000);
             WebElement darkdropdown = browser.findElement(By.xpath("(//div[contains(.,'Dark')])[14]"));
      	     darkdropdown.click();

             WebElement Light=browser.findElement(By.xpath("//li[@role='option'][2]"));
             Light.click();
             WebElement LightEditor = browser.findElement(By.xpath("//textarea[@class='ace_text-input']"));

             String backgroundColor1 = LightEditor.getCssValue("background-color");
             ExtentCucumberAdapter.addTestStepLog("Editor Light Theme in"+ backgroundColor1 + "colour" );
             System.out.println("Light colour is displayed  "+backgroundColor1);
            if(backgroundColor1.equals("rgba(225, 225, 225, 225)"))
            {
                ExtentCucumberAdapter.addTestStepLog("Editor LightTheme in "+ backgroundColor1 + "colour" );
            }
    
       }

       catch(Exception e)
       {
          e.printStackTrace();
       }
       
    }
    
    
     public static void fileRename()
     {
       browser = WebBrowser.getBrowser();
       try
       {
            WebElement utilityfile = browser.findElement(By.xpath("//input[@value='demo.java']"));
            utilityfile.clear();
            utilityfile.sendKeys("Sree.java",Keys.ENTER);
            

        
       }
        catch(Exception e)
       {
          e.printStackTrace();
       }
       
     }
    
    public static void clickAndMove(String XPath){
        // this method is only used in API Authorization for drag and drop the Responce area Writen by Sakthi KL
    	browser = WebBrowser.getBrowser();
        try{
        	Thread.sleep(2000);
            WebElement Element=browser.findElement(By.xpath(YMLUtil.getYMLObjectRepositoryData(XPath)));
            Actions actions = new Actions(browser);
            actions.dragAndDropBy(Element, 0, 100).build().perform();
            ExtentCucumberAdapter.addTestStepLog("Responce pannel is resized");
            WebBrowserUtil.captureScreenshot();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    public static void clickEscape(){
        // this method is only used in API Authorization for drag and drop the Responce area
        browser = WebBrowser.getBrowser();
        try{
            Actions actions = new Actions(browser);

            // Perform the Escape key action
            actions.sendKeys(Keys.ESCAPE).perform();

            System.out.println("Escape key pressed successfully.");
           
        }
        catch(Exception e){
            e.printStackTrace();
        }
    } 
    



public boolean verifySelectedPercentage(String param, String XPath, String identification) {
        String xpath = YMLUtil.getYMLObjectRepositoryData(XPath);
        param = CommonUtil.getData(param);
        int Actualpercentage1 = 0;
        boolean Verified = false;
        int intParam = Integer.parseInt(param); // Converts the string to an integer
        String scrappefileelementsxpath = "//div[@col-id='CONTROL NAME' and @role='gridcell']";
        String repositoryelementxpath = "//div[@role='presentation' and @class='ag-selection-checkbox']";
        String MuiIconButtonxpath = "//div/button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeSmall css-vi5zjz']";
 
        // Locate the elements using the provided XPath
        List<WebElement> repositoryelements = WebBrowserUtil.findElements(repositoryelementxpath, identification);
        // Get the total number of elements
        int totalElements = repositoryelements.size();
        // Scrape file elements
        List<WebElement> scrappeelements = WebBrowserUtil.findElements(scrappefileelementsxpath, identification);
        
        try {
            // Select the specified number of elements
            for (int i = 0; i < intParam; i++) {
                repositoryelements.get(i).click(); // Click on checkbox
                Thread.sleep(2000);
                System.out.println("Controls checked");
                ExtentCucumberAdapter.addTestStepLog("Control checked");
               
            }
            scrappeelements.get(1).click();  // Click scrape element
            Thread.sleep(2000);
        } catch (Exception ex) {
            throw new CustomException("Unable to perform selected action" + ex.getMessage());
        }
   
        try {
        	// Select the mutibutton
            WebElement button = WebBrowserUtil.findElement(MuiIconButtonxpath, identification);
            WebBrowserUtil.click(button);
            // Calculate the percentage of selected elements
            double percentage = ((double) intParam / totalElements) * 100;
            // Round the percentage to the nearest whole number
            long ExpPercentage = Math.round(percentage);
            WebElement perctele = WebBrowserUtil.findElement(xpath, identification);
            String Actualpercentage = WebBrowserUtil.getText(perctele);
            
            // Use regular expression to extract the number (percentage) from the text
            Pattern pattern = Pattern.compile("\\d+");  // Regex to match one or more digits
            Matcher matcher = pattern.matcher(Actualpercentage);
            
            if (matcher.find()) {
                // Extract the matched number and parse it to an integer
                Actualpercentage1 = Integer.parseInt(matcher.group());
            } else {
                System.out.println("No percentage found in the Application.");
                ExtentCucumberAdapter.addTestStepLog("No percentage found in the Application.");
            }
            
            // Assertion to check if the expected and actual percentages are equal
            try {
                assertEquals("Percentage verification failed. Expected and Actual percentages do not match.",
                             ExpPercentage, Actualpercentage1); // This will throw an AssertionError if the values don't match
                Verified = true;
                System.out.println("Actual Percentage: " + Actualpercentage1 + "%" + "    Expected Percentage: " + ExpPercentage + "%");
                ExtentCucumberAdapter.addTestStepLog("Percentage successfully verified");
                ExtentCucumberAdapter.addTestStepLog("Actual Percentage: " + Actualpercentage1 + "%" + "   Expected Percentage: " + ExpPercentage + "%");
            } catch (AssertionError e) {
                System.out.println("AssertionError: Percentage mismatch");
                ExtentCucumberAdapter.addTestStepLog("Actual Percentage: " + Actualpercentage1 + "%" + "   Expected Percentage: " + ExpPercentage + "%");
                ExtentCucumberAdapter.addTestStepLog("Percentage not verified" +e);
                throw e; // Rethrow the assertion error to fail the test if necessary
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
 
        return Verified;
    }

    // method used to verify all the controls are checked or unchecked in node configuration : written by Sakthi KL
    public boolean verifyAllControlsCheckedorUnchecked(String param, String XPath) {
		browser = WebBrowser.getBrowser();
		param = CommonUtil.getData(param);
	    // Split the locator string using "::"
	    String[] locators = YMLUtil.getYMLObjectRepositoryData(XPath).split("::");
	    String checkboxLocator = locators[0];  // Checkbox XPath or CSS
	    String nextPageLocator = locators[1];  // Pagination button XPath or CSS
	
	    int page = 1;
	    boolean verified = true;
	    while (true) {
	        System.out.println("Checking checkboxes on Page " + page+"\n");
	
	        // Get list of checkboxes on the current page
	        List<WebElement> checkboxes = browser.findElements(By.xpath(checkboxLocator));
	
	        // Verify checkbox status
	        if(param.equalsIgnoreCase("CHECKED")) {
	        	for (int i = 1; i < checkboxes.size(); i++) {
		            WebElement checkbox = checkboxes.get(i);
		            boolean isChecked = checkbox.isSelected();
		            if(isChecked) {
		            	continue;
		            }else {
		            	verified = false;
		            	break;
		            }
		        }
	        }else {
	        	for (int i = 1; i < checkboxes.size(); i++) {
		            WebElement checkbox = checkboxes.get(i);
		            boolean isChecked = checkbox.isSelected();
		            if(isChecked) {
		            	verified = false;
		            	break;
		            }else {
		            	continue;
		            }
		        }
	        }
	        
	        // Locate the "Next" button
	        if(verified) {
	        	
		        WebElement nextPageButton = browser.findElement(By.xpath(nextPageLocator));
		
		        // Check if the next page button is disabled
		        if (!nextPageButton.isEnabled()) {
		            System.out.println("Next button is disabled. Stopping pagination.\n");
		            break; // Exit the loop when "Next" button is disabled
		        }
		        
		        ExtentCucumberAdapter.addTestStepLog("Page" +page);
		        WebBrowserUtil.captureScreenshot();
		
		        // Click the next page button
		        nextPageButton.click();
		        page++;
	        }else {
	        	ExtentCucumberAdapter.addTestStepLog("Elements are "+(param.equalsIgnoreCase("CHECKED")?"UNCHECKED":"Checked")+" in Page" +page);
		        WebBrowserUtil.captureScreenshot();
	        }
	    }
	    return verified;
	}

    public boolean verifyControlsCheckedorUnchecked(String param, String XPath) {
		browser = WebBrowser.getBrowser();
		param = CommonUtil.getData(param);
	    boolean verified = true;
	    while (true) {
	
	        // Get list of checkboxes on the current page
	        List<WebElement> checkboxes = browser.findElements(By.xpath(YMLUtil.getYMLObjectRepositoryData(XPath)));
	
	        // Verify checkbox status
	        if(param.equalsIgnoreCase("CHECKED")) {
	        	for (int i = 1; i < checkboxes.size(); i++) {
		            WebElement checkbox = checkboxes.get(i);
		            boolean isChecked = checkbox.isSelected();
		            if(isChecked) {
		            	continue;
		            }else {
		            	verified = false;
		            	break;
		            }
		        }
	        }else {
	        	for (int i = 1; i < checkboxes.size(); i++) {
		            WebElement checkbox = checkboxes.get(i);
		            boolean isChecked = checkbox.isSelected();
		            if(isChecked) {
		            	verified = false;
		            	break;
		            }else {
		            	continue;
		            }
		        }
	        }
	        
	        // Locate the "Next" button
	        if(verified) {
	        	ExtentCucumberAdapter.addTestStepLog("Controles are checked");
		      //  WebBrowserUtil.captureScreenshot();
		        break;
	        }else {
	        	
	        	ExtentCucumberAdapter.addTestStepLog("Controles are unchecked");
		      //  WebBrowserUtil.captureScreenshot();
		        break;
	        }
	    }
	    return verified;
	}
	
	public static void selectcurrentdate(String XPath)
    {
		
		browser = WebBrowser.getBrowser();
		//param = CommonUtil.GetData(param);
    	
    	List<WebElement> elements = browser.findElements(By.xpath("//button[contains(@class,'MuiButtonBase-root MuiPickersDay-root MuiPickersDay-dayWithMargin ')]"));
        if (!elements.isEmpty()) {
            WebElement lastElementFromList = elements.get(elements.size() - 1);
            lastElementFromList.click();
        }
        
        WebElement selecteddate = browser.findElement(By.xpath("//input[contains(@placeholder,'dd/mm/yyyy')][1]"));
        String value = selecteddate.getText();
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String currentDate = dateFormat.format(new Date());
        
        if (value.equals(currentDate)) {
            System.out.println("Success: Selected date matches the current date.");
            ExtentCucumberAdapter.addTestStepLog("current date is " + value + "current date is selected");

        } else {
            System.out.println("Failure: Selected date does not match. Expected: " + currentDate + ", Found: "+value);
        }
          
        
    }
    
    
    public static void selectcurrentdateto(String XPath)
    {
    	browser = WebBrowser.getBrowser();
		//param = CommonUtil.GetData(param);
    	
    	List<WebElement> elements = browser.findElements(By.xpath("//button[contains(@class,'MuiButtonBase-root MuiPickersDay-root MuiPickersDay-dayWithMargin ')]"));
        if (!elements.isEmpty()) {
            WebElement lastElementFromList = elements.get(elements.size() - 1);
            lastElementFromList.click();
        }
        
        WebElement selecteddateto = browser.findElement(By.xpath(("//input[@type='tel'])[2]")));
        String value = selecteddateto.getText();
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); // Adjust format as needed
        String currentDate = dateFormat.format(new Date());
        System.out.println(currentDate);
        System.out.println(value);

        
        
        if (selecteddateto.equals(currentDate)) {
            System.out.println("Success: Selected date matches the current date.");
            ExtentCucumberAdapter.addTestStepLog("current date is " + selecteddateto + " selected");

        } else {
            System.out.println("Failure: Selected date does not match. Expected: " + currentDate + ", Found: " + selecteddateto);
        }
          
        
    	//WebElement date= browser.findElements(By.xpath("//button[contains(@class,'MuiButtonBase-root MuiPickersDay-ro')]"))
    }

  
    
    public static void clickUntilDisabled(String param) 
    {
    	browser = WebBrowser.getBrowser();
		//param = CommonUtil.GetData(param);
        WebElement plusButton = browser.findElement(By.xpath("//div[contains(@class,'MuiBox-root jss833 css-qhp3of')]"));
        
        while (plusButton.isEnabled()) {
            plusButton.click();
            try {
                // Small wait to allow button state update
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            plusButton = browser.findElement(By.xpath("//div[contains(@class,'MuiBox-root jss833 css-qhp3of')]")); // Re-locate to check updated state
        }

        // Verification
        if (!plusButton.isEnabled()) {
            System.out.println("Button is successfully disabled.");
            ExtentCucumberAdapter.addTestStepLog("button is in disabled state");

            
        } else {
            System.out.println("Button is still enabled.");
        }
        
        int expectedvalue=7;
        WebElement element = browser.findElement(By.xpath(""));
        String text = element.getText(); // Get the text from the element

        // Extract integer using regex
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);
        
        if (matcher.find()) {
            int extractedNumber = Integer.parseInt(matcher.group());
            System.out.println("Extracted Number: " + extractedNumber);

            // Verify the extracted number
            if (extractedNumber == expectedvalue) {
                System.out.println("Verification Passed: Extracted number matches expected value.");
                ExtentCucumberAdapter.addTestStepLog("Verification Passed: Extracted number matches expected value.");

            } else {
                System.out.println("Verification Failed: Expected " + expectedvalue + ", but got " + extractedNumber);
            }
        } else {
            System.out.println("No integer found in the given string.");
        }
    }
        
    public static void deleteAllProjects() throws InterruptedException{
        browser = WebBrowser.getBrowser();
        int i=1;
        WebElement project = browser.findElement(By.xpath("(//h5[contains(@class,'MuiTypography-root css-kss21i MuiTypography-h5')])[1]"));
        while(project.isDisplayed()){
            project.click();
            Thread.sleep(500);
            WebElement dot = browser.findElement(By.xpath("(//*[name()='svg'][@data-testid='MoreVertIcon'])[1]"));
            dot.click();
            Thread.sleep(500);
            WebElement delete = browser.findElement(By.xpath("(//ul[@class='MuiList-root MuiMenu-list MuiList-padding']/descendant::div[contains(.,'Delete')])[1]"));
            delete.click();
            Thread.sleep(500);
            WebElement yes = browser.findElement(By.xpath("//span[contains(.,'Yes')]"));
            yes.click();
            Thread.sleep(3000);
            System.out.println(i);
            i++;
        }
        
    }      
        public static boolean checkFileInsideZip(String filePath) {
            // Check if the filePath contains "Extention_"
        	filePath = CommonUtil.getData(filePath);

            if (filePath != null && filePath.contains("Extention_")) {
                String path = System.getProperty("user.dir");
                System.out.println("User directory: " + path);
                
                // Split the filePath to get the file type
                String[] arr = filePath.split("_");
                if (arr.length < 2) {
                    // If the split is not valid, log and return false
                    System.out.println("Invalid filePath format. Expected format: 'Extention_<fileType>'");
                    ExtentCucumberAdapter.addTestStepLog("Invalid filePath format. Expected format: 'Extention_<fileType>'");
                    return false;
                }
                
                String fileType = arr[1];
                System.out.println("File type to search for: " + fileType);

                // Initialize the file search
                File theNewestFile = null;
                File dir = new File(path);
                FileFilter fileFilter = new WildcardFileFilter("*.zip");
                File[] files = dir.listFiles(fileFilter);

                // Check if no zip files were found in the directory
                if (files == null || files.length == 0) {
                    System.out.println("No ZIP files found in the directory.");
                    ExtentCucumberAdapter.addTestStepLog("No ZIP files found in the directory.");
                    return false;
                }

                // Sort the files by last modified date (newest first)
                Arrays.sort(files, LastModifiedFileComparator.LASTMODIFIED_REVERSE);
                theNewestFile = files[0];
                System.out.println("Newest ZIP file: " + theNewestFile.getName());
                ExtentCucumberAdapter.addTestStepLog("Newest ZIP file: " + theNewestFile.getName());

                // Call the checkZip method to verify if the file is inside the zip file
                boolean fileFound = checkZip(theNewestFile, fileType);
                
                // Log the final result
                if (fileFound) {
                    System.out.println("File with extension '" + fileType + "' found inside the ZIP.");
                    ExtentCucumberAdapter.addTestStepLog("File with extension '" + fileType + "' found inside the ZIP.");
                } else {
                    System.out.println("No file with extension '" + fileType + "' found inside the ZIP.");
                    ExtentCucumberAdapter.addTestStepLog("No file with extension '" + fileType + "' found inside the ZIP.");
                }
                return fileFound;
            }

            // Log if the filePath does not contain "Extention_"
            System.out.println("Invalid filePath format. 'Extention_' not found.");
            ExtentCucumberAdapter.addTestStepLog("Invalid filePath format. 'Extention_' not found.");
            return false;
        }

        private static boolean checkZip(File zipFile, String fileType) {
            try (ZipFile zip = new ZipFile(zipFile)) {
                Enumeration<? extends ZipEntry> entries = zip.entries();

                // Loop through each entry in the zip file
                while (entries.hasMoreElements()) {
                    ZipEntry entry = entries.nextElement();

                    // If the entry is not a directory, check the file extension
                    if (!entry.isDirectory()) {
                        String fileName = entry.getName();
                        if (fileName.endsWith("." + fileType)) {
                            System.out.println("File found inside ZIP: " + fileName);
                            ExtentCucumberAdapter.addTestStepLog("File found inside ZIP: " + fileName);
                            return true;
                        }
                    }
                }
            } catch (IOException e) {
                // Log the exception and the file that caused it
                System.out.println("Error reading the ZIP file: " + zipFile.getName());
                e.printStackTrace();
                ExtentCucumberAdapter.addTestStepLog("Error reading the ZIP file: " + zipFile.getName());
            }

            // Log if no file was found inside the zip with the desired extension
            System.out.println("No file with extension '" + fileType + "' found inside the ZIP.");
            ExtentCucumberAdapter.addTestStepLog("No file with extension '" + fileType + "' found inside the ZIP.");
            return false;
        }
      
    //       selectCustomUtilFile
   public void selectFromDropdownInCustomMethod(String param, String XPath) 
   {
       browser = WebBrowser.getBrowser();
       param = CommonUtil.getData(param);
       try {
    	   Thread.sleep(2000);
           WebElement element = browser.findElement(By.xpath(YMLUtil.getYMLObjectRepositoryData(XPath)));
           element.click();
           element.sendKeys(param);
           Thread.sleep(2000);
           Robot robot = new Robot();
           robot.keyPress(KeyEvent.VK_DOWN);   // Press ↓
           robot.keyRelease(KeyEvent.VK_DOWN);
           robot.keyPress(KeyEvent.VK_ENTER);  // Press ENTER
           robot.keyRelease(KeyEvent.VK_ENTER);
       } catch (Exception e) {
           System.out.println("Error selecting file: " + e.getMessage());
       }
   }
   
   public static void clickon5times(String XPath) {
   		browser = WebBrowser.getBrowser();
   		try {
            
            WebElement element = browser.findElement(By.xpath(YMLUtil.getYMLObjectRepositoryData(XPath))); // Change locator as needed

          // Click the element 5 times
          for (int i = 0; i < 5; i++) {
              element.click();
              Thread.sleep(2000); // optional delay between clicks (2000ms)
          }

      } catch (Exception e) {
          e.printStackTrace();
      }
   	}
   	
   	
   	 public static void checkElementState(String XPath) {
        try {
            // Get the browser instance
            browser = WebBrowser.getBrowser();
            
            // Find the element by XPath
            WebElement element = browser.findElement(By.xpath(YMLUtil.getYMLObjectRepositoryData(XPath)));
            
            // Check for the presence of the "disabled" attribute in the DOM
            boolean isDisabledAttribute = element.getAttribute("disabled") != null;
    
            // Check if the element has the "Mui-disabled" class
            String classAttribute = element.getAttribute("class");
            boolean hasDisabledClass = classAttribute.contains("Mui-disabled");
            
            // Check CSS styles like pointer-events and opacity to see if it is visually disabled
            String pointerEvents = element.getCssValue("pointer-events");
            String opacity = element.getCssValue("opacity");
            boolean isPointerEventsNone = "none".equalsIgnoreCase(pointerEvents);
            boolean isOpacityLow = Double.parseDouble(opacity) <= 0.5;  // Customizable threshold
            
            // Combine all checks to determine if the element is truly disabled
            if (isDisabledAttribute || hasDisabledClass || isPointerEventsNone || isOpacityLow) {
                String message = String.format("Web element is disabled : %s", element.getText());
                System.out.println(message);
                ExtentCucumberAdapter.addTestStepLog(message);
            } else if (element.isEnabled()) {
                String message = String.format("Web element is enabled: %s", element.getText());
                System.out.println(message);
                ExtentCucumberAdapter.addTestStepLog(message);
            } else {
                // If the element is neither disabled nor enabled as per `isEnabled()`
                String message = String.format("Web element is in an unknown state: %s", element.getText());
                System.out.println(message);
                ExtentCucumberAdapter.addTestStepLog(message);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            ExtentCucumberAdapter.addTestStepLog("Error: " + e.getMessage());
        }
    }
    
        	public static void stateOfElement(String param, String XPath) {
   	    param = CommonUtil.getData(param); // Resolve param if it's a key
   	    final String ENABLED = "enabled";
   	    final String DISABLED = "disabled";

   	    try {
   	        WebDriver browser = WebBrowser.getBrowser();

   	        // Resolve XPath string from YML using key
   	        String resolvedXPath = YMLUtil.getYMLObjectRepositoryData(XPath);

   	        if (resolvedXPath == null || resolvedXPath.trim().isEmpty()) {
   	            String msg = "Unable to resolve XPath from YML key: '" + XPath + "'";
   	            System.out.println(msg);
   	            ExtentCucumberAdapter.addTestStepLog(msg);
   	            Assert.fail(msg);
   	        }

   	        // Locate the element
   	        WebElement element = browser.findElement(By.xpath(resolvedXPath));

   	        // FUNCTIONAL (backend) check
   	        boolean isFunctionallyEnabled = element.isEnabled();
   	        boolean hasDisabledAttr = element.getAttribute("disabled") != null;

   	        // VISUAL (frontend) check
   	        String classAttr = element.getAttribute("class");
   	        boolean hasDisabledClass = classAttr != null && classAttr.contains("Mui-disabled");

   	        String pointerEvents = element.getCssValue("pointer-events");
   	        boolean isPointerEventsNone = "none".equalsIgnoreCase(pointerEvents);

   	        String opacityValue = element.getCssValue("opacity");
   	        boolean isOpacityLow = false;
   	        try {
   	            isOpacityLow = Double.parseDouble(opacityValue) < 0.5;
   	        } catch (NumberFormatException e) {
   	            // ignore
   	        }

   	        boolean isVisuallyDisabled = hasDisabledClass || isPointerEventsNone || isOpacityLow;
   	        boolean isActuallyDisabled = hasDisabledAttr || !isFunctionallyEnabled || isVisuallyDisabled;
   	        boolean isActuallyEnabled = !isActuallyDisabled;

   	        String normalizedParam = param.trim().toLowerCase();
   	        String elementText = element.getText();
   	        if (elementText == null || elementText.trim().isEmpty()) {
   	            elementText = "[Element text not available]";
   	        }

   	        // Match expected state
   	        if (ENABLED.equals(normalizedParam)) {
   	            if (isActuallyEnabled) {
   	                String msg = "Element is ENABLED (visually or functionally): " + elementText;
   	                System.out.println(msg);
   	                ExtentCucumberAdapter.addTestStepLog(msg);
   	            } else {
   	                String msg = "Expected element to be ENABLED but it is DISABLED (visually and functionally): " + elementText;
   	                System.out.println(msg);
   	                ExtentCucumberAdapter.addTestStepLog(msg);
   	                Assert.fail(msg);
   	            }
   	        } else if (DISABLED.equals(normalizedParam)) {
   	            if (isActuallyDisabled) {
   	                String msg = "Element is DISABLED (visually or functionally): " + elementText;
   	                System.out.println(msg);
   	                ExtentCucumberAdapter.addTestStepLog(msg);
   	            } else {
   	                String msg = "Expected element to be DISABLED but it is ENABLED (visually and functionally): " + elementText;
   	                System.out.println(msg);
   	                ExtentCucumberAdapter.addTestStepLog(msg);
   	                Assert.fail(msg);
   	            }
   	        } else {
   	            String msg = "Invalid parameter: expected 'enabled' or 'disabled'. Received: " + param;
   	            System.out.println(msg);
   	            ExtentCucumberAdapter.addTestStepLog(msg);
   	            Assert.fail(msg);
   	        }

   	    } catch (Exception e) {
   	        String error = "Error while verifying element state: " + e.getMessage();
   	        System.out.println(error);
   	        ExtentCucumberAdapter.addTestStepLog(error);
   	        Assert.fail(error);
   	    }
   	}
// Method to verify text
public static boolean verifyTextInFile(String filePath, String expectedValue) {
    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.contains(expectedValue)) {
                System.out.println("Found expected value: " + expectedValue);
                return true;
            }
        }
    } catch (IOException e) {
        System.err.println("Error reading file: " + e.getMessage());
    }

    System.out.println("Expected value NOT found: " + expectedValue);
    return false;
} // ✅ Make sure this is closed properly

// Main method (for testing only, you can remove if unused)
public static void main(String[] args) {
    String path = "C:\\path\\to\\your\\file.txt";
    String expectedText = "Transaction successful";

    boolean isFound = verifyTextInFile(path, expectedText);
    if (isFound) {
        System.out.println("✅ Verification passed.");
    } else {
        System.out.println("❌ Verification failed.");
    }
}


public static void checkIfArrowCursorOnHover(String XPath) {
    
    WebElement element = browser.findElement(By.xpath(YMLUtil.getYMLObjectRepositoryData(XPath)));
    WebDriver browser = WebBrowser.getBrowser();

    Actions actions = new Actions(browser);
    JavascriptExecutor js = (JavascriptExecutor) driver;
 
    // Hover on the element
    actions.moveToElement(element).perform();
 
    // Allow time for hover to apply
    try {
        Thread.sleep(500); // optional delay
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
 
    // Get the cursor style
    String cursorStyle = (String) js.executeScript(
        "return window.getComputedStyle(arguments[0]).getPropertyValue('cursor');",
        element
    );
 
    // Check if cursor is arrow (default or auto)
    if ("default".equalsIgnoreCase(cursorStyle) || "auto".equalsIgnoreCase(cursorStyle)) {
        System.out.println("Element shows arrow cursor — considered DISABLED.");
    } else {
        System.out.println("Element shows cursor style: " + cursorStyle + " — considered ACTIVE.");
    }
}

public static void checkBackgroundColor(String param, String XPath) {
    try {
        WebDriver browser = WebBrowser.getBrowser();
        String expectedColor = getRGBAFromColorName(CommonUtil.getData(param));
        String resolvedXPath = YMLUtil.getYMLObjectRepositoryData(XPath);

        WebElement element = browser.findElement(By.xpath(resolvedXPath));
        String actualColor = element.getCssValue("background-color");

        if (actualColor.equals(expectedColor)) {
            ExtentCucumberAdapter.addTestStepLog("✅ Background color verification passed. Actual color: " + actualColor);
        } else {
            String msg = "❌ Background color verification failed. Expected: " + expectedColor + ", Actual: " + actualColor;
            ExtentCucumberAdapter.addTestStepLog(msg);
            throw new CustomException(msg); // Fails the test
        }

    } catch (Exception e) {
        ExtentCucumberAdapter.addTestStepLog("❌ Error during background color verification: " + e.getMessage());
        throw new CustomException("Background color check failed", e);
    }
}

private static String getRGBAFromColorName(String colorName) {
    Map<String, String> colorMap = new HashMap<>();
    colorMap.put("red", "rgba(255, 0, 0, 1)");
    colorMap.put("green", "rgba(0, 128, 0, 1)");
    colorMap.put("blue", "rgba(0, 0, 255, 1)");
    colorMap.put("yellow", "rgba(255, 255, 0, 1)");
    colorMap.put("gray", "rgba(128, 128, 128, 1)");
    colorMap.put("lightgreen", "rgba(144, 238, 144, 1)");
    colorMap.put("teal", "rgba(0, 128, 128, 1)");
    colorMap.put("lightteal", "rgba(193, 234, 229, 1)");

    String normalizedName = colorName == null ? "" : colorName.trim().toLowerCase();
    return colorMap.getOrDefault(normalizedName, colorName); // If not matched, return as-is (could be raw RGBA)
}

public static void checkCustomColor(String color, String XPath){
    if (color == null) {
        throw new IllegalArgumentException("Color cannot be null");
    }
    browser = WebBrowser.getBrowser();
    color = CommonUtil.getData(color);
    boolean verify = false;
  // Use a broad XPath if class is fully dynamic
//        List<WebElement> elements = (List<WebElement>) ((By) driver).findElement((SearchContext) By.xpath(YMLUtil.getYMLObjectRepositoryData(XPath)));
    List<WebElement> elements = browser.findElements(By.xpath(YMLUtil.getYMLObjectRepositoryData(XPath)));
    switch(color.toLowerCase()){
        case "green":
            for (WebElement el : elements) {
                String bgColor = el.getCssValue("background-color");
                if (bgColor.equals("rgb(193, 234, 229)") || bgColor.equals("rgba(193, 234, 229, 1)")) {
                    verify = true;
                    break;
                }else{
                    verify = false;
                }
            }
            break;
        case "blue":
            for (WebElement el : elements) {
                String bgColor = el.getCssValue("background-color");
                if (bgColor.equals("rgb(67, 143, 239)") || bgColor.equals("rgba(67, 143, 239, 1)")) {
                    verify = true;
                    break;
                }else{
                    verify = false;
                }
            }
            break;
        default:
        System.out.println("Unknown color: " + color);
        break;
    }
    if(verify){
        System.out.println("Color found");
        ExtentCucumberAdapter.addTestStepLog("Color found");
        WebBrowserUtil.captureScreenshot();
    }else{
        System.out.println("Color not found");
        ExtentCucumberAdapter.addTestStepLog("Color not found");
        WebBrowserUtil.captureScreenshot();
    }
}


        public static void uploadingFile(String param, String XPath) {
    		browser = WebBrowser.getBrowser();
    		param = CommonUtil.getData(param);
    		// Split the locator string using "::"
    	    String[] locators = YMLUtil.getYMLObjectRepositoryData(XPath).split("::");
    	    String uploadbutton = locators[0];  // Checkbox XPath or CSS
    	    String fileInputXpath = locators[1];  // Pagination button XPath or CSS
    		String filePath = param.contains(":") ? param
    				: Paths.get(System.getProperty("user.dir"), "src", "test", "java", "attachments", param).toString();
    		File file = new File(filePath);
    		if (!file.exists() || !file.isFile()) {
    			throw new CustomException("File not found at path: " + filePath);
    		}
    		int i = 0;
    		while (i < Constants.NUMBER_OF_ITERATION) {
    			try {
    				try {
    	    			// put path to your image in a clipboard
    	    			if (WebBrowser.browserType.toUpperCase().equals("HEADLESS CHROME")) {
    	    				try {
    	    			        WebElement fileInput;

    	    			        // Retry mechanism to avoid StaleElementReferenceException
    	    			        for (int j = 0; j < 3; j++) { // Retry up to 3 times
    	    			            try {
    	    			                fileInput = WebBrowserUtil.findElement(fileInputXpath, "xpath"); // Find fresh element
    	    			                
    	    			                if (fileInput != null) {
    	    			                    // Ensure the file input is visible
    	    			                    JavascriptExecutor js = (JavascriptExecutor) browser;
    	    			                    js.executeScript("arguments[0].style.display='block';", fileInput);
    	    			                    
    	    			                    // Upload file
    	    			                    fileInput.sendKeys(filePath);
    	    			                    System.out.println("File uploaded successfully: " + filePath);
    	    			                    WebBrowserUtil.captureScreenshot();
    	    			                    return; // Exit if successful
    	    			                }
    	    			            } catch (StaleElementReferenceException e) {
    	    			                System.out.println("Retrying due to stale element...");
    	    			            }
    	    			        }
    	    			        throw new CustomException("File input field not found or stale.");
    	    			    } catch (Exception ex) {
    	    			        throw new CustomException("File upload failed: " + ex.getMessage());
    	    			    }
    	    			}else {
    	    				try {
    	    					WebElement upload = WebBrowserUtil.findElement(uploadbutton, "xpath");
    	    					upload.click();
    	    					StringSelection ss = new StringSelection(filePath);
        	    				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        	    				
        	    				// imitate mouse events like ENTER, CTRL+C, CTRL+V
        	    				Robot robot = new Robot();
        	    				robot.delay(4000);
        	    				robot.keyPress(KeyEvent.VK_ENTER);
        	    				robot.keyRelease(KeyEvent.VK_ENTER);
        	    				robot.keyPress(KeyEvent.VK_CONTROL);
        	    				robot.keyPress(KeyEvent.VK_V);
        	    				robot.keyRelease(KeyEvent.VK_V);
        	    				robot.keyRelease(KeyEvent.VK_CONTROL);
        	    				robot.keyPress(KeyEvent.VK_ENTER);
        	    				robot.delay(50);
        	    				robot.keyRelease(KeyEvent.VK_ENTER);
    	    				}catch(Exception ex) {
    	    					throw new CustomException("File upload failed: " + ex.getMessage());
    	    				}
    	    			}
    	    		} catch (Exception ex) {
    	    			throw new CustomException(ex.getMessage());
    	    		}
    				break;
    			} catch (Exception ex) {
    				i++;
    				if (i >= Constants.NUMBER_OF_ITERATION) {
    					throw new CustomException("File upload failed", ex);
    				}
    			}
    		}
    		
    	}

        private static int totalSelectionsSoFar = 0;        // Cumulative total from param
        private static Integer totalCheckboxesCounted = null;  // Use Integer to check if counted or not

        public static boolean verifySelectedPercentageIncremental(String param, String percentageXPathKey, String identification) {
            String xpath = YMLUtil.getYMLObjectRepositoryData(percentageXPathKey);
            param = CommonUtil.getData(param);
            boolean verified = false;

            int stepSelectionCount = Integer.parseInt(param);  // Number of checkboxes to select in this step
            String checkboxXPath = "//div[@role='presentation' and @class='ag-selection-checkbox']";
            String scrapperXPath = "//div[@col-id='CONTROL NAME' and @role='gridcell']";
            String muiSaveButtonXPath = "//*[name()='svg'][@class='svg-inline--fa fa-code-merge ']";

            // If totalCheckboxesCounted is not yet set, count checkboxes now
            if (totalCheckboxesCounted == null) {
                List<WebElement> checkboxes = WebBrowserUtil.findElements(checkboxXPath, identification);
                int totalCheckboxes = checkboxes.size();

                if (totalCheckboxes == 0) {
                    throw new RuntimeException("❌ No checkboxes found.");
                }

                totalCheckboxesCounted = totalCheckboxes;
            }

            int totalCheckboxes = totalCheckboxesCounted;

            if (stepSelectionCount < 0) {
                throw new IllegalArgumentException("❌ Cannot select a negative number of checkboxes.");
            }

            try {
                // Select only 'stepSelectionCount' new checkboxes
                List<WebElement> checkboxes = WebBrowserUtil.findElements(checkboxXPath, identification);
                int selectedInStep = 0;
                for (WebElement checkbox : checkboxes) {
                    if (!checkbox.isSelected()) {
                        checkbox.click();
                        selectedInStep++;
                        Thread.sleep(300);
                        if (selectedInStep == stepSelectionCount) break;
                    }
                }

                if (selectedInStep < stepSelectionCount) {
                    System.out.println("⚠️ Only " + selectedInStep + " checkboxes selected (requested: " + stepSelectionCount + ")");
                }

                // Update the cumulative count **based on param**, not actual selection
                totalSelectionsSoFar += stepSelectionCount;
                if (totalSelectionsSoFar > totalCheckboxes) {
                    totalSelectionsSoFar = totalCheckboxes;
                }

                // Click scrapper row if applicable
                List<WebElement> scrappers = WebBrowserUtil.findElements(scrapperXPath, identification);
                if (!scrappers.isEmpty() && scrapperSelectionIndex < scrappers.size()) {
                    scrappers.get(scrapperSelectionIndex).click();
                    scrapperSelectionIndex++;
                    Thread.sleep(800);
                }

                // Click save button
                WebElement saveButton = WebBrowserUtil.findElement(muiSaveButtonXPath, identification);
                WebBrowserUtil.click(saveButton);
                Thread.sleep(800);

                // Read actual UI percentage — with graceful handling if element not found
                int actualPercentage = 0;  // default 0% if element missing
                boolean isMappedPercentageLabelFound = true;
                try {
                    WebElement percentageElement = WebBrowserUtil.findElement(xpath, identification);
                    String actualText = WebBrowserUtil.getText(percentageElement);
                    Matcher matcher = Pattern.compile("\\d+").matcher(actualText);
                    if (matcher.find()) {
                        actualPercentage = Integer.parseInt(matcher.group());
                    } else {
                        throw new RuntimeException("❌ Could not parse percentage from: " + actualText);
                    }
                } catch (org.openqa.selenium.NoSuchElementException e) {
                    System.out.println("⚠️ Mapped percentage label not found, assuming 0%");
                    actualPercentage = 0;
                    isMappedPercentageLabelFound = false;
                }

                int expectedPercentage;

                if (isMappedPercentageLabelFound) {
                    // If label found, DO NOT recalc total checkboxes or expected percentage from selection
                    // Instead, we trust the UI (actualPercentage) and calculate expectedPercentage accordingly:
                    expectedPercentage = actualPercentage;

                    // Note: You can decide to keep totalSelectionsSoFar consistent with actualPercentage here if needed.
                    // For example:
                    // totalSelectionsSoFar = (int) Math.round((actualPercentage / 100.0) * totalCheckboxes);
                } else {
                    // If label NOT found, calculate expected percentage based on selections and total checkboxes
                    expectedPercentage = (int) Math.round(((double) totalSelectionsSoFar / totalCheckboxes) * 100);
                }

                // Final assertion
                assertEquals("Percentage mismatch!", expectedPercentage, actualPercentage);

                // Logging
                String log = "✅ Percentage verified | Step Selected: " + stepSelectionCount +
                             " | Total Selected: " + totalSelectionsSoFar + "/" + totalCheckboxes +
                             " | Expected: " + expectedPercentage + "% | Actual: " + actualPercentage + "%";
                System.out.println(log);
                ExtentCucumberAdapter.addTestStepLog(log);
                verified = true;

            } catch (Exception e) {
                e.printStackTrace();
                ExtentCucumberAdapter.addTestStepLog("❌ Error: " + e.getMessage());
                throw new RuntimeException(e);
            }

            return verified;
        }

        // Reset tracking at the beginning of each test scenario
        public static void resetPercentageTracking() {
            totalSelectionsSoFar = 0;
            scrapperSelectionIndex = 0;
            totalCheckboxesCounted = null;
        }


        
        public void selectLastEnabledDate(String XPath) {
            // Open the calendar icon
    		browser = WebBrowser.getBrowser();

            browser.findElement(By.xpath(YMLUtil.getYMLObjectRepositoryData(XPath))).click();
            WebElement element = browser.findElement(By.xpath(YMLUtil.getYMLObjectRepositoryData(XPath)));


            // Fetch all enabled date elements from the calendar
            List<WebElement> enabledDates = browser.findElements(By.xpath(
                "//td[not(contains(@class, 'disabled')) and not(contains(@class, 'old')) and not(contains(@class, 'new'))]"
            ));

            // Select the last enabled (present) date
            if (!enabledDates.isEmpty()) {
                enabledDates.get(enabledDates.size() - 1).click();
            } else {
                System.out.println("No enabled dates available to select.");
            }
        }

        
        
        
}

