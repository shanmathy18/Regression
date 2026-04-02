package stepdefinitions;
    
import io.cucumber.java.en.*;
import workflows.SeleniumWorkFlow;
import common.*;

  @SuppressWarnings("all")
  public class AlgoQAStepDefinition
	{
      SeleniumWorkFlow workFlow = new SeleniumWorkFlow();
      
            @When("^I click if visible react tour skip button in algoqa$")			
            public void whenIClickIfVisibleReactTourSkipButtonInAlgoqa()
            {
                workFlow.clickIfVisible(0, "AlgoQA", "AlgoQA.reacttourskipbuttonButtonXPATH", "XPATH");
                
            }
    }