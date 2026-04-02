package stepdefinitions;
    
import io.cucumber.java.en.*;
import workflows.SeleniumWorkFlow;
import common.*;

  @SuppressWarnings("all")
  public class AlgoshackStepDefinition
	{
      SeleniumWorkFlow workFlow = new SeleniumWorkFlow();
      
             @Then("^verify displayed Login to algoQA in login page$")			
            public void thenVerifyDisplayedLoginToAlgoqaInLoginPage()
            {
                Assertion.isTrue(workFlow.verifyTextInLink(0, "Algoshack", "Algoshack.LogintoalgoQALabelXPATH", "XPATH"), "Then verify displayed Login to algoQA in login page");
        WebBrowserUtil.captureScreenshot();
                
            }
             @Then("^verify displayed Node in canvas page$")			
            public void thenVerifyDisplayedNodeInCanvasPage()
            {
                Assertion.isTrue(workFlow.verifyTextInLink(0, "Algoshack", "Algoshack.NodeButtonXPATH", "XPATH"), "Then verify displayed Node in canvas page");
        WebBrowserUtil.captureScreenshot();
                
            }
             @Then("^verify displayed Project list label in project list page$")			
            public void thenVerifyDisplayedProjectListLabelInProjectListPage()
            {
                Assertion.isTrue(workFlow.verifyTextInLink(0, "Algoshack", "Algoshack.ProjectlistlabelButtonXPATH", "XPATH"), "Then verify displayed Project list label in project list page");
        WebBrowserUtil.captureScreenshot();
                
            }
             @Then("^verify displayed Scenario label in scenarios list page$")			
            public void thenVerifyDisplayedScenarioLabelInScenariosListPage()
            {
                Assertion.isTrue(workFlow.verifyTextInLink(0, "Algoshack", "Algoshack.ScenariolabelLabelXPATH", "XPATH"), "Then verify displayed Scenario label in scenarios list page");
        WebBrowserUtil.captureScreenshot();
                
            }
             @Then("^verify displayed Searched project in project list page$")			
            public void thenVerifyDisplayedSearchedProjectInProjectListPage()
            {
                Assertion.isTrue(workFlow.verifyTextInLink(0, "Algoshack", "Algoshack.SearchedprojectButtonXPATH", "XPATH"), "Then verify displayed Searched project in project list page");
        WebBrowserUtil.captureScreenshot();
                
            }
            @When("^I selected Searched project in project list page$")			
            public void whenISelectedSearchedProjectInProjectListPage()
            {
                workFlow.clickedElement(0, "Algoshack", "Algoshack.SearchedprojectButtonXPATH", "XPATH");
                
            }
            @When("^I selected Clone Project submit button in clone project$")			
            public void whenISelectedCloneProjectSubmitButtonInCloneProject()
            {
                workFlow.clickedElement(0, "Algoshack", "Algoshack.CloneProjectsubmitbuttonButtonXPATH", "XPATH");
                
            }
            @When("^I selected Delete button in project list page$")			
            public void whenISelectedDeleteButtonInProjectListPage()
            {
                workFlow.clickedElement(0, "Algoshack", "Algoshack.DeletebuttonButtonXPATH", "XPATH");
                
            }
            @When("^I selected Delete project in project list page$")			
            public void whenISelectedDeleteProjectInProjectListPage()
            {
                workFlow.clickedElement(0, "Algoshack", "Algoshack.DeleteprojectButtonXPATH", "XPATH");
                
            }
            @When("^I selected Node in canvas page$")			
            public void whenISelectedNodeInCanvasPage()
            {
                workFlow.clickedElement(0, "Algoshack", "Algoshack.NodeButtonXPATH", "XPATH");
                
            }
             @Then("^verify displayed Project copied successfully in clone project$")			
            public void thenVerifyDisplayedProjectCopiedSuccessfullyInCloneProject()
            {
                Assertion.isTrue(workFlow.verifyTextInLink(0, "Algoshack", "Algoshack.ProjectcopiedsuccessfullyLabelXPATH", "XPATH"), "Then verify displayed Project copied successfully in clone project");
        WebBrowserUtil.captureScreenshot();
                
            }
             @Then("^verify displayed project deleted Successfully popup in project list page$")			
            public void thenVerifyDisplayedProjectDeletedSuccessfullyPopupInProjectListPage()
            {
                Assertion.isTrue(workFlow.verifyTextInLink(0, "Algoshack", "Algoshack.projectdeletedSuccessfullypopupLabelXPATH", "XPATH"), "Then verify displayed project deleted Successfully popup in project list page");
        WebBrowserUtil.captureScreenshot();
                
            }
             @Then("^verify displayed Specify a name for a copied project in clone project$")			
            public void thenVerifyDisplayedSpecifyANameForACopiedProjectInCloneProject()
            {
                Assertion.isTrue(workFlow.verifyTextInLink(0, "Algoshack", "Algoshack.SpecifyanameforacopiedprojectLabelXPATH", "XPATH"), "Then verify displayed Specify a name for a copied project in clone project");
        WebBrowserUtil.captureScreenshot();
                
            }
             @Then("^verify content error msg for project name in clone project as '(.*)'$")			
            public void thenVerifyContentErrorMsgForProjectNameInCloneProjectAserrorMsgForProjectName(String  varerrorMsgForProjectName)
            {
                Assertion.isTrue(workFlow.verifyContentTextBox(varerrorMsgForProjectName, 0, "Algoshack", "Algoshack.errormsgforprojectnameTextBoxXPATH", "XPATH"), "Then verify content error msg for project name in clone project as '<error msg for project name>'");
      WebBrowserUtil.captureScreenshot();
                
            }
             @Then("^verify displayed Settings updated successfully in project settings tab$")			
            public void thenVerifyDisplayedSettingsUpdatedSuccessfullyInProjectSettingsTab()
            {
                Assertion.isTrue(workFlow.verifyTextInLink(0, "Algoshack", "Algoshack.SettingsupdatedsuccessfullyLabelXPATH", "XPATH"), "Then verify displayed Settings updated successfully in project settings tab");
        WebBrowserUtil.captureScreenshot();
                
            }
             @Then("^'(.*)' is displayed with '(.*)'$")			
            public void thenpageIsDisplayedWithcontent(String  varpage, String varcontent)
            {
                Assertion.isTrue(workFlow.verifyDefaultpageIsdisplayed(varpage), "Then '<page>' is displayed with '<content>'");
                Assertion.isTrue(workFlow.verifymessageIsDisplayed(varcontent), "");
                
            }
    }