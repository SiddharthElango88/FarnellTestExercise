package com.farnell.seit.testExercise.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;

    //Page factory Object definitions
    
    //Cookies policy Accept button
    @FindBy(id = "mktg_Cookie_button")
    WebElement acceptCookiesPolicyButton;
    
    //Registration Link
    @FindBy(xpath = "//a[contains(@class,'regLink')]")
    WebElement registrationLink;

    //Welcome Message
    @FindBy(id = "loggedInPar")
    WebElement welcomeMessage;
    
    //My Account Link
    @FindBy(xpath = "//a[contains(text(),'My Account')]")
    WebElement myAccountLink;

    public HomePage(WebDriver driver) 
    {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }
    
    //Method to accept cookies statement    
    public void acceptCookiesPolicy() 
    {
    	wait.until(ExpectedConditions.visibilityOf(acceptCookiesPolicyButton));
    	acceptCookiesPolicyButton.click();
    }

    //Method to click on register link    
    public void clickRegisterLink() 
    {
    	wait.until(ExpectedConditions.elementToBeClickable(registrationLink));
        registrationLink.click();
    }

    //Method to check if welcome message is displayed 
    public Boolean isWelcomeMessageDisplayed(String UserName) 
    {
        wait.until(ExpectedConditions.visibilityOf(welcomeMessage));
        return welcomeMessage.getText().toLowerCase().contains(UserName.toLowerCase());
    }

    //Method to check if My Account link is displayed  
    public Boolean isMyAccountLinkDisplayed() 
    {
        wait.until(ExpectedConditions.visibilityOf(myAccountLink));
        return myAccountLink.isDisplayed();
    }
}