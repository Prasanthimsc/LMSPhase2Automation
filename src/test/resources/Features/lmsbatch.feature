Feature:  To validate Batch Module Functionality

Background: User lands on home page
Given user launches chrome browswer
When user opens URL "http://lmsphase2seleniumhackahon.com"
And user enters "adminid/userid/staffid" and "password"
And clicks Login button
Then home page is displayed

@smoke @regression @sanity
Scenario: Validating the Manage Batch Header
When user clicks on batch link
Then header should be "Manage Batch"

@smoke
Scenario: Validating the Manage Batch Footer
When user clicks on batch link
Then footer should be "In total there are 21 batches."

@regression
Scenario: Validating the Pagination of Batch page
When user clicks on batch link
Then text should be "Showing 1 to 5 of 21 batches."
When user clicks enabled paginator-next button
Then text should be "Showing 6 to 10 of 21 batches."
When user clicks enabled paginator-prev button
Then text should be "Showing 1 to 5 of 21 batches"
When user cliks enabled last button
Then page number should be navigated to '5'
When user clicks enabled first button
Then page number should be navigated to '1'

Scenario: Validating Search on Batch Page by batch name
When user clicks on batch link
Then search text box label should be "Search"
When user enters "batch name" in text box
And clicks search button
Then entries for the searched name "batch name" should be displayed

Scenario: Validating Search on Batch Page by batch description
When user clicks on batch link
Then search text box label should be "Search"
When user enters "batch description" in text box
And clicks search button
Then entries for the searched description "batch description" shoule be displayed

Scenario: Validating Search on Batch Page by batch status
When user clicks on batch link
Then search text box label should be "Search"
When user enters "batch status" in text box
And clicks search button
Then entries for the searched status "batch status" shoule be displayed

Scenario: Validating Search on Batch Page by no of classes
When user clicks on batch link
Then search text box label should be "Search"
When user enters 'no of classes' in text box
And clicks search button
Then entries for the searched classes "no of classes" shoule be displayed

Scenario: Validating Search on Batch Page by program name
When user clicks on batch link
Then search text box label should be "Search"
When user enters "program name" in text box
And clicks search button
Then entries for the searched program "program name" should be displayed

Scenario: Valiting the ascending order sort on batch name
When user clicks on batch link
And user clicks on batch name ascending order arrow
Then batch name should be sorted in ascending order

Scenario: Validating the ascending order sort on batch description
When user clicks on batch link
And user clicks on batch description ascending arrow
Then batch description should be sorted in ascending order

Scenario: Valiting the ascending order sort on batch status
When user clicks on batch link
And user clicks on batch status ascending order arrow
Then batch status should be sorted in ascending order

Scenario: Validating the ascending order sort on no of classes
When user clicks on batch link
And user clicks on no of classes ascending arrow
Then no of classes should be sorted in ascending order

Scenario: Validating the ascending order sort on program name
When user clicks on batch link
And user clicks on program name ascending arrow
Then program name should be sorted in ascending order

Scenario: Valiting the descending order sort on batch name
When user clicks on batch link
And user clicks on batch name descending order arrow
Then batch name should be sorted in descending order

Scenario: Validating the descending order sort on batch description
When user clicks on batch link
And user clicks on batch description descending arrow
Then batch description should be sorted in descending order

Scenario: Valiting the descending order sort on batch status
When user clicks on batch link
And user clicks on batch status descending order arrow
Then batch status should be sorted in descending order

Scenario: Validating the descending order sort on no of classes
When user clicks on batch link
And user clicks on no of classes descending arrow
Then no of classes should be sorted in descending order

Scenario: Validating the descending order sort on program name
When user clicks on batch link
And user clicks on program name descending arrow
Then program name should be sorted in descending order

Scenario: Valdiating no of rows in table
When user clicks on batch page
Then no of rows should be '5'

Scenario: Validating new batch button
When admin clicks on batch link
And admin cliks +A new batch button
Then header text should be "Batch Details"

Scenario: No details entered on new batch details page
When admin clicks on batch link
And clicks +A new batch button
And clicks on new batch details save button
Then message should be "Name is required"

Scenario: Validating the message when only name is entered on new batch details page
When admin clicks on batch link
And clicks +A new batch button
And enters "Name"
And clicks on new batch details save button
Then message should be "Description is required"

Scenario: Validating the program name drop down in new bathc details page
When admin clicks on batch link
And clicks +A new batch button
And clicks on program name drop down
Then list of program names should be visible

