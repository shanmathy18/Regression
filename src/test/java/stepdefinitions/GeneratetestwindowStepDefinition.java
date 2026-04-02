package stepdefinitions;
    
import io.cucumber.java.en.*;
import workflows.SeleniumWorkFlow;
import common.*;

  @SuppressWarnings("all")
  public class GeneratetestwindowStepDefinition
	{
      SeleniumWorkFlow workFlow = new SeleniumWorkFlow();
      
             @Then("^verify displayed Test Cases Generated Successfully in generate test window$")			
            public void thenVerifyDisplayedTestCasesGeneratedSuccessfullyInGenerateTestWindow()
            {
                Assertion.isTrue(workFlow.verifyTextInLink(0, "Generate test window", "Generate test window.TestCasesGeneratedSuccessfullyLabelXPATH", "XPATH"), "Then verify displayed Test Cases Generated Successfully in generate test window");
        WebBrowserUtil.captureScreenshot();
                
            }
            @When("^I clicked generate_script_button in generate test window$")			
            public void whenIClickedGeneratescriptbuttonInGenerateTestWindow()
            {
                workFlow.clickedElement(0, "Generate test window", "Generate test window.generate_script_buttonButtonXPATH", "XPATH");
                
            }
             @Then("^verify displayed Scripts Generated Successfully in generate test window$")			
            public void thenVerifyDisplayedScriptsGeneratedSuccessfullyInGenerateTestWindow()
            {
                Assertion.isTrue(workFlow.verifyTextInLink(0, "Generate test window", "Generate test window.ScriptsGeneratedSuccessfullyLabelXPATH", "XPATH"), "Then verify displayed Scripts Generated Successfully in generate test window");
        WebBrowserUtil.captureScreenshot();
                
            }
            @When("^I wait for control visible Test Cases Generated Successfully in generate test window$")			
            public void whenIWaitForControlVisibleTestCasesGeneratedSuccessfullyInGenerateTestWindow()
            {
                workFlow.waitForControlVisible(0, "Generate test window", "Generate test window.TestCasesGeneratedSuccessfullyLabelXPATH", "XPATH");
                
            }
            @When("^I wait for control visible Scripts Generated Successfully in generate test window$")			
            public void whenIWaitForControlVisibleScriptsGeneratedSuccessfullyInGenerateTestWindow()
            {
                workFlow.waitForControlVisible(0, "Generate test window", "Generate test window.ScriptsGeneratedSuccessfullyLabelXPATH", "XPATH");
                
            }
    }