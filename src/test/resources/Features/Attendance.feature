Feature: Attendance Validation
Background: common steps
Scenario: Validating Attendance page
  Given Users Launch the chrome browser
  When Users opens the URL "http://lmsphase2seleniumhackahon.com/"
  Then Users enter valid "adminuserid" and valid "password"
  And Users clicks on login
  Then Users are on Homepage
  When Users click on Attendance 
  Then Users are on "Manage Attendance page"



Scenario: Validating the Attendance Header
Then Admin/User/Staff see header text as "Manage Attendance"

Scenario: Validating the Attendance Footer

 Then Users are on "Manage Attendance page"
Then Admin/User/Staff see Footer text as "In total there are 5 entries."

Scenario: Validating the Attendance Paginator
Then User should see the text "Showing 1 to 5 of 5 entries" beow the Attendance table.
Then Pagination control shoud  disable


Scenario: Verify the EditButton
Then Users are on "Manage Attendance page"
When User/Staff Clicks on EditButton
Then Admin see header text as "Attendance Details"


Scenario: Edit ProgramName in Attendance Details window
When User/Staff Clicks on EditButton
When User/Staff clicks on Save button after changing Program Name
Then User/Staff see the success message "Updated Successfully"
When User/Staff clicks on Save button after changing User name
Then User/Staff see the success message "Updated Successfully"
When User/Staff clicks on Save button after disabling Present details 
Then User/Staff see the success message "Updated Successfully"
When User/Staff clicks on Save button after enabling Absent details
Then User/Staff see the success message "Updated Successfully"
When User/Staff clicks on Cancel button after entering details 
Then User/Staff see a Attendance Details window getting closed


Scenario: Admin Verify the EditButton
When User/Staff Clicks on EditButton
Then Admin see Error Message "Admin Has View Only Permission"


Scenario: Verify the Delete Functionality
Then Users are on "Manage Attendance page"
When User/Staff Clicks on Delete Button
Then Admin see header text as "Delete Confirm"
When User/Staff  Clicks on " Yes"  button
Then User/Staff  see Success message ""Program Deleted Succesfully""


Scenario: Click on "No" button in Delete Confirm window
When User/Staff  Clicks on No button
Then User/Staff can see Program Name not deleted

Scenario: Admin Verify the Delete Functionality
Given Admin is on Manage Attendance page
When Admin Clicks on Delete Button
Then Admin see Error Message Admin Has View Only Permission

Scenario: Verifying the Checkbox functionality of  Program Name
Then Users are on "Manage Attendance page"
When Admin/User/Staff Clicks on Checkbox 
Then Admin/User/Staff  see list of Users in that Program

Scenario: Verifying the Functionality of a Present button
When Admin/User/Staff  Clicks on Present
Then Admin/User/Staff  see the list of  "User Name" who are Present

Scenario: Verifying the Functionality of a Absent button
When Admin/User/Staff  Clicks on Absent
Then Admin/User/Staff  see the list of  "User Name" who are Absent