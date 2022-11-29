#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Program module for LMS Phase

  Scenario: Header Validation
    Given Admin/User/Staff logged on to LMS Website
    When Admin/User/Staff is on Manage Program page
    Then Admin/User/Staff see header text as "Manage Program"

  Scenario: Footer Validation
    Given Admin/User/Staff Logged on to LMS Website
    When Admin/User/Staff is on Manage Program page
    Then Admin/User/Staff see Footer text as "In total there are 9 programs"

  Scenario: Paginator Validation
    Given Admin/User/Staff Logged on to LMS Website
    When Admin/User/Staff is on Manage Program page
    Then Admin/User/Staff  see the text as "Showing 1 to 5 of 9 entries"
    When Admin/User/Staff Clicks on Enabled paginator to next button
    Then Admin/User/Staff see Paginator text as "Showing 6 to 9 of 9 entries"
    When Admin/User/Staff Clicks on Enabled paginator -prev button
    Then Admin/User/Staff see Paginator text as"Showing 1 to 5 of 9 entries"
    When Admin/User/Staff Clicks on Enabled paginator-last button
    Then Admin/User/Staff see Page number navigated to '2'
    When Admin/User/Staff Clicks on Enabled paginator -first button
    Then Admin/User/Staff see Page number navigated to '1'

  Scenario: Search TextBox Functionality
    Given Admin/User/Staff Logged on to LMS Website
    When Admin/User/Staff is on Manage Program page
    Then Admin/User/Staff see the Search Text box has text as "Search"
    When Admin/User/Staff enters Program Name to be searched
    Then Entries for the searched Program Name are shown
    When Admin/User/Staff enters Program Description to be searched
    Then Entries for the searched Program Description are shown
    When Admin/User/Staff enters Program Status to be searched
    Then Entries for the searched Program Status are shown

  Scenario: Ascending order Functionality
    Given Admin/User/Staff is on Manage Program page
    When Admin/User/Staff Clicks on Program Name Ascending Arrow
    Then Admin/User/Staff see the Program Name displayed in Ascending order
    When Admin/User/Staff Clicks on Program Description Ascending Arrow
    Then Admin/User/Staff see the Program Description displayed in Ascending order
    When Admin/User/Staff Clicks on Program Status Ascending Arrow
    Then Admin/User/Staff see the Program Status displayed in Ascending order

  Scenario: Descending order Functionality
    Given Admin/User/Staff is on Manage Program page
    When Admin/User/Staff Clicks on Program Name Descending Arrow
    Then Admin/User/Staff see the Program Name displayed in Descending order
    When Admin/User/Staff Clicks on Program Description Descending Arrow
    Then Admin/User/Staff see the Program Description displayed in Descending order
    When Admin/User/Staff Clicks on Program Status Descending Arrow
    Then Admin/User/Staff see the Program Status displayed in Descending order

  Scenario: Adding New Program Functionality
    Given Admin is on Manage Program page
    When Admin Clicks on  " + A New Program" button
    Then Admin see header text as "Program Details"
    When Admin Clicks on Save Button with out entering details
    Then Admin see Error message "Name is required"
    When Admin Clicks on Save Button after entering all details
    Then Admin see Success message "New Program Created"
    When Admin Clicks on Save Button after entering Name alone
    Then Admin get Error message "Description is required"
    When Admin Clicks on Save Button after entering Description alone
    Then Admin gets an error "Name is required"
    When Admin Clicks on Save Button after selecting Status alone
    Then Admin see Error message "Name required"
    When Admin Clicks on Cancel button
    Then Admin see a Program Details window getting closed
    When Admin/User/Staff enters newly added Program Name in Search
    Then Entry for the newly added Program Name is shown
    When User/Staff is on Manage Program page by clicking "+A New Program" button
    Then User/Staff see a Error message "Only Admin have Access"

  Scenario: Total number of rows in a table
    Given Admin/User/Staff Logged on to LMS Website
    When Admin/User/Staff is on Manage Program page
    Then Admin/User/Staff counts number of rows as 5 in a table

  Scenario: Edit Functionality
    Given Admin is on Manage Program page
    When Admin Clicks on Edit buttton
    Then Admin see header text as "Program Details"
    When Admin Clicks on Save Button after updating Name
    Then Admin see Success message "Updated Name in Program details"
    When Admin  Clicks on Save Button after updating  Description
    Then Admin see success message as "Updated Description in Program details"
    When Admin  Clicks on Save Button after Changing the status
    Then Admin see a Success message "Updated Status in Program details"
    When Admin clicks on Cancel button
    Then Admin sees a Program details window is closed without any modification made
    When Admin/User/Staff enter edited Program Name in Search feature
    Then It should display the edited Program Name details
    When Admin/User/Staff enter edited Program description in Search field
    Then It Shows edited description in program details
    When User/Staff tries to click on Edit button
    Then Display an error message stating that "Please login as an Admin to have access to this page"

  Scenario: Delete Functionality
    Given Admin on Manage Program Page
    When Admin clicks on Delete feature in Manage Program
    Then Admin sees a text mesaage "Delete Confirm"
    When Admin Clicks on Yes  button
    Then Admin see Success message "Program Deleted Succesfully"
    When Admin Clicks on No button
    Then Admin see a message "Program Name is not Deleted"
    When Admin Enters deleted  Program Name in Search
    Then Admin finds no results
    When User/Staff Clicks on Delete buttton
    Then It desplays a message that "Only Admin can Access"

  Scenario: Delete Multiple Records
    Given Admin Manage Program Page
    When Admin Clicks on Checkbox near to Program Name on left side of the page by having Program details on below
    Then Admin can view enabled delete button by selecting all the Program Details present on the Manage Program
    When Admin Clicks on checkbox near to Program Name without having any Program Details record
    Then Admin see a Delete button disabled
    When Admin selects a more than one checkbox in Program Details
    Then Admin see a Enabled Delete button
    When Admin Clicks on Enabled Delete button
    Then Message occurs in Pop Up screen as Delete Confirm
    When Admin Clicks Yes
    Then Selected Program details are deleted from the Program Page
    When Admin Clicks No
    Then Admin can see the Program details are not deleted
    When Admin/User/Staff Enters deleted  Program Names in Search
    Then Can see meassage "No results found"
    When User/Staff clicks on Delete button with and without Program Details
    Then User/Staff will view disabled Delete button by getting a message"Admin has the access"
    When Admin/User/Staff navigate to homepage
    Then Validate the navigation
