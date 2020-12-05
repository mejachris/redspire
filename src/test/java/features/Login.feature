Feature: Login to PubAudit application
  In order to login
  As a valid user
  I have to provide valid user name and password

@Test1
Scenario: Verify login functionality
 Given I navigate to url "https://letskodeit.teachable.com"
 When I click on login link
 And I enter username "name" and password "password"
 And I click on login button
 
 @Test2
 Scenario: Verify login functionality
 Given I navigate to url "https://letskodeit.teachable.com"
 When I click on login link
 And I enter username "fake_name" and password "fake_password"
 And I click on login button