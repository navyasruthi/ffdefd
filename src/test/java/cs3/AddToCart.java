package cs3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCart {
	WebDriver driver;
	@Given("homepage")
	public void homepage() {
		System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe" );
		  driver=new ChromeDriver();
	  driver.get("https://10.232.237.143/TestMeApp/");
	  driver.findElement(By.id("details-button")).click();
	  driver.findElement(By.id("proceed-link")).click();
		  driver.findElement(By.linkText("SignIn")).click();
		  driver.findElement(By.name("userName")).sendKeys("Lalitha");
		    driver.findElement(By.name("password")).sendKeys("Password123");	
		    driver.findElement(By.name("Login")).click();
	}

	@Given("when user click on all category")
	public void when_user_click_on_all_category() {
		
		driver.findElement(By.xpath("//a[@href=\'#\']")).click();
		  
	}

	@When("popup appear select Electronics and click on Headphone")
	public void popup_appear_select_Electronics_and_click_on_Headphone() {
		driver.findElement(By.linkText("Electronics")).click();
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  driver.findElement(By.linkText("Head Phone")).click();
		  
	}

	@Then("click on add to cart")
	public void click_on_add_to_cart() {
		driver.findElement(By.className("btn")).click();
		  driver.findElement(By.xpath("//a[@href=\'displayCart.htm\']")).click();
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//a[@href=\'checkout.htm\']")).click();
	    
	}
}
