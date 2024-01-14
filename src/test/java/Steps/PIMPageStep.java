package Steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PIMPageStep {



	@Given("Scenario1: Step1")
	public void scenario1_step1() {
		System.out.println("Scenario1: Step1");
	}

	@When("Scenario1: Step2")
	public void scenario1_step2() {
		System.out.println("Scenario1: Step2");
	}

	@Then("Scenario1: Step3")
	public void scenario1_step3() {
		System.out.println("Scenario1: Step3");
	}

	@Given("Scenario2: Step1")
	public void scenario2_step1() {
		System.out.println("Scenario2: Step1");
	}

	@When("Scenario2: Step2")
	public void scenario2_step2() {
		System.out.println("Scenario2: Step2");
	}

}
