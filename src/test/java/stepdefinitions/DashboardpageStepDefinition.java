package stepdefinitions;
    
import io.cucumber.java.en.*;
import workflows.SeleniumWorkFlow;
import common.*;

  @SuppressWarnings("all")
  public class DashboardpageStepDefinition
	{
      SeleniumWorkFlow workFlow = new SeleniumWorkFlow();
      
             @Then("^verify displayed AlgoQA Dashboard label in dashboard page$")			
            public void thenVerifyDisplayedAlgoqaDashboardLabelInDashboardPage()
            {
                Assertion.isTrue(workFlow.verifyTextInLink(0, "Dashboard page", "Dashboard page.AlgoQADashboardlabelLabelXPATH", "XPATH"), "Then verify displayed AlgoQA Dashboard label in dashboard page");
        WebBrowserUtil.captureScreenshot();
                
            }
    }