#Author:Akshaya...email...domain..
@login

Feature:validate login page
Background:

Given open network
Given open DB

Scenario:validate login page with credentials
Given open browser as "chrome"
When enter username as "Akshaya"
And enter password as "pass@123"
When click login button
Then verify the welcome page as "welcome" in header
But dont click remember password



