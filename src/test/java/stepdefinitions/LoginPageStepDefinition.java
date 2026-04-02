package stepdefinitions;
    
import io.cucumber.java.en.*;
import workflows.SeleniumWorkFlow;
import common.*;

  @SuppressWarnings("all")
  public class LoginPageStepDefinition
	{
      SeleniumWorkFlow workFlow = new SeleniumWorkFlow();
      
            @When("^I entered Enter your email in login page as '(.*)'$")			
            public void whenIEnteredEnterYourEmailInLoginPageAsenterYourEmail(String  varenterYourEmail)
            {
                workFlow.enterText(varenterYourEmail, 0, "Login Page", "Login Page.EnteryouremailTextBoxXPATH", "XPATH");
                
            }
            @When("^I entered Enter your password in login page as '(.*)'$")			
            public void whenIEnteredEnterYourPasswordInLoginPageAsenterYourPassword(String  varenterYourPassword)
            {
                workFlow.enterText(varenterYourPassword, 0, "Login Page", "Login Page.EnteryourpasswordTextBoxXPATH", "XPATH");
                
            }
            @When("^I selected Login Button in login page$")			
            public void whenISelectedLoginButtonInLoginPage()
            {
                workFlow.clickedElement(0, "Login Page", "Login Page.LoginButtonButtonXPATH", "XPATH");
                
            }
             @Then("^verify displayed User signed in successfully popup in login page$")			
            public void thenVerifyDisplayedUserSignedInSuccessfullyPopupInLoginPage()
            {
                Assertion.isTrue(workFlow.verifyTextInLink(0, "Login Page", "Login Page.UsersignedinsuccessfullypopupLabelXPATH", "XPATH"), "Then verify displayed User signed in successfully popup in login page");
        WebBrowserUtil.captureScreenshot();
                
            }
            @When("^I click if visible Continue Login in login page$")			
            public void whenIClickIfVisibleContinueLoginInLoginPage()
            {
                workFlow.clickIfVisible(0, "Login Page", "Login Page.ContinueLoginButtonXPATH", "XPATH");
                
            }
    }