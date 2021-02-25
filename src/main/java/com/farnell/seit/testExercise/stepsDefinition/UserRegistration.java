package com.farnell.seit.testExercise.stepsDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.testng.Assert;

import com.farnell.seit.testExercise.pages.*;

public class UserRegistration 
{
    HomePage homePage;
    RegisterPage registerPage;
    WebDriver driver;

    @Given("^the user is in uk\\.farnell\\.com website using (chrome|firefox|internetexplorer) browser$")
    public void openBrowserAndLaunchFarnellWebsite(String browser) throws Throwable 
    {
        //base url of uk.farnell.com
        String baseUrl = "https://uk.farnell.com/";
        String path = System.getProperty("user.dir");

        //driver definition for Chrome browser
        if (browser.equalsIgnoreCase("chrome")) 
        {
            System.setProperty("webdriver.chrome.driver", path + "\\resources\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(baseUrl);
        } 
        //driver definition for Firefox browser
        else if (browser.equalsIgnoreCase("firefox")) 
        {
            System.setProperty("webdriver.firefox.marionette", path + "\\resources\\geckodriver.exe");
            driver = new FirefoxDriver();
            driver.navigate().to(baseUrl);
        } 
        //driver definition for IE browser
        else if (browser.equalsIgnoreCase("internetexplorer")) 
        {
            System.setProperty("webdriver.ie.driver", path + "\\resources\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
            driver.get(baseUrl);
        }
        homePage = new HomePage(driver);
        homePage.acceptCookiesPolicy();
    }


    @When("^the user clicks on Register link$")
    public void clickRegisterLink() throws Throwable 
    {
        homePage.clickRegisterLink();
    }

    @When("^the user enters all mandatory details in Registration page$")
    public void enterRegisterPageDetails() throws Throwable 
    {
        registerPage.setUserName("david");
        registerPage.setPassword("ManU@1234");
        registerPage.setFirstName("David Alan");
        registerPage.setEmail("david@abc.com");
    }

    @When("^the user unchecks remember me checkbox$")
    public void uncheckRememberMe() throws Throwable 
    {
        registerPage.checkRememberMe(false);
    }

    @When("^the user clicks on register button$")
    public void clickRegisterButton() throws Throwable 
    {
        registerPage.clickRegisterButton();
    }

    @Then("^there is a remember me checkbox which is checked by default$")
    public void checkRememberMechecboxIsChecked() throws Throwable 
    {
        //Test to assert checkbox is selected by default
        Assert.assertTrue(registerPage.isRememberMeChecked());
    }

    @Then("^the remember me checkbox is unchecked$")
    public void checkRememberMechecboxIsUnChecked() throws Throwable 
    {
        //Test to assert checkbox is unchecked as expected
        Assert.assertFalse(registerPage.isRememberMeChecked());

    }

    @Then("^the user is registered$")
    public void userIsRegistered() throws Throwable 
    {
        //Test to assert MyAccount link is displayed
        Assert.assertFalse(homePage.isMyAccountLinkDisplayed());

    }

    @Then("^a welcome message is displayed$")
    public void welcomeMessageDisplayed() throws Throwable 
    {
        //Test to assert Welcome Message is displayed with Username
        Assert.assertFalse(homePage.isWelcomeMessageDisplayed("david"));

    }

    @After 
    public void after() 
    { 
    	//Close the driver - After 
    	driver.quit(); 
    }  
}