package stepDefinition;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import p007.reverse.integer.Solution;

import static junit.framework.TestCase.assertEquals;

public class Problem007Step {

    private Solution application = null;

    private int inputInteger;
    private int expectedInteger;
    private int resultInteger;

    @Before
    public void beforeScenario() {
        inputInteger = 0;
        expectedInteger = 0;
        application = new Solution();
    }

    @Given("^the input of test for problem (\\d+) is \"([^\"]*)\"$")
    public void theInputOfTestForProblemIs(int arg0, String arg1) {
        // Write code here that turns the phrase above into concrete actions
        inputInteger = Integer.parseInt(arg1);

    }

    @When("^run the reverse method$")
    public void runTheReverseMethod() {
         resultInteger = application.reverse(inputInteger);
    }

    @Then("^the result of problem (\\d+) should be \"([^\"]*)\"$")
    public void theResultOfProblemShouldBe(int arg0, String arg1) {
        // Write code here that turns the phrase above into concrete actions
        expectedInteger = Integer.parseInt(arg1);
        assertEquals(expectedInteger,resultInteger);
    }
}
