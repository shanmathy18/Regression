package attachments;

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

import common.CommonUtil;
import common.WebBrowser;
import common.YMLUtil;

import org.openqa.selenium.Alert;


import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

public class customUtil {
	public static WebDriver browser;

	public static void clearTextfield(String XPath) {

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
	
	
	
// 	public static void waitUntilElementVisible(String Xpath) {
//         int timeoutInSeconds = 10; // Adjust the timeout as needed
//         WebDriver browser = null;
//         try {
//             browser = WebBrowser.getBrowser();
//             WebDriverWait wait = new WebDriverWait(browser, (Duration.ofSeconds(timeoutInSeconds)));
//             wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath)));
//         } catch (TimeoutException e) {
//             // Handle timeout exception
//             System.out.println("Element with XPath '" + Xpath + "' was not visible within " + timeoutInSeconds + " seconds");
//         } catch (NoSuchElementException e) {
//             // Handle element not found exception
//             System.out.println("Element with XPath '" + Xpath + "' not found");
//         } catch (Exception e) {
//             // Handle other exceptions
//             e.printStackTrace();
//         } finally {
//             if (browser != null) {
//                 browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
//             }
//         }
//     }
    
    
    
    
    
    public static void waitUntilElementVisible(String XPath) {
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
    
    // Custom method to select a dropdown option by value attribute
    public static void selectDropdownByValue(String param, String XPath) {
    	browser=WebBrowser.getBrowser();
		Actions actions=new Actions(browser);
    	try {
    		WebElement Node = browser.findElement(By.xpath(YMLUtil.getYMLObjectRepositoryData(XPath)));
    		Select S = new Select(Node);
    		param=CommonUtil.getData(param);
    		S.selectByValue(param);
		} catch (Exception e) {
			e.printStackTrace();
		}                
    }

    public static boolean verifyAlertMessagePopup(String param){
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
            } else {
                System.out.println("Alert message is incorrect. Expected: " + param);
            }
            // Accept the alert (click OK)
            alert.accept();
            System.out.println("Alert accepted (OK clicked).");
            
        }
        catch(Exception e){
        	e.printStackTrace();
        }
        return true;
    }
}










