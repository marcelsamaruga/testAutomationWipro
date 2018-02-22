Narrative:
In order to deposit value to an account
As an admin
I want to fill the input, submit the form and check the return message

GivenStories: stories/CreateAccount.story

Scenario: Deposit Account Page
When User clicks on menu Deposit

Scenario: Fill in right values
When User fills the form with value <amount>
And User clicks on Transfer button
Then The return message for Deposit Account is <message>

Examples:
| amount 		| message 						            |
|  100	   		| Operation completed with success          |
|   	   		| The ammount is invalid for the operation  |