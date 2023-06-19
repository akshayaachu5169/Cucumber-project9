package tests;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	@Given("open browser as {string}")
	public void openbrowser(String browser) {
		System.out.println("---open browser---" + browser);
	}

	@When("enter username as {string}")
	public void enterusername(String username) {
		System.out.println("---enter username---" + username);
	}

	@And("enter password as {string}")
	public void enterpassword(String password) {
		System.out.println("---enter password---" + password);
	}

	@When("click login button")
	public void clickloginbutton() {
		System.out.println("---click login button---");
	}

	@Then("verify the welcome page as {string} in header")
	public void verifythewelcomepage(String welcomemsg) {
		System.out.println("---verify the welcome page---" + welcomemsg);
	}

	@But("dont click remember password")
	public void dontclickrememberpassword() {
		System.out.println("---dont click remember password---");
	}
	//background
	@Given ("open network")
	public void openNetwork() {
		System.err.println("***open network***");
	}
	@Given ("open DB")
	public void openDB() {
		System.err.println("***open DB***");
	}
//hooks
	@Before(order = 1)
	public void setup1() {
		System.err.println("---setup1---");
	}
	
	@After(order = 1)
	public void tearsome1() {
		System.err.println("---tearsome1---");
	}
	
	@Before
	public void setup2() {
		System.err.println("---setup2---");
	}
	
	@After
	public void tearsome2() {
		System.err.println("---tearsome2---");
	}
	//it runs for each tests
}
