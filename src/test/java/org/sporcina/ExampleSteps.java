package org.sporcina;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;


/**
 * This code maps the steps outlined in the example.story, to executable code.
 */
public class ExampleSteps {

    @Given("account $accountNumber is in credit")
    public void thisContext(String accountNumber) {
        // do stuff
        System.out.println("(FYI) -> The account number received is: " + accountNumber);
    }

    @Given("the card is valid")
    public void someMoreContext() {
        // do stuff
    }

    @Given("the dispenser contains cash")
    public void theDispenserContainsCash() {
        // do stuff
    }

    @When("the customer requests cash")
    public void theCustomerRequestsCash() {
        // do stuff
    }

    @Then("ensure the account is debited")
    public void ensureTheAccountIsDebited() {
        // do stuff
        Assert.assertTrue(true);
    }

    @Then("ensure cash is dispensed")
    public void ensureCashIsDispensed() {
        // do stuff
        Assert.assertTrue(true);
    }

    @Then("ensure the card is returned")
    public void ensureTheCardIsReturned() {
        // do stuff
        Assert.assertTrue(true);
    }
}
