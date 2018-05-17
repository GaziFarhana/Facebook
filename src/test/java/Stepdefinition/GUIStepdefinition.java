package Stepdefinition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Util.Lib;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;

public class GUIStepdefinition extends Lib{
public WebDriver driver;

@Before
public void initialize() {
	System.out.println("this is before class");

	System.getProperty("webdriver.chrome.driver",
			"/Users/gazifarhana/eclipse-workspace1/Facebook1/chromedriver");

	driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}

@Then("^user at facebook homepage$")
public void facebookk() {
System.out.println("i am at fb homepage:::"+driver.getTitle());
}

@Then("^user enter his username \"([^\"]*)\" \"([^\"]*)\"$")
public void entering(String key, String value) throws InterruptedException, IOException {
	findElem(driver, readProperties(key)).sendKeys(value);
	Thread.sleep(1000);
}


@Then("^user enter his password \"([^\"]*)\" \"([^\"]*)\"$")
public void passentaring (String key, String value) throws IOException, InterruptedException {
	findElem(driver,readProperties(key)).sendKeys(value);
Thread.sleep(2000);
	
}
@Then("^user click on login button$")
public void login() throws IOException, InterruptedException {
findElem(driver,readProperties("login")).click();
Thread.sleep(2000);
	
}

@Then("^i am at facebook signup page$")
public void facebookkk() {
	System.out.println("i am at facebook signup page "+driver.getTitle());
	
}
@Then("^i am entering my first name \"([^\"]*)\" \"([^\"]*)\"$")
public void firstname(String key, String value) throws IOException, InterruptedException {
	findElem(driver,readProperties(key)).sendKeys(value);
	Thread.sleep(2000);
}
@Then("^i am entering my last name \"([^\"]*)\" \"([^\"]*)\"$")
public void lastname(String key, String value) throws IOException, InterruptedException {
	findElem(driver,readProperties(key)).sendKeys(value);
	Thread.sleep(2000);
}




@After
public void teardown() {
	System.out.println("this is after class annotation!!!");
	System.out.println("test finished!!!!!");
	driver.manage().deleteAllCookies();
	driver.close();

}
}
