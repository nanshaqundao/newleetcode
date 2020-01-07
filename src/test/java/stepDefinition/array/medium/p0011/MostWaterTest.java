package stepDefinition.array.medium.p0011;

import array.medium.p0011.MostWater;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Arrays;
import java.util.stream.IntStream;

import static junit.framework.TestCase.assertEquals;

public class MostWaterTest {
    int[] testArray;

    @Given("^the input of problem (\\d+) is \"([^\"]*)\"$")
    public void theInputOfProblemIs(int arg0, String inputArrayString) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(inputArrayString);

        String[] strArray = inputArrayString.split(",");
        testArray = new int[strArray.length];

        IntStream.range(0, strArray.length).forEach(i -> {
            testArray[i] = Integer.parseInt(strArray[i]);
        });

    }

    @When("^run the maxArea$")
    public void runTheMaxArea() {

    }

    @Then("^the output of problem (\\d+) should be \"([^\"]*)\"$")
    public void theOutputOfProblemShouldBe(int arg0, String expectedString) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        int result = new MostWater().maxArea(testArray);
        int expectedInteger = Integer.parseInt(expectedString);
        testArray = null;
        assertEquals(expectedInteger, result);
    }
}
