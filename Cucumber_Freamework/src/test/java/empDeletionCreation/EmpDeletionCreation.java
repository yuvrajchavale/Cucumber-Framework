package empDeletionCreation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EmpDeletionCreation {
	 WebDriver driver;
	 
	@Given("I open the browser with URL {string}")
	public void i_open_the_browser_with_URL(String url) {
		 driver = new ChromeDriver();
	        driver.get(url);
	}

	@Then("I should see the login page")
	public void i_should_see_the_login_page() {
		WebElement loginPageElement = driver.findElement(By.id("txtUsername"));
        assert(loginPageElement.isDisplayed());
	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String username) {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String password) {
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	}

	@When("I click login")
	public void i_click_login() {
		 driver.findElement(By.id("btnLogin")).click();
	}

	@Then("I should see the PIM module")
	public void i_should_see_the_PIM_module() {
		WebElement pimElement = driver.findElement(By.id("menu_pim_viewPimModule"));
        assert(pimElement.isDisplayed());
	}

	@When("I click the PIM button")
	public void i_click_the_PIM_button() {
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
	}

	@When("I wait for the add button")
	public void i_wait_for_the_add_button() {
	       WebElement addButton = driver.findElement(By.id("btnAdd"));
	        assert(addButton.isDisplayed());
	}

	@When("I click on the add button")
	public void i_click_on_the_add_button() {
		driver.findElement(By.id("btnAdd")).click();
	}

	@Then("I wait for the Employee Id")
	public void i_wait_for_the_Employee_Id() {
		WebElement employeeIdElement = driver.findElement(By.id("employeeId"));
        assert(employeeIdElement.isDisplayed());
	}

	@When("I enter first name as {string}")
	public void i_enter_first_name_as(String fname) {
		 driver.findElement(By.id("firstName")).sendKeys(fname);
	}

	@When("I enter middle name as {string}")
	public void i_enter_middle_name_as(String mname) {
		driver.findElement(By.id("middleName")).sendKeys(mname);
	}

	@When("I enter last name as {string}")
	public void i_enter_last_name_as(String lname) {
		driver.findElement(By.id("lastName")).sendKeys(lname);
	}

	@When("I click on the save button")
	public void i_click_on_the_save_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("user wait for the Employee Id")
	public void user_wait_for_the_Employee_Id() {
		 WebElement employeeIdElement = driver.findElement(By.id("employeeId"));
	        assert(employeeIdElement.isDisplayed());
	}
	@Then("I capture the Employee Id")
	public void i_capture_the_Employee_Id() {
		 driver.findElement(By.id("btnSave")).click();
	}

	@When("I close the browser")
	public void i_close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("I search for the employee with id {string}")
	public void i_search_for_the_employee_with_id(String string) {
		 WebElement employeeIdElement = driver.findElement(By.id("employeeId"));
	        assert(employeeIdElement.isDisplayed());
	}

	@When("I select the employee")
	public void i_select_the_employee() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("I click the delete button")
	public void i_click_the_delete_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("I should see the employee is deleted")
	public void i_should_see_the_employee_is_deleted() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
