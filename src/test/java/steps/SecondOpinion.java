package steps;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SecondOpinion {
	WebDriver driver;
	
	@Given("Open browser,enter sparsh hospital url")
	public void open_browser_enter_sparsh_hospital_url() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sparshhospital.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
	   
	}

	@Given("Select Yelahanka hospital from hospitals dropdown")
	public void select_yelahanka_hospital_from_hospitals_dropdown() {
		driver.findElement(By.xpath("(//a[@data-toggle='dropdown'])[3]")).click();
		driver.findElement(By.xpath("(//a[@href='https://www.sparshhospital.com/hospitals/sparsh-hospital-yelahanka/'])[1]")).click();

	    

	}

	@When("user click second opinion link")
	public void user_click_second_opinion_link() {
		//Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement click = driver.findElement(By.xpath("(//a[@href='https://www.sparshhospital.com/second-opinion/'])[1]"));
       
		js.executeScript("arguments[0].click()",click);

		//driver.findElement(By.xpath("(//a[@href='https://www.sparshhospital.com/second-opinion/'])[1]")).click();
	  
	}

	@When("user enters firstname,lastname,phone,email textbox")
	public void user_enters_firstname_lastname_phone_email_textbox() {
		driver.findElement(By.cssSelector("[name='secondopinion_first_name']")).sendKeys("Anjali");
		driver.findElement(By.cssSelector("[name='secondopinion_last_name']")).sendKeys("Shaw");
		driver.findElement(By.cssSelector("[name='secondopinion_phone']")).sendKeys("9865325627");
		driver.findElement(By.cssSelector("[name='secondopinion_email']")).sendKeys("shaw14@gmail.com");
	    
	}

	@When("upload the reports with message and click the send button")
	public void upload_the_reports_with_message_and_click_the_send_button() {
		//driver.findElement(By.cssSelector("[name='secondopinion_reports[]']")).sendKeys("‪C:\\Users\\beati\\OneDrive\\Pictures\\Desktop\\TUTORIALS_NINJA_TestPlan.pdf");
		driver.findElement(By.cssSelector("[name='secondopinion_message']")).sendKeys("I have uploaded the reports");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement click1 = driver.findElement(By.cssSelector("[id='secondopinion_submit']"));
	       
		js.executeScript("arguments[0].click()",click1);
	}

	@Then("Thankyou message should be displayed")
	public void thankyou_message_should_be_displayed() {
		String actualText = driver.findElement(By.xpath("(//h1[@class='font-700 mb-4'])[1]")).getText();
		String expectedText="Thank you";
			Assert.assertEquals(actualText, expectedText);

	 
	}

	@Then("bank info should be available in the page")
	public void bank_info_should_be_available_in_the_page() {
		String actualResult = driver.findElement(By.xpath("(//div[@class='col-md-12 p-4'])[2]/p[3]")).getText();
		String expectedResult="Bank Name: Bank of Baroda";
			Assert.assertEquals(actualResult, expectedResult);
			//driver.close();

	  
	}




}
