Feature: NetBanking login application
  Scenario: Admin user login into the application
    Given User is on the login page of the application
    When user enter the valid crmadmin and 1234
    Then clicks on the login button
    And home page of the application is displayed with user details

  Scenario: Resource user login into the application
    Given User is on the login page of the application
    When user enter the valid fsresource and 435346
    Then clicks on the login button
    And home page of the application is displayed with user details

#  Scenario Outline:  user login into the application
#    Given User is on the login page of the application
#    When user enter the valid  username "<Username>" and password "<Password>"
#    Then clicks on the login button
#    And home page of the application is displayed with user details
#    Examples:
#  |Username|Password|
#  |crmadmin|1234|
#  |fsresource|435346|