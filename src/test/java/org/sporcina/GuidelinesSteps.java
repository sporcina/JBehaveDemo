package org.sporcina;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

/**
 * This code maps the steps outlined in the guidelines.story, to executable code.
 */
public class GuidelinesSteps {

    @Given("this context")
    public void thisContext() {
        // do stuff
    }

    @Given("some more context")
    public void someMoreContext() {
        // do stuff
    }

    @When("this event occurs")
    public void thisEventOccurs() {
        // do stuff
    }

    @Then("there is this outcome")
    public void thereIsThisOutcome() {
        // do stuff
        Assert.assertTrue(true);
    }

    @Then("another outcome")
    public void anotherOutcome() {
        // do stuff
        Assert.assertTrue(true);
    }
}
