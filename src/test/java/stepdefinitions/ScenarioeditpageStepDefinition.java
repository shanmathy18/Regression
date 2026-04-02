package stepdefinitions;
    
import io.cucumber.java.en.*;
import workflows.SeleniumWorkFlow;
import common.*;

  @SuppressWarnings("all")
  public class ScenarioeditpageStepDefinition
	{
      SeleniumWorkFlow workFlow = new SeleniumWorkFlow();
      
             @Then("^verify content copied scenario name in scenario edit page as '(.*)'$")			
            public void thenVerifyContentCopiedScenarioNameInScenarioEditPageAscopiedScenarioName7(String  varcopiedScenarioName7)
            {
                Assertion.isTrue(workFlow.verifyContentTextBox(varcopiedScenarioName7, 0, "Scenario edit page", "Scenario edit page.copiedscenarionameTextBoxXPATH", "XPATH"), "Then verify content copied scenario name in scenario edit page as '<copied scenario name7>'");
      WebBrowserUtil.captureScreenshot();
                
            }
            @When("^I copied text Scenario name text field in scenario edit page$")			
            public void whenICopiedTextScenarioNameTextFieldInScenarioEditPage()
            {
                workFlow.copiedtext(0, "Scenario edit page", "Scenario edit page.ScenarionametextfieldTextBoxXPATH", "XPATH");
                
            }
            @When("^I checked Last Scenario CheckBox in scenarios list page$")			
            public void whenICheckedLastScenarioCheckboxInScenariosListPage()
            {
                workFlow.checkCheckbox(0, "Scenario edit page", "Scenario edit page.LastScenarioCheckBoxCheckBoxXPATH", "XPATH");
                
            }
    }