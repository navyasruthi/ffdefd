package cs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class RunnerTest {
	WebDriver driver;
	@Given("i enter into url")
	public void i_enter_into_url() {


	System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe" );
		  driver=new ChromeDriver();
	  driver.get("https://10.232.237.143/TestMeApp/");
	  driver.findElement(By.id("details-button")).click();
	  driver.findElement(By.id("proceed-link")).click();
		  driver.findElement(By.linkText("SignUp")).click();
	}

	@When("enters {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string}  ,  {string}")
	public void enters(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11) {
	    // Write code here that turns the phrase above into concrete actions
	  


		    driver.findElement(By.name("userName")).sendKeys(string);
		    driver.findElement(By.name("firstName")).sendKeys(string2);		   
		    driver.findElement(By.name("lastName")).sendKeys(string3);
		    driver.findElement(By.name("password")).sendKeys(string4);
	        driver.findElement(By.name("confirmPassword")).sendKeys(string5);
		    driver.findElement(By.xpath("//*[@value='Female']")).click();
		    driver.findElement(By.name("emailAddress")).sendKeys(string7);
	        driver.findElement(By.name("mobileNumber")).sendKeys(string8);
		    driver.findElement(By.name("dob")).sendKeys(string9);		  
		    driver.findElement(By.name("address")).sendKeys(string10);    
	        driver.findElement(By.name("securityQuestion")).click();
	        driver.findElement(By.name("answer")).sendKeys(string11);
	        driver.findElement(By.name("Submit")).click();
	}

	@Then("Login page appears")
	public void login_page_appears() {
   System.out.println("Successfully registered");
	}


}


