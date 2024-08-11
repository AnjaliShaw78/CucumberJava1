package simpleSteps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SimpleSteps {
	WebDriver driver;

@Given("open the browser enter simpleForm url")
public void open_the_browser_enter_simple_form_url() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://v1.training-support.net/selenium/simple-form");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 
}

@When("user enter, firstname,lastname,email,contact number")
public void user_enter_firstname_lastname_email_contact_number() {
	driver.findElement(By.cssSelector("[placeholder='First Name']")).sendKeys("Anjali");
	driver.findElement(By.cssSelector("[placeholder='Last Name']")).sendKeys("Shaw");
	driver.findElement(By.cssSelector("[id='email']")).sendKeys("shawanjali0708@gmail.com");
	driver.findElement(By.cssSelector("[id='number']")).sendKeys("9830814266");

 
}

@When("write in messagebox")
public void write_in_messagebox() {
	driver.findElement(By.cssSelector("[rows='2']")).sendKeys("I have filled all the details");


}

@When("click on submit button")
public void click_on_submit_button() {
	driver.findElement(By.cssSelector("[onclick='simpleFormSubmit()']")).click();

 
}

@Then("Thankyou popup should be visible")
public void thankyou_popup_should_be_visible() {
	String thankyoutext = driver.switchTo().alert().getText();
	System.out.println(thankyoutext);
	driver.switchTo().alert().accept();
	driver.close();
	
	
  
}

	
}
