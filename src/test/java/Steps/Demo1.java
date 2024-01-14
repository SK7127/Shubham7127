package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Demo1 {

	@Given("scenario3 and step1")
	public void scenario3_and_step1() {
		System.out.println("scenario3 and step1");
	}

	@When("scenario3 and step2")
	public void scenario3_and_step2() {
		System.out.println("scenario3 and step2");
	}

	@When("scenario3 and step3")
	public void scenario3_and_step3() {
		System.out.println("scenario3 and step3");
	}

	@Given("scenario4 and step1")
	public void scenario4_and_step1() {
		System.out.println("scenario4 and step1");
	}

	@When("scenario4 and step2")
	public void scenario4_and_step2() {
		System.out.println("scenario4 and step2");
	}

}
