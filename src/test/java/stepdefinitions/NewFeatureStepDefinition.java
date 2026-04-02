package stepdefinitions;
    
import io.cucumber.java.en.*;
import workflows.SeleniumWorkFlow;
import common.*;

  @SuppressWarnings("all")
  public class NewFeatureStepDefinition
	{
      SeleniumWorkFlow workFlow = new SeleniumWorkFlow();
      
            @When("^I selected clone in clone project$")			
            public void whenISelectedCloneInCloneProject()
            {
                workFlow.clickedElement(0, "New Feature", "New Feature.cloneButtonXPATH", "XPATH");
                
            }
             @Then("^verify displayed clone project label in clone project$")			
            public void thenVerifyDisplayedCloneProjectLabelInCloneProject()
            {
                Assertion.isTrue(workFlow.verifyTextInLink(0, "New Feature", "New Feature.cloneprojectlabelLabelXPATH", "XPATH"), "Then verify displayed clone project label in clone project");
        WebBrowserUtil.captureScreenshot();
                
            }
            @When("^I entered Project Name for clone in clone project as '(.*)'$")			
            public void whenIEnteredProjectNameForCloneInCloneProjectAsprojectNameForClone3(String  varprojectNameForClone3)
            {
                workFlow.enterText(varprojectNameForClone3, 0, "New Feature", "New Feature.ProjectNameforcloneTextBoxXPATH", "XPATH");
                
            }
            @When("^I copied text Project Name for clone in clone project$")			
            public void whenICopiedTextProjectNameForCloneInCloneProject()
            {
                workFlow.copiedtext(0, "New Feature", "New Feature.ProjectNameforcloneTextBoxXPATH", "XPATH");
                
            }
            @When("^I clicked Generate TestCase button in scenarios list page$")			
            public void whenIClickedGenerateTestcaseButtonInScenariosListPage()
            {
                workFlow.clickedElement(0, "New Feature", "New Feature.GenerateTestCasebuttonButtonXPATH", "XPATH");
                
            }
    }