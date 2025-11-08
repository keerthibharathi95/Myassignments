Feature: To perfome Lead Operations
@CreateLead
Scenario: Create Lead With Valid Input
Given Click on Create lead
Given Enter the Companyname
Given  Enter the Firstname
Given Enter the Lastname
When  Click on the CreateLead Button
Then  Create Lead operation successfull
But Create Lead operation failed


@EditLead
Scenario: Edit Lead With Valid Input
Given Click on Edit lead
Given Enter the phone number edit
When Click on Find Leads edit
When Wait for edit
When Select first name from the list
When Click on Edit button
When Update Companyname
When Click on EditSubmit button
Then Edit lead operation successful
But Edit lead operation failed

@DeleteLead
Scenario: Delete Lead With Valid Input
Given Click on Find leads Tab
Given Enter the phone number delete
When Click on Find Leads delete
When Wait for delete
When Select Second from the list
When Click on the delete button
Then Delete operation successfull



  