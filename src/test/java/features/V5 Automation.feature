Feature: V5 Automation1
#Regression Type
#Correct Values = true
#Incorrect Values = false
#Illegal Values = false
#Invalid Values = false
#Boundary Values = false
#Edge Cases Values = false

@Clone_Project_sanity
@test001
@Id68ac33467d5057ddb9a82489
@Sanity
@Smoke
@Clone
Scenario Outline:  Clone project Functionality
i. Verify user can clone the any Automation type project(Currently WEB)
Given I have access to application
Then verify displayed Login to algoQA in login page
When I entered Enter your email in login page as '<Enter your email>'
And I entered Enter your password in login page as '<Enter your password>'
And I selected Login Button in login page
And I click if visible Continue Login in login page
Then verify displayed User signed in successfully popup in login page
When I click if visible react tour skip button in algoqa
Then verify displayed AlgoQA Dashboard label in dashboard page
When I selected Projects Icon in left navigation bar
Then verify displayed Project list label in project list page
When I entered Search projects in project list page as '<Search projects1>'
Then verify displayed Searched project in project list page
When I selected Searched project in project list page
Then verify displayed Node in canvas page
When I clicked Node name in canvas page
And I selected feature name 1 in node configuration page
And I copied text Control Name textbox in node configuration page
And I selected Test Design icon in project menu
Then verify displayed Scenario label in scenarios list page
When I selected scenario edit button in scenarios list page
And I selected Edit scenario button in scenario edit page
And I copied text Scenario name text field in scenario edit page
And I selected Projects Icon in left navigation bar
Then verify displayed Project list label in project list page
When I entered Search projects in project list page as '<Search projects2>'
And I selected Searched project 3dots in project list page
And I selected clone in clone project
Then verify displayed clone project label in clone project
And verify displayed Specify a name for a copied project in clone project
When I entered Project Name for clone in clone project as '<Project Name for clone3>'
And I copied text Project Name for clone in clone project
And I selected Clone Project submit button in clone project
Then verify displayed Project copied successfully in clone project
When I entered Search projects in project list page as '<Search projects4>'
Then verify displayed Searched project in project list page
When I selected Searched project in project list page
And I wait in seconds for sometime in forgot password page as '<for sometime5>'
Then verify displayed Node in canvas page
When I selected Node in canvas page
And I selected feature name 1 in node configuration page
Then verify content copied control name in node configuration page as '<copied control name6>'
When I selected Test Design icon in project menu
Then verify displayed Scenario label in scenarios list page
When I selected scenario edit button in scenarios list page
And I selected Edit scenario button in scenario edit page
Then verify content copied scenario name in scenario edit page as '<copied scenario name7>'
When I selected Test Design icon in project menu
And I checked Last Scenario CheckBox in scenarios list page
And I clicked Generate TestCase button in scenarios list page
And I wait for control visible Test Cases Generated Successfully in generate test window
Then verify displayed Test Cases Generated Successfully in generate test window
When I clicked generate_script_button in generate test window
And I wait for control visible Scripts Generated Successfully in generate test window
Then verify displayed Scripts Generated Successfully in generate test window
When I selected Settings icon in project menu
And I clicked Project Settings in settings page
And I clear and enter text Settings Project Name Textbox in project settings tab as '<Settings Project Name Textbox8>'
And I selected Update in project settings tab
Then verify displayed Settings updated successfully in project settings tab
When I selected Projects Icon in left navigation bar
Then verify displayed Project list label in project list page
When I entered Search projects in project list page as '<Search projects9>'
And I wait in seconds for sometime in forgot password page as '<for sometime10>'
And I selected Searched project 3dots in project list page
And I selected Delete project in project list page
And I selected Delete button in project list page
Then verify displayed project deleted Successfully popup in project list page
And '<page>' is displayed with '<content>'

Examples:
|SlNo.|Enter your email|Enter your password|Search projects1|Search projects2|Project Name for clone3|Search projects4|for sometime5|copied control name6|copied scenario name7|Settings Project Name Textbox8|Search projects9|for sometime10|page|content|
|1|Enteryouremail|Enteryourpassword|Searchprojects|Searchprojects|ProjectNameforclone|Searchprojects_1|forsometime|copiedcontrolname|copiedscenarioname|SettingsProjectNameTextbox|Searchprojects_2|forsometime|Algoshack|NA|

#Total No. of Test Cases : 1

@Clone_project_2
@test002
@Id68ac33617d5057ddb9a87fcb
@Clone
Scenario Outline: Verify the project name textfield validation by passing different inputs while cloning project
Given I have access to application
Then verify displayed Login to algoQA in login page
When I entered Enter your email in login page as '<Enter your email>'
And I entered Enter your password in login page as '<Enter your password>'
And I click if visible Continue Login in login page
Then verify displayed User signed in successfully popup in login page
When I click if visible react tour skip button in algoqa
Then verify displayed AlgoQA Dashboard label in dashboard page
When I selected Projects Icon in left navigation bar
And I entered Search projects in project list page as '<Search projects1>'
And I copied text Search projects in project list page
And I selected Searched project 3dots in project list page
And I selected Clone button in project list page
And I entered Project Name for clone in clone project as '<Project Name for clone2>'
And I selected Clone Project submit button in clone project
Then verify content error msg for project name in clone project as '<error msg for project name>'
And '<page>' is displayed with '<content>'

Examples:
|SlNo.|Enter your email|Enter your password|Search projects1|Project Name for clone2|error msg for project name|page|content|
|1|Enteryouremail|Enteryourpassword|Searchprojects_3|ProjectNameforclone_10|errormsgforprojectname_5|Algoshack|NA|
|2|Enteryouremail|Enteryourpassword|Searchprojects_3|ProjectNameforclone_9|errormsgforprojectname_4|Algoshack|NA|
|3|Enteryouremail|Enteryourpassword|Searchprojects_3|ProjectNameforclone_8|errormsgforprojectname_3|Algoshack|NA|
|4|Enteryouremail|Enteryourpassword|Searchprojects_3|ProjectNameforclone_7|errormsgforprojectname_2|Algoshack|NA|
|5|Enteryouremail|Enteryourpassword|Searchprojects_3|ProjectNameforclone_6|errormsgforprojectname_1|Algoshack|NA|
|6|Enteryouremail|Enteryourpassword|Searchprojects_3|ProjectNameforclone_5|errormsgforprojectname_1|Algoshack|NA|
|7|Enteryouremail|Enteryourpassword|Searchprojects_3|ProjectNameforclone_4|errormsgforprojectname_1|Algoshack|NA|
|8|Enteryouremail|Enteryourpassword|Searchprojects_3|ProjectNameforclone_3|errormsgforprojectname_1|Algoshack|NA|
|9|Enteryouremail|Enteryourpassword|Searchprojects_3|ProjectNameforclone_2|errormsgforprojectname_1|Algoshack|NA|
|10|Enteryouremail|Enteryourpassword|Searchprojects_3|ProjectNameforclone_1|errormsgforprojectname|Algoshack|NA|

#Total No. of Test Cases : 11

