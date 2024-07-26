package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinations {

public static WebDriver driver;
	
@Given("i open browser with url {string}")
public void launchBrowser(String url) {
  driver = new FirefoxDriver();
  driver.manage().deleteAllCookies();
  driver.manage().window().maximize();
  driver.get(url);
}

@Then("i should see login page")
public void loginbutton() {
    if (driver.findElement(By.xpath("//input[contains(@name,'Submit')]")).isDisplayed()) {
		System.out.println("System displayed Login Page");
	}
}

@When("i enter username as {string}")
public void username(String username) {
    driver.findElement(By.id("txtUsername")).sendKeys(username);
}

@When("i enter password as {string}")
public void password(String password) {
   driver.findElement(By.id("txtPassword")).sendKeys(password);
}

@When("i click login")
public void clicklogin() {
   driver.findElement(By.id("btnLogin")).click();
}

@Then("i should see admin module")
public void adminpage() {
	if (driver.findElement(By.xpath("//input[contains(@name,'Submit')]")).isDisplayed()) {
		System.out.println("System displayed Login Page");
	}
}

@When("i click logout")
public void clicklogout() {
   driver.findElement(By.xpath("//a[contains(@id,'welcome')]")).click();
   driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
}

@When("i close browser")
public void closebrowser() {
    driver.close();
}

@Then("i should see error message")
public void errormessage() {
   String errmsg;
   errmsg = driver.findElement(By.id("spanMessage")).getText();
   if (errmsg.toLowerCase().contains("invalid")) {
	System.out.println("System Displays Expected Message : Invalid credentials");
}
}

}
