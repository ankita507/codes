package stepDefination;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterTest {
	public static WebDriver driver;

	@Given("^user open TestMeApp$")
	public void userOpenTestMeApp() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http:10.232.237.143:443/TestMeApp/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	@When("^user click signin$")
	public void userclickonsignin()
	{
		driver.findElement(By.xpath("//a[@href='login.htm']")).click();
	}
	@And("^user enter credentials as$")
	public void entercredeintial(DataTable dt)
	{
		List<String> cred = dt.asList(String.class);
		driver.findElement(By.name("userName")).sendKeys(cred.get(0));
		driver.findElement(By.name("password")).sendKeys(cred.get(1));	
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}
	@And("^seach product$")
	public void usersearchproduct(DataTable dt1)
	{
		List<String> search = dt1.asList(String.class);
		driver.findElement(By.name("products")).sendKeys(search.get(0));
		
		
	}
	@And("^click on find button$")
	public void clickonfindbutton()
	{
		driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
	}
	@Then("^click on add to cart button$")
	public void addtocart()
	{
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	}
	

	@When("^user click on signup$")
	public void userclickonsignup() {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	}

	@And("^enter username as \"([^\"]*)\"$")
	public void userclicksonsignup(String uname) {
		driver.findElement(By.name("userName")).sendKeys(uname);
	}

	@And("^enter first name as \"([^\"]*)\"$")
	public void userenterfirstname(String fname) {
		driver.findElement(By.name("firstName")).sendKeys(fname);

	}

	@And("^enter last name as \"([^\"]*)\"$")
	public void userenterlastname(String lname) {
		driver.findElement(By.name("lastName")).sendKeys(lname);
	}

	@And("^enter password as \"([^\"]*)\"$")
	public void userenterpassword(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
	}

	@And("^enter confirm password as \"([^\"]*)\"$")
	public void userenterconfirmpassword(String cpass) {
		driver.findElement(By.id("pass_confirmation")).sendKeys(cpass);
	}

	@And("^select gender as \"([^\"]*)\"$")
	public void userselectgender(String gender) {
		if (gender.equalsIgnoreCase("male")) {
			driver.findElement(By.xpath("//input[@value='Male']")).click();
		} else if (gender.equalsIgnoreCase("female")) {
			driver.findElement(By.xpath("//input[@value='Female']")).click();
		}
	}

	@And("^enter email as \"([^\"]*)\"$")
	public void userenteremail(String mail) {
		driver.findElement(By.name("emailAddress")).sendKeys(mail);
	}

	@And("^enter mobile number as \"([^\"]*)\"$")
	public void userentermobno(String num) {
		driver.findElement(By.name("mobileNumber")).sendKeys(num);
	}

	@And("^enter dob as \"([^\"]*)\"$")
	public void userenteredob(String dob) {
		driver.findElement(By.name("dob")).sendKeys(dob);
	}

	@And("^enter address as \"([^\"]*)\"$")
	public void userenteaddress(String address) {
		driver.findElement(By.name("address")).sendKeys(address);
	}

	@And("^Select security question as \"([^\"]*)\"$")
	public void userselectques(String ques) {
		driver.findElement(By.name("securityQuestion")).click();
	}

	@And("^enter answer as \"([^\"]*)\"$")
	public void userentereans(String ans) {
		driver.findElement(By.name("answer")).sendKeys(ans);
	}

	@Then("^click on Register$")
	public void userclicksregister() {
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();

		System.out.println("register successfull");

	}
	
	
   
}
