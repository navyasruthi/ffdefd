package cs2;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;


	public class Loginf {
		WebDriver driver;
		
		@Given("i enter into url")
		public void i_enter_into_url() {
	

		System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe" );
			  driver=new ChromeDriver();
		  driver.get("https://10.232.237.143/TestMeApp/");
		  driver.findElement(By.id("details-button")).click();
		  driver.findElement(By.id("proceed-link")).click();
			  driver.findElement(By.linkText("SignIn")).click();
			  
		}
		@When("enters {string} , {string}")
		public void enters(String string, String string2) {
			 driver.findElement(By.name("userName")).sendKeys(string);
			    driver.findElement(By.name("password")).sendKeys(string2);	
			   
		}

		@Then("click on Login")
		public void click_on_Login() {
			driver.findElement(By.name("Login")).click();
		}



}
