Feature: SignIn to Netflix
this feature signIn to Netflix
Scenario: SignIn with invalid credentials
Given user navigate to signIn page
And user click on the SignIn button
When user enters invalid email and invalid password click on the signIn button
Then user should see an error message