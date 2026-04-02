package stepdefinitions;
    
import io.cucumber.java.en.*;
import workflows.SeleniumWorkFlow;
import common.*;

  @SuppressWarnings("all")
  public class EditScenariopageStepDefinition
	{
      SeleniumWorkFlow workFlow = new SeleniumWorkFlow();
      
            @When("^I selected Edit scenario button in scenario edit page$")			
            public void whenISelectedEditScenarioButtonInScenarioEditPage()
            {
                workFlow.clickedElement(0, "Edit Scenario page", "Edit Scenario page.EditscenariobuttonButtonXPATH", "XPATH");
                
            }
    }