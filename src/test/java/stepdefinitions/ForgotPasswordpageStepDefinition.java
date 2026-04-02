package stepdefinitions;
    
import io.cucumber.java.en.*;
import workflows.SeleniumWorkFlow;
import common.*;

  @SuppressWarnings("all")
  public class ForgotPasswordpageStepDefinition
	{
      SeleniumWorkFlow workFlow = new SeleniumWorkFlow();
      
            @When("^I wait in seconds for sometime in forgot password page as '(.*)'$")			
            public void whenIWaitInSecondsForSometimeInForgotPasswordPageAsforSometime5(String  varforSometime5)
            {
                workFlow.waitInSeconds(varforSometime5, 0, "Forgot Password page", "Forgot Password page.forsometimeTextBoxXPATH", "XPATH");
                
            }
    }