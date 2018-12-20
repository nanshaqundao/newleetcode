package stepDefinition;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import p008.string.to.integer.Solution;

import static org.junit.Assert.assertEquals;

public class Problem008Step {

    Solution application = null;

    private String StringContent;
    private int IntContent;

    @Before
    public void beforeScenario() {
        StringContent = "";
        IntContent = 0;
        application = new Solution();
    }

    @Given("^the input of test is \"([^\"]*)\"$")
    public void theInputOfTestIsStringContent(String stringContent) {
        System.out.println(stringContent);
        StringContent = stringContent;
    }

    @When("^run the convert method$")
    public void runTheConvertMethod() {
        IntContent = application.myAtoi(StringContent);
    }

    @Then("^the result should be \"([^\"]*)\"$")
    public void theResultShouldBeIntegerContent(int intContent) {
        assertEquals(intContent, IntContent);
    }
}
