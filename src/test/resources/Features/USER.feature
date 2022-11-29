Feature: User Validation
  
  Scenario: Validatation landing in Manage page
  Given Users Launches the chrome browser
  When Users opens the URL "http://lmsphase2seleniumhackahon.com/"
  When User clicks on the Tab User
  Then User is on the Manage user page "landing"
    
  
  Scenario:  Manage page heading validation   
    When User is on the Manage user page after clicking User Tab
    Then  User should see the page heading as Manage User
    
  Scenario: Validate the presence of pagination
  
    When User is on the Manage user page after clicking User Tab
    Then  User should see the pagination controls below data table
    When Manage user table has less than or equal to 5 rows 
    Then Pagination control should be disabled 
    When  Manage user table has more than 5 rows
    Then Pagination control should be enabled
    When  User clicks next link of pagination
   	Then  Next page should be displayed
    When User clicks next link of pagination
    Then Next link of pagination should be disabled
    When User clicks previous link of pagination
    Then previous page should be displayed
    When User clicks previous link of pagination
    Then Previous link of pagination should be disabled
    When User clicks << icon in pagination
    Then User clicks should see the First page of the table    
    When User clicks >> icon in paginations
    Then User clicks should see the last page of the table
   	Then User should see the text "Showing 1 to 4 of 4 entries" beow the user table.
    
    
    Scenario: Footer Validation  
    When User is on the Manage user page after clicking User Tab
    Then Usershould see the table footer as "In total there are 4 users".
    
    Scenario: Validate the presence of Add new user button
    When User is on the Manage user page after clicking User Tab
    Then User should see the button with text "+ icon and Add New User"
   	When User clicks Add New User
    Then User should see the "User details" dialog box
    
    Scenario: Validating Table header
   
    When User is on the Manage user page after clicking User Tab
    Then User should see the table header as "Empty checkbox-icon , ID with sort icon, Name with Sort icon, Email Address with sort icon,Contact Number with sort icon, Batch with sort icon, Skill with Sort icon, Edit/Delete as column names"
	  When User clicks sort icon in table header
    Then Table rows should be sorted
    When User checks empty checkbox in header
    Then Check box in all the rows of user table should be checked
    When User unchecks checkbox in header
    Then Check box in all the rows of user table should be unchecked
    
    Scenario: Verify the presence of Delete icon in manage user page
    Given User is on the Manage user page after clicking User Tab
    Then User should see the delete icon at the top left corner of the user table
    When No rows is checked
    Then Delete icon at the top left corner of the user table disabled 
    When User checks the rows in user table
    Then Delete icon at the top left corner of the user table enabled
    When User clicks the delete icon at the top left corner of user table
    Then User should see the table header as "Empty checkbox-icon , ID with sort icon, Name with Sort icon, Email Address with sort icon,Contact Number with sort icon, Batch with sort icon, Skill with Sort icon, Edit/Delete as column names"
    Then User is in confirm dialog box after clicking delete icon
    When User clicks button with text "No"
    Then Selected rows should not be deleted and dialog box should be closed
    When User clicks button with text "Yes"
    Then Selected rows should be deleted and popup should be shown with success message "User deleted"
    When User clicks the close(x) icon
    Then Confirm dialog box should be closed
    
    Scenario: Validate the presence of Edit/Delete icon
    Given User is on the Manage user page after clicking User Tab
  	Then User should see the buttons with edit/delete icon in each row of Edit/Delete coulmn
    When User clicks delete button
    Then Confirm dialog box should be displayed with Text "Are you sure you want to delete (selected user name) ?" , button with text "No" , the button with text "yes" and close(X) icon
    When User clicks Edit button
    Then " User Details" dialog box should be displayed for editing
    
     Scenario: Verify the presence of Input field for searching
    Given User is on the Manage user page after clicking User Tab
    Then  User see the Search Text box has text as "Search".
    Then User should see the search input field with search icon and text as"Search"
    When User types <Name> to search
    Then Rows with the name should be displayed
    When User types <random text> in search field which has no matching entry
    Then No rows is displayed
    
    Scenario: Verify ID functionality
    Given User is on the Manage user page after clicking User Tab
    When User clicks ID in any row
    Then User  see dialog box displayed with user information
    
     Scenario: Verify the heading of User Details window
    Given User is on the Manage user page after clicking User Tab
    When User clicks Add new user button
    Then User should see User Details window with text as "User Details"
    
    Scenario: Verify the presence of Cancel button in User Details window
    Given User is on the Manage user page after clicking User Tab
    When User clicks Add new user button
    Then User should see a button with text as Cancel  in User Details window
    Then User  see User Details window getting  closed
   
    Scenario:Verify the presence of Cancel(x) icon in user detais window
    Given User is on the Manage user page after clicking User Tab
    When User clicks Add new user button
    Then User should see a cancel(x) icon
    
    Scenario: Functionality of Cancel(x) icon
    Given User is on User Details details window
    When User clicks cancel(X) icon
    Then User Details window should be closed
    
    Scenario:Verify the presence of Submit button in User Details window
    Given User is on the Manage user page after clicking User Tab
    When User clicks Add new user button
    Then User should see a button with text as Submit in user details window
    
    Scenario: Verify the presence of Label Texts
    Given User is on the Manage user page after clicking User Tab
    When User clicks Add new user button
    Then User should see the placeholders with Text As "First name","Middle name", "Last name","Email adress","Phone no", "Address","City", "State","Postal Code"."Program","UG Program","PG Program","Skill","Experience","User Role",'"Visa status","Batch","Comments"
    
    Scenario: Verify the presence of input fields
    Given User is on the Manage user page after clicking User Tab
    When User clicks Add new user button
    Then User should see the input fields for "First name","Middle name", "Last name","Email adress","Phone no", "Address","City", "State","Postal Code"."Program","UG Program","PG Program","Skill","Experience","User Role","Visa status","Batch","Comments" corresponding to their labels
    
    Scenario: Verify drop down menu for state
    Given User is on User Details details window
    When User clicks the drop down icon for state
    Then User should select from the drop down menu for state
    
     Scenario: Verify drop down menu for user role
  	 Given User is on User Details details window
    When User clicks the drop down icon for User Role
    Then User should select from the drop down menu for user role
    When User clicks submit button with all details empty
    Then User should see a Error message "Mandatory Fields cannot be empty"
    
    Scenario: Adding new User
    Given User is on User Details details window
    When User clicks on Submit button after entering  Few Field details 
    Then User see error message "Name is required"
    When User clicks Submit button by entering all valid values in required fields
    Then User  see Success message  "New User Created"  is  Should be Saved.
    
    
    Scenario: Validating the Email address
    Given User is on User Details details window
    When User clicks on Submit button after entering wrong email address
    Then User see error message as "Invalid Email address"
    
    Scenario: Validating the presence of Address2 button 
    Given User is on User Details details window
    When User clicks Add new user button
    Then User should see the button with text as "+ Add C/O, Apt, Suite, Unit"
    
     Scenario: Validating the Phone number
    Given User is on User Details details window
    When User Enters more than 10 digits
    Then User see error message "Invalid Input"
    
  Scenario: Validating Postal Code
  	 Given User is on User Details details window
    When User Enters more than 5 digit
    Then User see error message "Invalid Input"
    
    Scenario: Validating State dropdown
		Given User is on User Details details window
    When User clicks on state dropdown
    Then User see list of states in Alphabetical Order
    
     Scenario:Validating UG Program Dropdown 
    Given User is on User Details details window
    When User clicks on UG Program dropdown
    Then User see list of UG Program 
    
    Scenario: Validating Address line  in User Details window
    Given User is on User Details details window
    When User clicks the button "+ Add C/O, Apt, Suite, Unit"
    Then User should see the input field with Label "New Address2"
    
