package stepdefinitions;
    
import io.cucumber.java.en.*;
import workflows.SeleniumWorkFlow;
import common.*;

  @SuppressWarnings("all")
  public class ProjectSettingstabStepDefinition
	{
      SeleniumWorkFlow workFlow = new SeleniumWorkFlow();
      
            @When("^I selected Update in project settings tab$")			
            public void whenISelectedUpdateInProjectSettingsTab()
            {
                workFlow.clickedElement(0, "Project Settings tab", "Project Settings tab.UpdateButtonXPATH", "XPATH");
                
            }
            @When("^I clear and enter text Settings Project Name Textbox in project settings tab as '(.*)'$")			
            public void whenIClearEnterTextSettingsProjectNameTextboxInProjectSettingsTabAssettingsProjectNameTextbox8(String  varsettingsProjectNameTextbox8)
            {
                workFlow.clearAndEnterText(varsettingsProjectNameTextbox8, 0, "Project Settings tab", "Project Settings tab.SettingsProjectNameTextboxTextBoxXPATH", "XPATH");
                
            }
    }