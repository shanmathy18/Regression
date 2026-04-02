package stepdefinitions;
    
import io.cucumber.java.en.*;
import workflows.SeleniumWorkFlow;
import common.*;

  @SuppressWarnings("all")
  public class NodeConfigurationpageStepDefinition
	{
      SeleniumWorkFlow workFlow = new SeleniumWorkFlow();
      
            @When("^I copied text Control Name textbox in node configuration page$")			
            public void whenICopiedTextControlNameTextboxInNodeConfigurationPage()
            {
                workFlow.copiedtext(0, "Node Configuration page", "Node Configuration page.ControlNametextboxTextBoxXPATH", "XPATH");
                
            }
            @When("^I selected feature name 1 in node configuration page$")			
            public void whenISelectedFeatureName1InNodeConfigurationPage()
            {
                workFlow.clickedElement(0, "Node Configuration page", "Node Configuration page.featurename1ButtonXPATH", "XPATH");
                
            }
             @Then("^verify content copied control name in node configuration page as '(.*)'$")			
            public void thenVerifyContentCopiedControlNameInNodeConfigurationPageAscopiedControlName6(String  varcopiedControlName6)
            {
                Assertion.isTrue(workFlow.verifyContentTextBox(varcopiedControlName6, 0, "Node Configuration page", "Node Configuration page.copiedcontrolnameTextBoxXPATH", "XPATH"), "Then verify content copied control name in node configuration page as '<copied control name6>'");
      WebBrowserUtil.captureScreenshot();
                
            }
    }