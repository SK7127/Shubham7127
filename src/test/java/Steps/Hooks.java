package Steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class Hooks {

	@BeforeAll
	public static void a1() {
		System.out.println("Before All");
	}

	@AfterAll
	public static void z1() {
		System.out.println("After All ");
	}

	@Before
	public static void a2() {
		System.out.println("Before");
	}

	@After
	public static void z2() {
		System.out.println("After");
		System.out.println("===============================");
	}

	@BeforeStep
	public static void a3() {
		System.out.println("Before step");
	}

	@AfterStep
	public static void z3() {
		System.out.println("After Step");
		System.out.println("-------------------");
	}
}
