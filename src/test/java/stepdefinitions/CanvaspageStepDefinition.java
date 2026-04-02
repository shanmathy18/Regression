package stepdefinitions;
    
import io.cucumber.java.en.*;
import workflows.SeleniumWorkFlow;
import common.*;

  @SuppressWarnings("all")
  public class CanvaspageStepDefinition
	{
      SeleniumWorkFlow workFlow = new SeleniumWorkFlow();
      
            @When("^I clicked Node name in canvas page$")			
            public void whenIClickedNodeNameInCanvasPage()
            {
                workFlow.clickedElement(0, "Canvas page", "Canvas page.NodenameLinkXPATH", "XPATH");
                
            }
    }