Scenario: Validating the message when only program name is entered on new batch details page
When admin clicks on batch link
And clicks +A new batch button
And user selects "program name"
And clicks on new batch details save button
Then message should be "Name is required"

Scenario: Validating the message when only status is selected on new batch details page
When admin clicks on batch link
And clicks +A new batch button
And user selects status
And clicks on new batch details save button
Then message should be "Name is required"

Scenario: Validating the message when only no of classes is entered on new batch details page
When admin clicks on batch link
And clicks +A new batch button
And user enters "no of classes"
And clicks on new batch details save button
Then message should be "Name is required"

Scenario: Adding a new batch
When admin clicks on batch link
And clicks +A new batch button
And user enters all the details required
And clicks on new batch details save button
Then new batch should be created

Scenario: Validating the cancel button on batch details window
When admin clicks on batch link
And clicks +A new batch button
And clicks on new batch details cancel button
Then batch details window is closed

Scenario: Searching for the newly added batch
When user clicks on batch link
And enters newly added batch in search
And clicks search button
Then newly added batch should be displayed

Scenario: Validating the add new batch button for user/staff
When staff/user clicks on batch link
And clicks on +A new batch button
Then message should be "Only admin can create a new batch"

Scenario: Validate Edit button
When admin clicks on batch link
And admin clicks edit on batch page
Then header text should be "Batch Details"

Scenario: To edit batch name on batch details
When admin clicks on batch link
And admin clicks edit on batch page
And admin updates name on batch details
And admin clicks save on batch details
Then message should be "Name Updated"

Scenario: To edit batch description on batch details
When admin clicks on batch link
And admin clicks edit on batch page
And admin updates description on batch details
And admin clicks save on batch details
Then message should be "Description Updated"

Scenario: To edit program name on batch details
When admin clicks on batch link
And admin clicks edit on batch page
And admin updates program name on batch details
And admin clicks save on batch details
Then message should be "Program name Updated"

Scenario: To edit status on batch details
When admin clicks on batch link
And admin clicks edit on batch page
And admin updates status on batch details
And admin clicks save on batch details
Then message should be "Status Updated"

Scenario: To edit no of classes on batch details
When admin clicks on batch link
And admin clicks edit on batch page
And admin updates no of classes on batch details
And admin clicks save on batch details
Then message should be "No of classes  Updated"

Scenario: To click cancel on batch details
When admin clicks on batch link
And admin clicks edit on batch page
And click cancel on batch details
Then batch details window is closed

Scenario: To validate edit button disabled for user/staff
When user/staff clicks on batch link
And user/staff clicks edit on batch page
Then message should be "Only admin have access"

Scenario: Verify the delete functionality
When admin clicks on batch link
And admin clicks delete on batch page
Then delete dialog box is opened
When admin click Yes
Then message displayed should be "Batch deleted successfully"

Scenario: Validating Search on Batch Page by deleted batch name
When user clicks on batch link
And user enters "deleted batch name" in text box
And clicks search button
Then no results with deleted batch name should be displayed

Scenario: To click No button on delete dialog
When admin clicks on batch link
And admin clicks delete on batch page
Then delete dialog box is opened
When admin click No
Then batch is not deleted

Scenario: To validate delete for user/staff
When user/staff clicks on batch link
And user/staff clicks delete on batch page
Then message should be "Only admin can delete batch"

Scenario: To validate the status of delete on top left of batch page
When admin clicks on batch link
Then delete on top left is disabled

Scenario: To verify the multiple selection of batches for deletion
When admin user clicks on batch link
And selects multiple batches
Then delete on top left is enabled
When admin clicks delete on top left
Then confirm delete should be displayed
When admin clicks yes
Then message should be "Batches deleted successfully"
When admin searches for deleted batch
Then no results for batch are displayed

Scenario: To verify no button on multiple batch delete dialog
When admin user clicks on batch link
And selects multiple batches
Then delete on top left is enabled
When admin clicks delete on top left
Then confirm delete should be displayed
When admin clicks no
Then message should be "Batches not deleted"

Scenario: To verify the multiple selection of batches for deletion by user/staff
When user/staff user clicks on batch link
And selects multiple batches
Then delete on top left is enabled
When user/staff clicks delete on top left
Then message should be "Only admin can delete the batches"

Scenario: To verify the all check box
When admin/user/staff clicks on batch link
And admin/user/staff selects all checkbox
Then all checkboxes in the batch should be selected





















