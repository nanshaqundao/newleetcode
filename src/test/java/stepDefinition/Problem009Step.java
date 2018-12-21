package stepDefinition;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import p009.palindrome.number.Solution;

import static junit.framework.TestCase.assertEquals;

public class Problem009Step {

    private Solution application = null;

    private int inputInteger;
    private boolean expectedResult;
    private boolean actualResult;

    @Before
    public void beforeScenario() {
        inputInteger = 0;
        expectedResult = false;
        application = new Solution();
    }

    @Given("^the input of test for problem-009 is \"([^\"]*)\"$")
    public void theInputOfTestForProblemIs(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        inputInteger = Integer.parseInt(arg1);
    }

    @When("^run the palindrome number method$")
    public void runThePalindromeNumberMethod() {
        actualResult = application.isPalindrome(inputInteger);
    }

    @Then("^the result of problem-009 should be \"([^\"]*)\"$")
    public void theResultOfProblemShouldBe(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        expectedResult = Boolean.valueOf(arg1);
        assertEquals(expectedResult,actualResult);
    }
}
