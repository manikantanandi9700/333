package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Stepdefinition {
	WebDriver driver;
@Given("user launches browser")
public void user_launches_browser() {
	System.setProperty("webdriver.chrome.driver","C:\\Dell\\UpdatePackage\\Log\\CucumberMani\\driver\\chromedriver.exe" );
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
}
@When("user enter the username{string} and password{string}")
public void user_enter_the_username_and_password(String s1, String s2) {

	driver.findElement(By.id("email")).sendKeys(s1);
	driver.findElement(By.id("pass")).sendKeys(s2);
}





@When("user hits the login button")
public void user_hits_the_login_button() {
	driver.findElement(By.id("loginbutton")).click();
   
}

@Then("user navigates to homr page")
public void user_navigates_to_homr_page() {
  String m = driver.getCurrentUrl();
  Assert.assertTrue(m.contains("face"));
}



	

}
