Sheldon Porcina
October 5, 2013

This is a simple Maven project that integrates and executes JBehave tests.
If you are new to Maven and/or JBehave, start with looking at the pom.xml and Stories.java files to get an idea how
these technologies are leveraged in this project.

This is not an all-encompassing project of JBehave technologies.  This is simply one execution path to leveraging
JBehave within a Maven project.  I encourage you to go to http://jbehave.org to learn more about configuring JBehave.

Installation
Ensure you have Maven 3.0 (or greater) installed.  You can find the installation instructions on http://maven.apache.org/.

Usage
To run the tests, execute "mvn clean install" in the same folder as the pom.xml of this project.  If the build is
successful you will see the following:

    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time: 2.289s
    [INFO] Finished at: Sat Oct 05 13:00:33 MDT 2013
    [INFO] Final Memory: 19M/244M
    [INFO] ------------------------------------------------------------------------

Notice above that is the execution output of the stories:

    (BeforeStories)

    [INFO] Running story example.story
    (example.story)
    Meta:
    @author Sheldon Porcina
    @themes example

    Scenario: Account is in credit
    (FYI) -> The account number received is: 111-111-1110
    Given account 111-111-1110 is in credit
    And the card is valid
    And the dispenser contains cash
    When the customer requests cash
    Then ensure the account is debited
    And ensure cash is dispensed
    And ensure the card is returned

    (etc)

Credit to the following resources from Dan North for my shameless exploitation of his examples :)

http://dannorth.net/whats-in-a-story/
http://dannorth.net/introducing-bdd/
