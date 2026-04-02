package stepdefinitions;
    
import io.cucumber.java.en.*;
import workflows.SeleniumWorkFlow;
import common.*;

  @SuppressWarnings("all")
  public class ProjectlistpageStepDefinition
	{
      SeleniumWorkFlow workFlow = new SeleniumWorkFlow();
      
            @When("^I entered Search projects in project list page as '(.*)'$")			
            public void whenIEnteredSearchProjectsInProjectListPageAssearchProjects1(String  varsearchProjects1)
            {
                workFlow.enterText(varsearchProjects1, 0, "Project list page", "Project list page.SearchprojectsTextBoxXPATH", "XPATH");
                
            }
            @When("^I selected Searched project 3dots in project list page$")			
            public void whenISelectedSearchedProject3dotsInProjectListPage()
            {
                workFlow.clickedElement(0, "Project list page", "Project list page.Searchedproject3dotsButtonXPATH", "XPATH");
                
            }
            @When("^I selected Clone button in project list page$")			
            public void whenISelectedCloneButtonInProjectListPage()
            {
                workFlow.clickedElement(0, "Project list page", "Project list page.ClonebuttonButtonXPATH", "XPATH");
                
            }
            @When("^I copied text Search projects in project list page$")			
            public void whenICopiedTextSearchProjectsInProjectListPage()
            {
                workFlow.copiedtext(0, "Project list page", "Project list page.SearchprojectsTextBoxXPATH", "XPATH");
                
            }
    }