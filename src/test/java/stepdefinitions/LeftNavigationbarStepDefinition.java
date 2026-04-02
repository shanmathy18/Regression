package stepdefinitions;
    
import io.cucumber.java.en.*;
import workflows.SeleniumWorkFlow;
import common.*;

  @SuppressWarnings("all")
  public class LeftNavigationbarStepDefinition
	{
      SeleniumWorkFlow workFlow = new SeleniumWorkFlow();
      
            @When("^I selected Projects Icon in left navigation bar$")			
            public void whenISelectedProjectsIconInLeftNavigationBar()
            {
                workFlow.clickedElement(0, "Left Navigation bar", "Left Navigation bar.ProjectsIconButtonXPATH", "XPATH");
                
            }
    }