package stepdefinitions;
    
import io.cucumber.java.en.*;
import workflows.SeleniumWorkFlow;
import common.*;

  @SuppressWarnings("all")
  public class NewFeature8StepDefinition
	{
      SeleniumWorkFlow workFlow = new SeleniumWorkFlow();
      
            @When("^I clicked Project Settings in settings page$")			
            public void whenIClickedProjectSettingsInSettingsPage()
            {
                workFlow.clickedElement(7, "New Feature8", "New Feature8.ProjectSettingsLinkXPATH", "XPATH");
                
            }
    }