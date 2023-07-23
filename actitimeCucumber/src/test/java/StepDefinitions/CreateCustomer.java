package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateCustomer {
	@Given("the user is logged in to the application")
	public void the_user_is_logged_in_to_the_application() {
		System.out.println("the user is logged in to the application");
	}
	@When("the user click on the task module")
	public void the_user_click_on_the_task_module() {
		System.out.println("the user click on the task module");

	}
	@Then("task page should display")
	public void task_page_should_display() {
		System.out.println("task page should display");

	}

	@Given("the user is on the task page")
	public void the_user_is_on_the_task_page() {
		System.out.println("the user is on the task page");

	}
	@When("the user clicks on the Add New button")
	public void the_user_clicks_on_the_add_new_button() {
		System.out.println("the user clicks on the Add New button");

	}
	@When("then clicks on the New Customer option")
	public void then_clicks_on_the_new_customer_option() {
		System.out.println("then clicks on the New Customer option");

	}
	@Then("the Create New Cutomer page displays")
	public void the_create_new_cutomer_page_displays() {
		System.out.println("the Create New Cutomer page displays");

	}
	@Given("the user is on the create new Customer page")
	public void the_user_is_on_the_create_new_customer_page() {
		System.out.println("the user is on the create new Customer page");

	}
	@When("the user passes the Customer Name")
	public void the_user_passes_the_customer_name() {
		System.out.println("the user passes the Customer Name");

	}
	@And("passes the Description")
	public void passes_the_description() {
		System.out.println("passes the Description");

	}
	@And("Clicks on the create customer button")
	public void clicks_on_the_create_customer_button() {
		System.out.println("Clicks on the create customer button");

	}
	@Then("Customer should be created")
	public void customer_should_be_created() {
		System.out.println("Customer should be created");

	}




}
