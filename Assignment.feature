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
Feature: Assignment Functionality

  Scenario: Header Validation
    Given Admin/User/Staff Logged on to LMS website
    When Admin/User/Staff clicks on Assignment Page
    Then Admin/User/Staff Should see a Header "Manage Assignment"

  Scenario: Footer Validation
    Given Admin/User/Staff Logged on to LMS website
    When Admin/User/Staff clicks on Assignment Page
    Then Admin/User/Staff Should see a Footer text "In Total there are 3 assignments"

  Scenario: Paginator Vaildation
    Given Admin/User/Staff Logged on to LMS website
    When Admin/User/Staff clicks on Assignment Page
    Then Admin/User/Staff Should see a Paginator text "Showing 1 to 3 of 3 entries"
    When Admin/User/Staff Clicks on Enabled paginator-next button
    Then Admin/User/Staff Should be navigated to next page
    When Admin/User/Staff Clicks on Enabled paginator-previous button
    Then Admin/User/Staff Should be navigated to previous page
    When Admin/User/Staff Clicks on Enabled paginator-second next button
    Then Admin/User/Staff Should be navigated to Last page
    When Admin/User/Staff Clicks on Enabled paginator-first previous button
    Then Admin/User/Staff Should be navigated to First page

  Scenario: Search functionality
    Given Admin/User/Staff login into LMS website
    When Admn/User/Staff clicks Search bar after entering Assignment name
    Then The requested assignment details should be displayed

  Scenario: Ascending Order Functionality
    Given Admin/User/Staff is on Assignment Page
    When Admin/User/Staff Clicks on Assignment Name Ascending Arrow
    Then Admin/User/Staff should see the Assignment Name displayed in Ascending order
    When Admin/User/Staff Clicks on Assignment Description Ascending Arrow
    Then Admin/User/Staff should see the Assignment Description displayed in Ascending order
    When Admin/User/Staff Clicks on Assignment Due Date Ascending Arrow
    Then Admin/User/Staff should see the Assignment Due Date displayed in Ascending order
    When Admin/User/Staff Clicks on Assignment Grade Ascending Arrow
    Then Admin/User/Staff should see the Assignment Grade displayed in Ascending order

  Scenario: Descending Order Functionality
    When Admin/User/Staff Clicks on Assignment Name Descending Arrow
    Then Admin/User/Staff should see the Assignment Name displayed in Descending order
    When Admin/User/Staff Clicks on Assignment Description Descending Arrow
    Then Admin/User/Staff should see the Assignment Description displayed in Descending order
    When Admin/User/Staff Clicks on Assignment Due Date Descending Arrow
    Then Admin/User/Staff should see the Assignment Due Date displayed in Descending order
    When Admin/User/Staff Clicks on Assignment Grade Descending Arrow
    Then Admin/User/Staff should see the Assignment Grade displayed in Descending order

  Scenario: Add New Assignment  Functionality
    ending

    Given Staff/User is on Manage Assignment page
    When Staff/User clicks a Add new assignment button
    Then Staff/User should see Assignment details window
    When Admin clicks a Add New Assignment button
    Then Admin should see a message "Staff/User only have access to add New Assignment"
    When Staff/User  clicks on Save after leaving all the fields empty
    Then Staff/User should see an error message "Name is required"
    When Staff/User clicks  Save button after entering Assignment details
    Then Staff/User should see a message "New Assignment successfully added"
    When Staff/User clicks cancel button while entering all fields
    Then Staff/User should see a Assignment details window is closed by not adding New Assignment in page
    When Admin/User/Staff clicks on Assignment
    Then Admin/User/Staff should see a newly added Assignment
    When Staff/User clicks manage button under Assignment Grade
    Then Staff/User should be navigated to Grade Window

  Scenario: Edit Functionality
    Given Staff is on Manage Assignment page
    When Staff/User clicks an edit Assignment button
    Then Staff/User should see a Assignment details window
    When Staff/User clicks Save button after edits Assignment Name
    Then Staff/User should see a message "Assignment Name updated"
    When Staff/User clicks Save button  after edits Assignment Description
    Then Staff/User should see a message "Assignment Description updated"
    When Staff/User clicks Save button After edits Assignment Grade
    Then Staff/User should see a message "Assignment Grade updated"
    When Staff/User clicks Save button After edits Assignment DueDate
    Then Staff/User should see a message "Assignment Due Date Updated"
    When Staff/User clicks cancel button
    Then Staff/User Should see a Assignment Details Page is closed without any updates on Assignment details
    When Admin/User/Staff clicks Edit button
    Then Admin/Staff/User should see a message "Staff/User can edit the Assignment Page"

  Scenario: Assignment Google form
    Given Admin/User/Staff on Assignment page
    When Admin/User/Staff clicks on Assignment Name
    Then Admin/User/Staff should be navigated to Assignment Google form page
    When Admin clicks on Assignment Name
    Then Message displays as "Admin Restricted to access"
    When Admin/User/Staff clicks on submit button after entering all questions and mail id
    Then Admin/User/Staff entered google forms successfully
    When Admin/User/Staff clicks on submit button after leaving all questions and mail id
    Then Message shows need to enter "Mandatory Fields"
    When Admin/User/Staff clicks Switch account link
    Then Admin/User/Staff should be switched over the account Successfully

  Scenario: Delete Assignment Functionality
    Given Staff/User is on Manage Assignment page
    When Staff/User clicks on delete button on the right side
    Then Staff/User should see a Delete Confirmation window
    When Staff/User clicks Yes
    Then Message occurs as "Assignment deleted Successfully"
    When Staff/User clicks No
    Then Window is closed without deleting the assignment
    When Admin clicks on delete button
    Then Message says "Admin restricted to do delete action"

  Scenario: Delete Multiple Assignment Functionality
    Given Admin/User/Staff is on Assignments page
    When Admin/User/Staff clicks on delete button on the top left
    Then Admin/User/Staff/ should see a disabled delete button
    When Staff/User clicks delete button on the top aftr selecting multiple checkbox
    Then Staff/User should see a Delete confirm window
    When Staff clicks Yes
    Then All Assignments are deleted Successfully
    When Staff clicks No
    Then Confirmation delete window should be closed successfully

  Scenario: Checkbox Functionality
    Given Admin/User/Staff is on Manage Assignment page
    When Admin/User/Staff clicks check box on the left side to the Assignment Name
    Then Admin/User/Staff should see a enabled delete button on the top left
    When Admin clicks check box on the left side to the Assignment Name
    Then Message occurs"No access to Admin to click on Checkbox"
    When Admin/User/Staff clicks individual checkbox button
    Then Admin/User/Staff should see a delete button on the top left
    When Admin clicks individual checkbox button
    Then Alert Message as "No access to click on Checkbox button"
