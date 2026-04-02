package stepdefinitions;
    
import io.cucumber.java.en.*;
import workflows.SeleniumWorkFlow;
import common.*;

  @SuppressWarnings("all")
  public class ScenarioslistpageStepDefinition
	{
      SeleniumWorkFlow workFlow = new SeleniumWorkFlow();
      
            @When("^I selected scenario edit button in scenarios list page$")			
            public void whenISelectedScenarioEditButtonInScenariosListPage()
            {
                workFlow.clickedElement(0, "Scenarios list page", "Scenarios list page.scenarioeditbuttonButtonXPATH", "XPATH");
                
            }
    }