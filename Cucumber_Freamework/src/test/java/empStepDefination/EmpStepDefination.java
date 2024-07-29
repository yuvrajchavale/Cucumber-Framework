package empStepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EmpStepDefination {
	public static WebDriver driver;
	String Act = "";
	String Exp = "";
	@Given("I open the browser with URL {string}")
	public void i_open_the_browser_with_URL(String url) {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(url);
	}

	@Then("I should see the login page")
	public void i_should_see_the_login_page() {
		if(driver.findElement(By.id("btnLogin")).isDisplayed())
		{
			System.out.println("System displayed Login Page");
		}
	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String uid) {
		driver.findElement(By.id("txtUsername")).sendKeys(uid);
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String pwd) {
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);	  
	}

	@When("I click login")
	public void i_click_login() {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("I should see the PIM module")
	public void i_should_see_the_PIM_module() {
		if (driver.findElement(By.id("menu_pim_viewPimModule")).isDisplayed()) 
		   {
			 System.out.println("Pim Module Displayed ");   
		   }
		
	}

	@When("I click the PIM button")
	public void i_click_the_PIM_button() {
		 driver.findElement(By.id("menu_pim_viewPimModule")).click();
	}

	@When("I wait for the add button")
	public void i_wait_for_the_add_button() {
		if(driver.findElement(By.id("btnAdd")).isDisplayed()) {
	    	System.out.println("Add Button Displayed Now Click on it");
	    }
	}

	@When("I click on the add button")
	public void i_click_on_the_add_button() {
		driver.findElement(By.id("btnAdd")).click();
	}

	@Then("I wait for the Employee Id")
	public void i_wait_for_the_Employee_Id()throws Throwable {
		Thread.sleep(2000);
		if (driver.findElement(By.xpath("//input[@id='employeeId']")).isDisplayed()) {
			Act = driver.findElement(By.xpath("//input[@id='employeeId']")).getText();
			}
		
	}

	@When("I enter first name as {string}")
	public void i_enter_first_name_as(String fname) {
		driver.findElement(By.name("firstName")).sendKeys(fname);
	}

	@When("I enter middle name as {string}")
	public void i_enter_middle_name_as(String mname) {
		driver.findElement(By.name("middleName")).sendKeys(mname);
	}

	@When("I enter last name as {string}")
	public void i_enter_last_name_as(String lname) {
		driver.findElement(By.name("lastName")).sendKeys(lname);
	}

	@When("I click on the save button")
	public void i_click_on_the_save_button() {
		driver.findElement(By.id("btnSave")).click();
	}

	@Then("I capture the Employee Id")
	public void i_capture_the_Employee_Id() {
		 Exp = driver.findElement(By.id("personal_txtEmployeeId")).getText();
	     if (Exp.equals(Act)) {
			System.out.println("Employee Create Sucessfully" + Act +"  " +Exp );
		}else
		{
			System.out.println("Employee Creation Failed" + Act +"  " +Exp );
		}
	}
	@Then("user wait for the Employee Id")
	public void user_wait_for_the_Employee_Id() throws Throwable {
		Thread.sleep(2000);
		if (driver.findElement(By.xpath("//input[@name='personal[txtEmployeeId]']")).isDisplayed()) {
			//Act = driver.findElement(By.xpath("//input[@name='personal[txtEmployeeId]']")).getText();
			}
	}


	@When("I close the browser")
	public void i_close_the_browser() {
	   driver.quit();
	}

}
