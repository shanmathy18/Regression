package stepdefinitions;
    
import io.cucumber.java.en.*;
import workflows.SeleniumWorkFlow;
import common.*;

  @SuppressWarnings("all")
  public class ProjectmenuStepDefinition
	{
      SeleniumWorkFlow workFlow = new SeleniumWorkFlow();
      
            @When("^I selected Test Design icon in project menu$")			
            public void whenISelectedTestDesignIconInProjectMenu()
            {
                workFlow.clickedElement(0, "Project menu", "Project menu.TestDesigniconButtonXPATH", "XPATH");
                
            }
            @When("^I selected Settings icon in project menu$")			
            public void whenISelectedSettingsIconInProjectMenu()
            {
                workFlow.clickedElement(0, "Project menu", "Project menu.SettingsiconButtonXPATH", "XPATH");
                
            }
    }