package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberTest.tools.Calculator;
import org.junit.Assert;

public class CalculatorStepdefine {

    private Calculator calculator;

    @Given("^i input \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iInputAnd(String num1, String num2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        calculator = new Calculator();
        calculator.setNum1(Integer.parseInt(num1));
        calculator.setNum2(Integer.parseInt(num2));
    }

    @When("^the calculator is run$")
    public void theCalculatorIsRun() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        calculator.calculate();
    }

    @Then("^the out put should be \"([^\"]*)\"$")
    public void theOutPutShouldBe(String result) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(Integer.parseInt(result), calculator.getTotle());
    }
}
